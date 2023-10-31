package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzum {
    public final int zza;
    public final boolean zzb;

    public zzum(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzum.class == obj.getClass()) {
            zzum zzumVar = (zzum) obj;
            if (this.zza == zzumVar.zza && this.zzb == zzumVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
