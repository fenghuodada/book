package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdeg implements zzgvo {
    private final zzddt zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdeg(zzddt zzddtVar, zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzddtVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzbxg zzb() {
        return new zzbxg(((zzchc) this.zzb).zza(), ((zzcuz) this.zzc).zza().zzf);
    }
}
