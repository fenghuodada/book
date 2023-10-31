package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgkc extends zzgow implements zzgqh {
    private static final zzgkc zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgkc zzgkcVar = new zzgkc();
        zzb = zzgkcVar;
        zzgow.zzaU(zzgkc.class, zzgkcVar);
    }

    private zzgkc() {
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
                    return new zzgkb(null);
                }
                return new zzgkc();
            }
            return zzgow.zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
