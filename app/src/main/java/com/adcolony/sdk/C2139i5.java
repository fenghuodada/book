package com.adcolony.sdk;

import android.graphics.Typeface;

/* renamed from: com.adcolony.sdk.i5 */
/* loaded from: classes.dex */
public final class C2139i5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5220a;

    public C2139i5(C2231o5 c2231o5) {
        this.f5220a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        Typeface typeface;
        int i;
        C2231o5 c2231o5 = this.f5220a;
        if (c2231o5.m9564b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r("font_style");
            c2231o5.f5435f = m9441r;
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
                typeface = c2231o5.getTypeface();
            } else {
                typeface = c2231o5.getTypeface();
                i = 0;
            }
            c2231o5.setTypeface(typeface, i);
        }
    }
}
