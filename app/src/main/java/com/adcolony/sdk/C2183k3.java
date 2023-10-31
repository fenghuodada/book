package com.adcolony.sdk;

import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.k3 */
/* loaded from: classes.dex */
public final class C2183k3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5334a;

    public C2183k3(C2058b3 c2058b3) {
        this.f5334a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2323u4 c2323u4 = this.f5334a.m9689n().f4926e;
        this.f5334a.f4962D.m9427b(true);
        if (this.f5334a.f4967I) {
            C2367y1 c2367y1 = new C2367y1();
            C2367y1 c2367y12 = new C2367y1();
            C2080d1.m9660h(c2367y12, "app_version", C2232o6.m9546q());
            C2080d1.m9661g(c2367y1, "app_bundle_info", c2367y12);
            new C2100e2(1, c2367y1, "AdColony.on_update").m9640b();
            this.f5334a.f4967I = false;
        }
        if (this.f5334a.f4968J) {
            new C2100e2("AdColony.on_install", 1).m9640b();
        }
        C2367y1 c2367y13 = c2100e2.f5098b;
        if (c2323u4 != null) {
            String m9436w = c2367y13.m9436w("app_session_id");
            synchronized (c2323u4) {
                c2323u4.f5631d.put("sessionId", m9436w);
            }
        }
        if (C2235p.m9535a()) {
            C2235p.m9534b();
        }
        Integer m9442q = c2367y13.m9442q("base_download_threads");
        if (m9442q != null) {
            C2052a5 c2052a5 = this.f5334a.f4984b;
            c2052a5.f4943b = m9442q.intValue();
            ThreadPoolExecutor threadPoolExecutor = c2052a5.f4946e;
            int corePoolSize = threadPoolExecutor.getCorePoolSize();
            int i = c2052a5.f4943b;
            if (corePoolSize < i) {
                threadPoolExecutor.setCorePoolSize(i);
            }
        }
        Integer m9442q2 = c2367y13.m9442q("concurrent_requests");
        if (m9442q2 != null) {
            C2052a5 c2052a52 = this.f5334a.f4984b;
            c2052a52.f4944c = m9442q2.intValue();
            ThreadPoolExecutor threadPoolExecutor2 = c2052a52.f4946e;
            int corePoolSize2 = threadPoolExecutor2.getCorePoolSize();
            int i2 = c2052a52.f4944c;
            if (corePoolSize2 > i2) {
                threadPoolExecutor2.setCorePoolSize(i2);
            }
        }
        Integer m9442q3 = c2367y13.m9442q("threads_keep_alive_time");
        if (m9442q3 != null) {
            this.f5334a.f4984b.f4946e.setKeepAliveTime(m9442q3.intValue(), TimeUnit.SECONDS);
        }
        double m9443p = c2367y13.m9443p();
        if (!Double.isNaN(m9443p)) {
            this.f5334a.f4984b.f4945d = m9443p;
        }
        C2175j6 c2175j6 = this.f5334a.f4995m;
        c2175j6.m9603a();
        c2175j6.f5303a = false;
        C2232o6.m9556g(c2175j6.f5304b, C2201m0.m9588d().f4979U);
        C2058b3 c2058b3 = this.f5334a;
        c2058b3.getClass();
        C2367y1 c2367y14 = new C2367y1();
        C2080d1.m9660h(c2367y14, "type", "AdColony.on_configuration_completed");
        C2328v1 c2328v1 = new C2328v1();
        for (String str : c2058b3.f5003u.keySet()) {
            c2328v1.m9483d(str);
        }
        C2367y1 c2367y15 = new C2367y1();
        C2080d1.m9662f(c2367y15, AdColonyAdapterUtils.KEY_ZONE_IDS, c2328v1);
        C2080d1.m9661g(c2367y14, "message", c2367y15);
        new C2100e2(0, c2367y14, "CustomMessage.controller_send").m9640b();
    }
}
