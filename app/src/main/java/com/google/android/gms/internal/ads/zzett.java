package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzett {
    public static zzeqq zza(zzesx zzesxVar, zzeoo zzeooVar, ScheduledExecutorService scheduledExecutorService, int i) {
        return i == 0 ? new zzeow(zzeooVar, 0L, scheduledExecutorService) : new zzeow(zzesxVar, 0L, scheduledExecutorService);
    }

    public static zzeqq zzb(zzeth zzethVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeow(zzethVar, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdO)).longValue(), scheduledExecutorService);
    }

    public static zzeqq zzc(zzeuc zzeucVar, ScheduledExecutorService scheduledExecutorService) {
        return new zzeow(zzeucVar, 0L, scheduledExecutorService);
    }
}
