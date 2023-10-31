package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzffa implements zzfen {
    private final zzfex zza;
    private final zzfev zzb;

    public zzffa(zzfex zzfexVar, zzfev zzfevVar) {
        this.zza = zzfexVar;
        this.zzb = zzfevVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final String zza(zzfem zzfemVar) {
        zzfex zzfexVar = this.zza;
        Map zzj = zzfemVar.zzj();
        this.zzb.zza(zzj);
        return zzfexVar.zza(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final void zzb(zzfem zzfemVar) {
    }
}
