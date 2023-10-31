package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzyn extends HandlerThread implements Handler.Callback {
    private zzee zza;
    private Handler zzb;
    @Nullable
    private Error zzc;
    @Nullable
    private RuntimeException zzd;
    @Nullable
    private zzyp zze;

    public zzyn() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzee zzeeVar = this.zza;
                    zzeeVar.getClass();
                    zzeeVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                zzee zzeeVar2 = this.zza;
                zzeeVar2.getClass();
                zzeeVar2.zzb(i2);
                this.zze = new zzyp(this, this.zza.zza(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (zzef e) {
                zzer.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzd = new IllegalStateException(e);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                zzer.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzc = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                zzer.zzc("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                this.zzd = e3;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzyp zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzee(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzyp zzypVar = this.zze;
                zzypVar.getClass();
                return zzypVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
