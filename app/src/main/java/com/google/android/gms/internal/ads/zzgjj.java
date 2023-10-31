package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgjj extends zzgow implements zzgqh {
    private static final zzgjj zzb;
    private int zzd;
    private zzgjp zze;
    private zzgno zzf = zzgno.zzb;

    static {
        zzgjj zzgjjVar = new zzgjj();
        zzb = zzgjjVar;
        zzgow.zzaU(zzgjj.class, zzgjjVar);
    }

    private zzgjj() {
    }

    public static zzgji zzc() {
        return (zzgji) zzb.zzaA();
    }

    public static zzgjj zze() {
        return zzb;
    }

    public static zzgjj zzf(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzgjj) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzj(zzgjj zzgjjVar, zzgjp zzgjpVar) {
        zzgjpVar.getClass();
        zzgjjVar.zze = zzgjpVar;
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
                    return new zzgji(null);
                }
                return new zzgjj();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgjp zzg() {
        zzgjp zzgjpVar = this.zze;
        return zzgjpVar == null ? zzgjp.zze() : zzgjpVar;
    }

    public final zzgno zzh() {
        return this.zzf;
    }
}
