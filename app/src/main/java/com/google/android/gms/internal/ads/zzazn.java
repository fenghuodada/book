package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazn extends zzgow implements zzgqh {
    private static final zzazn zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzazp zzo;

    static {
        zzazn zzaznVar = new zzazn();
        zzb = zzaznVar;
        zzgow.zzaU(zzazn.class, zzaznVar);
    }

    private zzazn() {
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzayk.zza;
                return zzgow.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", zzgpaVar, "zzf", zzgpaVar, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzazm(null);
            } else {
                return new zzazn();
            }
        }
        return (byte) 1;
    }
}
