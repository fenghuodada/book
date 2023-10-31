package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgje extends zzgow implements zzgqh {
    private static final zzgje zzb;

    static {
        zzgje zzgjeVar = new zzgje();
        zzb = zzgjeVar;
        zzgow.zzaU(zzgje.class, zzgjeVar);
    }

    private zzgje() {
    }

    public static zzgje zzc() {
        return zzb;
    }

    public static zzgje zzd(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgje) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgjd(null);
                }
                return new zzgje();
            }
            return zzgow.zzaR(zzb, "\u0000\u0000", null);
        }
        return (byte) 1;
    }
}
