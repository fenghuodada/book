package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgid extends zzgow implements zzgqh {
    private static final zzgid zzb;
    private int zzd;

    static {
        zzgid zzgidVar = new zzgid();
        zzb = zzgidVar;
        zzgow.zzaU(zzgid.class, zzgidVar);
    }

    private zzgid() {
    }

    public static zzgic zzc() {
        return (zzgic) zzb.zzaA();
    }

    public static zzgid zze() {
        return zzb;
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
                    return new zzgic(null);
                }
                return new zzgid();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
