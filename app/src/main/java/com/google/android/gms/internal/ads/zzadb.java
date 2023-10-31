package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzadb extends zzabc {
    private final long zza;

    public zzadb(zzaap zzaapVar, long j) {
        super(zzaapVar);
        zzdy.zzd(zzaapVar.zzf() >= j);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzaap
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzaap
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabc, com.google.android.gms.internal.ads.zzaap
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
