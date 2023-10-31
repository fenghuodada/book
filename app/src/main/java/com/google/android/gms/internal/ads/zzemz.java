package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzemz implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzemz(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzfrw zzm;
        zzemp zza = zzemr.zza();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.zzb.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdK)).booleanValue()) {
            zzm = zzfrw.zzn(new zzeow(zza, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdL)).intValue(), scheduledExecutorService));
        } else {
            zzm = zzfrw.zzm();
        }
        zzgvw.zzb(zzm);
        return zzm;
    }
}
