package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtk extends zzgow implements zzgqh {
    private static final zzgtk zzb;
    private int zzd;
    private zzgno zze;
    private zzgno zzf;
    private zzgno zzg;

    static {
        zzgtk zzgtkVar = new zzgtk();
        zzb = zzgtkVar;
        zzgow.zzaU(zzgtk.class, zzgtkVar);
    }

    private zzgtk() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zze = zzgnoVar;
        this.zzf = zzgnoVar;
        this.zzg = zzgnoVar;
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
                    return new zzgtj(null);
                }
                return new zzgtk();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
