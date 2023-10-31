package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzazg extends zzgow implements zzgqh {
    private static final zzgpc zzb = new zzaze();
    private static final zzazg zzd;
    private int zze;
    private long zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private zzgpb zzj = zzgow.zzaJ();
    private zzazb zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private long zzr;

    static {
        zzazg zzazgVar = new zzazg();
        zzd = zzazgVar;
        zzgow.zzaU(zzazg.class, zzazgVar);
    }

    private zzazg() {
    }

    public static /* synthetic */ void zzA(zzazg zzazgVar, int i) {
        zzazgVar.zzm = i - 1;
        zzazgVar.zze |= 64;
    }

    public static /* synthetic */ void zzB(zzazg zzazgVar, int i) {
        zzazgVar.zzn = i - 1;
        zzazgVar.zze |= 128;
    }

    public static /* synthetic */ void zzC(zzazg zzazgVar, int i) {
        zzazgVar.zzp = i - 1;
        zzazgVar.zze |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static zzazf zzg() {
        return (zzazf) zzd.zzaA();
    }

    public static zzazg zzi(byte[] bArr) throws zzgpi {
        return (zzazg) zzgow.zzaF(zzd, bArr);
    }

    public static /* synthetic */ void zzl(zzazg zzazgVar, long j) {
        zzazgVar.zze |= 1;
        zzazgVar.zzf = j;
    }

    public static /* synthetic */ void zzm(zzazg zzazgVar, long j) {
        zzazgVar.zze |= 4;
        zzazgVar.zzh = j;
    }

    public static /* synthetic */ void zzn(zzazg zzazgVar, long j) {
        zzazgVar.zze |= 8;
        zzazgVar.zzi = j;
    }

    public static /* synthetic */ void zzo(zzazg zzazgVar, Iterable iterable) {
        zzgpb zzgpbVar = zzazgVar.zzj;
        if (!zzgpbVar.zzc()) {
            zzazgVar.zzj = zzgow.zzaK(zzgpbVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzazgVar.zzj.zzh(((zzaxv) it.next()).zza());
        }
    }

    public static /* synthetic */ void zzp(zzazg zzazgVar, zzazb zzazbVar) {
        zzazbVar.getClass();
        zzazgVar.zzk = zzazbVar;
        zzazgVar.zze |= 16;
    }

    public static /* synthetic */ void zzq(zzazg zzazgVar, int i) {
        zzazgVar.zze |= 256;
        zzazgVar.zzo = i;
    }

    public static /* synthetic */ void zzr(zzazg zzazgVar, zzazk zzazkVar) {
        zzazgVar.zzq = zzazkVar.zza();
        zzazgVar.zze |= 1024;
    }

    public static /* synthetic */ void zzs(zzazg zzazgVar, long j) {
        zzazgVar.zze |= 2048;
        zzazgVar.zzr = j;
    }

    public static /* synthetic */ void zzy(zzazg zzazgVar, int i) {
        zzazgVar.zzg = i - 1;
        zzazgVar.zze |= 2;
    }

    public static /* synthetic */ void zzz(zzazg zzazgVar, int i) {
        zzazgVar.zzl = i - 1;
        zzazgVar.zze |= 32;
    }

    public final int zza() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzayk.zza;
                return zzgow.zzaR(zzd, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n\rဂ\u000b", new Object[]{"zze", "zzf", "zzg", zzgpaVar, "zzh", "zzi", "zzj", zzaxu.zza, "zzk", "zzl", zzgpaVar, "zzm", zzgpaVar, "zzn", zzgpaVar, "zzo", "zzp", zzgpaVar, "zzq", zzazj.zza, "zzr"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzd;
                }
                return new zzazf(null);
            } else {
                return new zzazg();
            }
        }
        return (byte) 1;
    }

    public final long zzc() {
        return this.zzi;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final long zze() {
        return this.zzf;
    }

    public final zzazb zzf() {
        zzazb zzazbVar = this.zzk;
        return zzazbVar == null ? zzazb.zzd() : zzazbVar;
    }

    public final zzazk zzj() {
        zzazk zzb2 = zzazk.zzb(this.zzq);
        return zzb2 == null ? zzazk.UNSPECIFIED : zzb2;
    }

    public final List zzk() {
        return new zzgpd(this.zzj, zzb);
    }

    public final int zzt() {
        int zza = zzayl.zza(this.zzm);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzu() {
        int zza = zzayl.zza(this.zzn);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzv() {
        int zza = zzayl.zza(this.zzp);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzw() {
        int zza = zzayl.zza(this.zzg);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzx() {
        int zza = zzayl.zza(this.zzl);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
