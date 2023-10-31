package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzeth implements zzeqq {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbrz zzc;

    public zzeth(zzbrz zzbrzVar, ScheduledExecutorService scheduledExecutorService, Context context) {
        this.zzc = zzbrzVar;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 49;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzl(zzfvr.zzn(zzfvr.zzh(new Bundle()), ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdO)).longValue(), TimeUnit.MILLISECONDS, this.zza), new zzfon() { // from class: com.google.android.gms.internal.ads.zzetg
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return new zzeti((Bundle) obj);
            }
        }, zzcag.zza);
    }
}
