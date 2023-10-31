package com.adcolony.sdk;

import android.view.View;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.v0 */
/* loaded from: classes.dex */
public final class C2327v0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f5641a;

    public C2327v0(C2135i1 c2135i1) {
        this.f5641a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        boolean z;
        C2135i1 c2135i1 = this.f5641a;
        if (c2135i1.m9617b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            View remove = c2135i1.f5198g.remove(Integer.valueOf(m9441r));
            TextureView$SurfaceTextureListenerC2142j0 remove2 = c2135i1.f5192a.remove(Integer.valueOf(m9441r));
            if (remove != null && remove2 != null) {
                if (remove2.f5232K != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    remove2.m9611e();
                }
                if (remove2.f5228G != null) {
                    remove2.f5259x = true;
                }
                remove2.f5234M.shutdown();
                c2135i1.removeView(remove2);
                return;
            }
            C2201m0.m9588d().m9692k().getClass();
            C2145j1.m9606d(c2100e2.f5097a, "" + m9441r);
        }
    }
}
