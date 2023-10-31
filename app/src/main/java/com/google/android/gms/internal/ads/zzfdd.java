package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class zzfdd implements zzgvo {
    private final zzgwb zza;

    public zzfdd(zzgwb zzgwbVar) {
        this.zza = zzgwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzflu.zza();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) this.zza.zzb()));
        zzgvw.zzb(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
