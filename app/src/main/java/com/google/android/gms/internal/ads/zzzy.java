package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzzy {
    public static final zzzy zza = new zzzy(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzzy(int i, long j, long j2) {
        this.zzb = i;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzzy zzd(long j, long j2) {
        return new zzzy(-1, j, j2);
    }

    public static zzzy zze(long j) {
        return new zzzy(0, -9223372036854775807L, j);
    }

    public static zzzy zzf(long j, long j2) {
        return new zzzy(-2, j, j2);
    }
}
