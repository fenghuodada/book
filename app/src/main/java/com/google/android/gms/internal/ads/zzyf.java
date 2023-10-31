package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzyf {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j = this.zze;
        if (j == 0) {
            return 0L;
        }
        return this.zzf / j;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j) {
        int i;
        long j2 = this.zzd;
        if (j2 == 0) {
            this.zza = j;
        } else if (j2 == 1) {
            long j3 = j - this.zza;
            this.zzb = j3;
            this.zzf = j3;
            this.zze = 1L;
        } else {
            long j4 = j - this.zzc;
            int i2 = (int) (j2 % 15);
            if (Math.abs(j4 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j4;
                boolean[] zArr = this.zzg;
                if (zArr[i2]) {
                    zArr[i2] = false;
                    i = this.zzh - 1;
                    this.zzh = i;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i2]) {
                    zArr2[i2] = true;
                    i = this.zzh + 1;
                    this.zzh = i;
                }
            }
        }
        this.zzd++;
        this.zzc = j;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j = this.zzd;
        if (j == 0) {
            return false;
        }
        return this.zzg[(int) ((j - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}
