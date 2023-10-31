package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.C10160a;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.C10177c;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.b */
/* loaded from: classes3.dex */
public final class C10206b extends AbstractC10154g {

    /* renamed from: c */
    public static final C10208b f20490c;

    /* renamed from: d */
    public static final ThreadFactoryC10217g f20491d;

    /* renamed from: e */
    public static final int f20492e;

    /* renamed from: f */
    public static final C10209c f20493f;

    /* renamed from: b */
    public final AtomicReference<C10208b> f20494b;

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$a */
    /* loaded from: classes3.dex */
    public static final class C10207a extends AbstractC10154g.AbstractC10157c {

        /* renamed from: a */
        public final C10177c f20495a;

        /* renamed from: b */
        public final C10160a f20496b;

        /* renamed from: c */
        public final C10177c f20497c;

        /* renamed from: d */
        public final C10209c f20498d;

        /* renamed from: e */
        public volatile boolean f20499e;

        public C10207a(C10209c c10209c) {
            this.f20498d = c10209c;
            C10177c c10177c = new C10177c();
            this.f20495a = c10177c;
            C10160a c10160a = new C10160a();
            this.f20496b = c10160a;
            C10177c c10177c2 = new C10177c();
            this.f20497c = c10177c2;
            c10177c2.mo1209c(c10177c);
            c10177c2.mo1209c(c10160a);
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            if (this.f20499e) {
                return;
            }
            this.f20499e = true;
            this.f20497c.mo49b();
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: c */
        public final InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            return this.f20499e ? EnumC10176b.INSTANCE : this.f20498d.m1200g(runnable, j, timeUnit, this.f20496b);
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: e */
        public final void mo1193e(@NonNull Runnable runnable) {
            if (this.f20499e) {
                return;
            }
            this.f20498d.m1200g(runnable, 0L, TimeUnit.MILLISECONDS, this.f20495a);
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$b */
    /* loaded from: classes3.dex */
    public static final class C10208b {

        /* renamed from: a */
        public final int f20500a;

        /* renamed from: b */
        public final C10209c[] f20501b;

        /* renamed from: c */
        public long f20502c;

        public C10208b(int i, ThreadFactory threadFactory) {
            this.f20500a = i;
            this.f20501b = new C10209c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f20501b[i2] = new C10209c(threadFactory);
            }
        }

        /* renamed from: a */
        public final C10209c m1202a() {
            int i = this.f20500a;
            if (i == 0) {
                return C10206b.f20493f;
            }
            long j = this.f20502c;
            this.f20502c = 1 + j;
            return this.f20501b[(int) (j % i)];
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.b$c */
    /* loaded from: classes3.dex */
    public static final class C10209c extends C10216f {
        public C10209c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int intValue = Integer.getInteger("rx3.computation-threads", 0).intValue();
        if (intValue > 0 && intValue <= availableProcessors) {
            availableProcessors = intValue;
        }
        f20492e = availableProcessors;
        C10209c c10209c = new C10209c(new ThreadFactoryC10217g("RxComputationShutdown"));
        f20493f = c10209c;
        c10209c.mo49b();
        ThreadFactoryC10217g threadFactoryC10217g = new ThreadFactoryC10217g("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx3.computation-priority", 5).intValue())), true);
        f20491d = threadFactoryC10217g;
        C10208b c10208b = new C10208b(0, threadFactoryC10217g);
        f20490c = c10208b;
        for (C10209c c10209c2 : c10208b.f20501b) {
            c10209c2.mo49b();
        }
    }

    public C10206b() {
        int i;
        boolean z;
        C10208b c10208b = f20490c;
        this.f20494b = new AtomicReference<>(c10208b);
        C10208b c10208b2 = new C10208b(f20492e, f20491d);
        while (true) {
            AtomicReference<C10208b> atomicReference = this.f20494b;
            if (atomicReference.compareAndSet(c10208b, c10208b2)) {
                z = true;
                break;
            } else if (atomicReference.get() != c10208b) {
                z = false;
                break;
            }
        }
        if (!z) {
            for (C10209c c10209c : c10208b2.f20501b) {
                c10209c.mo49b();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10207a(this.f20494b.get().m1202a());
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: c */
    public final InterfaceC10161b mo1195c(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        Future<?> schedule;
        C10209c m1202a = this.f20494b.get().m1202a();
        m1202a.getClass();
        CallableC10220i callableC10220i = new CallableC10220i(runnable);
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        ScheduledExecutorService scheduledExecutorService = m1202a.f20529a;
        try {
            if (i <= 0) {
                schedule = scheduledExecutorService.submit(callableC10220i);
            } else {
                schedule = scheduledExecutorService.schedule(callableC10220i, j, timeUnit);
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
        Future<?> schedule;
        C10209c m1202a = this.f20494b.get().m1202a();
        m1202a.getClass();
        int i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        EnumC10176b enumC10176b = EnumC10176b.INSTANCE;
        try {
            if (i <= 0) {
                ScheduledExecutorService scheduledExecutorService = m1202a.f20529a;
                CallableC10210c callableC10210c = new CallableC10210c(runnableC10194a, scheduledExecutorService);
                if (j <= 0) {
                    schedule = scheduledExecutorService.submit(callableC10210c);
                } else {
                    schedule = scheduledExecutorService.schedule(callableC10210c, j, timeUnit);
                }
                callableC10210c.m1201a(schedule);
                return callableC10210c;
            }
            RunnableC10219h runnableC10219h = new RunnableC10219h(runnableC10194a);
            runnableC10219h.m1203a(m1202a.f20529a.scheduleAtFixedRate(runnableC10219h, j, j2, timeUnit));
            return runnableC10219h;
        } catch (RejectedExecutionException e) {
            C10234a.m1188a(e);
            return enumC10176b;
        }
    }
}
