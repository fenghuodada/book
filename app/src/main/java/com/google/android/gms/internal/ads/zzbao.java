package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbao extends zzgow implements zzgqh {
    private static final zzbao zzb;
    private int zzd;
    private int zze = 1000;
    private zzbae zzf;
    private zzazv zzg;

    static {
        zzbao zzbaoVar = new zzbao();
        zzb = zzbaoVar;
        zzgow.zzaU(zzbao.class, zzbaoVar);
    }

    private zzbao() {
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
                    return new zzban(null);
                }
                return new zzbao();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayk.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
