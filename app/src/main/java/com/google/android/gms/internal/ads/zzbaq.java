package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbaq extends zzgow implements zzgqh {
    private static final zzbaq zzb;
    private int zzd;
    private int zze = 1000;
    private zzbae zzf;

    static {
        zzbaq zzbaqVar = new zzbaq();
        zzb = zzbaqVar;
        zzgow.zzaU(zzbaq.class, zzbaqVar);
    }

    private zzbaq() {
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
                    return new zzbap(null);
                }
                return new zzbaq();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", zzayk.zza, "zzf"});
        }
        return (byte) 1;
    }
}
