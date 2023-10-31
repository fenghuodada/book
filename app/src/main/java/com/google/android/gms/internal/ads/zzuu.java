package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzuu implements zzxg {
    public long zza;
    public long zzb;
    @Nullable
    public zzxf zzc;
    @Nullable
    public zzuu zzd;

    public zzuu(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final zzuu zzb() {
        this.zzc = null;
        zzuu zzuuVar = this.zzd;
        this.zzd = null;
        return zzuuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    public final zzxf zzc() {
        zzxf zzxfVar = this.zzc;
        zzxfVar.getClass();
        return zzxfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxg
    @Nullable
    public final zzxg zzd() {
        zzuu zzuuVar = this.zzd;
        if (zzuuVar == null || zzuuVar.zzc == null) {
            return null;
        }
        return zzuuVar;
    }

    public final void zze(long j, int i) {
        zzdy.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }
}
