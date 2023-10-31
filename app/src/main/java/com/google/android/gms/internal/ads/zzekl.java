package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzekl implements zzeqq {
    private final Clock zza;
    private final zzfaa zzb;

    public zzekl(Clock clock, zzfaa zzfaaVar) {
        this.zza = clock;
        this.zzb = zzfaaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzh(new zzekm(this.zzb, this.zza.currentTimeMillis()));
    }
}
