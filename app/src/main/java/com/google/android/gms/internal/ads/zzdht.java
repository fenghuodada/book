package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzdht implements zzgvo {
    private final zzdho zza;
    private final zzgwb zzb;
    private final zzgwb zzc;

    public zzdht(zzdho zzdhoVar, zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzdhoVar;
        this.zzb = zzgwbVar;
        this.zzc = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzbxg zzb() {
        return new zzbxg(((zzchc) this.zzb).zza(), ((zzcuz) this.zzc).zza().zzf);
    }
}
