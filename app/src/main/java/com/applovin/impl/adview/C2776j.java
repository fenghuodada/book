package com.applovin.impl.adview;

import android.os.Handler;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.applovin.impl.adview.j */
/* loaded from: classes.dex */
public final class C2776j {

    /* renamed from: a */
    private final C3349v f6632a;

    /* renamed from: b */
    private final Handler f6633b;

    /* renamed from: c */
    private final Set<C2779b> f6634c = new HashSet();

    /* renamed from: d */
    private final AtomicInteger f6635d = new AtomicInteger();

    /* renamed from: com.applovin.impl.adview.j$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2778a {
        /* renamed from: a */
        void mo8938a();

        /* renamed from: b */
        boolean mo8937b();
    }

    /* renamed from: com.applovin.impl.adview.j$b */
    /* loaded from: classes.dex */
    public static class C2779b {

        /* renamed from: a */
        private final String f6639a;

        /* renamed from: b */
        private final InterfaceC2778a f6640b;

        /* renamed from: c */
        private final long f6641c;

        private C2779b(String str, long j, InterfaceC2778a interfaceC2778a) {
            this.f6639a = str;
            this.f6641c = j;
            this.f6640b = interfaceC2778a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public String m8936a() {
            return this.f6639a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public long m8934b() {
            return this.f6641c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public InterfaceC2778a m8932c() {
            return this.f6640b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C2779b) {
                String str = this.f6639a;
                String str2 = ((C2779b) obj).f6639a;
                return str != null ? str.equalsIgnoreCase(str2) : str2 == null;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f6639a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "CountdownProxy{identifier='" + this.f6639a + "', countdownStepMillis=" + this.f6641c + '}';
        }
    }

    public C2776j(Handler handler, C3214m c3214m) {
        if (handler == null) {
            throw new IllegalArgumentException("No handler specified.");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified.");
        }
        this.f6633b = handler;
        this.f6632a = c3214m.m7487A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8945a(final C2779b c2779b, final int i) {
        this.f6633b.postDelayed(new Runnable() { // from class: com.applovin.impl.adview.j.1
            @Override // java.lang.Runnable
            public void run() {
                InterfaceC2778a m8932c = c2779b.m8932c();
                if (!m8932c.mo8937b()) {
                    if (C3349v.m6862a()) {
                        C3349v c3349v = C2776j.this.f6632a;
                        c3349v.m6855b("CountdownManager", "Ending countdown for " + c2779b.m8936a());
                    }
                } else if (C2776j.this.f6635d.get() != i) {
                    if (C3349v.m6862a()) {
                        C3349v c3349v2 = C2776j.this.f6632a;
                        c3349v2.m6851d("CountdownManager", "Killing duplicate countdown from previous generation: " + c2779b.m8936a());
                    }
                } else {
                    try {
                        m8932c.mo8938a();
                        C2776j.this.m8945a(c2779b, i);
                    } catch (Throwable th) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = C2776j.this.f6632a;
                            c3349v3.m6854b("CountdownManager", "Encountered error on countdown step for: " + c2779b.m8936a(), th);
                        }
                        C2776j.this.m8941b();
                    }
                }
            }
        }, c2779b.m8934b());
    }

    /* renamed from: a */
    public void m8946a() {
        HashSet hashSet = new HashSet(this.f6634c);
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6632a;
            c3349v.m6855b("CountdownManager", "Starting " + hashSet.size() + " countdowns...");
        }
        int incrementAndGet = this.f6635d.incrementAndGet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C2779b c2779b = (C2779b) it.next();
            if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f6632a;
                c3349v2.m6855b("CountdownManager", "Starting countdown: " + c2779b.m8936a() + " for generation " + incrementAndGet + "...");
            }
            m8945a(c2779b, incrementAndGet);
        }
    }

    /* renamed from: a */
    public void m8942a(String str, long j, InterfaceC2778a interfaceC2778a) {
        if (j > 0) {
            if (this.f6633b != null) {
                if (C3349v.m6862a()) {
                    C2808x.m8855b("Adding countdown: ", str, this.f6632a, "CountdownManager");
                }
                this.f6634c.add(new C2779b(str, j, interfaceC2778a));
                return;
            }
            throw new IllegalArgumentException("No handler specified.");
        }
        throw new IllegalArgumentException("Invalid step specified.");
    }

    /* renamed from: b */
    public void m8941b() {
        if (C3349v.m6862a()) {
            this.f6632a.m6855b("CountdownManager", "Removing all countdowns...");
        }
        m8939c();
        this.f6634c.clear();
    }

    /* renamed from: c */
    public void m8939c() {
        if (C3349v.m6862a()) {
            this.f6632a.m6855b("CountdownManager", "Stopping countdowns...");
        }
        this.f6635d.incrementAndGet();
        this.f6633b.removeCallbacksAndMessages(null);
    }
}
