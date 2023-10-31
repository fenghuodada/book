package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgkm extends zzgow implements zzgqh {
    private static final zzgkm zzb;
    private int zzd;
    private zzgpf zze = zzgow.zzaN();

    static {
        zzgkm zzgkmVar = new zzgkm();
        zzb = zzgkmVar;
        zzgow.zzaU(zzgkm.class, zzgkmVar);
    }

    private zzgkm() {
    }

    public static zzgkj zza() {
        return (zzgkj) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzgkm zzgkmVar, zzgkl zzgklVar) {
        zzgklVar.getClass();
        zzgpf zzgpfVar = zzgkmVar.zze;
        if (!zzgpfVar.zzc()) {
            zzgkmVar.zze = zzgow.zzaO(zzgpfVar);
        }
        zzgkmVar.zze.add(zzgklVar);
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
                    return new zzgkj(null);
                }
                return new zzgkm();
            }
            return zzgow.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgkl.class});
        }
        return (byte) 1;
    }
}
