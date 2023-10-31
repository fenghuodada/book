package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgor implements zzgqe {
    private static final zzgor zza = new zzgor();

    private zzgor() {
    }

    public static zzgor zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final zzgqd zzb(Class cls) {
        if (zzgow.class.isAssignableFrom(cls)) {
            try {
                return (zzgqd) zzgow.zzaC(cls.asSubclass(zzgow.class)).zzb(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final boolean zzc(Class cls) {
        return zzgow.class.isAssignableFrom(cls);
    }
}
