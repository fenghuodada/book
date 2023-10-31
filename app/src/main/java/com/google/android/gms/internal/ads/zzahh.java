package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahh implements zzahn {
    private final zzabb zza;
    private final zzaba zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzahh(zzabb zzabbVar, zzaba zzabaVar) {
        this.zza = zzabbVar;
        this.zzb = zzabaVar;
    }

    public final void zza(long j) {
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final long zzd(zzaap zzaapVar) {
        long j = this.zzd;
        if (j >= 0) {
            this.zzd = -1L;
            return -(j + 2);
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final zzabn zze() {
        zzdy.zzf(this.zzc != -1);
        return new zzaaz(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzg(long j) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzfn.zzc(jArr, j, true, true)];
    }
}
