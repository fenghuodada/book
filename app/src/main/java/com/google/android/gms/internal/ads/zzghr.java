package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzghr extends zzgow implements zzgqh {
    private static final zzghr zzb;
    private int zzd;
    private zzghx zze;
    private zzgjj zzf;

    static {
        zzghr zzghrVar = new zzghr();
        zzb = zzghrVar;
        zzgow.zzaU(zzghr.class, zzghrVar);
    }

    private zzghr() {
    }

    public static zzghq zzc() {
        return (zzghq) zzb.zzaA();
    }

    public static zzghr zze(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzghr) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzi(zzghr zzghrVar, zzghx zzghxVar) {
        zzghxVar.getClass();
        zzghrVar.zze = zzghxVar;
    }

    public static /* synthetic */ void zzj(zzghr zzghrVar, zzgjj zzgjjVar) {
        zzgjjVar.getClass();
        zzghrVar.zzf = zzgjjVar;
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
                    return new zzghq(null);
                }
                return new zzghr();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzghx zzf() {
        zzghx zzghxVar = this.zze;
        return zzghxVar == null ? zzghx.zze() : zzghxVar;
    }

    public final zzgjj zzg() {
        zzgjj zzgjjVar = this.zzf;
        return zzgjjVar == null ? zzgjj.zze() : zzgjjVar;
    }
}
