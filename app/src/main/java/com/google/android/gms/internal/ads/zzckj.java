package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckj implements zzexl {
    private final zzcir zza;
    private final zzckj zzb = this;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;

    public /* synthetic */ zzckj(zzcir zzcirVar, Context context, String str, com.google.android.gms.ads.internal.client.zzq zzqVar, zzcki zzckiVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        zzgwb zzgwbVar4;
        zzgwb zzgwbVar5;
        zzgwb zzgwbVar6;
        zzgwb zzgwbVar7;
        this.zza = zzcirVar;
        zzgvo zza = zzgvp.zza(context);
        this.zzc = zza;
        zzgvo zza2 = zzgvp.zza(zzqVar);
        this.zzd = zza2;
        zzgvo zza3 = zzgvp.zza(str);
        this.zze = zza3;
        zzgwbVar = zzcirVar.zzo;
        zzgwb zzc = zzgvn.zzc(new zzejg(zzgwbVar));
        this.zzf = zzc;
        zzgwbVar2 = zzcirVar.zzaE;
        zzgwb zzc2 = zzgvn.zzc(new zzeyj(zzgwbVar2));
        this.zzg = zzc2;
        zzgwbVar3 = zzcirVar.zzp;
        zzgwbVar4 = zzcirVar.zzU;
        zzgwb zzc3 = zzgvn.zzc(new zzexj(zza, zzgwbVar3, zzgwbVar4, zzc, zzc2, zzfac.zza()));
        this.zzh = zzc3;
        zzgwbVar5 = zzcirVar.zzi;
        zzgwbVar6 = zzcirVar.zzV;
        zzgwbVar7 = zzcirVar.zzZ;
        this.zzi = zzgvn.zzc(new zzejo(zza, zza2, zza3, zzc3, zzc, zzc2, zzgwbVar5, zzgwbVar6, zzgwbVar7));
    }

    @Override // com.google.android.gms.internal.ads.zzexl
    public final zzejn zza() {
        return (zzejn) this.zzi.zzb();
    }
}
