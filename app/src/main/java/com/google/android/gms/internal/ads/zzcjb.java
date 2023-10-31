package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzcjb implements zzeug {
    private final zzcir zza;
    private final zzcjb zzb = this;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;

    public /* synthetic */ zzcjb(zzcir zzcirVar, Context context, String str, zzcja zzcjaVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        zzgwb zzgwbVar4;
        zzgwb zzgwbVar5;
        zzgwb zzgwbVar6;
        zzgwb zzgwbVar7;
        zzgwb zzgwbVar8;
        zzgwb zzgwbVar9;
        this.zza = zzcirVar;
        zzgvo zza = zzgvp.zza(context);
        this.zzc = zza;
        zzgvo zza2 = zzgvp.zza(str);
        this.zzd = zza2;
        zzgwbVar = zzcirVar.zzaE;
        zzgwbVar2 = zzcirVar.zzaF;
        zzewy zzewyVar = new zzewy(zza, zzgwbVar, zzgwbVar2);
        this.zze = zzewyVar;
        zzgwbVar3 = zzcirVar.zzaE;
        zzgwb zzc = zzgvn.zzc(new zzeve(zzgwbVar3));
        this.zzf = zzc;
        zzgwbVar4 = zzcirVar.zzp;
        zzgwbVar5 = zzcirVar.zzU;
        zzfac zza3 = zzfac.zza();
        zzgwbVar6 = zzcirVar.zzi;
        zzgwb zzc2 = zzgvn.zzc(new zzevg(zza, zzgwbVar4, zzgwbVar5, zzewyVar, zzc, zza3, zzgwbVar6));
        this.zzg = zzc2;
        zzgwbVar7 = zzcirVar.zzU;
        zzgwbVar8 = zzcirVar.zzi;
        zzgwbVar9 = zzcirVar.zzZ;
        this.zzh = zzgvn.zzc(new zzevm(zzgwbVar7, zza, zza2, zzc2, zzc, zzgwbVar8, zzgwbVar9));
    }

    @Override // com.google.android.gms.internal.ads.zzeug
    public final zzevl zza() {
        return (zzevl) this.zzh.zzb();
    }
}
