package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzcpc implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzcpc(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzcxx zzb() {
        return new zzcxx((ScheduledExecutorService) this.zza.zzb(), (Clock) this.zzb.zzb());
    }
}
