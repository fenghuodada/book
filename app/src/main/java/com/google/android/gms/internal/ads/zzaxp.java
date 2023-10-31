package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxp extends zzgow implements zzgqh {
    private static final zzaxp zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzaxp zzaxpVar = new zzaxp();
        zzb = zzaxpVar;
        zzgow.zzaU(zzaxp.class, zzaxpVar);
    }

    private zzaxp() {
    }

    public static zzaxo zza() {
        return (zzaxo) zzb.zzaA();
    }

    public static zzaxp zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaxp zzaxpVar, boolean z) {
        zzaxpVar.zzd |= 1;
        zzaxpVar.zze = z;
    }

    public static /* synthetic */ void zzf(zzaxp zzaxpVar, int i) {
        zzaxpVar.zzd |= 2;
        zzaxpVar.zzf = i;
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
                    return new zzaxo(null);
                }
                return new zzaxp();
            }
            return zzgow.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
