package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzflw {
    private final String zza;
    private final long zzb;

    public zzflw() {
        this.zza = null;
        this.zzb = -1L;
    }

    public zzflw(String str, long j) {
        this.zza = str;
        this.zzb = j;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb >= 0;
    }
}
