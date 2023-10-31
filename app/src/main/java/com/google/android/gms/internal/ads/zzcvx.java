package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzcvx implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;

    public zzcvx(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzcvu zzb = ((zzcvw) this.zza).zzb();
        Set zzb2 = ((zzgvz) this.zzb).zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzcvv(zzb, zzb2, zzfwcVar, (ScheduledExecutorService) this.zzd.zzb());
    }
}
