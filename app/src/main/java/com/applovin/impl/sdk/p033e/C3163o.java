package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3291e;
import com.applovin.impl.sdk.utils.Utils;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.e.o */
/* loaded from: classes.dex */
public class C3163o {

    /* renamed from: b */
    private final C3214m f8239b;

    /* renamed from: c */
    private final C3349v f8240c;

    /* renamed from: d */
    private final ScheduledThreadPoolExecutor f8241d;

    /* renamed from: e */
    private final ScheduledThreadPoolExecutor f8242e;

    /* renamed from: h */
    private boolean f8245h;

    /* renamed from: a */
    private final String f8238a = "TaskManager";

    /* renamed from: f */
    private final List<RunnableC3168c> f8243f = new ArrayList(5);

    /* renamed from: g */
    private final Object f8244g = new Object();

    /* renamed from: com.applovin.impl.sdk.e.o$a */
    /* loaded from: classes.dex */
    public enum EnumC3165a {
        MAIN,
        TIMEOUT,
        BACKGROUND,
        ADVERTISING_INFO_COLLECTION,
        POSTBACKS,
        CACHING_INTERSTITIAL,
        CACHING_INCENTIVIZED,
        CACHING_OTHER,
        REWARD,
        MEDIATION_MAIN,
        MEDIATION_TIMEOUT,
        MEDIATION_BACKGROUND,
        MEDIATION_POSTBACKS,
        MEDIATION_BANNER,
        MEDIATION_INTERSTITIAL,
        MEDIATION_INCENTIVIZED,
        MEDIATION_REWARDED_INTERSTITIAL,
        MEDIATION_REWARD
    }

    /* renamed from: com.applovin.impl.sdk.e.o$b */
    /* loaded from: classes.dex */
    public class ThreadFactoryC3166b implements ThreadFactory {

        /* renamed from: b */
        private final String f8268b;

