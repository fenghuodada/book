package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcjz implements zzdrl {
    private final Context zza;
    private final zzbjf zzb;
    private final zzcir zzc;
    private final zzcjz zzd = this;
    private final zzgwb zze;
    private final zzgwb zzf;
    private final zzgwb zzg;
    private final zzgwb zzh;

    public /* synthetic */ zzcjz(zzcir zzcirVar, Context context, zzbjf zzbjfVar, zzcjy zzcjyVar) {
        this.zzc = zzcirVar;
        this.zza = context;
        this.zzb = zzbjfVar;
        zzgvo zza = zzgvp.zza(this);
        this.zze = zza;
        zzgvo zza2 = zzgvp.zza(zzbjfVar);
        this.zzf = zza2;
        zzdrh zzdrhVar = new zzdrh(zza2);
        this.zzg = zzdrhVar;
        this.zzh = zzgvn.zzc(new zzdrj(zza, zzdrhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdrl
    public final zzdrc zzb() {
        return new zzcjt(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdrl
    public final zzdri zzd() {
        return (zzdri) this.zzh.zzb();
    }
}
