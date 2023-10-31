package com.adcolony.sdk;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.b1 */
/* loaded from: classes.dex */
public final class C2056b1 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f4951a;

    public C2056b1(C2135i1 c2135i1) {
        this.f4951a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2135i1 c2135i1 = this.f4951a;
        if (c2135i1.m9617b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            View remove = c2135i1.f5198g.remove(Integer.valueOf(m9441r));
            C2066c0 remove2 = c2135i1.f5196e.remove(Integer.valueOf(m9441r));
            if (remove != null && remove2 != null) {
                c2135i1.removeView(remove2);
                return;
            }
            C2201m0.m9588d().m9692k().getClass();
            C2145j1.m9606d(c2100e2.f5097a, "" + m9441r);
        }
    }
}
