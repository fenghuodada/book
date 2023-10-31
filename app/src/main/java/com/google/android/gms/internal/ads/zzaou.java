package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaou extends zzgow implements zzgqh {
    private static final zzaou zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private zzgno zzg = zzgno.zzb;

    static {
        zzaou zzaouVar = new zzaou();
        zzb = zzaouVar;
        zzgow.zzaU(zzaou.class, zzaouVar);
    }

    private zzaou() {
    }

    public static zzaou zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zze;
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
                    return new zzaot(null);
                }
                return new zzaou();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 1) != 0;
    }
}
