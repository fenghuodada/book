package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaog extends zzgow implements zzgqh {
    private static final zzaog zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzaog zzaogVar = new zzaog();
        zzb = zzaogVar;
        zzgow.zzaU(zzaog.class, zzaogVar);
    }

    private zzaog() {
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
                    return new zzaof(null);
                }
                return new zzaog();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", zzaor.zza});
        }
        return (byte) 1;
    }
}
