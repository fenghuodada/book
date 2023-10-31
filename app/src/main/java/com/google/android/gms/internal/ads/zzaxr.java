package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxr extends zzgow implements zzgqh {
    private static final zzaxr zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzaxr zzaxrVar = new zzaxr();
        zzb = zzaxrVar;
        zzgow.zzaU(zzaxr.class, zzaxrVar);
    }

    private zzaxr() {
    }

    public static zzaxq zza() {
        return (zzaxq) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxr zzaxrVar, boolean z) {
        zzaxrVar.zzd |= 1;
        zzaxrVar.zze = z;
    }

    public static /* synthetic */ void zze(zzaxr zzaxrVar, boolean z) {
        zzaxrVar.zzd |= 2;
        zzaxrVar.zzf = z;
    }

    public static /* synthetic */ void zzf(zzaxr zzaxrVar, int i) {
        zzaxrVar.zzd |= 4;
        zzaxrVar.zzg = i;
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
                    return new zzaxq(null);
                }
                return new zzaxr();
            }
            return zzgow.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
