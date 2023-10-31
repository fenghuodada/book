package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzeph implements zzeqq {
    private final String zza;
    private final String zzb;

    public zzeph(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzh(new zzepi(this.zza, this.zzb));
    }
}
