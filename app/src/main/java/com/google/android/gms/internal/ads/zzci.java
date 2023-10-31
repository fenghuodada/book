package com.google.android.gms.internal.ads;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzci {
    public final float zzc;
    public final float zzd;
    private final int zzg;
    public static final zzci zza = new zzci(1.0f, 1.0f);
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzch
    };

    public zzci(@FloatRange(from = 0.0d, fromInclusive = false) float f, @FloatRange(from = 0.0d, fromInclusive = false) float f2) {
        zzdy.zzd(f > 0.0f);
        zzdy.zzd(f2 > 0.0f);
        this.zzc = f;
        this.zzd = f2;
        this.zzg = Math.round(f * 1000.0f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzci.class == obj.getClass()) {
            zzci zzciVar = (zzci) obj;
            if (this.zzc == zzciVar.zzc && this.zzd == zzciVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.zzc) + 527) * 31) + Float.floatToRawIntBits(this.zzd);
    }

    public final String toString() {
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.zzc), Float.valueOf(this.zzd));
    }

    public final long zza(long j) {
        return j * this.zzg;
    }
}
