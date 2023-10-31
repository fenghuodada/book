package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjz extends zzgow implements zzgqh {
    private static final zzgjz zzb;
    private String zzd = "";
    private zzgno zze = zzgno.zzb;
    private int zzf;

    static {
        zzgjz zzgjzVar = new zzgjz();
        zzb = zzgjzVar;
        zzgow.zzaU(zzgjz.class, zzgjzVar);
    }

    private zzgjz() {
    }

    public static zzgjy zza() {
        return (zzgjy) zzb.zzaA();
    }

    public static zzgjz zzd() {
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
                    return new zzgjy(null);
                }
                return new zzgjz();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgla zze() {
        zzgla zzb2 = zzgla.zzb(this.zzf);
        return zzb2 == null ? zzgla.UNRECOGNIZED : zzb2;
    }

    public final zzgno zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
