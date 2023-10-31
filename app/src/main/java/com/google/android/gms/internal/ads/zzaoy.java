package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaoy extends zzgow implements zzgqh {
    private static final zzaoy zzb;
    private int zzd;
    private zzgpf zze = zzgow.zzaN();
    private zzgno zzf = zzgno.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzaoy zzaoyVar = new zzaoy();
        zzb = zzaoyVar;
        zzgow.zzaU(zzaoy.class, zzaoyVar);
    }

    private zzaoy() {
    }

    public static zzaox zza() {
        return (zzaox) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaoy zzaoyVar, zzgno zzgnoVar) {
        zzgpf zzgpfVar = zzaoyVar.zze;
        if (!zzgpfVar.zzc()) {
            zzaoyVar.zze = zzgow.zzaO(zzgpfVar);
        }
        zzaoyVar.zze.add(zzgnoVar);
    }

    public static /* synthetic */ void zze(zzaoy zzaoyVar, zzgno zzgnoVar) {
        zzaoyVar.zzd |= 1;
        zzaoyVar.zzf = zzgnoVar;
    }

    public static /* synthetic */ void zzf(zzaoy zzaoyVar, int i) {
        zzaoyVar.zzh = 4;
        zzaoyVar.zzd = 4 | zzaoyVar.zzd;
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
                    return new zzaox(null);
                }
                return new zzaoy();
            }
            return zzgow.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzaos.zza, "zzh", zzaoq.zza});
        }
        return (byte) 1;
    }
}
