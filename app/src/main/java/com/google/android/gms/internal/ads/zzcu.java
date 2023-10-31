package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcu {
    @Nullable
    public Object zzb;
    @Nullable
    public Object zzc;
    public int zzd;
    public long zze;
    public long zzf;
    public boolean zzg;
    private zzd zzm = zzd.zza;
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzct
    };

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcu.class.equals(obj.getClass())) {
            zzcu zzcuVar = (zzcu) obj;
            if (zzfn.zzB(this.zzb, zzcuVar.zzb) && zzfn.zzB(this.zzc, zzcuVar.zzc) && this.zzd == zzcuVar.zzd && this.zze == zzcuVar.zze && this.zzg == zzcuVar.zzg && zzfn.zzB(this.zzm, zzcuVar.zzm)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zzb;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzc;
        int hashCode2 = ((((hashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.zzd;
        long j = this.zze;
        return this.zzm.hashCode() + (((((hashCode2 * 31) + ((int) (j ^ (j >>> 32)))) * 961) + (this.zzg ? 1 : 0)) * 31);
    }

    public final int zza(int i) {
        return this.zzm.zza(i).zzc;
    }

    public final int zzb() {
        int i = this.zzm.zzc;
        return 0;
    }

    public final int zzc(long j) {
        return -1;
    }

    public final int zzd(long j) {
        this.zzm.zzb(-1);
        return -1;
    }

    public final int zze(int i) {
        return this.zzm.zza(i).zza(-1);
    }

    public final int zzf(int i, int i2) {
        return this.zzm.zza(i).zza(i2);
    }

    public final int zzg() {
        int i = this.zzm.zze;
        return 0;
    }

    public final long zzh(int i, int i2) {
        zzc zza2 = this.zzm.zza(i);
        if (zza2.zzc != -1) {
            return zza2.zzf[i2];
        }
        return -9223372036854775807L;
    }

    public final long zzi(int i) {
        long j = this.zzm.zza(i).zzb;
        return 0L;
    }

    public final long zzj() {
        long j = this.zzm.zzd;
        return 0L;
    }

    public final long zzk(int i) {
        long j = this.zzm.zza(i).zzg;
        return 0L;
    }

    public final zzcu zzl(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, zzd zzdVar, boolean z) {
        this.zzb = obj;
        this.zzc = obj2;
        this.zzd = 0;
        this.zze = j;
        this.zzf = 0L;
        this.zzm = zzdVar;
        this.zzg = z;
        return this;
    }

    public final boolean zzm(int i) {
        zzb();
        if (i == -1) {
            this.zzm.zzb(-1);
            return false;
        }
        return false;
    }

    public final boolean zzn(int i) {
        boolean z = this.zzm.zza(i).zzh;
        return false;
    }
}
