package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzcph implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;
    private final zzgwb zzi;
    private final zzgwb zzj;

    public zzcph(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4, zzgwb zzgwbVar5, zzgwb zzgwbVar6, zzgwb zzgwbVar7, zzgwb zzgwbVar8, zzgwb zzgwbVar9, zzgwb zzgwbVar10) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
        this.zzd = zzgwbVar4;
        this.zze = zzgwbVar5;
        this.zzf = zzgwbVar6;
        this.zzg = zzgwbVar7;
        this.zzh = zzgwbVar8;
        this.zzi = zzgwbVar9;
        this.zzj = zzgwbVar10;
    }

    public static zzcpg zzc(zzcre zzcreVar, Context context, zzezg zzezgVar, View view, zzcfb zzcfbVar, zzcrd zzcrdVar, zzdhn zzdhnVar, zzdcy zzdcyVar, zzgvi zzgviVar, Executor executor) {
        return new zzcpg(zzcreVar, context, zzezgVar, view, zzcfbVar, zzcrdVar, zzdhnVar, zzdcyVar, zzgviVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzcpg zzb() {
        return new zzcpg(((zzcte) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcpn) this.zzc).zza(), ((zzcpm) this.zzd).zza(), ((zzcpy) this.zze).zza(), ((zzcpo) this.zzf).zza(), ((zzdfk) this.zzg).zza(), (zzdcy) this.zzh.zzb(), zzgvn.zza(this.zzi), (Executor) this.zzj.zzb());
    }
}
