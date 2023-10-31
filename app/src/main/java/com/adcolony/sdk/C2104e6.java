package com.adcolony.sdk;

import android.graphics.Typeface;

/* renamed from: com.adcolony.sdk.e6 */
/* loaded from: classes.dex */
public final class C2104e6 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5102a;

    public C2104e6(C2132h6 c2132h6) {
        this.f5102a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        Typeface typeface;
        int i;
        C2132h6 c2132h6 = this.f5102a;
        if (c2132h6.m9619c(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r("font_style");
            c2132h6.f5179f = m9441r;
            if (m9441r != 0) {
                i = 1;
                if (m9441r != 1) {
                    i = 2;
                    if (m9441r != 2) {
                        i = 3;
                        if (m9441r != 3) {
                            return;
                        }
                    }
                }
                typeface = c2132h6.getTypeface();
            } else {
                typeface = c2132h6.getTypeface();
                i = 0;
            }
            c2132h6.setTypeface(typeface, i);
        }
    }
}
