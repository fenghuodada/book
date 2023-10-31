package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtp extends zzgow implements zzgqh {
    private static final zzgtp zzb;
    private int zzd;
    private zzgto zze;
    private zzgno zzg;
    private zzgno zzh;
    private int zzi;
    private zzgno zzj;
    private byte zzk = 2;
    private zzgpf zzf = zzgow.zzaN();

    static {
        zzgtp zzgtpVar = new zzgtp();
        zzb = zzgtpVar;
        zzgow.zzaU(zzgtp.class, zzgtpVar);
    }

    private zzgtp() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zzg = zzgnoVar;
        this.zzh = zzgnoVar;
        this.zzj = zzgnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgtm(null);
                }
                return new zzgtp();
            }
            return zzgow.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgth.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
