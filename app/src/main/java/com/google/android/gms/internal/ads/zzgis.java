package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgis extends zzgow implements zzgqh {
    private static final zzgis zzb;
    private int zzd;
    private int zze;

    static {
        zzgis zzgisVar = new zzgis();
        zzb = zzgisVar;
        zzgow.zzaU(zzgis.class, zzgisVar);
    }

    private zzgis() {
    }

    public static zzgir zzc() {
        return (zzgir) zzb.zzaA();
    }

    public static zzgis zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgis) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgir(null);
                }
                return new zzgis();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
