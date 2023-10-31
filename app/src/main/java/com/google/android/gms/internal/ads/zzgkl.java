package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgkl extends zzgow implements zzgqh {
    private static final zzgkl zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgkl zzgklVar = new zzgkl();
        zzb = zzgklVar;
        zzgow.zzaU(zzgkl.class, zzgklVar);
    }

    private zzgkl() {
    }

    public static zzgkk zza() {
        return (zzgkk) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgkl zzgklVar, String str) {
        str.getClass();
        zzgklVar.zzd = str;
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
                    return new zzgkk(null);
                }
                return new zzgkl();
            }
            return zzgow.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
