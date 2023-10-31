package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.datastore.preferences.protobuf.C1169e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

@SuppressLint({"UseSparseArrays"})
/* renamed from: com.adcolony.sdk.g2 */
/* loaded from: classes.dex */
public final class C2117g2 {

    /* renamed from: a */
    public final LinkedHashMap<Integer, InterfaceC2228o3> f5124a = new LinkedHashMap<>();

    /* renamed from: b */
    public int f5125b = 2;

    /* renamed from: c */
    public final HashMap<String, ArrayList<InterfaceC2203m2>> f5126c = new HashMap<>();

    /* renamed from: d */
    public int f5127d = 1;

    /* renamed from: e */
    public final LinkedBlockingQueue<C2367y1> f5128e = new LinkedBlockingQueue<>();

    /* renamed from: f */
    public boolean f5129f = false;

    /* renamed from: g */
    public final ScheduledExecutorService f5130g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h */
    public final ExecutorService f5131h = Executors.newSingleThreadExecutor();

    /* renamed from: i */
    public ScheduledFuture<?> f5132i;

    /* renamed from: com.adcolony.sdk.g2$a */
    /* loaded from: classes.dex */
    public class RunnableC2118a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Context f5133a;

        public RunnableC2118a(Context context) {
            this.f5133a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2367y1 c2367y1 = C2201m0.m9588d().m9687p().f5362b;
            C2367y1 c2367y12 = new C2367y1();
            C2080d1.m9660h(c2367y1, "os_name", "android");
            C2080d1.m9660h(c2367y12, "filepath", C2201m0.m9588d().m9685r().f5576a + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            C2080d1.m9661g(c2367y12, "info", c2367y1);
            C2080d1.m9657k(0, c2367y12, "m_origin");
            C2117g2 c2117g2 = C2117g2.this;
            int i = c2117g2.f5127d;
            c2117g2.f5127d = i + 1;
            C2080d1.m9657k(i, c2367y12, "m_id");
            C2080d1.m9660h(c2367y12, "m_type", "Controller.create");
            try {
                new C2240p3(this.f5133a, new C2100e2(c2367y12)).mo9472n();
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.toString() + ": during WebView initialization.");
                sb.append(" Disabling AdColony.");
                C2201m0.m9588d().m9689n().m9706d(sb.toString(), 0, 0, false);
                C2074d.m9671f();
            }
        }
    }

    /* renamed from: b */
    public static void m9632b(C2117g2 c2117g2, C2367y1 c2367y1) {
        StringBuilder sb;
        String str;
        c2117g2.getClass();
        try {
            String m9446m = c2367y1.m9446m("m_type");
            int m9452g = c2367y1.m9452g("m_origin");
            RunnableC2169j2 runnableC2169j2 = new RunnableC2169j2(c2117g2, m9446m, c2367y1);
            if (m9452g >= 2) {
                C2232o6.m9548o(runnableC2169j2);
            } else {
                c2117g2.f5131h.execute(runnableC2169j2);
            }
        } catch (RejectedExecutionException e) {
            e = e;
            sb = new StringBuilder();
            str = "RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ";
            sb.append(str);
            sb.append(e.toString());
            C1169e.m11129c(sb.toString(), 0, 0, true);
        } catch (JSONException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "JSON error from message dispatcher's dispatchNativeMessage(): ";
            sb.append(str);
            sb.append(e.toString());
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: a */
    public final void m9633a() {
        Context context;
        C2058b3 m9588d = C2201m0.m9588d();
        if (!m9588d.f4960B && !m9588d.f4961C && (context = C2201m0.f5363a) != null) {
            m9630d();
            C2232o6.m9548o(new RunnableC2118a(context));
        }
    }

    /* renamed from: c */
    public final boolean m9631c(int i) {
        synchronized (this.f5124a) {
            InterfaceC2228o3 remove = this.f5124a.remove(Integer.valueOf(i));
            if (remove != null) {
                remove.mo9473b();
                return true;
            }
            return false;
        }
    }

    /* renamed from: d */
    public final void m9630d() {
        if (this.f5129f) {
            return;
        }
        synchronized (this.f5128e) {
            if (this.f5129f) {
                return;
            }
            this.f5129f = true;
            new Thread(new RunnableC2127h2(this)).start();
        }
    }

    /* renamed from: e */
    public final void m9629e(C2367y1 c2367y1) {
        boolean z;
        try {
            int i = this.f5127d;
            synchronized (c2367y1.f5690a) {
                if (!c2367y1.f5690a.has("m_id")) {
                    c2367y1.f5690a.put("m_id", i);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.f5127d++;
            }
            c2367y1.m9447l(0, "m_origin");
            int m9452g = c2367y1.m9452g("m_target");
            if (m9452g == 0) {
                m9630d();
                this.f5128e.add(c2367y1);
                return;
            }
            InterfaceC2228o3 interfaceC2228o3 = this.f5124a.get(Integer.valueOf(m9452g));
            if (interfaceC2228o3 != null) {
                interfaceC2228o3.mo9570c(c2367y1);
            }
        } catch (JSONException e) {
            C1169e.m11129c("JSON error in ADCMessageDispatcher's sendMessage(): " + e.toString(), 0, 0, true);
        }
    }

    /* renamed from: f */
    public final boolean m9628f() {
        for (InterfaceC2228o3 interfaceC2228o3 : this.f5124a.values()) {
            if (interfaceC2228o3.mo9571a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final void m9627g() {
        if (m9628f() && this.f5132i == null) {
            try {
                this.f5132i = this.f5130g.scheduleAtFixedRate(new RunnableC2136i2(this), 0L, 17L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                C1169e.m11129c("Error when scheduling message pumping" + e.toString(), 0, 0, true);
            }
        }
    }
}
