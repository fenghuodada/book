package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzanz extends zzgow implements zzgqh {
    private static final zzanz zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzanz zzanzVar = new zzanz();
        zzb = zzanzVar;
        zzgow.zzaU(zzanz.class, zzanzVar);
    }

    private zzanz() {
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
                    return new zzany(null);
                }
                return new zzanz();
            }
            return zzgow.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
