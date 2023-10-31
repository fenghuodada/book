package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzglj extends zzgow implements zzgqh {
    private static final zzglj zzb;
    private int zzd;

    static {
        zzglj zzgljVar = new zzglj();
        zzb = zzgljVar;
        zzgow.zzaU(zzglj.class, zzgljVar);
    }

    private zzglj() {
    }

    public static zzglj zzc() {
        return zzb;
    }

    public static zzglj zzd(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzglj) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgli(null);
                }
                return new zzglj();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
