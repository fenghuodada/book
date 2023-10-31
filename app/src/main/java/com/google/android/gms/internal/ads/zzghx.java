package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzghx extends zzgow implements zzgqh {
    private static final zzghx zzb;
    private int zzd;
    private zzgid zze;
    private zzgno zzf = zzgno.zzb;

    static {
        zzghx zzghxVar = new zzghx();
        zzb = zzghxVar;
        zzgow.zzaU(zzghx.class, zzghxVar);
    }

    private zzghx() {
    }

    public static zzghw zzc() {
        return (zzghw) zzb.zzaA();
    }

    public static zzghx zze() {
        return zzb;
    }

    public static zzghx zzf(zzgno zzgnoVar, zzgoi zzgoiVar) throws zzgpi {
        return (zzghx) zzgow.zzaG(zzb, zzgnoVar, zzgoiVar);
    }

    public static /* synthetic */ void zzj(zzghx zzghxVar, zzgid zzgidVar) {
        zzgidVar.getClass();
        zzghxVar.zze = zzgidVar;
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
                    return new zzghw(null);
                }
                return new zzghx();
            }
            return zzgow.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgid zzg() {
        zzgid zzgidVar = this.zze;
        return zzgidVar == null ? zzgid.zze() : zzgidVar;
    }

    public final zzgno zzh() {
        return this.zzf;
    }
}
