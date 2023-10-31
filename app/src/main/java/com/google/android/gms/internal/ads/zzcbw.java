package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzcbw {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzD)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcbh zzcbhVar) {
        if (zzcbhVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
            this.zzc = false;
            this.zzb = timestamp;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbv
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbh.this.zzk();
                }
            });
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
