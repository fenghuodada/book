package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjp extends zzgow implements zzgqh {
    private static final zzgjp zzb;
    private int zzd;
    private int zze;

    static {
        zzgjp zzgjpVar = new zzgjp();
        zzb = zzgjpVar;
        zzgow.zzaU(zzgjp.class, zzgjpVar);
    }

    private zzgjp() {
    }

    public static zzgjo zzc() {
        return (zzgjo) zzb.zzaA();
    }

    public static zzgjp zze() {
        return zzb;
    }

    public final int zza() {
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
                    return new zzgjo(null);
                }
                return new zzgjp();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final int zzg() {
        int i = this.zzd;
        int i2 = 2;
        if (i != 0) {
            if (i == 1) {
                i2 = 3;
            } else if (i != 2) {
                i2 = 5;
                if (i != 3) {
                    i2 = i != 4 ? i != 5 ? 0 : 7 : 6;
                }
            } else {
                i2 = 4;
            }
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
