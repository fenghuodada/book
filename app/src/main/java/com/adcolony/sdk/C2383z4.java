package com.adcolony.sdk;

import android.os.SystemClock;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.LinkedHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.z4 */
/* loaded from: classes.dex */
public final class C2383z4 {

    /* renamed from: b */
    public int f5721b;

    /* renamed from: c */
    public long f5722c;

    /* renamed from: f */
    public boolean f5725f;

    /* renamed from: i */
    public boolean f5728i;

    /* renamed from: j */
    public boolean f5729j;

    /* renamed from: k */
    public C2215n5 f5730k;

    /* renamed from: a */
    public long f5720a = 1800000;

    /* renamed from: d */
    public boolean f5723d = true;

    /* renamed from: e */
    public boolean f5724e = true;

    /* renamed from: g */
    public boolean f5726g = false;

    /* renamed from: h */
    public boolean f5727h = false;

    /* renamed from: com.adcolony.sdk.z4$a */
    /* loaded from: classes.dex */
    public class RunnableC2384a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2240p3 f5731a;

        /* renamed from: b */
        public final /* synthetic */ C2058b3 f5732b;

        public RunnableC2384a(C2240p3 c2240p3, C2058b3 c2058b3) {
            this.f5731a = c2240p3;
            this.f5732b = c2058b3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5731a.mo9569d();
            this.f5732b.m9689n().m9704f();
        }
    }

    /* renamed from: com.adcolony.sdk.z4$b */
    /* loaded from: classes.dex */
    public class RunnableC2385b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f5733a;

        public RunnableC2385b(boolean z) {
            this.f5733a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            LinkedHashMap<Integer, InterfaceC2228o3> linkedHashMap = C2201m0.m9588d().m9688o().f5124a;
            synchronized (linkedHashMap) {
                for (InterfaceC2228o3 interfaceC2228o3 : linkedHashMap.values()) {
                    C2367y1 c2367y1 = new C2367y1();
                    C2080d1.m9656l(c2367y1, "from_window_focus", this.f5733a);
                    C2383z4 c2383z4 = C2383z4.this;
                    if (c2383z4.f5727h && !c2383z4.f5726g) {
                        C2080d1.m9656l(c2367y1, "app_in_foreground", false);
                        C2383z4.this.f5727h = false;
                    }
                    new C2100e2(interfaceC2228o3.getModuleId(), c2367y1, "SessionInfo.on_pause").m9640b();
                }
            }
            C2201m0.m9585g();
        }
    }

    /* renamed from: com.adcolony.sdk.z4$c */
    /* loaded from: classes.dex */
    public class RunnableC2386c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ boolean f5735a;

        public RunnableC2386c(boolean z) {
            this.f5735a = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2058b3 m9588d = C2201m0.m9588d();
            LinkedHashMap<Integer, InterfaceC2228o3> linkedHashMap = m9588d.m9688o().f5124a;
            synchronized (linkedHashMap) {
                for (InterfaceC2228o3 interfaceC2228o3 : linkedHashMap.values()) {
                    C2367y1 c2367y1 = new C2367y1();
                    C2080d1.m9656l(c2367y1, "from_window_focus", this.f5735a);
                    C2383z4 c2383z4 = C2383z4.this;
                    if (c2383z4.f5727h && c2383z4.f5726g) {
                        C2080d1.m9656l(c2367y1, "app_in_foreground", true);
                        C2383z4.this.f5727h = false;
                    }
                    new C2100e2(interfaceC2228o3.getModuleId(), c2367y1, "SessionInfo.on_resume").m9640b();
                }
            }
            m9588d.m9689n().m9704f();
        }
    }

    /* renamed from: a */
    public final void m9426a(boolean z) {
        this.f5724e = true;
        C2215n5 c2215n5 = this.f5730k;
        if (c2215n5.f5392b == null) {
            try {
                c2215n5.f5392b = c2215n5.f5391a.schedule(new RunnableC2198l5(c2215n5), c2215n5.f5394d.f5720a, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C1169e.m11129c("RejectedExecutionException when scheduling session stop " + e.toString(), 0, 0, true);
            }
        }
        if (!C2074d.m9673d(new RunnableC2385b(z))) {
            C1169e.m11129c("RejectedExecutionException on session pause.", 0, 0, true);
        }
    }

    /* renamed from: b */
    public final void m9425b(boolean z) {
        this.f5724e = false;
        C2215n5 c2215n5 = this.f5730k;
        ScheduledFuture<?> scheduledFuture = c2215n5.f5392b;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            c2215n5.f5392b.cancel(false);
            c2215n5.f5392b = null;
        }
        if (!C2074d.m9673d(new RunnableC2386c(z))) {
            C1169e.m11129c("RejectedExecutionException on session resume.", 0, 0, true);
        }
    }

    /* renamed from: c */
    public final void m9424c(boolean z) {
        C2240p3 c2240p3;
        C2058b3 m9588d = C2201m0.m9588d();
        if (this.f5725f) {
            return;
        }
        if (this.f5728i) {
            m9588d.f4960B = false;
            this.f5728i = false;
        }
        this.f5721b = 0;
        this.f5722c = SystemClock.uptimeMillis();
        this.f5723d = true;
        this.f5725f = true;
        this.f5726g = true;
        this.f5727h = false;
        if (C2074d.f5043a.isShutdown()) {
            C2074d.f5043a = Executors.newSingleThreadExecutor();
        }
        if (z) {
            C2367y1 c2367y1 = new C2367y1();
            C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, C2232o6.m9559d());
            new C2100e2(1, c2367y1, "SessionInfo.on_start").m9640b();
            InterfaceC2228o3 interfaceC2228o3 = C2201m0.m9588d().m9688o().f5124a.get(1);
            if (interfaceC2228o3 instanceof C2240p3) {
                c2240p3 = (C2240p3) interfaceC2228o3;
            } else {
                c2240p3 = null;
            }
            if (c2240p3 != null && !C2074d.m9673d(new RunnableC2384a(c2240p3, m9588d))) {
                C1169e.m11129c("RejectedExecutionException on controller update.", 0, 0, true);
            }
        }
        m9588d.m9688o().m9627g();
        C2279r5.m9508a().f5549e.clear();
    }

    /* renamed from: d */
    public final void m9423d(boolean z) {
        if (z && this.f5724e) {
            m9425b(false);
        } else if (!z && !this.f5724e) {
            m9426a(false);
        }
        this.f5723d = z;
    }
}
