package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgiy extends zzgow implements zzgqh {
    private static final zzgiy zzb;
    private int zzd;
    private int zze;

    static {
        zzgiy zzgiyVar = new zzgiy();
        zzb = zzgiyVar;
        zzgow.zzaU(zzgiy.class, zzgiyVar);
    }

    private zzgiy() {
    }

    public static zzgix zzc() {
        return (zzgix) zzb.zzaA();
    }

    public static zzgiy zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgiy) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgix(null);
                }
                return new zzgiy();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        return (byte) 1;
    }
}
