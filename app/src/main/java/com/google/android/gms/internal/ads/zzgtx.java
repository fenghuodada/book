package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgtx extends zzgow implements zzgqh {
    private static final zzgtx zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgno zzg;
    private zzgno zzh;

    static {
        zzgtx zzgtxVar = new zzgtx();
        zzb = zzgtxVar;
        zzgow.zzaU(zzgtx.class, zzgtxVar);
    }

    private zzgtx() {
        zzgno zzgnoVar = zzgno.zzb;
        this.zzg = zzgnoVar;
        this.zzh = zzgnoVar;
    }

    public static zzgtv zza() {
        return (zzgtv) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgtx zzgtxVar, String str) {
        zzgtxVar.zzd |= 2;
        zzgtxVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgtx zzgtxVar, zzgno zzgnoVar) {
        zzgnoVar.getClass();
        zzgtxVar.zzd |= 4;
        zzgtxVar.zzg = zzgnoVar;
    }

    public static /* synthetic */ void zzf(zzgtx zzgtxVar, int i) {
        zzgtxVar.zze = 1;
        zzgtxVar.zzd = 1 | zzgtxVar.zzd;
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
                    return new zzgtv(null);
                }
                return new zzgtx();
            }
            return zzgow.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgtw.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
