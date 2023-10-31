package com.adcolony.sdk;

import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.a2 */
/* loaded from: classes.dex */
public final class C2040a2 {

    /* renamed from: f */
    public static boolean f4919f = false;

    /* renamed from: g */
    public static int f4920g = 3;

    /* renamed from: h */
    public static int f4921h = 1;

    /* renamed from: a */
    public C2367y1 f4922a = new C2367y1();

    /* renamed from: b */
    public C2328v1 f4923b = null;

    /* renamed from: c */
    public ExecutorService f4924c = null;

    /* renamed from: d */
    public final ConcurrentLinkedQueue f4925d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    public C2323u4 f4926e;

    /* renamed from: com.adcolony.sdk.a2$a */
    /* loaded from: classes.dex */
    public class C2041a implements InterfaceC2203m2 {
        public C2041a() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 0, true);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$b */
    /* loaded from: classes.dex */
    public class C2042b implements InterfaceC2203m2 {
        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            C2040a2.f4920g = c2100e2.f5098b.m9441r("level");
        }
    }

    /* renamed from: com.adcolony.sdk.a2$c */
    /* loaded from: classes.dex */
    public class C2043c implements InterfaceC2203m2 {
        public C2043c() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 3, false);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$d */
    /* loaded from: classes.dex */
    public class C2044d implements InterfaceC2203m2 {
        public C2044d() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 3, true);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$e */
    /* loaded from: classes.dex */
    public class C2045e implements InterfaceC2203m2 {
        public C2045e() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 2, false);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$f */
    /* loaded from: classes.dex */
    public class C2046f implements InterfaceC2203m2 {
        public C2046f() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 2, true);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$g */
    /* loaded from: classes.dex */
    public class C2047g implements InterfaceC2203m2 {
        public C2047g() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 1, false);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$h */
    /* loaded from: classes.dex */
    public class C2048h implements InterfaceC2203m2 {
        public C2048h() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 1, true);
        }
    }

    /* renamed from: com.adcolony.sdk.a2$i */
    /* loaded from: classes.dex */
    public class C2049i implements InterfaceC2203m2 {
        public C2049i() {
        }

        @Override // com.adcolony.sdk.InterfaceC2203m2
        /* renamed from: a */
        public final void mo9422a(C2100e2 c2100e2) {
            int m9441r = c2100e2.f5098b.m9441r("module");
            C2040a2.this.m9706d(c2100e2.f5098b.m9436w("message"), m9441r, 0, false);
        }
    }

    /* renamed from: a */
    public static boolean m9709a(C2367y1 c2367y1, int i) {
        int m9441r = c2367y1.m9441r("send_level");
        if (c2367y1.m9449j()) {
            m9441r = f4921h;
        }
        if (m9441r >= i && m9441r != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m9708b(C2367y1 c2367y1, int i, boolean z) {
        int m9441r = c2367y1.m9441r("print_level");
        boolean m9444o = c2367y1.m9444o("log_private");
        if (c2367y1.m9449j()) {
            m9441r = f4920g;
            m9444o = f4919f;
        }
        if ((z && !m9444o) || m9441r == 4 || m9441r < i) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean m9707c(Runnable runnable) {
        try {
            ExecutorService executorService = this.f4924c;
            if (executorService == null || executorService.isShutdown() || this.f4924c.isTerminated()) {
                return false;
            }
            this.f4924c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* renamed from: d */
    public final void m9706d(String str, int i, int i2, boolean z) {
        if (!m9707c(new RunnableC2057b2(this, i, str, i2, z))) {
            synchronized (this.f4925d) {
                this.f4925d.add(new RunnableC2057b2(this, i, str, i2, z));
            }
        }
    }

    /* renamed from: e */
    public final void m9705e() {
        C2201m0.m9590b("Log.set_log_level", new C2042b());
        C2201m0.m9590b("Log.public.trace", new C2043c());
        C2201m0.m9590b("Log.private.trace", new C2044d());
        C2201m0.m9590b("Log.public.info", new C2045e());
        C2201m0.m9590b("Log.private.info", new C2046f());
        C2201m0.m9590b("Log.public.warning", new C2047g());
        C2201m0.m9590b("Log.private.warning", new C2048h());
        C2201m0.m9590b("Log.public.error", new C2049i());
        C2201m0.m9590b("Log.private.error", new C2041a());
    }

    /* renamed from: f */
    public final void m9704f() {
        ExecutorService executorService = this.f4924c;
        if (executorService == null || executorService.isShutdown() || this.f4924c.isTerminated()) {
            this.f4924c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f4925d) {
            while (!this.f4925d.isEmpty()) {
                m9707c((Runnable) this.f4925d.poll());
            }
        }
    }
}
