package com.vungle.warren.utility;

import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.FutureC9926f;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vungle.warren.utility.y */
/* loaded from: classes3.dex */
public final class C10111y extends ThreadPoolExecutor {
    public C10111y(int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactoryC10092m threadFactoryC10092m) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactoryC10092m);
        allowCoreThreadTimeOut(true);
    }

    /* renamed from: a */
    public final void m1236a(Runnable runnable, Runnable runnable2) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
            runnable2.run();
        }
    }

    /* renamed from: b */
    public final Future m1235b(C9928h.RunnableC9938j runnableC9938j, C9928h.RunnableC9940k runnableC9940k) {
        try {
            return super.submit(runnableC9938j);
        } catch (OutOfMemoryError unused) {
            runnableC9940k.run();
            return new FutureC9926f(null);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError unused) {
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        try {
            return super.submit(runnable);
        } catch (OutOfMemoryError unused) {
            return new FutureC9926f(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        try {
            return super.submit(runnable, t);
        } catch (OutOfMemoryError unused) {
            return new FutureC9926f(null);
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        try {
            return super.submit(callable);
        } catch (OutOfMemoryError unused) {
            return new FutureC9926f(null);
        }
    }
}
