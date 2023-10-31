package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaxj extends zzgow implements zzgqh {
    private static final zzaxj zzb;
    private int zzd;
    private int zze;
    private zzaxz zzg;
    private zzayb zzh;
    private zzayd zzj;
    private zzazn zzk;
    private zzazd zzl;
    private zzayr zzm;
    private zzayt zzn;
    private int zzf = 1000;
    private zzgpf zzi = zzgow.zzaN();
    private zzgpf zzo = zzgow.zzaN();

    static {
        zzaxj zzaxjVar = new zzaxj();
        zzb = zzaxjVar;
        zzgow.zzaU(zzaxj.class, zzaxjVar);
    }

    private zzaxj() {
    }

    public static zzaxj zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzaxj zzaxjVar, zzaxh zzaxhVar) {
        zzaxjVar.zze = zzaxhVar.zza();
        zzaxjVar.zzd |= 1;
    }

    public static /* synthetic */ void zzf(zzaxj zzaxjVar, zzayb zzaybVar) {
        zzaybVar.getClass();
        zzaxjVar.zzh = zzaybVar;
        zzaxjVar.zzd |= 8;
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
                    return new zzaxi(null);
                }
                return new zzaxj();
            }
            return zzgow.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzaxg.zza, "zzf", zzayk.zza, "zzg", "zzh", "zzi", zzaxx.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzazz.class});
        }
        return (byte) 1;
    }

    public final zzayb zzd() {
        zzayb zzaybVar = this.zzh;
        return zzaybVar == null ? zzayb.zzc() : zzaybVar;
    }
}
