package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzsa {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzsa(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzsa.class) {
            zzsa zzsaVar = (zzsa) obj;
            if (TextUtils.equals(this.zza, zzsaVar.zza) && this.zzb == zzsaVar.zzb && this.zzc == zzsaVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 31;
        return (((hashCode * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true == this.zzc ? 1231 : 1237);
    }
}
