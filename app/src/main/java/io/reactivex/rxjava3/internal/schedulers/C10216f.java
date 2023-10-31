package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.disposables.InterfaceC10162c;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.f */
/* loaded from: classes3.dex */
public class C10216f extends AbstractC10154g.AbstractC10157c {

    /* renamed from: a */
    public final ScheduledExecutorService f20529a;

    /* renamed from: b */
    public volatile boolean f20530b;

    public C10216f(ThreadFactory threadFactory) {
        boolean z = C10222k.f20539a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (C10222k.f20539a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C10222k.f20542d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        this.f20529a = newScheduledThreadPool;
    }

    @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
    /* renamed from: b */
    public final void mo49b() {
        if (this.f20530b) {
            return;
        }
        this.f20530b = true;
        this.f20529a.shutdownNow();
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
    @NonNull
    /* renamed from: c */
    public final InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        return this.f20530b ? EnumC10176b.INSTANCE : m1200g(runnable, j, timeUnit, null);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
    @NonNull
    /* renamed from: e */
    public final void mo1193e(@NonNull Runnable runnable) {
        mo1194c(runnable, 0L, null);
    }

    @NonNull
    /* renamed from: g */
    public final RunnableC10221j m1200g(Runnable runnable, long j, @NonNull TimeUnit timeUnit, @Nullable InterfaceC10162c interfaceC10162c) {
        Future<?> schedule;
        Objects.requireNonNull(runnable, "run is null");
        RunnableC10221j runnableC10221j = new RunnableC10221j(runnable, interfaceC10162c);
        if (interfaceC10162c != null && !interfaceC10162c.mo1209c(runnableC10221j)) {
            return runnableC10221j;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ScheduledExecutorService scheduledExecutorService = this.f20529a;
        try {
            if (i <= 0) {
                schedule = scheduledExecutorService.submit((Callable) runnableC10221j);
            } else {
                schedule = scheduledExecutorService.schedule((Callable) runnableC10221j, j, timeUnit);
            }
            runnableC10221j.m1199a(schedule);
        } catch (RejectedExecutionException e) {
            if (interfaceC10162c != null) {
                interfaceC10162c.mo1210a(runnableC10221j);
            }
            C10234a.m1188a(e);
        }
        return runnableC10221j;
    }
}
