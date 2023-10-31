package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtt extends zzgow implements zzgqh {
    private static final zzgtt zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        zzgtt zzgttVar = new zzgtt();
        zzb = zzgttVar;
        zzgow.zzaU(zzgtt.class, zzgttVar);
    }

    private zzgtt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzgtr.zza;
                return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", zzgpaVar, "zzf", "zzg", zzgpaVar});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzgts(null);
            } else {
                return new zzgtt();
            }
        }
        return (byte) 1;
    }
}
