package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbag extends zzgow implements zzgqh {
    private static final zzbag zzb;
    private int zzd;
    private zzazx zze;
    private int zzf = 1000;
    private zzbae zzg;
    private zzazv zzh;

    static {
        zzbag zzbagVar = new zzbag();
        zzb = zzbagVar;
        zzgow.zzaU(zzbag.class, zzbagVar);
    }

    private zzbag() {
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
                    return new zzbaf(null);
                }
                return new zzbag();
            }
            return zzgow.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzayk.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
