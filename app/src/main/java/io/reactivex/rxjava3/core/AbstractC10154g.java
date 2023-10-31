package io.reactivex.rxjava3.core;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.disposables.InterfaceC10161b;
import io.reactivex.rxjava3.internal.disposables.C10178d;
import io.reactivex.rxjava3.internal.disposables.EnumC10175a;
import io.reactivex.rxjava3.internal.disposables.EnumC10176b;
import io.reactivex.rxjava3.internal.operators.observable.C10193c;
import io.reactivex.rxjava3.internal.operators.observable.C10199g;
import io.reactivex.rxjava3.internal.schedulers.C10216f;
import io.reactivex.rxjava3.plugins.C10234a;
import java.util.concurrent.TimeUnit;

/* renamed from: io.reactivex.rxjava3.core.g */
/* loaded from: classes3.dex */
public abstract class AbstractC10154g {

    /* renamed from: a */
    public static final long f20410a;

    /* renamed from: io.reactivex.rxjava3.core.g$a */
    /* loaded from: classes3.dex */
    public static final class RunnableC10155a implements InterfaceC10161b, Runnable {
        @NonNull

        /* renamed from: a */
        public final Runnable f20411a;
        @NonNull

        /* renamed from: b */
        public final AbstractC10157c f20412b;
        @Nullable

        /* renamed from: c */
        public Thread f20413c;

        public RunnableC10155a(@NonNull Runnable runnable, @NonNull AbstractC10157c abstractC10157c) {
            this.f20411a = runnable;
            this.f20412b = abstractC10157c;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            if (this.f20413c == Thread.currentThread()) {
                AbstractC10157c abstractC10157c = this.f20412b;
                if (abstractC10157c instanceof C10216f) {
                    C10216f c10216f = (C10216f) abstractC10157c;
                    if (!c10216f.f20530b) {
                        c10216f.f20530b = true;
                        c10216f.f20529a.shutdown();
                        return;
                    }
                    return;
                }
            }
            this.f20412b.mo49b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f20413c = Thread.currentThread();
            try {
                this.f20411a.run();
            } finally {
            }
        }
    }

    /* renamed from: io.reactivex.rxjava3.core.g$b */
    /* loaded from: classes3.dex */
    public static final class RunnableC10156b implements InterfaceC10161b, Runnable {
        @NonNull

        /* renamed from: a */
        public final Runnable f20414a;
        @NonNull

        /* renamed from: b */
        public final AbstractC10157c f20415b;

        /* renamed from: c */
        public volatile boolean f20416c;

        public RunnableC10156b(@NonNull C10193c.RunnableC10194a runnableC10194a, @NonNull AbstractC10157c abstractC10157c) {
            this.f20414a = runnableC10194a;
            this.f20415b = abstractC10157c;
        }

