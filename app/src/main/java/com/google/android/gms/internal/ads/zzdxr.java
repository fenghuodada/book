package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzdxr implements zzgvo {
    private final zzgwb zza;
    private final zzgwb zzb;

    public zzdxr(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        this.zza = zzgwbVar;
        this.zzb = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    /* renamed from: zza */
    public final zzdxq zzb() {
        return new zzdxq(((zzchc) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
