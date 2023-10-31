package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfmo extends zzfnh {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfnh
    public final zzfnh zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnh
    public final zzfnh zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnh
    public final zzfni zzc() {
        return new zzfmq(this.zza, this.zzb, null);
    }
}
