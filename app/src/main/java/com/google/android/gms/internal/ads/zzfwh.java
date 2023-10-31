package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwh extends zzfwe implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    public zzfwh(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.zza = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        zzfwr zzf = zzfwr.zzf(runnable, null);
        return new zzfwf(zzf, this.zza.schedule(zzf, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j, TimeUnit timeUnit) {
        zzfwr zzfwrVar = new zzfwr(callable);
        return new zzfwf(zzfwrVar, this.zza.schedule(zzfwrVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfwg zzfwgVar = new zzfwg(runnable);
        return new zzfwf(zzfwgVar, this.zza.scheduleAtFixedRate(zzfwgVar, j, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        zzfwg zzfwgVar = new zzfwg(runnable);
        return new zzfwf(zzfwgVar, this.zza.scheduleWithFixedDelay(zzfwgVar, j, j2, timeUnit));
    }
}
