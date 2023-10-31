package com.applovin.impl.mediation.ads;

import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.C2826d;
import com.applovin.impl.sdk.C3068aa;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.C3358z;

/* renamed from: com.applovin.impl.mediation.ads.b */
/* loaded from: classes.dex */
public class C2856b implements C3068aa.InterfaceC3071a {

    /* renamed from: a */
    private final C3214m f6900a;

    /* renamed from: b */
    private final C2826d f6901b;

    /* renamed from: c */
    private final C3068aa f6902c;

    /* renamed from: d */
    private final C3358z f6903d;

    /* renamed from: e */
    private final AbstractC2854a.InterfaceC2855a f6904e;

    public C2856b(C2826d c2826d, AbstractC2854a.InterfaceC2855a interfaceC2855a, C3214m c3214m) {
        this.f6900a = c3214m;
        this.f6901b = c2826d;
        this.f6904e = interfaceC2855a;
        this.f6903d = new C3358z(c2826d.m8757u(), c3214m);
        C3068aa c3068aa = new C3068aa(c2826d.m8757u(), c3214m, this);
        this.f6902c = c3068aa;
        c3068aa.m8024a(c2826d);
        if (C3349v.m6862a()) {
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6855b("MaxNativeAdView", "Created new MaxNativeAdView (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m8606a(long j) {
        if (this.f6901b.m8753y().compareAndSet(false, true)) {
            if (C3349v.m6862a()) {
                this.f6900a.m7487A().m6855b("MaxNativeAdView", "Scheduling viewability impression for ad...");
            }
            this.f6900a.m7483E().processViewabilityAdImpressionPostback(this.f6901b, j, this.f6904e);
        }
    }

    /* renamed from: a */
    public void m8607a() {
        this.f6902c.m8027a();
    }

    /* renamed from: b */
    public void m8605b() {
        if (C3349v.m6862a()) {
            this.f6900a.m7487A().m6855b("MaxNativeAdView", "Handling view attached to window");
        }
        if (this.f6901b.m8754x().compareAndSet(false, true)) {
            if (C3349v.m6862a()) {
                this.f6900a.m7487A().m6855b("MaxNativeAdView", "Scheduling impression for ad manually...");
            }
            this.f6900a.m7483E().processRawAdImpressionPostback(this.f6901b, this.f6904e);
        }
    }

    /* renamed from: c */
    public C2826d m8604c() {
        return this.f6901b;
    }

    @Override // com.applovin.impl.sdk.C3068aa.InterfaceC3071a
    public void onLogVisibilityImpression() {
        m8606a(this.f6903d.m6825a(this.f6901b));
    }
}
