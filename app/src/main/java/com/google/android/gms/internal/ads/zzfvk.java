package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class zzfvk extends zzfri implements Future {
    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return zzb().cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException, ExecutionException {
        return zzb().get();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzb().get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return zzb().isDone();
    }

    @Override // com.google.android.gms.internal.ads.zzfri
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Future zzb();
}
