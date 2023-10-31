package com.vungle.warren;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.work.C1828a;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8690m;
import com.google.gson.C8693p;
import com.google.gson.C8695r;
import com.google.gson.C8699t;
import com.vungle.warren.model.C9879m;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.utility.C10069a;
import com.vungle.warren.utility.C10110x;
import io.reactivex.rxjava3.annotations.SchedulerSupport;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.vungle.warren.m1 */
/* loaded from: classes3.dex */
public final class C9846m1 {

    /* renamed from: o */
    public static C9846m1 f19681o;

    /* renamed from: p */
    public static long f19682p;

    /* renamed from: a */
    public C10110x f19683a;

    /* renamed from: b */
    public ExecutorService f19684b;

    /* renamed from: d */
    public long f19686d;

    /* renamed from: e */
    public InterfaceC9849c f19687e;

    /* renamed from: i */
    public VungleApiClient f19691i;

    /* renamed from: l */
    public int f19694l;

    /* renamed from: m */
    public C9928h f19695m;

    /* renamed from: c */
    public boolean f19685c = false;

    /* renamed from: f */
    public final List<C9879m> f19688f = Collections.synchronizedList(new ArrayList());

    /* renamed from: g */
    public final ArrayList f19689g = new ArrayList();

    /* renamed from: h */
    public final HashMap f19690h = new HashMap();

    /* renamed from: j */
    public int f19692j = 40;

    /* renamed from: k */
    public final AtomicInteger f19693k = new AtomicInteger();
    @VisibleForTesting

    /* renamed from: n */
    public final C9848b f19696n = new C9848b();

    /* renamed from: com.vungle.warren.m1$a */
    /* loaded from: classes3.dex */
    public class RunnableC9847a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C9879m f19697a;

