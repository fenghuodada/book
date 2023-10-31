package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfju extends zzgow implements zzgqh {
    private static final zzfju zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfjq zzh;

    static {
        zzfju zzfjuVar = new zzfju();
        zzb = zzfjuVar;
        zzgow.zzaU(zzfju.class, zzfjuVar);
    }

    private zzfju() {
    }

    public static zzfjs zza() {
        return (zzfjs) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzfju zzfjuVar, String str) {
        str.getClass();
        zzfjuVar.zzd |= 2;
        zzfjuVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfju zzfjuVar, zzfjq zzfjqVar) {
        zzfjqVar.getClass();
        zzfjuVar.zzh = zzfjqVar;
        zzfjuVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzfju zzfjuVar, int i) {
        zzfjuVar.zze = 1;
        zzfjuVar.zzd = 1 | zzfjuVar.zzd;
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
                    return new zzfjs(null);
                }
                return new zzfju();
            }
            return zzgow.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfjt.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
