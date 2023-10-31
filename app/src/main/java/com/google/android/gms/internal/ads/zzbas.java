package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbas extends zzgow implements zzgqh {
    private static final zzbas zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbas zzbasVar = new zzbas();
        zzb = zzbasVar;
        zzgow.zzaU(zzbas.class, zzbasVar);
    }

    private zzbas() {
    }

    public static zzbar zza() {
        return (zzbar) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbas zzbasVar, boolean z) {
        zzbasVar.zzd |= 1;
        zzbasVar.zze = z;
    }

    public static /* synthetic */ void zze(zzbas zzbasVar, int i) {
        zzbasVar.zzd |= 2;
        zzbasVar.zzf = i;
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
                    return new zzbar(null);
                }
                return new zzbas();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
