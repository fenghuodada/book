package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgiv extends zzgow implements zzgqh {
    private static final zzgiv zzb;
    private int zzd;
    private zzgno zze = zzgno.zzb;

    static {
        zzgiv zzgivVar = new zzgiv();
        zzb = zzgivVar;
        zzgow.zzaU(zzgiv.class, zzgivVar);
    }

    private zzgiv() {
    }

    public static zzgiu zzc() {
        return (zzgiu) zzb.zzaA();
    }

    public static zzgiv zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgiv) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzgiu(null);
                }
                return new zzgiv();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgno zzf() {
        return this.zze;
    }
}
