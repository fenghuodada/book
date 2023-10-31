package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgig extends zzgow implements zzgqh {
    private static final zzgig zzb;
    private int zzd;
    private zzgim zze;
    private zzgno zzf = zzgno.zzb;

    static {
        zzgig zzgigVar = new zzgig();
        zzb = zzgigVar;
        zzgow.zzaU(zzgig.class, zzgigVar);
    }

    private zzgig() {
    }

    public static zzgif zzc() {
        return (zzgif) zzb.zzaA();
    }

    public static zzgig zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgig) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzi(zzgig zzgigVar, zzgim zzgimVar) {
        zzgimVar.getClass();
        zzgigVar.zze = zzgimVar;
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
                    return new zzgif(null);
                }
                return new zzgig();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgim zzf() {
        zzgim zzgimVar = this.zze;
        return zzgimVar == null ? zzgim.zze() : zzgimVar;
    }

    public final zzgno zzg() {
        return this.zzf;
    }
}