        public ThreadFactoryC3166b(String str) {
            this.f8268b = str;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "AppLovinSdk:" + this.f8268b + ":" + Utils.shortenKey(C3163o.this.f8239b.m7386z()));
            thread.setDaemon(true);
            thread.setPriority(10);
            thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.applovin.impl.sdk.e.o.b.1
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public void uncaughtException(Thread thread2, Throwable th) {
                    if (C3349v.m6862a()) {
                        C3163o.this.f8240c.m6854b("TaskManager", "Caught unhandled exception", th);
                    }
                }
            });
            return thread;
        }
    }

    /* renamed from: com.applovin.impl.sdk.e.o$c */
    /* loaded from: classes.dex */
    public static class RunnableC3168c implements Runnable {

        /* renamed from: a */
        private final C3214m f8270a;

        /* renamed from: b */
        private final String f8271b;

        /* renamed from: c */
        private final C3349v f8272c;

        /* renamed from: d */
        private final AbstractRunnableC3131a f8273d;

        /* renamed from: e */
        private final EnumC3165a f8274e;

        public RunnableC3168c(C3214m c3214m, AbstractRunnableC3131a abstractRunnableC3131a, EnumC3165a enumC3165a) {
            this.f8270a = c3214m;
            this.f8272c = c3214m.m7487A();
            this.f8271b = abstractRunnableC3131a.m7699e();
            this.f8273d = abstractRunnableC3131a;
            this.f8274e = enumC3165a;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = " queue finished task "
                com.applovin.impl.sdk.utils.C3294g.m7028a()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.m r1 = r6.f8270a     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.m7415c()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L35
                com.applovin.impl.sdk.e.a r1 = r6.f8273d     // Catch: java.lang.Throwable -> L4a
                boolean r1 = r1.m7697g()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L16
                goto L35
            L16:
                boolean r1 = com.applovin.impl.sdk.C3349v.m6862a()     // Catch: java.lang.Throwable -> L4a
                if (r1 == 0) goto L25
                com.applovin.impl.sdk.v r1 = r6.f8272c     // Catch: java.lang.Throwable -> L4a
                java.lang.String r2 = r6.f8271b     // Catch: java.lang.Throwable -> L4a
                java.lang.String r3 = "Task re-scheduled..."
                r1.m6853c(r2, r3)     // Catch: java.lang.Throwable -> L4a
            L25:
                com.applovin.impl.sdk.m r1 = r6.f8270a     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o r1 = r1.m7469S()     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.a r2 = r6.f8273d     // Catch: java.lang.Throwable -> L4a
                com.applovin.impl.sdk.e.o$a r3 = r6.f8274e     // Catch: java.lang.Throwable -> L4a
                r4 = 2000(0x7d0, double:9.88E-321)
                r1.m7619a(r2, r3, r4)     // Catch: java.lang.Throwable -> L4a
                goto L3a
            L35:
                com.applovin.impl.sdk.e.a r1 = r6.f8273d     // Catch: java.lang.Throwable -> L4a
                r1.run()     // Catch: java.lang.Throwable -> L4a
            L3a:
                boolean r1 = com.applovin.impl.sdk.C3349v.m6862a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.v r1 = r6.f8272c
                java.lang.String r2 = r6.f8271b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                goto L69
            L4a:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C3349v.m6862a()     // Catch: java.lang.Throwable -> L82
                if (r2 == 0) goto L5a
                com.applovin.impl.sdk.v r2 = r6.f8272c     // Catch: java.lang.Throwable -> L82
                java.lang.String r3 = r6.f8271b     // Catch: java.lang.Throwable -> L82
                java.lang.String r4 = "Task failed execution"
                r2.m6854b(r3, r4, r1)     // Catch: java.lang.Throwable -> L82
            L5a:
                boolean r1 = com.applovin.impl.sdk.C3349v.m6862a()
                if (r1 == 0) goto L81
                com.applovin.impl.sdk.v r1 = r6.f8272c
                java.lang.String r2 = r6.f8271b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L69:
                com.applovin.impl.sdk.e.o$a r4 = r6.f8274e
                r3.append(r4)
                r3.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f8273d
                java.lang.String r0 = r0.m7699e()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r1.m6853c(r2, r0)
            L81:
                return
            L82:
                r1 = move-exception
                boolean r2 = com.applovin.impl.sdk.C3349v.m6862a()
                if (r2 == 0) goto Laa
                com.applovin.impl.sdk.v r2 = r6.f8272c
                java.lang.String r3 = r6.f8271b
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                com.applovin.impl.sdk.e.o$a r5 = r6.f8274e
                r4.append(r5)
                r4.append(r0)
                com.applovin.impl.sdk.e.a r0 = r6.f8273d
                java.lang.String r0 = r0.m7699e()
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r2.m6853c(r3, r0)
            Laa:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.p033e.C3163o.RunnableC3168c.run():void");
        }
    }

    public C3163o(C3214m c3214m) {
        this.f8239b = c3214m;
        this.f8240c = c3214m.m7487A();
        this.f8241d = m7613a("auxiliary_operations", ((Integer) c3214m.m7456a(C3109b.f7930cd)).intValue());
        this.f8242e = m7613a("shared_thread_pool", ((Integer) c3214m.m7456a(C3109b.f7834am)).intValue());
    }

    /* renamed from: a */
    private ScheduledThreadPoolExecutor m7613a(String str, int i) {
        return new ScheduledThreadPoolExecutor(i, new ThreadFactoryC3166b(str));
    }

    /* renamed from: a */
    private void m7614a(final Runnable runnable, long j, boolean z) {
        if (j <= 0) {
            this.f8242e.submit(runnable);
        } else if (z) {
            C3291e.m7031a(j, this.f8239b, new Runnable() { // from class: com.applovin.impl.sdk.e.o.1
                @Override // java.lang.Runnable
                public void run() {
                    C3163o.this.f8242e.execute(runnable);
                }
            });
        } else {
            this.f8242e.schedule(runnable, j, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    private boolean m7617a(RunnableC3168c runnableC3168c) {
        if (runnableC3168c.f8273d.m7697g()) {
            return false;
        }
        synchronized (this.f8244g) {
            if (this.f8245h) {
                return false;
            }
            this.f8243f.add(runnableC3168c);
            return true;
        }
    }

    /* renamed from: a */
    public void m7621a(AbstractRunnableC3131a abstractRunnableC3131a) {
        if (abstractRunnableC3131a == null) {
            if (C3349v.m6862a()) {
                this.f8240c.m6850e("TaskManager", "Attempted to execute null task immediately");
                return;
            }
            return;
        }
        try {
            abstractRunnableC3131a.run();
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                this.f8240c.m6854b(abstractRunnableC3131a.m7699e(), "Task failed execution", th);
            }
        }
    }

    /* renamed from: a */
    public void m7620a(AbstractRunnableC3131a abstractRunnableC3131a, EnumC3165a enumC3165a) {
        m7619a(abstractRunnableC3131a, enumC3165a, 0L);
    }

    /* renamed from: a */
    public void m7619a(AbstractRunnableC3131a abstractRunnableC3131a, EnumC3165a enumC3165a, long j) {
        m7618a(abstractRunnableC3131a, enumC3165a, j, false);
    }

    /* renamed from: a */
    public void m7618a(AbstractRunnableC3131a abstractRunnableC3131a, EnumC3165a enumC3165a, long j, boolean z) {
        if (abstractRunnableC3131a != null) {
            if (j >= 0) {
                if (!m7617a(new RunnableC3168c(this.f8239b, abstractRunnableC3131a, enumC3165a))) {
                    m7614a(abstractRunnableC3131a, j, z);
                    return;
                } else if (C3349v.m6862a()) {
                    this.f8240c.m6853c(abstractRunnableC3131a.m7699e(), "Task execution delayed until after init");
                    return;
                } else {
                    return;
                }
            }
            throw new IllegalArgumentException(C3132a0.m7696a("Invalid delay (millis) specified: ", j));
        }
        throw new IllegalArgumentException("No task specified");
    }

    /* renamed from: a */
    public void m7615a(Runnable runnable) {
        this.f8241d.submit(runnable);
    }

    /* renamed from: a */
    public boolean m7622a() {
        return this.f8245h;
    }

    /* renamed from: b */
    public Executor m7612b() {
        return this.f8242e;
    }

    /* renamed from: c */
    public void m7610c() {
        synchronized (this.f8244g) {
            this.f8245h = false;
        }
    }

    /* renamed from: d */
    public void m7608d() {
        synchronized (this.f8244g) {
            this.f8245h = true;
            for (RunnableC3168c runnableC3168c : this.f8243f) {
                m7620a(runnableC3168c.f8273d, runnableC3168c.f8274e);
            }
            this.f8243f.clear();
        }
    }
}
