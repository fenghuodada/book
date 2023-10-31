package com.iab.omid.library.adcolony.adsession;

import androidx.constraintlayout.motion.widget.C0561g;
import com.iab.omid.library.adcolony.p041b.C8734f;

/* renamed from: com.iab.omid.library.adcolony.adsession.a */
/* loaded from: classes3.dex */
public final class C8711a {

    /* renamed from: a */
    public final C8722l f16528a;

    public C8711a(C8722l c8722l) {
        this.f16528a = c8722l;
    }

    /* renamed from: a */
    public final void m3195a() {
        boolean z;
        boolean z2;
        C8722l c8722l = this.f16528a;
        C0561g.m12180c(c8722l);
        C0561g.m12177f(c8722l);
        if (c8722l.f16574f && !c8722l.f16575g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                c8722l.m3188e();
            } catch (Exception unused) {
            }
        }
        if (c8722l.f16574f && !c8722l.f16575g) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!c8722l.f16577i) {
                C8734f.m3182a(c8722l.f16573e.m3169f(), "publishImpressionEvent", new Object[0]);
                c8722l.f16577i = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }
}
