package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjb extends zzgow implements zzgqh {
    private static final zzgjb zzb;
    private int zzd;
    private zzgno zze = zzgno.zzb;

    static {
        zzgjb zzgjbVar = new zzgjb();
        zzb = zzgjbVar;
        zzgow.zzaU(zzgjb.class, zzgjbVar);
    }

    private zzgjb() {
    }

    public static zzgja zzc() {
        return (zzgja) zzb.zzaA();
    }

    public static zzgjb zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgjb) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
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
                    return new zzgja(null);
                }
                return new zzgjb();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgno zzf() {
        return this.zze;
    }
}
