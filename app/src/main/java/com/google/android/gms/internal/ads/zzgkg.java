package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgkg extends zzgow implements zzgqh {
    private static final zzgkg zzb;
    private zzgju zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgkg zzgkgVar = new zzgkg();
        zzb = zzgkgVar;
        zzgow.zzaU(zzgkg.class, zzgkgVar);
    }

    private zzgkg() {
    }

    public static zzgkf zzd() {
        return (zzgkf) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgkg zzgkgVar, zzgju zzgjuVar) {
        zzgjuVar.getClass();
        zzgkgVar.zzd = zzgjuVar;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzgkf(null);
                }
                return new zzgkg();
            }
            return zzgow.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgju zzc() {
        zzgju zzgjuVar = this.zzd;
        return zzgjuVar == null ? zzgju.zze() : zzgjuVar;
    }

    public final zzgla zzf() {
        zzgla zzb2 = zzgla.zzb(this.zzg);
        return zzb2 == null ? zzgla.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return this.zzd != null;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
