package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeow implements zzeqq {
    private final zzeqq zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzeow(zzeqq zzeqqVar, long j, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzeqqVar;
        this.zzb = j;
        this.zzc = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzfwb zzb = this.zza.zzb();
        long j = this.zzb;
        if (j > 0) {
            zzb = zzfvr.zzn(zzb, j, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfvr.zzf(zzb, Throwable.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzeov
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Throwable th = (Throwable) obj;
                return zzfvr.zzh(null);
            }
        }, zzcag.zzf);
    }
}
