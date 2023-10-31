package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.provider.C0761g;

/* loaded from: classes.dex */
final class zzfmh extends zzfms {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzfmh(String str, String str2, zzfmg zzfmgVar) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfms) {
            zzfms zzfmsVar = (zzfms) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfmsVar.zzb()) : zzfmsVar.zzb() == null) {
                String str2 = this.zzb;
                String zza = zzfmsVar.zza();
                if (str2 != null ? str2.equals(zza) : zza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((hashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return C0761g.m11824a("OverlayDisplayDismissRequest{sessionToken=", this.zza, ", appId=", this.zzb, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    @Nullable
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfms
    @Nullable
    public final String zzb() {
        return this.zza;
    }
}
