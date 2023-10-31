package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzanj extends zzgow implements zzgqh {
    private static final zzanj zzb;
    private int zzd;
    private int zze = 2;

    static {
        zzanj zzanjVar = new zzanj();
        zzb = zzanjVar;
        zzgow.zzaU(zzanj.class, zzanjVar);
    }

    private zzanj() {
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
                    return new zzani(null);
                }
                return new zzanj();
            }
            return zzgow.zzaR(zzb, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzd", "zze", zzank.zza});
        }
        return (byte) 1;
    }
}
