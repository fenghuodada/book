package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.bumptech.glide.load.engine.executor.a */
/* loaded from: classes.dex */
public final class ExecutorServiceC3527a implements ExecutorService {

    /* renamed from: b */
    public static final long f9325b = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: c */
    public static volatile int f9326c;

    /* renamed from: a */
    public final ExecutorService f9327a;

    /* renamed from: com.bumptech.glide.load.engine.executor.a$a */
    /* loaded from: classes.dex */
    public static final class ThreadFactoryC3528a implements ThreadFactory {

        /* renamed from: a */
        public final String f9328a;

        /* renamed from: b */
        public final boolean f9329b;

        /* renamed from: c */
        public int f9330c;

        /* renamed from: com.bumptech.glide.load.engine.executor.a$a$a */
        /* loaded from: classes.dex */
        public class C3529a extends Thread {
            public C3529a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                Process.setThreadPriority(9);
                if (ThreadFactoryC3528a.this.f9329b) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                    }
                }
            }
        }

        public ThreadFactoryC3528a(String str, boolean z) {
            this.f9328a = str;
            this.f9329b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final synchronized Thread newThread(@NonNull Runnable runnable) {
            C3529a c3529a;
            c3529a = new C3529a(runnable, "glide-" + this.f9328a + "-thread-" + this.f9330c);
            this.f9330c = this.f9330c + 1;
            return c3529a;
        }
    }

    @VisibleForTesting
    public ExecutorServiceC3527a(ThreadPoolExecutor threadPoolExecutor) {
        this.f9327a = threadPoolExecutor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f9327a.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.f9327a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f9327a.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> List<Future<T>> invokeAll(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
        return this.f9327a.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.f9327a.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(@NonNull Collection<? extends Callable<T>> collection, long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.f9327a.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f9327a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f9327a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f9327a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final List<Runnable> shutdownNow() {
        return this.f9327a.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final Future<?> submit(@NonNull Runnable runnable) {
        return this.f9327a.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @NonNull
    public final <T> Future<T> submit(@NonNull Runnable runnable, T t) {
        return this.f9327a.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(@NonNull Callable<T> callable) {
        return this.f9327a.submit(callable);
    }

    public final String toString() {
        return this.f9327a.toString();
    }
}
