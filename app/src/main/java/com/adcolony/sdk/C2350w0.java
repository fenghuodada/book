package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.iab.omid.library.adcolony.adsession.EnumC8717g;

/* renamed from: com.adcolony.sdk.w0 */
/* loaded from: classes.dex */
public final class C2350w0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f5661a;

    /* renamed from: com.adcolony.sdk.w0$a */
    /* loaded from: classes.dex */
    public class RunnableC2351a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5662a;

        public RunnableC2351a(C2100e2 c2100e2) {
            this.f5662a = c2100e2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2088e1 m9578a;
            C2135i1 c2135i1 = C2350w0.this.f5661a;
            c2135i1.getClass();
            C2100e2 c2100e2 = this.f5662a;
            C2367y1 c2367y1 = c2100e2.f5098b;
            int m9441r = c2367y1.m9441r(FacebookAdapter.KEY_ID);
            boolean m9444o = c2367y1.m9444o("is_module");
            C2058b3 m9588d = C2201m0.m9588d();
            if (m9444o) {
                m9578a = m9588d.f5004v.get(Integer.valueOf(c2367y1.m9441r("module_id")));
                if (m9578a == null) {
                    C1169e.m11129c("Module WebView created with invalid id", 0, 0, false);
                    m9578a = null;
                    c2135i1.m9618a(m9578a, EnumC8717g.OTHER);
                }
                m9578a.mo9517h(c2100e2, m9441r, c2135i1);
                m9578a.mo9515l();
            } else {
                try {
                    m9578a = C2218o0.m9578a(c2135i1.f5216y, c2100e2, m9441r, c2135i1);
                } catch (RuntimeException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(e.toString() + ": during WebView initialization.");
                    sb.append(" Disabling AdColony.");
                    C2201m0.m9588d().m9689n().m9706d(sb.toString(), 0, 0, false);
                    C2074d.m9671f();
                }
            }
            c2135i1.f5194c.put(Integer.valueOf(m9441r), m9578a);
            c2135i1.f5198g.put(Integer.valueOf(m9441r), m9578a);
            C2367y1 c2367y12 = new C2367y1();
            C2080d1.m9657k(m9578a.getWebViewModuleId(), c2367y12, "module_id");
            if (m9578a instanceof C2257q3) {
                C2080d1.m9657k(((C2257q3) m9578a).getAdcModuleId(), c2367y12, "mraid_module_id");
            }
            c2100e2.m9641a(c2367y12).m9640b();
            c2135i1.m9618a(m9578a, EnumC8717g.OTHER);
        }
    }

    public C2350w0(C2135i1 c2135i1) {
        this.f5661a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        if (this.f5661a.m9617b(c2100e2)) {
            C2232o6.m9548o(new RunnableC2351a(c2100e2));
        }
    }
}
