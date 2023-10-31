package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfby implements zzfbw {
    private final String zza;

    public zzfby(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final boolean equals(Object obj) {
        if (obj instanceof zzfby) {
            return this.zza.equals(((zzfby) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfbw
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
