package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
final class zzfvj extends zzfvi {
    private final zzfwb zza;

    public zzfvj(zzfwb zzfwbVar) {
        zzfwbVar.getClass();
        this.zza = zzfwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j, timeUnit);
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf, com.google.android.gms.internal.ads.zzfwb
    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }
}
