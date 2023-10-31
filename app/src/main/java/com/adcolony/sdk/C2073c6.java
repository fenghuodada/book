package com.adcolony.sdk;

import android.graphics.Typeface;

/* renamed from: com.adcolony.sdk.c6 */
/* loaded from: classes.dex */
public final class C2073c6 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2132h6 f5042a;

    public C2073c6(C2132h6 c2132h6) {
        this.f5042a = c2132h6;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        Typeface typeface;
        C2132h6 c2132h6 = this.f5042a;
        if (c2132h6.m9619c(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r("font_family");
            c2132h6.f5180g = m9441r;
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
            c2132h6.setTypeface(typeface);
        }
    }
}
