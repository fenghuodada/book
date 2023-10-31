package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0484a;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaac implements zzabn {
    public final int zza;
    public final int[] zzb;
    public final long[] zzc;
    public final long[] zzd;
    public final long[] zze;
    private final long zzf;

    public zzaac(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.zzb = iArr;
        this.zzc = jArr;
        this.zzd = jArr2;
        this.zze = jArr3;
        int length = iArr.length;
        this.zza = length;
        if (length <= 0) {
            this.zzf = 0L;
            return;
        }
        int i = length - 1;
        this.zzf = jArr2[i] + jArr3[i];
    }

    public final String toString() {
        int i = this.zza;
        String arrays = Arrays.toString(this.zzb);
        String arrays2 = Arrays.toString(this.zzc);
        String arrays3 = Arrays.toString(this.zze);
        String arrays4 = Arrays.toString(this.zzd);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(i);
        sb.append(", sizes=");
        sb.append(arrays);
        sb.append(", offsets=");
        sb.append(arrays2);
        sb.append(", timeUs=");
        sb.append(arrays3);
        sb.append(", durationsUs=");
        return C0484a.m12392a(sb, arrays4, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        int zzc = zzfn.zzc(this.zze, j, true, true);
        zzabo zzaboVar = new zzabo(this.zze[zzc], this.zzc[zzc]);
        if (zzaboVar.zzb >= j || zzc == this.zza - 1) {
            return new zzabl(zzaboVar, zzaboVar);
        }
        int i = zzc + 1;
        return new zzabl(zzaboVar, new zzabo(this.zze[i], this.zzc[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
