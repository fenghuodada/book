package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzatk extends zzgow implements zzgqh {
    private static final zzatk zzb;
    private int zzd;
    private zzatn zze;
    private zzgno zzf;
    private zzgno zzg;

    static {
        zzatk zzatkVar = new zzatk();
        zzb = zzatkVar;
        zzgow.zzaU(zzatk.class, zzatkVar);
    }

    private zzatk() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zzf = zzgnoVar;
        this.zzg = zzgnoVar;
    }

    public static zzatk zzc(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzatk) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzatj(null);
                }
                return new zzatk();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzatn zzd() {
        zzatn zzatnVar = this.zze;
        return zzatnVar == null ? zzatn.zzg() : zzatnVar;
    }

    public final zzgno zze() {
        return this.zzg;
    }

    public final zzgno zzf() {
        return this.zzf;
    }
}
