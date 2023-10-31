package com.applovin.impl.sdk.utils;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.applovin.impl.sdk.utils.o */
/* loaded from: classes.dex */
public class C3337o {

    /* renamed from: a */
    private final C3214m f8797a;

    /* renamed from: b */
    private Timer f8798b;

    /* renamed from: c */
    private long f8799c;

    /* renamed from: d */
    private long f8800d;

    /* renamed from: e */
    private final Runnable f8801e;

    /* renamed from: f */
    private long f8802f;

    /* renamed from: g */
    private final Object f8803g = new Object();

    private C3337o(C3214m c3214m, Runnable runnable) {
        this.f8797a = c3214m;
        this.f8801e = runnable;
    }

    /* renamed from: a */
    public static C3337o m6906a(long j, C3214m c3214m, Runnable runnable) {
        if (j < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j + ".");
        } else if (runnable != null) {
            C3337o c3337o = new C3337o(c3214m, runnable);
            c3337o.f8799c = System.currentTimeMillis();
            c3337o.f8800d = j;
            try {
                Timer timer = new Timer();
                c3337o.f8798b = timer;
                timer.schedule(c3337o.m6898e(), j);
            } catch (OutOfMemoryError e) {
                if (C3349v.m6862a()) {
                    c3214m.m7487A().m6854b("Timer", "Failed to create timer due to OOM error", e);
                }
            }
            return c3337o;
        } else {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
        }
    }

    /* renamed from: e */
    private TimerTask m6898e() {
        return new TimerTask() { // from class: com.applovin.impl.sdk.utils.o.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                try {
                    C3337o.this.f8801e.run();
                    synchronized (C3337o.this.f8803g) {
                        C3337o.this.f8798b = null;
                    }
                } catch (Throwable th) {
                    try {
                        if (C3337o.this.f8797a != null && C3349v.m6862a()) {
                            C3337o.this.f8797a.m7487A().m6854b("Timer", "Encountered error while executing timed task", th);
                        }
                        synchronized (C3337o.this.f8803g) {
                            C3337o.this.f8798b = null;
                        }
                    } catch (Throwable th2) {
                        synchronized (C3337o.this.f8803g) {
                            C3337o.this.f8798b = null;
                            throw th2;
                        }
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public long m6907a() {
        if (this.f8798b != null) {
            return this.f8800d - (System.currentTimeMillis() - this.f8799c);
        }
        return this.f8800d - this.f8802f;
    }

    /* renamed from: b */
    public void m6903b() {
        synchronized (this.f8803g) {
            Timer timer = this.f8798b;
            if (timer != null) {
                timer.cancel();
                this.f8802f = Math.max(1L, System.currentTimeMillis() - this.f8799c);
                this.f8798b = null;
            }
        }
    }

    /* renamed from: c */
    public void m6901c() {
        synchronized (this.f8803g) {
            long j = this.f8802f;
            if (j > 0) {
                long j2 = this.f8800d - j;
                this.f8800d = j2;
                if (j2 < 0) {
                    this.f8800d = 0L;
                }
                Timer timer = new Timer();
                this.f8798b = timer;
                timer.schedule(m6898e(), this.f8800d);
                this.f8799c = System.currentTimeMillis();
                this.f8802f = 0L;
            }
        }
    }

    /* renamed from: d */
    public void m6899d() {
        synchronized (this.f8803g) {
            Timer timer = this.f8798b;
            if (timer != null) {
                timer.cancel();
                this.f8798b = null;
                this.f8802f = 0L;
            }
        }
    }
}
