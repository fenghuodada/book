package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazx extends zzgow implements zzgqh {
    private static final zzazx zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzazx zzazxVar = new zzazx();
        zzb = zzazxVar;
        zzgow.zzaU(zzazx.class, zzazxVar);
    }

    private zzazx() {
    }

    public static zzazw zza() {
        return (zzazw) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzazx zzazxVar, int i) {
        zzazxVar.zzd |= 1;
        zzazxVar.zze = i;
    }

    public static /* synthetic */ void zze(zzazx zzazxVar, int i) {
        zzazxVar.zzd |= 2;
        zzazxVar.zzf = i;
    }

    public static /* synthetic */ void zzf(zzazx zzazxVar, int i) {
        zzazxVar.zzd |= 4;
        zzazxVar.zzg = i;
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
                    return new zzazw(null);
                }
                return new zzazx();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
