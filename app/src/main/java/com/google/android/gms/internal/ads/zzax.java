package com.google.android.gms.internal.ads;

import androidx.annotation.IntRange;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzax {
    @IntRange(from = 0)
    public final long zzc = 0;
    public final long zzd = Long.MIN_VALUE;
    public final boolean zze = false;
    public final boolean zzf = false;
    public final boolean zzg = false;
    public static final zzax zza = new zzaz(new zzav(), null);
    private static final String zzh = Integer.toString(0, 36);
    private static final String zzi = Integer.toString(1, 36);
    private static final String zzj = Integer.toString(2, 36);
    private static final String zzk = Integer.toString(3, 36);
    private static final String zzl = Integer.toString(4, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzau
    };

    public /* synthetic */ zzax(zzav zzavVar, zzaw zzawVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzax) {
            long j = ((zzax) obj).zzc;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((int) (-9223372034707292160L)) * 29791;
    }
}
