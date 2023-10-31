package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class zzfwf extends zzfvl implements ScheduledFuture {
    private final ScheduledFuture zza;

    public zzfwf(zzfwb zzfwbVar, ScheduledFuture scheduledFuture) {
        super(zzfwbVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzfvk, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean cancel = zzb().cancel(z);
        if (cancel) {
            this.zza.cancel(z);
        }
        return cancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }
}