        @Override // io.reactivex.rxjava3.disposables.InterfaceC10161b
        /* renamed from: b */
        public final void mo49b() {
            this.f20416c = true;
            this.f20415b.mo49b();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f20416c) {
                return;
            }
            try {
                this.f20414a.run();
            } catch (Throwable th) {
                mo49b();
                C10234a.m1188a(th);
                throw th;
            }
        }
    }

    /* renamed from: io.reactivex.rxjava3.core.g$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC10157c implements InterfaceC10161b {

        /* renamed from: io.reactivex.rxjava3.core.g$c$a */
        /* loaded from: classes3.dex */
        public final class RunnableC10158a implements Runnable {
            @NonNull

            /* renamed from: a */
            public final Runnable f20417a;
            @NonNull

            /* renamed from: b */
            public final C10178d f20418b;

            /* renamed from: c */
            public final long f20419c;

            /* renamed from: d */
            public long f20420d;

            /* renamed from: e */
            public long f20421e;

            /* renamed from: f */
            public long f20422f;

            public RunnableC10158a(long j, @NonNull Runnable runnable, long j2, @NonNull C10178d c10178d, long j3) {
                this.f20417a = runnable;
                this.f20418b = c10178d;
                this.f20419c = j3;
                this.f20421e = j2;
                this.f20422f = j;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                long j;
                this.f20417a.run();
                C10178d c10178d = this.f20418b;
                if (c10178d.get() == EnumC10175a.f20431a) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    AbstractC10157c abstractC10157c = AbstractC10157c.this;
                    abstractC10157c.getClass();
                    long m1219a = AbstractC10157c.m1219a(timeUnit);
                    long j2 = AbstractC10154g.f20410a;
                    long j3 = this.f20421e;
                    int i = ((m1219a + j2) > j3 ? 1 : ((m1219a + j2) == j3 ? 0 : -1));
                    long j4 = this.f20419c;
                    if (i >= 0 && m1219a < j3 + j4 + j2) {
                        long j5 = this.f20422f;
                        long j6 = this.f20420d + 1;
                        this.f20420d = j6;
                        j = (j6 * j4) + j5;
                    } else {
                        j = m1219a + j4;
                        long j7 = this.f20420d + 1;
                        this.f20420d = j7;
                        this.f20422f = j - (j4 * j7);
                    }
                    this.f20421e = m1219a;
                    c10178d.m1207a(abstractC10157c.mo1194c(this, j - m1219a, timeUnit));
                }
            }
        }

        /* renamed from: a */
        public static long m1219a(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @NonNull
        /* renamed from: c */
        public abstract InterfaceC10161b mo1194c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit);

        @NonNull
        /* renamed from: e */
        public void mo1193e(@NonNull Runnable runnable) {
            mo1194c(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        /* renamed from: f */
        public final InterfaceC10161b m1218f(@NonNull Runnable runnable, long j, long j2, @NonNull TimeUnit timeUnit) {
            C10178d c10178d = new C10178d();
            C10178d c10178d2 = new C10178d(c10178d);
            long nanos = timeUnit.toNanos(j2);
            long m1219a = m1219a(TimeUnit.NANOSECONDS);
            InterfaceC10161b mo1194c = mo1194c(new RunnableC10158a(timeUnit.toNanos(j) + m1219a, runnable, m1219a, c10178d2, nanos), j, timeUnit);
            if (mo1194c == EnumC10176b.INSTANCE) {
                return mo1194c;
            }
            c10178d.m1207a(mo1194c);
            return c10178d2;
        }
    }

    static {
        TimeUnit timeUnit;
        long longValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", "minutes");
        if ("seconds".equalsIgnoreCase(property)) {
            timeUnit = TimeUnit.SECONDS;
        } else if ("milliseconds".equalsIgnoreCase(property)) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            timeUnit = TimeUnit.MINUTES;
        }
        f20410a = timeUnit.toNanos(longValue);
    }

    @NonNull
    /* renamed from: a */
    public abstract AbstractC10157c mo1197a();

    @NonNull
    /* renamed from: b */
    public InterfaceC10161b mo1196b(@NonNull C10199g.RunnableC10201b runnableC10201b) {
        return mo1195c(runnableC10201b, 0L, TimeUnit.NANOSECONDS);
    }

    @NonNull
    /* renamed from: c */
    public InterfaceC10161b mo1195c(@NonNull Runnable runnable, long j, @NonNull TimeUnit timeUnit) {
        AbstractC10157c mo1197a = mo1197a();
        RunnableC10155a runnableC10155a = new RunnableC10155a(runnable, mo1197a);
        mo1197a.mo1194c(runnableC10155a, j, timeUnit);
        return runnableC10155a;
    }

    @NonNull
    /* renamed from: d */
    public InterfaceC10161b mo1198d(@NonNull C10193c.RunnableC10194a runnableC10194a, long j, long j2, @NonNull TimeUnit timeUnit) {
        AbstractC10157c mo1197a = mo1197a();
        RunnableC10156b runnableC10156b = new RunnableC10156b(runnableC10194a, mo1197a);
        InterfaceC10161b m1218f = mo1197a.m1218f(runnableC10156b, j, j2, timeUnit);
        if (m1218f == EnumC10176b.INSTANCE) {
            return m1218f;
        }
        return runnableC10156b;
    }
}
