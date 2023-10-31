package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzlt {
    public final long zza;
    public final zzcx zzb;
    public final int zzc;
    @Nullable
    public final zztl zzd;
    public final long zze;
    public final zzcx zzf;
    public final int zzg;
    @Nullable
    public final zztl zzh;
    public final long zzi;
    public final long zzj;

    public zzlt(long j, zzcx zzcxVar, int i, @Nullable zztl zztlVar, long j2, zzcx zzcxVar2, int i2, @Nullable zztl zztlVar2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzcxVar;
        this.zzc = i;
        this.zzd = zztlVar;
        this.zze = j2;
        this.zzf = zzcxVar2;
        this.zzg = i2;
        this.zzh = zztlVar2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzlt.class == obj.getClass()) {
            zzlt zzltVar = (zzlt) obj;
            if (this.zza == zzltVar.zza && this.zzc == zzltVar.zzc && this.zze == zzltVar.zze && this.zzg == zzltVar.zzg && this.zzi == zzltVar.zzi && this.zzj == zzltVar.zzj && zzfou.zza(this.zzb, zzltVar.zzb) && zzfou.zza(this.zzd, zzltVar.zzd) && zzfou.zza(this.zzf, zzltVar.zzf) && zzfou.zza(this.zzh, zzltVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
