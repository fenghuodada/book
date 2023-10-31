package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfga extends zzgow implements zzgqh {
    private static final zzfga zzb;
    private zzffw zzd;

    static {
        zzfga zzfgaVar = new zzfga();
        zzb = zzfgaVar;
        zzgow.zzaU(zzfga.class, zzfgaVar);
    }

    private zzfga() {
    }

    public static zzffz zza() {
        return (zzffz) zzb.zzaA();
    }

    public static /* synthetic */ zzfga zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfga zzfgaVar, zzffw zzffwVar) {
        zzffwVar.getClass();
        zzfgaVar.zzd = zzffwVar;
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
                    return new zzffz(null);
                }
                return new zzfga();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0000\u0000\u0006\t", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
