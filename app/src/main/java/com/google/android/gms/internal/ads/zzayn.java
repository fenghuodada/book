package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;

/* loaded from: classes.dex */
public final class zzayn extends zzgow implements zzgqh {
    private static final zzayn zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private zzazx zzi;
    private zzayf zzk;
    private zzayi zzl;
    private zzazb zzm;
    private zzaxj zzn;
    private zzazl zzo;
    private zzbas zzp;
    private zzaxs zzq;
    private String zzf = "";
    private int zzh = 1000;
    private zzgpe zzj = zzgow.zzaL();

    static {
        zzayn zzaynVar = new zzayn();
        zzb = zzaynVar;
        zzgow.zzaU(zzayn.class, zzaynVar);
    }

    private zzayn() {
    }

    public static zzaym zzd() {
        return (zzaym) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzayn zzaynVar, String str) {
        str.getClass();
        zzaynVar.zzd |= 2;
        zzaynVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzayn zzaynVar, Iterable iterable) {
        zzgpe zzgpeVar = zzaynVar.zzj;
        if (!zzgpeVar.zzc()) {
            zzaynVar.zzj = zzgow.zzaM(zzgpeVar);
        }
        zzgmx.zzav(iterable, zzaynVar.zzj);
    }

    public static /* synthetic */ void zzj(zzayn zzaynVar, zzayf zzayfVar) {
        zzayfVar.getClass();
        zzaynVar.zzk = zzayfVar;
        zzaynVar.zzd |= 32;
    }

    public static /* synthetic */ void zzk(zzayn zzaynVar, zzaxj zzaxjVar) {
        zzaxjVar.getClass();
        zzaynVar.zzn = zzaxjVar;
        zzaynVar.zzd |= 256;
    }

    public static /* synthetic */ void zzl(zzayn zzaynVar, zzazl zzazlVar) {
        zzazlVar.getClass();
        zzaynVar.zzo = zzazlVar;
        zzaynVar.zzd |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static /* synthetic */ void zzm(zzayn zzaynVar, zzbas zzbasVar) {
        zzbasVar.getClass();
        zzaynVar.zzp = zzbasVar;
        zzaynVar.zzd |= 1024;
    }

    public static /* synthetic */ void zzn(zzayn zzaynVar, zzaxs zzaxsVar) {
        zzaxsVar.getClass();
        zzaynVar.zzq = zzaxsVar;
        zzaynVar.zzd |= 2048;
    }

    public final zzaxj zza() {
        zzaxj zzaxjVar = this.zzn;
        return zzaxjVar == null ? zzaxj.zzc() : zzaxjVar;
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
                    return new zzaym(null);
                }
                return new zzayn();
            }
            return zzgow.zzaR(zzb, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzayk.zza, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq"});
        }
        return (byte) 1;
    }

    public final zzayf zzc() {
        zzayf zzayfVar = this.zzk;
        return zzayfVar == null ? zzayf.zzc() : zzayfVar;
    }

    public final String zzf() {
        return this.zzf;
    }
}
