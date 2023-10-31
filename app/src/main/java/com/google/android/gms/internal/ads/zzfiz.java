package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfiz extends zzfiv {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    public /* synthetic */ zzfiz(String str, boolean z, boolean z2, zzfiy zzfiyVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfiv) {
            zzfiv zzfivVar = (zzfiv) obj;
            if (this.zza.equals(zzfivVar.zzb()) && this.zzb == zzfivVar.zzd() && this.zzc == zzfivVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        return (((hashCode * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true == this.zzc ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final String zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final boolean zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfiv
    public final boolean zzd() {
        return this.zzb;
    }
}
