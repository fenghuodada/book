package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.AbstractC10154g;
import io.reactivex.rxjava3.disposables.C10163d;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.internal.operators.observable.C10199g;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.reactivex.rxjava3.internal.schedulers.m */
/* loaded from: classes3.dex */
public final class C10226m extends AbstractC10154g {

    /* renamed from: b */
    public static final /* synthetic */ int f20549b = 0;

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.m$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10227a implements Runnable {

        /* renamed from: a */
        public final Runnable f20550a;

        /* renamed from: b */
        public final C10229c f20551b;

        /* renamed from: c */
        public final long f20552c;

        public RunnableC10227a(Runnable runnable, C10229c c10229c, long j) {
            this.f20550a = runnable;
            this.f20551b = c10229c;
            this.f20552c = j;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20551b.f20560d) {
                return;
            }
            C10229c c10229c = this.f20551b;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            c10229c.getClass();
            long m1219a = AbstractC10154g.AbstractC10157c.m1219a(timeUnit);
            long j = this.f20552c;
            if (j > m1219a) {
                try {
                    Thread.sleep(j - m1219a);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    C10234a.m1188a(e);
                    return;
                }
            }
            if (this.f20551b.f20560d) {
                return;
            }
            this.f20550a.run();
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.m$b */
    /* loaded from: classes3.dex */
    public static final class C10228b implements Comparable<C10228b> {

        /* renamed from: a */
        public final Runnable f20553a;

        /* renamed from: b */
        public final long f20554b;

        /* renamed from: c */
        public final int f20555c;

        /* renamed from: d */
        public volatile boolean f20556d;

        public C10228b(Runnable runnable, Long l, int i) {
            this.f20553a = runnable;
            this.f20554b = l.longValue();
            this.f20555c = i;
        }

        @Override // java.lang.Comparable
        public final int compareTo(C10228b c10228b) {
            C10228b c10228b2 = c10228b;
            int compare = Long.compare(this.f20554b, c10228b2.f20554b);
            if (compare == 0) {
                return Integer.compare(this.f20555c, c10228b2.f20555c);
            }
            return compare;
        }
    }

    /* renamed from: io.reactivex.rxjava3.internal.schedulers.m$c */
    /* loaded from: classes3.dex */
    public static final class C10229c extends AbstractC10154g.AbstractC10157c {

        /* renamed from: a */
        public final PriorityBlockingQueue<C10228b> f20557a = new PriorityBlockingQueue<>();

        /* renamed from: b */
        public final AtomicInteger f20558b = new AtomicInteger();

        /* renamed from: c */
        public final AtomicInteger f20559c = new AtomicInteger();

        /* renamed from: d */
        public volatile boolean f20560d;

        /* renamed from: io.reactivex.rxjava3.internal.schedulers.m$c$a */
        /* loaded from: classes3.dex */
        public final class RunnableC10230a implements Runnable {

            /* renamed from: a */
            public final C10228b f20561a;

            public RunnableC10230a(C10228b c10228b) {
                this.f20561a = c10228b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20561a.f20556d = true;
                C10229c.this.f20557a.remove(this.f20561a);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f20560d = true;
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: c */
        public final InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j) + AbstractC10154g.AbstractC10157c.m1219a(TimeUnit.MILLISECONDS);
            return m1192g(new RunnableC10227a(runnable, this, millis), millis);
        }

        @Override // io.reactivex.rxjava3.core.AbstractC10154g.AbstractC10157c
        @NonNull
        /* renamed from: e */
        public final void mo1193e(@NonNull Runnable runnable) {
            m1192g(runnable, AbstractC10154g.AbstractC10157c.m1219a(TimeUnit.MILLISECONDS));
        }

        /* renamed from: g */
        public final InterfaceC10161b m1192g(Runnable runnable, long j) {
            boolean z = this.f20560d;
            EnumC10176b enumC10176b = EnumC10176b.INSTANCE;
            if (z) {
                return enumC10176b;
            }
            C10228b c10228b = new C10228b(runnable, Long.valueOf(j), this.f20559c.incrementAndGet());
            this.f20557a.add(c10228b);
            if (this.f20558b.getAndIncrement() == 0) {
                int i = 1;
                while (!this.f20560d) {
                    C10228b poll = this.f20557a.poll();
                    if (poll == null) {
                        i = this.f20558b.addAndGet(-i);
                        if (i == 0) {
                            return enumC10176b;
                        }
                    } else if (!poll.f20556d) {
                        poll.f20553a.run();
                    }
                }
                this.f20557a.clear();
                return enumC10176b;
            }
            return new C10163d(new RunnableC10230a(c10228b));
        }
    }

    static {
        new C10226m();
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: a */
    public final AbstractC10154g.AbstractC10157c mo1197a() {
        return new C10229c();
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: b */
    public final InterfaceC10161b mo1196b(@NonNull C10199g.RunnableC10201b runnableC10201b) {
        runnableC10201b.run();
        return EnumC10176b.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.AbstractC10154g
    @NonNull
    /* renamed from: c */
    public final InterfaceC10161b mo1195c(@NonNull Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C10234a.m1188a(e);
        }
        return EnumC10176b.INSTANCE;
    }
}
