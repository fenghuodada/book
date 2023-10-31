package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzghi extends zzgow implements zzgqh {
    private static final zzghi zzb;
    private int zzd;
    private zzgno zze = zzgno.zzb;
    private zzgho zzf;

    static {
        zzghi zzghiVar = new zzghi();
        zzb = zzghiVar;
        zzgow.zzaU(zzghi.class, zzghiVar);
    }

    private zzghi() {
    }

    public static zzghh zzc() {
        return (zzghh) zzb.zzaA();
    }

    public static zzghi zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzghi) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzj(zzghi zzghiVar, zzgho zzghoVar) {
        zzghoVar.getClass();
        zzghiVar.zzf = zzghoVar;
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
                    return new zzghh(null);
                }
                return new zzghi();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgho zzf() {
        zzgho zzghoVar = this.zzf;
        return zzghoVar == null ? zzgho.zze() : zzghoVar;
    }

    public final zzgno zzg() {
        return this.zze;
    }
}
