package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzakf implements zzabn {
    private final zzakc zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzakf(zzakc zzakcVar, int i, long j, long j2) {
        this.zza = zzakcVar;
        this.zzb = i;
        this.zzc = j;
        long j3 = (j2 - j) / zzakcVar.zzd;
        this.zzd = j3;
        this.zze = zza(j3);
    }

    private final long zza(long j) {
        return zzfn.zzp(j * this.zzb, 1000000L, this.zza.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        long max = Math.max(0L, Math.min((this.zza.zzc * j) / (this.zzb * 1000000), this.zzd - 1));
        long j2 = (this.zza.zzd * max) + this.zzc;
        long zza = zza(max);
        zzabo zzaboVar = new zzabo(zza, j2);
        if (zza >= j || max == this.zzd - 1) {
            return new zzabl(zzaboVar, zzaboVar);
        }
        long j3 = max + 1;
        return new zzabl(zzaboVar, new zzabo(zza(j3), (this.zza.zzd * j3) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return true;
    }
}
