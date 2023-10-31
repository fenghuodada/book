package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfmf extends zzfmr {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final zzfmr zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final zzfmr zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfmr
    public final zzfms zzc() {
        return new zzfmh(this.zza, this.zzb, null);
    }
}
