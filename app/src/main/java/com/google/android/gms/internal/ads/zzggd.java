package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzggd {
    public static final zzggd zza = new zzggd("SHA1");
    public static final zzggd zzb = new zzggd("SHA224");
    public static final zzggd zzc = new zzggd("SHA256");
    public static final zzggd zzd = new zzggd("SHA384");
    public static final zzggd zze = new zzggd("SHA512");
    private final String zzf;

    private zzggd(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
