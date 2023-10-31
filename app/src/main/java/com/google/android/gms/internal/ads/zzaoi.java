package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzaoi extends zzgow implements zzgqh {
    private static final zzaoi zzb;
    private int zzd;
    private long zzt;
    private long zzu;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private int zzk = 1000;
    private long zzl = -1;
    private long zzm = -1;
    private long zzn = -1;
    private int zzo = 1000;
    private long zzp = -1;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzv = -1;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;

    static {
        zzaoi zzaoiVar = new zzaoi();
        zzb = zzaoiVar;
        zzgow.zzaU(zzaoi.class, zzaoiVar);
    }

    private zzaoi() {
    }

    public static zzaoh zza() {
        return (zzaoh) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 1;
        zzaoiVar.zze = j;
    }

    public static /* synthetic */ void zze(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 2;
        zzaoiVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 4;
        zzaoiVar.zzg = j;
    }

    public static /* synthetic */ void zzg(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 8;
        zzaoiVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzaoi zzaoiVar) {
        zzaoiVar.zzd &= -9;
        zzaoiVar.zzh = -1L;
    }

    public static /* synthetic */ void zzi(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 16;
        zzaoiVar.zzi = j;
    }

    public static /* synthetic */ void zzj(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 32;
        zzaoiVar.zzj = j;
    }

    public static /* synthetic */ void zzk(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 128;
        zzaoiVar.zzl = j;
    }

    public static /* synthetic */ void zzl(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 256;
        zzaoiVar.zzm = j;
    }

    public static /* synthetic */ void zzm(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= AdRequest.MAX_CONTENT_URL_LENGTH;
        zzaoiVar.zzn = j;
    }

    public static /* synthetic */ void zzn(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 2048;
        zzaoiVar.zzp = j;
    }

    public static /* synthetic */ void zzo(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 4096;
        zzaoiVar.zzq = j;
    }

    public static /* synthetic */ void zzp(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 8192;
        zzaoiVar.zzr = j;
    }

    public static /* synthetic */ void zzq(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
        zzaoiVar.zzs = j;
    }

    public static /* synthetic */ void zzr(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 32768;
        zzaoiVar.zzt = j;
    }

    public static /* synthetic */ void zzs(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 65536;
        zzaoiVar.zzu = j;
    }

    public static /* synthetic */ void zzt(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 131072;
        zzaoiVar.zzv = j;
    }

    public static /* synthetic */ void zzu(zzaoi zzaoiVar, long j) {
        zzaoiVar.zzd |= 262144;
        zzaoiVar.zzw = j;
    }

    public static /* synthetic */ void zzv(zzaoi zzaoiVar, int i) {
        zzaoiVar.zzk = i - 1;
        zzaoiVar.zzd |= 64;
    }

    public static /* synthetic */ void zzw(zzaoi zzaoiVar, int i) {
        zzaoiVar.zzo = i - 1;
        zzaoiVar.zzd |= 1024;
    }

    @Override // com.google.android.gms.internal.ads.zzgow
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 2) {
                zzgpa zzgpaVar = zzaor.zza;
                return zzgow.zzaR(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဌ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဌ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzgpaVar, "zzl", "zzm", "zzn", "zzo", zzgpaVar, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy"});
            } else if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        return null;
                    }
                    return zzb;
                }
                return new zzaoh(null);
            } else {
                return new zzaoi();
            }
        }
        return (byte) 1;
    }
}
