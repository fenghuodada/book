package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgkp extends zzgow implements zzgqh {
    private static final zzgkp zzb;
    private int zzd;
    private zzgks zze;

    static {
        zzgkp zzgkpVar = new zzgkp();
        zzb = zzgkpVar;
        zzgow.zzaU(zzgkp.class, zzgkpVar);
    }

    private zzgkp() {
    }

    public static zzgko zzc() {
        return (zzgko) zzb.zzaA();
    }

    public static zzgkp zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgkp) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzh(zzgkp zzgkpVar, zzgks zzgksVar) {
        zzgksVar.getClass();
        zzgkpVar.zze = zzgksVar;
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
                    return new zzgko(null);
                }
                return new zzgkp();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgks zzf() {
        zzgks zzgksVar = this.zze;
        return zzgksVar == null ? zzgks.zzc() : zzgksVar;
    }
}
