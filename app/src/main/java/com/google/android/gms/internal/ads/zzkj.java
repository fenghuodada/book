package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzkj {
    public final zztl zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzkj(zztl zztlVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        zzdy.zzd(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        zzdy.zzd(z5);
        this.zza = zztlVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
        this.zze = j4;
        this.zzf = false;
        this.zzg = z2;
        this.zzh = z3;
        this.zzi = z4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzkj.class == obj.getClass()) {
            zzkj zzkjVar = (zzkj) obj;
            if (this.zzb == zzkjVar.zzb && this.zzc == zzkjVar.zzc && this.zzd == zzkjVar.zzd && this.zze == zzkjVar.zze && this.zzg == zzkjVar.zzg && this.zzh == zzkjVar.zzh && this.zzi == zzkjVar.zzi && zzfn.zzB(this.zza, zzkjVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza.hashCode() + 527) * 31) + ((int) this.zzb)) * 31) + ((int) this.zzc)) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 961) + (this.zzg ? 1 : 0)) * 31) + (this.zzh ? 1 : 0)) * 31) + (this.zzi ? 1 : 0);
    }

    public final zzkj zza(long j) {
        return j == this.zzc ? this : new zzkj(this.zza, this.zzb, j, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }

    public final zzkj zzb(long j) {
        return j == this.zzb ? this : new zzkj(this.zza, j, this.zzc, this.zzd, this.zze, false, this.zzg, this.zzh, this.zzi);
    }
}
