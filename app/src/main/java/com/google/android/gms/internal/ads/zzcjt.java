package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcjt implements zzdrc {
    private final zzcir zza;
    private final zzcjz zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzcjt(zzcir zzcirVar, zzcjz zzcjzVar, zzcjs zzcjsVar) {
        this.zza = zzcirVar;
        this.zzb = zzcjzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrc
    public final /* synthetic */ zzdrc zza(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrc
    public final /* bridge */ /* synthetic */ zzdrc zzb(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdrc
    public final zzdrd zzc() {
        zzgvw.zzc(this.zzc, Long.class);
        zzgvw.zzc(this.zzd, String.class);
        return new zzcjv(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
