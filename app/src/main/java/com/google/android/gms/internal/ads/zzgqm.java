package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgqm {
    private static final zzgql zza;
    private static final zzgql zzb;

    static {
        zzgql zzgqlVar;
        try {
            zzgqlVar = (zzgql) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgqlVar = null;
        }
        zza = zzgqlVar;
        zzb = new zzgql();
    }

    public static zzgql zza() {
        return zza;
    }

    public static zzgql zzb() {
        return zzb;
    }
}
