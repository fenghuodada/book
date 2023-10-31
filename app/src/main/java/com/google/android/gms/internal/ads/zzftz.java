package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzftz extends zzfua {
    public static int zza(long j) {
        int i = (int) j;
        if (i == j) {
            return i;
        }
        throw new IllegalArgumentException(zzfpo.zzb("Out of range: %s", Long.valueOf(j)));
    }

    public static int zzb(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int zzc(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
