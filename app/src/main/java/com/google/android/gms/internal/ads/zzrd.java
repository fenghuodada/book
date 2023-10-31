package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(23)
/* loaded from: classes.dex */
public final class zzrd {
    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzeb zzg;
    private boolean zzh;

    public zzrd(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzebVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* bridge */ /* synthetic */ void zza(com.google.android.gms.internal.ads.zzrd r9, android.os.Message r10) {
        /*
            int r0 = r10.what
            r1 = 0
            if (r0 == 0) goto L3e
            r2 = 1
            if (r0 == r2) goto L22
            r2 = 2
            if (r0 == r2) goto L1c
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            int r10 = r10.what
            java.lang.String r10 = java.lang.String.valueOf(r10)
            r0.<init>(r10)
            com.google.android.gms.internal.ads.zzra.zza(r9, r1, r0)
            goto L58
        L1c:
            com.google.android.gms.internal.ads.zzeb r9 = r9.zzg
            r9.zze()
            goto L58
        L22:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrc r10 = (com.google.android.gms.internal.ads.zzrc) r10
            int r3 = r10.zza
            android.media.MediaCodec$CryptoInfo r5 = r10.zzd
            long r6 = r10.zze
            int r8 = r10.zzf
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzrd.zzb     // Catch: java.lang.RuntimeException -> L3c
            monitor-enter(r0)     // Catch: java.lang.RuntimeException -> L3c
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.Throwable -> L39
            r4 = 0
            r2.queueSecureInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L39
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            goto L57
        L39:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L39
            throw r2     // Catch: java.lang.RuntimeException -> L3c
        L3c:
            r0 = move-exception
            goto L52
        L3e:
            java.lang.Object r10 = r10.obj
            com.google.android.gms.internal.ads.zzrc r10 = (com.google.android.gms.internal.ads.zzrc) r10
            int r3 = r10.zza
            int r5 = r10.zzc
            long r6 = r10.zze
            int r8 = r10.zzf
            android.media.MediaCodec r2 = r9.zzc     // Catch: java.lang.RuntimeException -> L51
            r4 = 0
            r2.queueInputBuffer(r3, r4, r5, r6, r8)     // Catch: java.lang.RuntimeException -> L51
            goto L57
        L51:
            r0 = move-exception
        L52:
            java.util.concurrent.atomic.AtomicReference r9 = r9.zzf
            com.google.android.gms.internal.ads.zzra.zza(r9, r1, r0)
        L57:
            r1 = r10
        L58:
            if (r1 == 0) goto L65
            java.util.ArrayDeque r9 = com.google.android.gms.internal.ads.zzrd.zza
            monitor-enter(r9)
            r9.add(r1)     // Catch: java.lang.Throwable -> L62
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            return
        L62:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L62
            throw r10
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zza(com.google.android.gms.internal.ads.zzrd, android.os.Message):void");
    }

    private static zzrc zzh() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzrc();
            }
            return (zzrc) arrayDeque.removeFirst();
        }
    }

    @Nullable
    private static byte[] zzi(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        int length;
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < (length = bArr.length)) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    @Nullable
    private static int[] zzj(@Nullable int[] iArr, @Nullable int[] iArr2) {
        int length;
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < (length = iArr.length)) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, length);
        return iArr2;
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                handler2.getClass();
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    public final void zzd(int i, int i2, int i3, long j, int i4) {
        zzc();
        zzrc zzh = zzh();
        zzh.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzfn.zza;
        handler.obtainMessage(0, zzh).sendToTarget();
    }

    public final void zze(int i, int i2, zzhf zzhfVar, long j, int i3) {
        zzc();
        zzrc zzh = zzh();
        zzh.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzh.zzd;
        cryptoInfo.numSubSamples = zzhfVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzhfVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzhfVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzhfVar.zzb, cryptoInfo.key);
        zzi.getClass();
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzhfVar.zza, cryptoInfo.iv);
        zzi2.getClass();
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzhfVar.zzc;
        if (zzfn.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzhfVar.zzg, zzhfVar.zzh));
        }
        this.zze.obtainMessage(1, zzh).sendToTarget();
    }

    public final void zzf() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzg() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzrb(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
