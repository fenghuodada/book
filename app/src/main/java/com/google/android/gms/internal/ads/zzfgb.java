package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfgb extends zzgow implements zzgqh {
    private static final zzfgb zzb;
    private zzgpf zzd = zzgow.zzaN();

    static {
        zzfgb zzfgbVar = new zzfgb();
        zzb = zzfgbVar;
        zzgow.zzaU(zzfgb.class, zzfgbVar);
    }

    private zzfgb() {
    }

    public static zzffy zzc() {
        return (zzffy) zzb.zzaA();
    }

    public static /* synthetic */ zzfgb zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfgb zzfgbVar) {
        zzfgbVar.zzd = zzgow.zzaN();
    }

    public static /* synthetic */ void zzf(zzfgb zzfgbVar, zzfga zzfgaVar) {
        zzfgaVar.getClass();
        zzgpf zzgpfVar = zzfgbVar.zzd;
        if (!zzgpfVar.zzc()) {
            zzfgbVar.zzd = zzgow.zzaO(zzgpfVar);
        }
        zzfgbVar.zzd.add(zzfgaVar);
    }

    public final int zza() {
        return this.zzd.size();
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
                    return new zzffy(null);
                }
                return new zzfgb();
            }
            return zzgow.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfga.class});
        }
        return (byte) 1;
    }
}
