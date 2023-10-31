package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazl extends zzgow implements zzgqh {
    private static final zzazl zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgpf zze = zzgow.zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzazl zzazlVar = new zzazl();
        zzb = zzazlVar;
        zzgow.zzaU(zzazl.class, zzazlVar);
    }

    private zzazl() {
    }

    public static zzazh zza() {
        return (zzazh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzazl zzazlVar, Iterable iterable) {
        zzgpf zzgpfVar = zzazlVar.zze;
        if (!zzgpfVar.zzc()) {
            zzazlVar.zze = zzgow.zzaO(zzgpfVar);
        }
        zzgmx.zzav(iterable, zzazlVar.zze);
    }

    public static /* synthetic */ void zze(zzazl zzazlVar, int i) {
        zzazlVar.zzd |= 1;
        zzazlVar.zzf = i;
    }

    public static /* synthetic */ void zzf(zzazl zzazlVar, int i) {
        zzazlVar.zzd |= 2;
        zzazlVar.zzg = i;
    }

    public static /* synthetic */ void zzg(zzazl zzazlVar, long j) {
        zzazlVar.zzd |= 4;
        zzazlVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzazl zzazlVar, String str) {
        str.getClass();
        zzazlVar.zzd |= 8;
        zzazlVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzazl zzazlVar, String str) {
        str.getClass();
        zzazlVar.zzd |= 16;
        zzazlVar.zzj = str;
    }

    public static /* synthetic */ void zzj(zzazl zzazlVar, long j) {
        zzazlVar.zzd |= 32;
        zzazlVar.zzk = j;
    }

    public static /* synthetic */ void zzk(zzazl zzazlVar, int i) {
        zzazlVar.zzd |= 64;
        zzazlVar.zzl = i;
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
                    return new zzazh(null);
                }
                return new zzazl();
            }
            return zzgow.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzazg.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
