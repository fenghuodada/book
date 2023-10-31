package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcm {
    private final zzah zzd;
    public static final zzcm zza = new zzck().zze();
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcj
    };

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzcm) {
            return this.zzd.equals(((zzcm) obj).zzd);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }
}
