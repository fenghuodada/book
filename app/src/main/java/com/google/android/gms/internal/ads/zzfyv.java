package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfyv {
    public static final zzfyv zza = new zzfyv("SHA1");
    public static final zzfyv zzb = new zzfyv("SHA224");
    public static final zzfyv zzc = new zzfyv("SHA256");
    public static final zzfyv zzd = new zzfyv("SHA384");
    public static final zzfyv zze = new zzfyv("SHA512");
    private final String zzf;

    private zzfyv(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
