package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxl extends zzgow implements zzgqh {
    private static final zzaxl zzb;
    private int zzd;
    private int zze;
    private zzaxp zzf;
    private zzaxr zzg;

    static {
        zzaxl zzaxlVar = new zzaxl();
        zzb = zzaxlVar;
        zzgow.zzaU(zzaxl.class, zzaxlVar);
    }

    private zzaxl() {
    }

    public static zzaxk zza() {
        return (zzaxk) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxl zzaxlVar, zzaxp zzaxpVar) {
        zzaxpVar.getClass();
        zzaxlVar.zzf = zzaxpVar;
        zzaxlVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzaxl zzaxlVar, zzaxr zzaxrVar) {
        zzaxrVar.getClass();
        zzaxlVar.zzg = zzaxrVar;
        zzaxlVar.zzd |= 4;
    }

    public static /* synthetic */ void zzf(zzaxl zzaxlVar, int i) {
        zzaxlVar.zze = 1;
        zzaxlVar.zzd = 1 | zzaxlVar.zzd;
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
                    return new zzaxk(null);
                }
                return new zzaxl();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzaxn.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
