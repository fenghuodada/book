package com.adcolony.sdk;

import android.widget.FrameLayout;

/* renamed from: com.adcolony.sdk.a0 */
/* loaded from: classes.dex */
public final class C2038a0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2066c0 f4917a;

    public C2038a0(C2066c0 c2066c0) {
        this.f4917a = c2066c0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2066c0 c2066c0 = this.f4917a;
        if (C2066c0.m9683a(c2066c0, c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            c2066c0.f5018b = c2367y1.m9441r("x");
            c2066c0.f5019c = c2367y1.m9441r("y");
            c2066c0.f5020d = c2367y1.m9441r("width");
            c2066c0.f5021e = c2367y1.m9441r("height");
            if (c2066c0.f5022f) {
                C2201m0.m9588d().m9691l().getClass();
                float m9524g = (c2066c0.f5021e * C2247p4.m9524g()) / c2066c0.getDrawable().getIntrinsicHeight();
                c2066c0.f5021e = (int) (c2066c0.getDrawable().getIntrinsicHeight() * m9524g);
                int intrinsicWidth = (int) (c2066c0.getDrawable().getIntrinsicWidth() * m9524g);
                c2066c0.f5020d = intrinsicWidth;
                c2066c0.f5018b -= intrinsicWidth;
                c2066c0.f5019c -= c2066c0.f5021e;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2066c0.getLayoutParams();
            layoutParams.setMargins(c2066c0.f5018b, c2066c0.f5019c, 0, 0);
            layoutParams.width = c2066c0.f5020d;
            layoutParams.height = c2066c0.f5021e;
            c2066c0.setLayoutParams(layoutParams);
        }
    }
}
