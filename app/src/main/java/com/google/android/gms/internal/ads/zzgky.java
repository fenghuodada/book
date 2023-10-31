package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgky extends zzgow implements zzgqh {
    private static final zzgky zzb;
    private String zzd = "";
    private zzgjz zze;

    static {
        zzgky zzgkyVar = new zzgky();
        zzb = zzgkyVar;
        zzgow.zzaU(zzgky.class, zzgkyVar);
    }

    private zzgky() {
    }

    public static zzgky zzd() {
        return zzb;
    }

    public static zzgky zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgky) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public final zzgjz zza() {
        zzgjz zzgjzVar = this.zze;
        return zzgjzVar == null ? zzgjz.zzd() : zzgjzVar;
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
                    return new zzgkx(null);
                }
                return new zzgky();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze != null;
    }
}
