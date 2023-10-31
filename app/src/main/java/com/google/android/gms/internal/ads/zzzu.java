package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzzu implements zzabn {
    private final zzzx zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzzu(zzzx zzzxVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.zza = zzzxVar;
        this.zzb = j;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
        this.zzf = j6;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zzb;
    }

    public final long zzf(long j) {
        return this.zza.zza(j);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        zzabo zzaboVar = new zzabo(j, zzzw.zzf(this.zza.zza(j), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzabl(zzaboVar, zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
