package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzabg implements zzabn {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzabg(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        zzdy.zzd(length == length2);
        boolean z = length2 > 0;
        this.zzd = z;
        if (!z || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        if (!this.zzd) {
            zzabo zzaboVar = zzabo.zza;
            return new zzabl(zzaboVar, zzaboVar);
        }
        int zzc = zzfn.zzc(this.zzb, j, true, true);
        zzabo zzaboVar2 = new zzabo(this.zzb[zzc], this.zza[zzc]);
        if (zzaboVar2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzc != jArr.length - 1) {
                int i = zzc + 1;
                return new zzabl(zzaboVar2, new zzabo(jArr[i], this.zza[i]));
            }
        }
        return new zzabl(zzaboVar2, zzaboVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return this.zzd;
    }
}
