package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.C10160a;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.l */
/* loaded from: classes3.dex */
public final class C10224l extends AbstractC10154g {

    /* renamed from: c */
    public static final ThreadFactoryC10217g f20543c;

    /* renamed from: d */
    public static final ScheduledExecutorService f20544d;

    /* renamed from: b */
    public final AtomicReference<ScheduledExecutorService> f20545b;

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.l$a */
    /* loaded from: classes3.dex */
    public static final class C10225a extends AbstractC10154g.AbstractC10157c {

        /* renamed from: a */
        public final ScheduledExecutorService f20546a;

        /* renamed from: b */
        public final C10160a f20547b = new C10160a();

        /* renamed from: c */
        public volatile boolean f20548c;

        public C10225a(ScheduledExecutorService scheduledExecutorService) {
            this.f20546a = scheduledExecutorService;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            if (this.f20548c) {
                return;
            }
            this.f20548c = true;
            this.f20547b.mo49b();
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: c */
        public final InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            Future<?> schedule;
            boolean z = this.f20548c;
            EnumC10176b enumC10176b = EnumC10176b.INSTANCE;
            if (z) {
                return enumC10176b;
            }
            Objects.requireNonNull(runnable, "run is null");
            RunnableC10221j runnableC10221j = new RunnableC10221j(runnable, this.f20547b);
            this.f20547b.mo1209c(runnableC10221j);
            try {
                if (j <= 0) {
                    schedule = this.f20546a.submit((Callable) runnableC10221j);
                } else {
                    schedule = this.f20546a.schedule((Callable) runnableC10221j, j, timeUnit);
                }
                runnableC10221j.m1199a(schedule);
                return runnableC10221j;
            } catch (RejectedExecutionException e) {
                mo49b();
                C10234a.m1188a(e);
                return enumC10176b;
            }
        }
    }

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f20544d = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f20543c = new ThreadFactoryC10217g("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.single-priority", 5).intValue())), true);
    }

    public C10224l() {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f20545b = atomicReference;
        boolean z = C10222k.f20539a;
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, f20543c);
        if (C10222k.f20539a && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            C10222k.f20542d.put((ScheduledThreadPoolExecutor) newScheduledThreadPool, newScheduledThreadPool);
        }
        atomicReference.lazySet(newScheduledThreadPool);
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10225a(this.f20545b.get());
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: c */
    public final InterfaceC10161b mo1195c(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        CallableC10220i callableC10220i = new CallableC10220i(runnable);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        AtomicReference<ScheduledExecutorService> atomicReference = this.f20545b;
        try {
            if (i <= 0) {
                schedule = atomicReference.get().submit(callableC10220i);
            } else {
                schedule = atomicReference.get().schedule(callableC10220i, j, timeUnit);
            }
            callableC10220i.m1203a(schedule);
            return callableC10220i;
        } catch (RejectedExecutionException e) {
            C10234a.m1188a(e);
            return EnumC10176b.INSTANCE;
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: d */
    public final InterfaceC10161b mo1198d(@NonNull C10193c.RunnableC10194a runnableC10194a, long j, long j2, TimeUnit timeUnit) {
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        EnumC10176b enumC10176b = EnumC10176b.INSTANCE;
        AtomicReference<ScheduledExecutorService> atomicReference = this.f20545b;
        if (i > 0) {
            RunnableC10219h runnableC10219h = new RunnableC10219h(runnableC10194a);
            try {
                runnableC10219h.m1203a(atomicReference.get().scheduleAtFixedRate(runnableC10219h, j, j2, timeUnit));
                return runnableC10219h;
            } catch (RejectedExecutionException e) {
                C10234a.m1188a(e);
                return enumC10176b;
            }
        }
        ScheduledExecutorService scheduledExecutorService = atomicReference.get();
        CallableC10210c callableC10210c = new CallableC10210c(runnableC10194a, scheduledExecutorService);
        try {
            callableC10210c.m1201a(j <= 0 ? scheduledExecutorService.submit(callableC10210c) : scheduledExecutorService.schedule(callableC10210c, j, timeUnit));
            return callableC10210c;
        } catch (RejectedExecutionException e2) {
            C10234a.m1188a(e2);
            return enumC10176b;
        }
    }
}
