package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

@Deprecated
/* loaded from: classes.dex */
public final class zzbbu {
    public static boolean zza(@Nullable zzbcc zzbccVar, @Nullable zzbbz zzbbzVar, String... strArr) {
        if (zzbbzVar == null) {
            return false;
        }
        zzbccVar.zze(zzbbzVar, com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), strArr);
        return true;
    }
}
