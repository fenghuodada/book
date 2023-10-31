package com.adcolony.sdk;

import android.graphics.Typeface;

/* renamed from: com.adcolony.sdk.g5 */
/* loaded from: classes.dex */
public final class C2122g5 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2231o5 f5154a;

    public C2122g5(C2231o5 c2231o5) {
        this.f5154a = c2231o5;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        Typeface typeface;
        C2231o5 c2231o5 = this.f5154a;
        if (c2231o5.m9564b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r("font_family");
            c2231o5.f5436g = m9441r;
            if (m9441r != 0) {
                if (m9441r != 1) {
                    if (m9441r != 2) {
                        if (m9441r == 3) {
                            typeface = Typeface.MONOSPACE;
                        } else {
                            return;
                        }
                    } else {
                        typeface = Typeface.SANS_SERIF;
                    }
                } else {
                    typeface = Typeface.SERIF;
                }
            } else {
                typeface = Typeface.DEFAULT;
            }
            c2231o5.setTypeface(typeface);
        }
    }
}
