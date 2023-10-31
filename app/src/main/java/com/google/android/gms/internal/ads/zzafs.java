package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
final class zzafs implements zzafx {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzafs(long[] jArr, long[] jArr2, long j) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j == -9223372036854775807L ? zzfn.zzo(jArr2[jArr2.length - 1]) : j;
    }

    public static zzafs zza(long j, zzaej zzaejVar, long j2) {
        int length = zzaejVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += zzaejVar.zzb + zzaejVar.zzd[i3];
            j3 += zzaejVar.zzc + zzaejVar.zze[i3];
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new zzafs(jArr, jArr2, j2);
    }

    private static Pair zzd(long j, long[] jArr, long[] jArr2) {
        Long valueOf;
        Long valueOf2;
        int zzc = zzfn.zzc(jArr, j, true, true);
        long j2 = jArr[zzc];
        long j3 = jArr2[zzc];
        int i = zzc + 1;
        if (i == jArr.length) {
            valueOf = Long.valueOf(j2);
            valueOf2 = Long.valueOf(j3);
        } else {
            long j4 = jArr[i];
            long j5 = jArr2[i];
            double d = j4 == j2 ? 0.0d : (j - j2) / (j4 - j2);
            valueOf = Long.valueOf(j);
            valueOf2 = Long.valueOf(((long) (d * (j5 - j3))) + j3);
        }
        return Pair.create(valueOf, valueOf2);
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzb() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzafx
    public final long zzc(long j) {
        return zzfn.zzo(((Long) zzd(j, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        Pair zzd = zzd(zzfn.zzq(Math.max(0L, Math.min(j, this.zzc))), this.zzb, this.zza);
        zzabo zzaboVar = new zzabo(zzfn.zzo(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzabl(zzaboVar, zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
