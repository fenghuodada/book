package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfml extends zzfne {
    private int zza;
    private String zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzfne
    public final zzfne zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final zzfne zzb(int i) {
        this.zza = i;
        this.zzc = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfne
    public final zzfnf zzc() {
        if (this.zzc == 1) {
            return new zzfmn(this.zza, this.zzb, null);
        }
        throw new IllegalStateException("Missing required properties: statusCode");
    }
}
