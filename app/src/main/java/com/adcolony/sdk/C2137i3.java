package com.adcolony.sdk;

import android.content.Context;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.i3 */
/* loaded from: classes.dex */
public final class C2137i3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5219a;

    public C2137i3(C2058b3 c2058b3) {
        this.f5219a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2058b3 c2058b3 = this.f5219a;
        c2058b3.getClass();
        Context context = C2201m0.f5363a;
        if (context != null) {
            try {
                int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
                if (m9441r > 0) {
                    c2058b3.f5004v.remove(Integer.valueOf(m9441r));
                    c2058b3.f4983a.m9631c(m9441r);
                }
                C2232o6.m9548o(new RunnableC2050a3(c2058b3, context, c2100e2));
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.toString() + ": during WebView initialization.");
                sb.append(" Disabling AdColony.");
                C2201m0.m9588d().m9689n().m9706d(sb.toString(), 0, 0, false);
                C2074d.m9671f();
            }
        }
    }
}
