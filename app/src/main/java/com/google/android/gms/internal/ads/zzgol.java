package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgol {
    private static final zzgoj zza = new zzgok();
    private static final zzgoj zzb;

    static {
        zzgoj zzgojVar;
        try {
            zzgojVar = (zzgoj) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgojVar = null;
        }
        zzb = zzgojVar;
    }

    public static zzgoj zza() {
        zzgoj zzgojVar = zzb;
        if (zzgojVar != null) {
            return zzgojVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgoj zzb() {
        return zza;
    }
}
