package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class zzbr {
    private static final HashSet zza = new HashSet();
    private static String zzb = "media3.common";

    public static synchronized String zza() {
        String str;
        synchronized (zzbr.class) {
            str = zzb;
        }
        return str;
    }

    public static synchronized void zzb(String str) {
        synchronized (zzbr.class) {
            if (zza.add(str)) {
                String str2 = zzb;
                zzb = str2 + ", " + str;
            }
        }
    }
}
