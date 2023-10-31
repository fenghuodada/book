package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzebw implements zzebv {
    @VisibleForTesting
    public final zzebv zza;
    private final zzfon zzb;

    public zzebw(zzebv zzebvVar, zzfon zzfonVar) {
        this.zza = zzebvVar;
        this.zzb = zzfonVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(zzezr zzezrVar, zzezf zzezfVar) {
        return zzfvr.zzl(this.zza.zza(zzezrVar, zzezfVar), this.zzb, zzcag.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        return this.zza.zzb(zzezrVar, zzezfVar);
    }
}
