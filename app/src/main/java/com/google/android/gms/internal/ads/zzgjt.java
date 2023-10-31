package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zzgjt implements zzgoy {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    
    private static final zzgoz zzg = new zzgoz() { // from class: com.google.android.gms.internal.ads.zzgjs
    };
    private final int zzi;

    zzgjt(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
