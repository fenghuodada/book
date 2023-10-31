package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaok extends zzgow implements zzgqh {
    private static final zzaok zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzaok zzaokVar = new zzaok();
        zzb = zzaokVar;
        zzgow.zzaU(zzaok.class, zzaokVar);
    }

    private zzaok() {
    }

    public static zzaoj zza() {
        return (zzaoj) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaok zzaokVar, long j) {
        zzaokVar.zzd |= 1;
        zzaokVar.zze = j;
    }

    public static /* synthetic */ void zze(zzaok zzaokVar, long j) {
        zzaokVar.zzd |= 4;
        zzaokVar.zzg = j;
    }

    public static /* synthetic */ void zzf(zzaok zzaokVar, long j) {
        zzaokVar.zzd |= 8;
        zzaokVar.zzh = j;
    }

    public static /* synthetic */ void zzg(zzaok zzaokVar, long j) {
        zzaokVar.zzd |= 16;
        zzaokVar.zzi = j;
    }

    public static /* synthetic */ void zzh(zzaok zzaokVar, long j) {
        zzaokVar.zzd |= 32;
        zzaokVar.zzj = j;
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
                    return new zzaoj(null);
                }
                return new zzaok();
            }
            return zzgow.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
