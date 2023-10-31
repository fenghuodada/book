package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzdve implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;

    public zzdve(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza = ((zzchc) this.zza).zza();
        zzfaa zza2 = ((zzcuz) this.zzb).zza();
        zzdud zzb = ((zzdue) this.zzc).zzb();
        zzfwc zzfwcVar = zzcag.zza;
        zzgvw.zzb(zzfwcVar);
        return new zzdvd(zza, zza2, zzb, zzfwcVar, (ScheduledExecutorService) this.zze.zzb(), (zzdzz) this.zzf.zzb(), (zzffq) this.zzg.zzb());
    }
}
