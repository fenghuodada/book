package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgim extends zzgow implements zzgqh {
    private static final zzgim zzb;
    private int zzd;

    static {
        zzgim zzgimVar = new zzgim();
        zzb = zzgimVar;
        zzgow.zzaU(zzgim.class, zzgimVar);
    }

    private zzgim() {
    }

    public static zzgil zzc() {
        return (zzgil) zzb.zzaA();
    }

    public static zzgim zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzgil(null);
                }
                return new zzgim();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
