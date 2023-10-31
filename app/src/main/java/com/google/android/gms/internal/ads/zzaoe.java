package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoe extends zzgow implements zzgqh {
    private static final zzaoe zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzaoe zzaoeVar = new zzaoe();
        zzb = zzaoeVar;
        zzgow.zzaU(zzaoe.class, zzaoeVar);
    }

    private zzaoe() {
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaod(null);
                }
                return new zzaoe();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzant.zza, "zzf"});
        }
        return (byte) 1;
    }
}
