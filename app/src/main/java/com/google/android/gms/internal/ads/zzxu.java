package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
public final class zzxu extends Handler implements Runnable {
    final /* synthetic */ zzxz zza;
    private final zzxv zzb;
    private final long zzc;
    @Nullable
    private zzxr zzd;
    @Nullable
    private IOException zze;
    private int zzf;
    @Nullable
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxu(zzxz zzxzVar, Looper looper, zzxv zzxvVar, zzxr zzxrVar, int i, long j) {
        super(looper);
        this.zza = zzxzVar;
        this.zzb = zzxvVar;
        this.zzd = zzxrVar;
        this.zzc = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzxu zzxuVar;
        this.zze = null;
        zzxz zzxzVar = this.zza;
        executorService = zzxzVar.zze;
        zzxuVar = zzxzVar.zzf;
        zzxuVar.getClass();
        executorService.execute(zzxuVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            zzd();
        } else if (i4 == 3) {
            throw ((Error) message.obj);
        } else {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zzc;
            zzxr zzxrVar = this.zzd;
            zzxrVar.getClass();
            if (this.zzh) {
                zzxrVar.zzI(this.zzb, elapsedRealtime, j2, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    zzxrVar.zzJ(this.zzb, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    zzer.zzc("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zzg = new zzxy(e);
                }
            } else if (i5 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i6 = this.zzf + 1;
                this.zzf = i6;
                zzxt zzt = zzxrVar.zzt(this.zzb, elapsedRealtime, j2, iOException, i6);
                i = zzt.zza;
                if (i == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i2 = zzt.zza;
                if (i2 != 2) {
                    i3 = zzt.zza;
                    if (i3 == 1) {
                        this.zzf = 1;
                    }
                    j = zzt.zzb;
                    zzc(j != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, 5000));
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object zzxyVar;
        Message obtainMessage;
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                String concat = "load:".concat(this.zzb.getClass().getSimpleName());
                int i = zzfn.zza;
                Trace.beginSection(concat);
                try {
                    this.zzb.zzh();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage = obtainMessage(2, e);
            obtainMessage.sendToTarget();
        } catch (OutOfMemoryError e2) {
            if (this.zzi) {
                return;
            }
            zzer.zzc("LoadTask", "OutOfMemory error loading stream", e2);
            zzxyVar = new zzxy(e2);
            obtainMessage = obtainMessage(2, zzxyVar);
            obtainMessage.sendToTarget();
        } catch (Error e3) {
            if (!this.zzi) {
                zzer.zzc("LoadTask", "Unexpected error loading stream", e3);
                obtainMessage(3, e3).sendToTarget();
            }
            throw e3;
        } catch (Exception e4) {
            if (this.zzi) {
                return;
            }
            zzer.zzc("LoadTask", "Unexpected exception loading stream", e4);
            zzxyVar = new zzxy(e4);
            obtainMessage = obtainMessage(2, zzxyVar);
            obtainMessage.sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzg();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzxr zzxrVar = this.zzd;
            zzxrVar.getClass();
            zzxrVar.zzI(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzxu zzxuVar;
        zzxuVar = this.zza.zzf;
        zzdy.zzf(zzxuVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
