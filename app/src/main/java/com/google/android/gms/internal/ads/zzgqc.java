package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgqc {
    private static final zzgqb zza;
    private static final zzgqb zzb;

    static {
        zzgqb zzgqbVar;
        try {
            zzgqbVar = (zzgqb) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgqbVar = null;
        }
        zza = zzgqbVar;
        zzb = new zzgqb();
    }

    public static zzgqb zza() {
        return zza;
    }

    public static zzgqb zzb() {
        return zzb;
    }
}
