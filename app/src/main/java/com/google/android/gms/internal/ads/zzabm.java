package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzabm implements zzabn {
    private final long zza;
    private final zzabl zzb;

    public zzabm(long j, long j2) {
        this.zza = j;
        zzabo zzaboVar = j2 == 0 ? zzabo.zza : new zzabo(0L, j2);
        this.zzb = new zzabl(zzaboVar, zzaboVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final zzabl zzg(long j) {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzabn
    public final boolean zzh() {
        return false;
    }
}
