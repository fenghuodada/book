package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzua implements zzvc {
    private final zzvc zza;
    private final long zzb;

    public zzua(zzvc zzvcVar, long j) {
        this.zza = zzvcVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zza(zzkf zzkfVar, zzhi zzhiVar, int i) {
        int zza = this.zza.zza(zzkfVar, zzhiVar, i);
        if (zza == -4) {
            zzhiVar.zzd = Math.max(0L, zzhiVar.zzd + this.zzb);
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvc zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final boolean zze() {
        return this.zza.zze();
    }
}
