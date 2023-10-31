package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfgx {
    private final String zza;
    private final String zzb;

    private zzfgx(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfgx zza(String str, String str2) {
        zzfhv.zza(str, "Name is null or empty");
        zzfhv.zza(str2, "Version is null or empty");
        return new zzfgx(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
