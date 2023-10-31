package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzff {
    public static final zzff zza = new zzff(-1, -1);
    public static final zzff zzb = new zzff(0, 0);
    private final int zzc;
    private final int zzd;

    public zzff(int i, int i2) {
        boolean z = false;
        if ((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0)) {
            z = true;
        }
        zzdy.zzd(z);
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzff) {
            zzff zzffVar = (zzff) obj;
            if (this.zzc == zzffVar.zzc && this.zzd == zzffVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        int i2 = this.zzc;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public final String toString() {
        int i = this.zzc;
        int i2 = this.zzd;
        return i + "x" + i2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final int zzb() {
        return this.zzc;
    }
}
