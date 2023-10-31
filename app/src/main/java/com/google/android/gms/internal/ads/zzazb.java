package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazb extends zzgow implements zzgqh {
    private static final zzazb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazb zzazbVar = new zzazb();
        zzb = zzazbVar;
        zzgow.zzaU(zzazb.class, zzazbVar);
    }

    private zzazb() {
    }

    public static zzayu zza() {
        return (zzayu) zzb.zzaA();
    }

    public static zzazb zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzazb zzazbVar, int i) {
        zzazbVar.zze = i - 1;
        zzazbVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzazb zzazbVar, int i) {
        zzazbVar.zzf = i - 1;
        zzazbVar.zzd |= 2;
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
                    return new zzayu(null);
                }
                return new zzazb();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", zzayz.zza, "zzf", zzayw.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzayx.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzaza.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
