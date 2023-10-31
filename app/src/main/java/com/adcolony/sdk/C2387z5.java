package com.adcolony.sdk;

import android.widget.FrameLayout;

/* renamed from: com.adcolony.sdk.z5 */
/* loaded from: classes.dex */
public final class C2387z5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5737a;

    public C2387z5(C2132h6 c2132h6) {
        this.f5737a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2132h6 c2132h6 = this.f5737a;
        if (c2132h6.m9619c(c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            c2132h6.f5175b = c2367y1.m9441r("x");
            c2132h6.f5176c = c2367y1.m9441r("y");
            c2132h6.f5177d = c2367y1.m9441r("width");
            c2132h6.f5178e = c2367y1.m9441r("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c2132h6.getLayoutParams();
            layoutParams.setMargins(c2132h6.f5175b, c2132h6.f5176c, 0, 0);
            layoutParams.width = c2132h6.f5177d;
            layoutParams.height = c2132h6.f5178e;
            c2132h6.setLayoutParams(layoutParams);
        }
    }
}
