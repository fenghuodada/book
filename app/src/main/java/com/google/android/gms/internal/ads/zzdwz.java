package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdwz implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdwz(zzgwb zzgwbVar, zzgwb zzgwbVar2, zzgwb zzgwbVar3) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
        this.zzc = zzgwbVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzdwy zzb() {
        zzfwc zzfwcVar = zzcag.zzb;
        zzgvw.zzb(zzfwcVar);
        zzfwc zzfwcVar2 = zzcag.zza;
        zzgvw.zzb(zzfwcVar2);
        return new zzdwy(zzfwcVar, zzfwcVar2, ((zzdxr) this.zzc).zzb());
    }
}
