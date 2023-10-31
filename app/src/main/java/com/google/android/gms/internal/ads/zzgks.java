package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgks extends zzgow implements zzgqh {
    private static final zzgks zzb;
    private String zzd = "";

    static {
        zzgks zzgksVar = new zzgks();
        zzb = zzgksVar;
        zzgow.zzaU(zzgks.class, zzgksVar);
    }

    private zzgks() {
    }

    public static zzgks zzc() {
        return zzb;
    }

    public static zzgks zzd(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgks) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgkr(null);
                }
                return new zzgks();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        return (byte) 1;
    }

    public final String zze() {
        return this.zzd;
    }
}
