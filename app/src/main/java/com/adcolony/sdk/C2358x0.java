package com.adcolony.sdk;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.x0 */
/* loaded from: classes.dex */
public final class C2358x0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f5671a;

    /* renamed from: com.adcolony.sdk.x0$a */
    /* loaded from: classes.dex */
    public class RunnableC2359a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5672a;

        public RunnableC2359a(C2100e2 c2100e2) {
            this.f5672a = c2100e2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2135i1 c2135i1 = C2358x0.this.f5671a;
            c2135i1.getClass();
            C2100e2 c2100e2 = this.f5672a;
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            C2058b3 m9588d = C2201m0.m9588d();
            View remove = c2135i1.f5198g.remove(Integer.valueOf(m9441r));
            C2218o0 remove2 = c2135i1.f5194c.remove(Integer.valueOf(m9441r));
            if (remove2 != null && remove != null) {
                if (remove2 instanceof InterfaceC2228o3) {
                    C2117g2 m9688o = m9588d.m9688o();
                    m9688o.getClass();
                    m9688o.m9631c(((InterfaceC2228o3) remove2).getAdcModuleId());
                }
                c2135i1.removeView(remove2);
                return;
            }
            m9588d.m9692k().getClass();
            C2145j1.m9606d(c2100e2.f5097a, "" + m9441r);
        }
    }

    public C2358x0(C2135i1 c2135i1) {
        this.f5671a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        if (this.f5671a.m9617b(c2100e2)) {
            C2232o6.m9548o(new RunnableC2359a(c2100e2));
        }
    }
}
