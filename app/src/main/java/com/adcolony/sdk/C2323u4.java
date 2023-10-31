package com.adcolony.sdk;

import android.util.Log;
import androidx.appcompat.C0157c;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.adcolony.sdk.u4 */
/* loaded from: classes.dex */
public final class C2323u4 {

    /* renamed from: a */
    public final C2284s1 f5628a;

    /* renamed from: b */
    public final ScheduledExecutorService f5629b;

    /* renamed from: d */
    public final HashMap<String, Object> f5631d;

    /* renamed from: c */
    public final ArrayList f5630c = new ArrayList();

    /* renamed from: e */
    public final C0157c f5632e = new C0157c();

    /* renamed from: com.adcolony.sdk.u4$a */
    /* loaded from: classes.dex */
    public class RunnableC2324a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2360x1 f5633a;

        public RunnableC2324a(C2360x1 c2360x1) {
            this.f5633a = c2360x1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2323u4.this.f5630c.add(this.f5633a);
        }
    }

    public C2323u4(C2284s1 c2284s1, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f5628a = c2284s1;
        this.f5629b = scheduledExecutorService;
        this.f5631d = hashMap;
    }

    /* renamed from: a */
    public final String m9492a(C0157c c0157c, ArrayList arrayList) throws JSONException {
        C2367y1 c2367y1;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        C2367y1 c2367y12 = new C2367y1();
        c0157c.getClass();
        c2367y12.m9455d(FirebaseAnalytics.Param.INDEX, "adcolony_android");
        c2367y12.m9455d("environment", "Production");
        c2367y12.m9455d(MediationMetaData.KEY_VERSION, "4.8.0");
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C2360x1 c2360x1 = (C2360x1) it.next();
            synchronized (this) {
                c2367y1 = new C2367y1(this.f5631d);
                c2360x1.f5677c.getClass();
                c2367y1.m9455d("environment", "Production");
                c2367y1.m9455d("level", c2360x1.m9461a());
                c2367y1.m9455d("message", c2360x1.f5678d);
                c2367y1.m9455d("clientTimestamp", C2360x1.f5674e.format(c2360x1.f5675a));
                JSONObject m9593b = C2201m0.m9588d().m9687p().m9593b();
                m9593b.getClass();
                JSONObject m9592c = C2201m0.m9588d().m9687p().m9592c();
                m9592c.getClass();
                synchronized (m9593b) {
                    optString = m9593b.optString("name");
                }
                c2367y1.m9455d("mediation_network", optString);
                synchronized (m9593b) {
                    optString2 = m9593b.optString(MediationMetaData.KEY_VERSION);
                }
                c2367y1.m9455d("mediation_network_version", optString2);
                synchronized (m9592c) {
                    optString3 = m9592c.optString("name");
                }
                c2367y1.m9455d("plugin", optString3);
                synchronized (m9592c) {
                    optString4 = m9592c.optString(MediationMetaData.KEY_VERSION);
                }
                c2367y1.m9455d("plugin_version", optString4);
                C2328v1 c2328v1 = C2201m0.m9588d().m9689n().f4923b;
                if (c2328v1 == null || c2328v1.m9485b("batteryInfo")) {
                    C2201m0.m9588d().m9691l().getClass();
                    c2367y1.m9450i("batteryInfo", C2247p4.m9526e());
                }
                if (c2328v1 != null) {
                    c2367y1.m9457b(c2328v1);
                }
            }
            synchronized (jSONArray) {
                jSONArray.put(c2367y1.f5690a);
            }
        }
        synchronized (c2367y12.f5690a) {
            c2367y12.f5690a.put("logs", jSONArray);
        }
        return c2367y12.toString();
    }

    /* renamed from: b */
    public final synchronized void m9491b(TimeUnit timeUnit) {
        try {
            if (!this.f5629b.isShutdown() && !this.f5629b.isTerminated()) {
                this.f5629b.scheduleAtFixedRate(new RunnableC2297t4(this), 5L, 5L, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    /* renamed from: c */
    public final synchronized void m9490c(C2360x1 c2360x1) {
        try {
            if (!this.f5629b.isShutdown() && !this.f5629b.isTerminated()) {
                this.f5629b.submit(new RunnableC2324a(c2360x1));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    /* renamed from: d */
    public final synchronized void m9489d(String str) {
        C2360x1 c2360x1 = new C2360x1();
        c2360x1.f5676b = 0;
        c2360x1.f5677c = this.f5632e;
        c2360x1.f5678d = str;
        if (c2360x1.f5675a == null) {
            c2360x1.f5675a = new Date(System.currentTimeMillis());
        }
        m9490c(c2360x1);
    }

    /* renamed from: e */
    public final synchronized void m9488e(String str) {
        C2360x1 c2360x1 = new C2360x1();
        c2360x1.f5676b = 2;
        c2360x1.f5677c = this.f5632e;
        c2360x1.f5678d = str;
        if (c2360x1.f5675a == null) {
            c2360x1.f5675a = new Date(System.currentTimeMillis());
        }
        m9490c(c2360x1);
    }

    /* renamed from: f */
    public final synchronized void m9487f(String str) {
        C2360x1 c2360x1 = new C2360x1();
        c2360x1.f5676b = 1;
        c2360x1.f5677c = this.f5632e;
        c2360x1.f5678d = str;
        if (c2360x1.f5675a == null) {
            c2360x1.f5675a = new Date(System.currentTimeMillis());
        }
        m9490c(c2360x1);
    }
}
