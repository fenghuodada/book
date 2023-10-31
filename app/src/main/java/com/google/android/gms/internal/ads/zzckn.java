package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
final class zzckn implements zzeyz {
    private final zzcir zza;
    private final zzckn zzb = this;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;

    public /* synthetic */ zzckn(zzcir zzcirVar, Context context, String str, zzckm zzckmVar) {
        zzgwb zzgwbVar;
        zzgwb zzgwbVar2;
        zzgwb zzgwbVar3;
        zzgwb zzgwbVar4;
        zzgwb zzgwbVar5;
        zzgwb zzgwbVar6;
        zzgwb zzgwbVar7;
        zzgwb zzgwbVar8;
        this.zza = zzcirVar;
        zzgvo zza = zzgvp.zza(context);
        this.zzc = zza;
        zzgwbVar = zzcirVar.zzaE;
        zzgwbVar2 = zzcirVar.zzaF;
        zzewz zzewzVar = new zzewz(zza, zzgwbVar, zzgwbVar2);
        this.zzd = zzewzVar;
        zzgwbVar3 = zzcirVar.zzaE;
        zzgwb zzc = zzgvn.zzc(new zzeyj(zzgwbVar3));
        this.zze = zzc;
        zzgwb zzc2 = zzgvn.zzc(zzezx.zza());
        this.zzf = zzc2;
        zzgwbVar4 = zzcirVar.zzp;
        zzgwbVar5 = zzcirVar.zzU;
        zzgwb zzc3 = zzgvn.zzc(new zzeyt(zza, zzgwbVar4, zzgwbVar5, zzewzVar, zzc, zzfac.zza(), zzc2));
        this.zzg = zzc3;
        this.zzh = zzgvn.zzc(new zzezd(zzc3, zzc, zzc2));
        zzgvo zzc4 = zzgvp.zzc(str);
        this.zzi = zzc4;
        zzgwbVar6 = zzcirVar.zzi;
        zzgwbVar7 = zzcirVar.zzV;
        zzgwbVar8 = zzcirVar.zzZ;
        this.zzj = zzgvn.zzc(new zzeyx(zzc4, zzc3, zza, zzc, zzc2, zzgwbVar6, zzgwbVar7, zzgwbVar8));
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzeyw zza() {
        return (zzeyw) this.zzj.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzeyz
    public final zzezc zzb() {
        return (zzezc) this.zzh.zzb();
    }
}
