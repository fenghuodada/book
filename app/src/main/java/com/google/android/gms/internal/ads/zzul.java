package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzul implements zzvc {
    final /* synthetic */ zzuo zza;
    private final int zzb;

    public zzul(zzuo zzuoVar, int i) {
        this.zza = zzuoVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zza(zzkf zzkfVar, zzhi zzhiVar, int i) {
        return this.zza.zzg(this.zzb, zzkfVar, zzhiVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final int zzb(long j) {
        return this.zza.zzi(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final void zzd() throws IOException {
        this.zza.zzH(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzvc
    public final boolean zze() {
        return this.zza.zzO(this.zzb);
    }
}
