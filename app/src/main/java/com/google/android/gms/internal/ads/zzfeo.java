package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzfeo implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzfeo(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzgvi zza = zzgvn.zza(this.zza);
        zzgvi zza2 = zzgvn.zza(this.zzb);
        Object zzfeqVar = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzie)).booleanValue() ? new zzfeq((zzfen) zza.zzb(), (ScheduledExecutorService) this.zzc.zzb()) : (zzfen) zza2.zzb();
        zzgvw.zzb(zzfeqVar);
        return zzfeqVar;
    }
}
