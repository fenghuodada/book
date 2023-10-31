package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzcp {
    @Nullable
    public final Object zzb;
    public final int zzc;
    @Nullable
    public final zzbq zzd;
    @Nullable
    public final Object zze;
    public final int zzf;
    public final long zzg;
    public final long zzh;
    public final int zzi;
    public final int zzj;
    private static final String zzk = Integer.toString(0, 36);
    private static final String zzl = Integer.toString(1, 36);
    private static final String zzm = Integer.toString(2, 36);
    private static final String zzn = Integer.toString(3, 36);
    private static final String zzo = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public static final zzn zza = new zzn() { // from class: com.google.android.gms.internal.ads.zzco
    };

    public zzcp(@Nullable Object obj, int i, @Nullable zzbq zzbqVar, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzb = obj;
        this.zzc = i;
        this.zzd = zzbqVar;
        this.zze = obj2;
        this.zzf = i2;
        this.zzg = j;
        this.zzh = j2;
        this.zzi = i3;
        this.zzj = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzcp.class == obj.getClass()) {
            zzcp zzcpVar = (zzcp) obj;
            if (this.zzc == zzcpVar.zzc && this.zzf == zzcpVar.zzf && this.zzg == zzcpVar.zzg && this.zzh == zzcpVar.zzh && this.zzi == zzcpVar.zzi && this.zzj == zzcpVar.zzj && zzfou.zza(this.zzb, zzcpVar.zzb) && zzfou.zza(this.zze, zzcpVar.zze) && zzfou.zza(this.zzd, zzcpVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, Integer.valueOf(this.zzc), this.zzd, this.zze, Integer.valueOf(this.zzf), Long.valueOf(this.zzg), Long.valueOf(this.zzh), Integer.valueOf(this.zzi), Integer.valueOf(this.zzj)});
    }
}
