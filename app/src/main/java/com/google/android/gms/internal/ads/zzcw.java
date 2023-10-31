package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcw {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    public static final zzn zzb;
    private static final zzbq zzr;
    private static final String zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;
    public Object zzc = zza;
    public zzbq zzd = zzr;
    public long zze;
    public long zzf;
    public long zzg;
    public boolean zzh;
    public boolean zzi;
    @Deprecated
    public boolean zzj;
    @Nullable
    public zzbg zzk;
    public boolean zzl;
    public long zzm;
    public long zzn;
    public int zzo;
    public int zzp;
    public static final Object zza = new Object();
    private static final Object zzq = new Object();

    static {
        zzat zzatVar = new zzat();
        zzatVar.zza("androidx.media3.common.Timeline");
        zzatVar.zzb(Uri.EMPTY);
        zzr = zzatVar.zzc();
        zzs = Integer.toString(1, 36);
        zzt = Integer.toString(2, 36);
        zzu = Integer.toString(3, 36);
        zzv = Integer.toString(4, 36);
        zzw = Integer.toString(5, 36);
        zzx = Integer.toString(6, 36);
        zzy = Integer.toString(7, 36);
        zzz = Integer.toString(8, 36);
        zzA = Integer.toString(9, 36);
        zzB = Integer.toString(10, 36);
        zzC = Integer.toString(11, 36);
        zzD = Integer.toString(12, 36);
        zzE = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcv
        };
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcw.class.equals(obj.getClass())) {
            zzcw zzcwVar = (zzcw) obj;
            if (zzfn.zzB(this.zzc, zzcwVar.zzc) && zzfn.zzB(this.zzd, zzcwVar.zzd) && zzfn.zzB(null, null) && zzfn.zzB(this.zzk, zzcwVar.zzk) && this.zze == zzcwVar.zze && this.zzf == zzcwVar.zzf && this.zzg == zzcwVar.zzg && this.zzh == zzcwVar.zzh && this.zzi == zzcwVar.zzi && this.zzl == zzcwVar.zzl && this.zzn == zzcwVar.zzn && this.zzo == zzcwVar.zzo && this.zzp == zzcwVar.zzp) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zzc.hashCode() + 217) * 31) + this.zzd.hashCode();
        zzbg zzbgVar = this.zzk;
        int hashCode2 = zzbgVar == null ? 0 : zzbgVar.hashCode();
        long j = this.zze;
        long j2 = this.zzf;
        long j3 = this.zzg;
        int i = (((((((((((((hashCode * 961) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzl ? 1 : 0);
        long j4 = this.zzn;
        return ((((((i * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzo) * 31) + this.zzp) * 31;
    }

    public final zzcw zza(Object obj, @Nullable zzbq zzbqVar, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable zzbg zzbgVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zzd = zzbqVar == null ? zzr : zzbqVar;
        this.zze = -9223372036854775807L;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = z;
        this.zzi = z2;
        this.zzj = zzbgVar != null;
        this.zzk = zzbgVar;
        this.zzm = 0L;
        this.zzn = j5;
        this.zzo = 0;
        this.zzp = 0;
        this.zzl = false;
        return this;
    }

    public final boolean zzb() {
        zzdy.zzf(this.zzj == (this.zzk != null));
        return this.zzk != null;
    }
}
