package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgju extends zzgow implements zzgqh {
    private static final zzgju zzb;
    private String zzd = "";
    private zzgno zze = zzgno.zzb;
    private int zzf;

    static {
        zzgju zzgjuVar = new zzgju();
        zzb = zzgjuVar;
        zzgow.zzaU(zzgju.class, zzgjuVar);
    }

    private zzgju() {
    }

    public static zzgjr zza() {
        return (zzgjr) zzb.zzaA();
    }

    public static zzgju zze() {
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
                    return new zzgjr(null);
                }
                return new zzgju();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjt zzc() {
        int i = this.zzf;
        zzgjt zzgjtVar = zzgjt.UNKNOWN_KEYMATERIAL;
        zzgjt zzgjtVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgjt.REMOTE : zzgjt.ASYMMETRIC_PUBLIC : zzgjt.ASYMMETRIC_PRIVATE : zzgjt.SYMMETRIC : zzgjt.UNKNOWN_KEYMATERIAL;
        return zzgjtVar2 == null ? zzgjt.UNRECOGNIZED : zzgjtVar2;
    }

    public final zzgno zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
