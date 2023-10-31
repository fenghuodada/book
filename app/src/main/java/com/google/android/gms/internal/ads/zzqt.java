package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzqt {
    public static final boolean zza;

    static {
        boolean z = false;
        if ("Amazon".equals(zzfn.zzc)) {
            String str = zzfn.zzd;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
            }
        }
        zza = z;
    }
}
