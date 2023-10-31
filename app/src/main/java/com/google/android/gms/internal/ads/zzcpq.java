package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzcpq implements zzgvo {
    private final zzcpk zza;
    private final zzgwb zzb;
    private final zzgwb zzc;
    private final zzgwb zzd;
    private final zzgwb zze;

    public zzcpq(zzcpk zzcpkVar, zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3, zzgwb zzgwbVar4) {
        this.zza = zzcpkVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
        this.zzd = zzgwbVar3;
        this.zze = zzgwbVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzcpk.zzf((Context) this.zzb.zzb(), ((zzchn) this.zzc).zza(), ((zzcrv) this.zzd).zza(), ((zzcuz) this.zze).zza());
    }
}
