package com.adcolony.sdk;

import android.view.View;
import android.widget.TextView;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.z0 */
/* loaded from: classes.dex */
public final class C2375z0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f5700a;

    public C2375z0(C2135i1 c2135i1) {
        this.f5700a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        HashMap hashMap;
        C2135i1 c2135i1 = this.f5700a;
        if (c2135i1.m9617b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            View remove = c2135i1.f5198g.remove(Integer.valueOf(m9441r));
            if (c2135i1.f5197f.remove(Integer.valueOf(m9441r)).booleanValue()) {
                hashMap = c2135i1.f5195d;
            } else {
                hashMap = c2135i1.f5193b;
            }
            TextView textView = (TextView) hashMap.remove(Integer.valueOf(m9441r));
            if (remove != null && textView != null) {
                c2135i1.removeView(textView);
                return;
            }
            C2201m0.m9588d().m9692k().getClass();
            C2145j1.m9606d(c2100e2.f5097a, "" + m9441r);
        }
    }
}
