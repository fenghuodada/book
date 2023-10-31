package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzfer {
    @NonNull
    public final String zza;
    @NonNull
    public final String zzb;

    public zzfer(@NonNull String str, @NonNull String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfer) {
            zzfer zzferVar = (zzfer) obj;
            return this.zza.equals(zzferVar.zza) && this.zzb.equals(zzferVar.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
