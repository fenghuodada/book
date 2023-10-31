package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgld extends zzgow implements zzgqh {
    private static final zzgld zzb;
    private String zzd = "";
    private zzgpf zze = zzgow.zzaN();

    static {
        zzgld zzgldVar = new zzgld();
        zzb = zzgldVar;
        zzgow.zzaU(zzgld.class, zzgldVar);
    }

    private zzgld() {
    }

    public static zzgld zzc() {
        return zzb;
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
                    return new zzglc(null);
                }
                return new zzgld();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", zzgkc.class});
        }
        return (byte) 1;
    }
}
