package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* loaded from: classes.dex */
public abstract class zzfuk extends AbstractExecutorService implements zzfwc {
    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfwr.zzf(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfwr(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfwb) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfwb) super.submit(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfwb) super.submit(callable);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final zzfwb zza(Runnable runnable) {
        return (zzfwb) super.submit(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    public final zzfwb zzb(Callable callable) {
        return (zzfwb) super.submit(callable);
    }
}
