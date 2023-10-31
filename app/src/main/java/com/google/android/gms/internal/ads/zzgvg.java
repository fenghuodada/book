package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class zzgvg {
    public static zzgvg zzb(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new zzgvb(cls.getSimpleName()) : new zzgvd(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
