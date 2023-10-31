package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzggx {
    public static final zzggx zza = new zzggv().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzggx) {
            return this.zzb.equals(((zzggx) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
