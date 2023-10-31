package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzddz implements zzgvo {
    private final zzddt zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;

    public zzddz(zzddt zzddtVar, zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzddtVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
        this.zzd = zzgwbVar3;
        this.zze = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zzb.zzb();
        final zzbzz zza = ((zzchn) this.zzc).zza();
        final zzezf zza2 = ((zzcrv) this.zzd).zza();
        final zzfaa zza3 = ((zzcuz) this.zze).zza();
        return new zzdco(new zzcww() { // from class: com.google.android.gms.internal.ads.zzdds
            @Override // com.google.android.gms.internal.ads.zzcww
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zza.zza, zza2.zzD.toString(), zza3.zzf);
            }
        }, zzcag.zzf);
    }
}
