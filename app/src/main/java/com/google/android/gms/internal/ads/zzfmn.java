package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzfmn extends zzfnf {
    private final int zza;
    private final String zzb;

    public /* synthetic */ zzfmn(int i, String str, zzfmm zzfmmVar) {
        this.zza = i;
        this.zzb = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfnf) {
            zzfnf zzfnfVar = (zzfnf) obj;
            if (this.zza == zzfnfVar.zza()) {
                String str = this.zzb;
                String zzb = zzfnfVar.zzb();
                if (str != null ? str.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza ^ 1000003;
        String str = this.zzb;
        return (i * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.zza;
        String str = this.zzb;
        return "OverlayDisplayState{statusCode=" + i + ", sessionToken=" + str + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnf
    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
