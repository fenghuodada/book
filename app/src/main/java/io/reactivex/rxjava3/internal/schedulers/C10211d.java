package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.C10160a;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.d */
/* loaded from: classes3.dex */
public final class C10211d extends AbstractC10154g {

    /* renamed from: c */
    public static final ThreadFactoryC10217g f20509c;

    /* renamed from: d */
    public static final ThreadFactoryC10217g f20510d;

    /* renamed from: g */
    public static final C10214c f20513g;

    /* renamed from: h */
    public static final RunnableC10212a f20514h;

    /* renamed from: b */
    public final AtomicReference<RunnableC10212a> f20515b;

    /* renamed from: f */
    public static final TimeUnit f20512f = TimeUnit.SECONDS;

    /* renamed from: e */
    public static final long f20511e = Long.getLong("rx3.io-keep-alive-time", 60).longValue();

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10212a implements Runnable {

        /* renamed from: a */
        public final long f20516a;

        /* renamed from: b */
        public final ConcurrentLinkedQueue<C10214c> f20517b;

        /* renamed from: c */
        public final C10160a f20518c;

        /* renamed from: d */
        public final ScheduledExecutorService f20519d;

        /* renamed from: e */
        public final ScheduledFuture f20520e;

        /* renamed from: f */
        public final ThreadFactory f20521f;

        public RunnableC10212a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledExecutorService scheduledExecutorService;
            ScheduledFuture<?> scheduledFuture;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f20516a = nanos;
            this.f20517b = new ConcurrentLinkedQueue<>();
            this.f20518c = new C10160a();
            this.f20521f = threadFactory;
            if (timeUnit != null) {
                scheduledExecutorService = Executors.newScheduledThreadPool(1, C10211d.f20510d);
                scheduledFuture = scheduledExecutorService.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledExecutorService = null;
                scheduledFuture = null;
            }
            this.f20519d = scheduledExecutorService;
            this.f20520e = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ConcurrentLinkedQueue<C10214c> concurrentLinkedQueue = this.f20517b;
            if (!concurrentLinkedQueue.isEmpty()) {
                long nanoTime = System.nanoTime();
                Iterator<C10214c> it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    C10214c next = it.next();
                    if (next.f20526c <= nanoTime) {
                        if (concurrentLinkedQueue.remove(next)) {
                            this.f20518c.mo1210a(next);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$b */
    /* loaded from: classes3.dex */
    public static final class C10213b extends AbstractC10154g.AbstractC10157c {

        /* renamed from: b */
        public final RunnableC10212a f20523b;

        /* renamed from: c */
        public final C10214c f20524c;

        /* renamed from: d */
        public final AtomicBoolean f20525d = new AtomicBoolean();

        /* renamed from: a */
        public final C10160a f20522a = new C10160a();

        public C10213b(RunnableC10212a runnableC10212a) {
            C10214c c10214c;
            C10214c c10214c2;
            this.f20523b = runnableC10212a;
            if (runnableC10212a.f20518c.f20425b) {
                c10214c2 = C10211d.f20513g;
            } else {
                while (true) {
                    if (!runnableC10212a.f20517b.isEmpty()) {
                        c10214c = runnableC10212a.f20517b.poll();
                        if (c10214c != null) {
                            break;
                        }
                    } else {
                        c10214c = new C10214c(runnableC10212a.f20521f);
                        runnableC10212a.f20518c.mo1209c(c10214c);
                        break;
                    }
                }
                c10214c2 = c10214c;
            }
            this.f20524c = c10214c2;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            if (this.f20525d.compareAndSet(false, true)) {
                this.f20522a.mo49b();
                RunnableC10212a runnableC10212a = this.f20523b;
                runnableC10212a.getClass();
                long nanoTime = System.nanoTime() + runnableC10212a.f20516a;
                C10214c c10214c = this.f20524c;
                c10214c.f20526c = nanoTime;
                runnableC10212a.f20517b.offer(c10214c);
            }
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: c */
        public final InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            if (this.f20522a.f20425b) {
                return EnumC10176b.INSTANCE;
            }
            return this.f20524c.m1200g(runnable, j, timeUnit, this.f20522a);
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.d$c */
    /* loaded from: classes3.dex */
    public static final class C10214c extends C10216f {

        /* renamed from: c */
        public long f20526c;

        public C10214c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f20526c = 0L;
        }
    }

    static {
        C10214c c10214c = new C10214c(new ThreadFactoryC10217g("RxCachedThreadSchedulerShutdown"));
        f20513g = c10214c;
        c10214c.mo49b();
        int max = Math.max(1, Math.min(10, Integer.getInteger("rx3.io-priority", 5).intValue()));
        ThreadFactoryC10217g threadFactoryC10217g = new ThreadFactoryC10217g("RxCachedThreadScheduler", max, false);
        f20509c = threadFactoryC10217g;
        f20510d = new ThreadFactoryC10217g("RxCachedWorkerPoolEvictor", max, false);
        RunnableC10212a runnableC10212a = new RunnableC10212a(0L, null, threadFactoryC10217g);
        f20514h = runnableC10212a;
        runnableC10212a.f20518c.mo49b();
        ScheduledFuture scheduledFuture = runnableC10212a.f20520e;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        ScheduledExecutorService scheduledExecutorService = runnableC10212a.f20519d;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public C10211d() {
        boolean z;
        RunnableC10212a runnableC10212a = f20514h;
        this.f20515b = new AtomicReference<>(runnableC10212a);
        RunnableC10212a runnableC10212a2 = new RunnableC10212a(f20511e, f20512f, f20509c);
        while (true) {
            AtomicReference<RunnableC10212a> atomicReference = this.f20515b;
            if (atomicReference.compareAndSet(runnableC10212a, runnableC10212a2)) {
                z = true;
                break;
            } else if (atomicReference.get() != runnableC10212a) {
                z = false;
                break;
            }
        }
        if (!z) {
            runnableC10212a2.f20518c.mo49b();
            ScheduledFuture scheduledFuture = runnableC10212a2.f20520e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = runnableC10212a2.f20519d;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10213b(this.f20515b.get());
    }
}
