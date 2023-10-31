package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaaz implements zzabn {
    private final zzabb zza;
    private final long zzb;

    public zzaaz(zzabb zzabbVar, long j) {
        this.zza = zzabbVar;
        this.zzb = j;
    }

    private final zzabo zza(long j, long j2) {
        return new zzabo((j * 1000000) / this.zza.zze, this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        zzdy.zzb(this.zza.zzk);
        zzabb zzabbVar = this.zza;
        zzaba zzabaVar = zzabbVar.zzk;
        long[] jArr = zzabaVar.zza;
        long[] jArr2 = zzabaVar.zzb;
        int zzc = zzfn.zzc(jArr, zzabbVar.zzb(j), true, false);
        zzabo zza = zza(zzc == -1 ? 0L : jArr[zzc], zzc != -1 ? jArr2[zzc] : 0L);
        if (zza.zzb == j || zzc == jArr.length - 1) {
            return new zzabl(zza, zza);
        }
        int i = zzc + 1;
        return new zzabl(zza, zza(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
