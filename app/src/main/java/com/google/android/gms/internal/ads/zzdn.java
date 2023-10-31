package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzdn {
    @IntRange(from = 0)
    public final int zzc;
    @IntRange(from = 0)
    public final int zzd;
    @IntRange(from = 0, m13044to = 359)
    public final int zze;
    @FloatRange(from = 0.0d, fromInclusive = false)
    public final float zzf;
    public static final zzdn zza = new zzdn(0, 0, 0, 1.0f);
    private static final String zzg = Integer.toString(0, 36);
    private static final String zzh = Integer.toString(1, 36);
    private static final String zzi = Integer.toString(2, 36);
    private static final String zzj = Integer.toString(3, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdm
    };

    public zzdn(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0, m13044to = 359) int i3, @FloatRange(from = 0.0d, fromInclusive = false) float f) {
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzdn) {
            zzdn zzdnVar = (zzdn) obj;
            if (this.zzc == zzdnVar.zzc && this.zzd == zzdnVar.zzd && this.zze == zzdnVar.zze && this.zzf == zzdnVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zzc + 217) * 31) + this.zzd) * 31) + this.zze) * 31) + Float.floatToRawIntBits(this.zzf);
    }
}
