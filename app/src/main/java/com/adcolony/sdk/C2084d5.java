package com.adcolony.sdk;

import android.widget.FrameLayout;

/* renamed from: com.adcolony.sdk.d5 */
/* loaded from: classes.dex */
public final class C2084d5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5072a;

    public C2084d5(C2231o5 c2231o5) {
        this.f5072a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2231o5 c2231o5 = this.f5072a;
        if (c2231o5.m9564b(c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            c2231o5.f5431b = c2367y1.m9441r("x");
            c2231o5.f5432c = c2367y1.m9441r("y");
            c2231o5.f5433d = c2367y1.m9441r("width");
            c2231o5.f5434e = c2367y1.m9441r("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2231o5.getLayoutParams();
            layoutParams.setMargins(c2231o5.f5431b, c2231o5.f5432c, 0, 0);
            layoutParams.width = c2231o5.f5433d;
            layoutParams.height = c2231o5.f5434e;
            c2231o5.setLayoutParams(layoutParams);
        }
    }
}
