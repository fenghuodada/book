package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;

/* loaded from: classes.dex */
public final class zzfl {
    @GuardedBy("this")
    private long zza;
    @GuardedBy("this")
    private long zzb;
    @GuardedBy("this")
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzfl(long j) {
        zzf(0L);
    }

    public final synchronized long zza(long j) {
        if (this.zzb == -9223372036854775807L) {
            long j2 = this.zza;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.zzd.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.zzb = j2 - j;
            notifyAll();
        }
        this.zzc = j;
        return j + this.zzb;
    }

    public final synchronized long zzb(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.zzc;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            long j6 = (j4 * 8589934592L) + j;
            j = Math.abs(j5 - j3) < Math.abs(j6 - j3) ? j5 : j6;
        }
        return zza((j * 1000000) / 90000);
    }

    public final synchronized long zzc() {
        long j = this.zza;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized long zzd() {
        long j;
        j = this.zzc;
        return j != -9223372036854775807L ? j + this.zzb : zzc();
    }

    public final synchronized long zze() {
        return this.zzb;
    }

    public final synchronized void zzf(long j) {
        this.zza = j;
        this.zzb = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }
}
