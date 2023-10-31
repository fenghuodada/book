package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzbx {
    public final Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzbx(zzbx zzbxVar) {
        this.zza = zzbxVar.zza;
        this.zzb = zzbxVar.zzb;
        this.zzc = zzbxVar.zzc;
        this.zzd = zzbxVar.zzd;
        this.zze = zzbxVar.zze;
    }

    public zzbx(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzbx(Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzbx(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public zzbx(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbx) {
            zzbx zzbxVar = (zzbx) obj;
            return this.zza.equals(zzbxVar.zza) && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd && this.zze == zzbxVar.zze;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + 527) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final zzbx zza(Object obj) {
        return this.zza.equals(obj) ? this : new zzbx(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }
}
