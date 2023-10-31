package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfjq extends zzgow implements zzgqh {
    private static final zzgpc zzb = new zzfjn();
    private static final zzfjq zzd;
    private int zze;
    private zzgpb zzf = zzgow.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfjq zzfjqVar = new zzfjq();
        zzd = zzfjqVar;
        zzgow.zzaU(zzfjq.class, zzfjqVar);
    }

    private zzfjq() {
    }

    public static zzfjp zza() {
        return (zzfjp) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzfjq zzfjqVar, String str) {
        str.getClass();
        zzfjqVar.zze |= 1;
        zzfjqVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfjq zzfjqVar, int i) {
        zzgpb zzgpbVar = zzfjqVar.zzf;
        if (!zzgpbVar.zzc()) {
            zzfjqVar.zzf = zzgow.zzaK(zzgpbVar);
        }
        zzfjqVar.zzf.zzh(2);
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
                        return zzd;
                    }
                    return new zzfjp(null);
                }
                return new zzfjq();
            }
            return zzgow.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfjo.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
