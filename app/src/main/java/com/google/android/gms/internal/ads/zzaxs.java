package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxs extends zzgow implements zzgqh {
    private static final zzaxs zzb;
    private zzgpf zzd = zzgow.zzaN();

    static {
        zzaxs zzaxsVar = new zzaxs();
        zzb = zzaxsVar;
        zzgow.zzaU(zzaxs.class, zzaxsVar);
    }

    private zzaxs() {
    }

    public static zzaxm zza() {
        return (zzaxm) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaxs zzaxsVar, zzaxl zzaxlVar) {
        zzaxlVar.getClass();
        zzgpf zzgpfVar = zzaxsVar.zzd;
        if (!zzgpfVar.zzc()) {
            zzaxsVar.zzd = zzgow.zzaO(zzgpfVar);
        }
        zzaxsVar.zzd.add(zzaxlVar);
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
                    return new zzaxm(null);
                }
                return new zzaxs();
            }
            return zzgow.zzaR(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzaxl.class});
        }
        return (byte) 1;
    }
}
