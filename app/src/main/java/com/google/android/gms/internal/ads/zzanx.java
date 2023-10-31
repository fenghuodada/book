package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzanx extends zzgow implements zzgqh {
    private static final zzanx zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;
    private int zzg = 1000;

    static {
        zzanx zzanxVar = new zzanx();
        zzb = zzanxVar;
        zzgow.zzaU(zzanx.class, zzanxVar);
    }

    private zzanx() {
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzaor.zza;
                return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", zzgpaVar, "zzg", zzgpaVar});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzanw(null);
            } else {
                return new zzanx();
            }
        }
        return (byte) 1;
    }
}
