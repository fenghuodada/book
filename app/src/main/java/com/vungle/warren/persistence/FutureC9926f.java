package com.vungle.warren.persistence;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.vungle.warren.persistence.f */
/* loaded from: classes3.dex */
public final class FutureC9926f<T> implements Future<T> {

    /* renamed from: a */
    public final Future<T> f19926a;

    public FutureC9926f(Future<T> future) {
        this.f19926a = future;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f19926a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final T get() {
        try {
            return this.f19926a.get();
        } catch (InterruptedException unused) {
            Log.w("f", "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            Log.e("f", "error on execution", e);
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final T get(long j, @NonNull TimeUnit timeUnit) {
        try {
            return this.f19926a.get(j, timeUnit);
        } catch (InterruptedException unused) {
            Log.w("f", "future.get() Interrupted on Thread " + Thread.currentThread().getName());
            Thread.currentThread().interrupt();
            return null;
        } catch (ExecutionException e) {
            Log.e("f", "error on execution", e);
            return null;
        } catch (TimeoutException unused2) {
            Log.w("f", "future.get() Timeout on Thread " + Thread.currentThread().getName());
            return null;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f19926a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f19926a.isDone();
    }
}
