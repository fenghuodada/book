package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzemn implements zzeqq {
    private final AtomicReference zza = new AtomicReference();
    private final Clock zzb;
    private final zzeqq zzc;
    private final long zzd;

    public zzemn(zzeqq zzeqqVar, long j, Clock clock) {
        this.zzb = clock;
        this.zzc = zzeqqVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 16;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzemm zzemmVar = (zzemm) this.zza.get();
        if (zzemmVar == null || zzemmVar.zza()) {
            zzemmVar = new zzemm(this.zzc.zzb(), this.zzd, this.zzb);
            this.zza.set(zzemmVar);
        }
        return zzemmVar.zza;
    }
}
