package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayf extends zzgow implements zzgqh {
    private static final zzayf zzb;
    private int zzd;
    private zzazv zzf;
    private int zzg;
    private zzazx zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzayf zzayfVar = new zzayf();
        zzb = zzayfVar;
        zzgow.zzaU(zzayf.class, zzayfVar);
    }

    private zzayf() {
    }

    public static zzayf zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzayf zzayfVar, String str) {
        zzayfVar.zzd |= 1;
        zzayfVar.zze = str;
    }

    public static /* synthetic */ void zze(zzayf zzayfVar, zzazx zzazxVar) {
        zzazxVar.getClass();
        zzayfVar.zzh = zzazxVar;
        zzayfVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzayk.zza;
                return zzgow.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgpaVar, "zzk", zzgpaVar, "zzl", zzgpaVar});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzaye(null);
            } else {
                return new zzayf();
            }
        }
        return (byte) 1;
    }
}