        public RunnableC9847a(C9879m c9879m) {
            this.f19697a = c9879m;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9879m c9879m;
            C9846m1 c9846m1 = C9846m1.this;
            try {
                C9928h c9928h = c9846m1.f19695m;
                if (c9928h != null && (c9879m = this.f19697a) != null) {
                    c9928h.m1376w(c9879m);
                    AtomicInteger atomicInteger = c9846m1.f19693k;
                    atomicInteger.incrementAndGet();
                    C9846m1 c9846m12 = C9846m1.f19681o;
                    Log.d("m1", "Session Count: " + atomicInteger + " " + C0539e.m12262d(c9879m.f19839a));
                    if (atomicInteger.get() >= c9846m1.f19692j) {
                        C9846m1.m1478a(c9846m1, (List) c9846m1.f19695m.m1382q(C9879m.class).get());
                        Log.d("m1", "SendData " + atomicInteger);
                    }
                }
            } catch (C9919c.C9920a unused) {
                C9846m1 c9846m13 = C9846m1.f19681o;
                VungleLogger.m1603c("m1", "Could not save event to DB");
            }
        }
    }

    /* renamed from: com.vungle.warren.m1$b */
    /* loaded from: classes3.dex */
    public class C9848b extends C10069a.C10075f {

        /* renamed from: a */
        public long f19699a;

        public C9848b() {
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: c */
        public final void mo1279c() {
            if (this.f19699a <= 0) {
                return;
            }
            C9846m1 c9846m1 = C9846m1.this;
            c9846m1.f19683a.getClass();
            long currentTimeMillis = System.currentTimeMillis() - this.f19699a;
            long j = c9846m1.f19686d;
            if (j > -1 && currentTimeMillis > 0 && currentTimeMillis >= j * 1000 && c9846m1.f19687e != null) {
                Vungle._instance.hbpOrdinalViewCount.set(0);
            }
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(4));
            c9846m1.m1474e(new C9879m(4, c8695r));
        }

        @Override // com.vungle.warren.utility.C10069a.C10075f
        /* renamed from: d */
        public final void mo1280d() {
            C8695r c8695r = new C8695r();
            c8695r.m3215u("event", C0539e.m12265a(5));
            C9879m c9879m = new C9879m(5, c8695r);
            C9846m1 c9846m1 = C9846m1.this;
            c9846m1.m1474e(c9879m);
            c9846m1.f19683a.getClass();
            this.f19699a = System.currentTimeMillis();
        }
    }

    /* renamed from: com.vungle.warren.m1$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC9849c {
    }

    /* renamed from: a */
    public static void m1478a(C9846m1 c9846m1, List list) throws C9919c.C9920a {
        int i;
        synchronized (c9846m1) {
            if (c9846m1.f19685c && !list.isEmpty()) {
                C8690m c8690m = new C8690m();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C8695r c8695r = ((C9879m) it.next()).f19841c;
                    C8686j c8686j = C9879m.f19838d;
                    c8686j.getClass();
                    StringWriter stringWriter = new StringWriter();
                    try {
                        c8686j.m3228j(c8695r, c8686j.m3231g(stringWriter));
                        AbstractC8692o m3209b = C8699t.m3209b(stringWriter.toString());
                        if (m3209b instanceof C8695r) {
                            c8690m.m3224r(m3209b.m3220n());
                        }
                    } catch (IOException e) {
                        throw new C8693p(e);
                    }
                }
                try {
                    C9901e m1432a = c9846m1.f19691i.m1606n(c8690m).m1432a();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C9879m c9879m = (C9879m) it2.next();
                        if (!m1432a.m1430a() && (i = c9879m.f19840b) < c9846m1.f19692j) {
                            c9879m.f19840b = i + 1;
                            c9846m1.f19695m.m1376w(c9879m);
                        }
                        c9846m1.f19695m.m1393f(c9879m);
                    }
                } catch (IOException e2) {
                    Log.e("m1", "Sending session analytics failed " + e2.getLocalizedMessage());
                }
                c9846m1.f19693k.set(0);
            }
        }
    }

    /* renamed from: b */
    public static C9846m1 m1477b() {
        if (f19681o == null) {
            f19681o = new C9846m1();
        }
        return f19681o;
    }

    /* renamed from: c */
    public final synchronized boolean m1476c(C9879m c9879m) {
        int i = c9879m.f19839a;
        if (1 == i) {
            this.f19694l++;
            return false;
        } else if (2 == i) {
            int i2 = this.f19694l;
            if (i2 <= 0) {
                return true;
            }
            this.f19694l = i2 - 1;
            return false;
        } else if (7 == i) {
            this.f19689g.add(c9879m.m1440a(1));
            return false;
        } else if (8 == i) {
            if (!this.f19689g.contains(c9879m.m1440a(1))) {
                return true;
            }
            this.f19689g.remove(c9879m.m1440a(1));
            return false;
        } else if (11 != i) {
            return false;
        } else {
            if (c9879m.m1440a(6) == null) {
                this.f19690h.put(c9879m.m1440a(8), c9879m);
                return true;
            }
            C9879m c9879m2 = (C9879m) this.f19690h.get(c9879m.m1440a(8));
            if (c9879m2 != null) {
                this.f19690h.remove(c9879m.m1440a(8));
                c9879m.f19841c.f16516a.remove(C1828a.m9909a(8));
                c9879m.f19841c.m3215u(C1828a.m9909a(4), c9879m2.m1440a(4));
                return false;
            }
            return !c9879m.m1440a(6).equals(SchedulerSupport.NONE);
        }
    }

    /* renamed from: d */
    public final synchronized void m1475d(C9879m c9879m) {
        ExecutorService executorService = this.f19684b;
        if (executorService == null) {
            return;
        }
        executorService.submit(new RunnableC9847a(c9879m));
    }

    /* renamed from: e */
    public final synchronized void m1474e(C9879m c9879m) {
        if (c9879m == null) {
            return;
        }
        if (!this.f19685c) {
            this.f19688f.add(c9879m);
            return;
        }
        if (!m1476c(c9879m)) {
            m1475d(c9879m);
        }
    }
}
