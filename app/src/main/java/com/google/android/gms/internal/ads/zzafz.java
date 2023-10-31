package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;

/* loaded from: classes.dex */
final class zzafz implements zzafx {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    @Nullable
    private final long[] zzf;

    private zzafz(long j, int i, long j2, long j3, @Nullable long[] jArr) {
        this.zza = j;
        this.zzb = i;
        this.zzc = j2;
        this.zzf = jArr;
        this.zzd = j3;
        this.zze = j3 != -1 ? j + j3 : -1L;
    }

    @Nullable
    public static zzafz zza(long j, long j2, zzabh zzabhVar, zzfd zzfdVar) {
        int zzn;
        int i = zzabhVar.zzg;
        int i2 = zzabhVar.zzd;
        int zze = zzfdVar.zze();
        if ((zze & 1) == 1 && (zzn = zzfdVar.zzn()) != 0) {
            int i3 = zze & 6;
            long zzp = zzfn.zzp(zzn, i * 1000000, i2);
            if (i3 != 6) {
                return new zzafz(j2, zzabhVar.zzc, zzp, -1L, null);
            }
            long zzs = zzfdVar.zzs();
            long[] jArr = new long[100];
            for (int i4 = 0; i4 < 100; i4++) {
                jArr[i4] = zzfdVar.zzk();
            }
            if (j != -1) {
                long j3 = j2 + zzs;
                if (j != j3) {
                    StringBuilder m12390a = C0486c.m12390a("XING data size mismatch: ", j, ", ");
                    m12390a.append(j3);
                    zzer.zze("XingSeeker", m12390a.toString());
                }
            }
            return new zzafz(j2, zzabhVar.zzc, zzp, zzs, jArr);
        }
        return null;
    }

    private final long zzd(int i) {
        return (this.zzc * i) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzc(long j) {
        long j2 = j - this.zza;
        if (!zzh() || j2 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzf;
        zzdy.zzb(jArr);
        double d = (j2 * 256.0d) / this.zzd;
        int zzc = zzfn.zzc(jArr, (long) d, true, true);
        long zzd = zzd(zzc);
        long j3 = jArr[zzc];
        int i = zzc + 1;
        long zzd2 = zzd(i);
        long j4 = zzc == 99 ? 256L : jArr[i];
        return Math.round((j3 == j4 ? 0.0d : (d - j3) / (j4 - j3)) * (zzd2 - zzd)) + zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        if (!zzh()) {
            zzabo zzaboVar = new zzabo(0L, this.zza + this.zzb);
            return new zzabl(zzaboVar, zzaboVar);
        }
        long max = Math.max(0L, Math.min(j, this.zzc));
        double d = (max * 100.0d) / this.zzc;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.zzf;
                zzdy.zzb(jArr);
                double d3 = jArr[i];
                d2 = (((i == 99 ? 256.0d : jArr[i + 1]) - d3) * (d - i)) + d3;
            }
        }
        zzabo zzaboVar2 = new zzabo(max, this.zza + Math.max(this.zzb, Math.min(Math.round((d2 / 256.0d) * this.zzd), this.zzd - 1)));
        return new zzabl(zzaboVar2, zzaboVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return this.zzf != null;
    }
}
