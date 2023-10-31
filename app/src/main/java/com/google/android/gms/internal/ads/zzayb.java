package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayb extends zzgow implements zzgqh {
    private static final zzayb zzb;
    private int zzd;
    private String zze = "";
    private zzgpf zzf = zzgow.zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayb zzaybVar = new zzayb();
        zzb = zzaybVar;
        zzgow.zzaU(zzayb.class, zzaybVar);
    }

    private zzayb() {
    }

    public static zzayb zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzayb zzaybVar, String str) {
        str.getClass();
        zzaybVar.zzd |= 1;
        zzaybVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzayk.zza;
                return zzgow.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", zzaxx.class, "zzg", zzgpaVar, "zzh", zzgpaVar, "zzi", zzgpaVar});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzaya(null);
            } else {
                return new zzayb();
            }
        }
        return (byte) 1;
    }
}
