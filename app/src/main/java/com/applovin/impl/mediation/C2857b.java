package com.applovin.impl.mediation;

import com.applovin.impl.mediation.C2821a;
import com.applovin.impl.mediation.C2866c;
import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.mediation.b */
/* loaded from: classes.dex */
public class C2857b implements C2821a.InterfaceC2822a, C2866c.InterfaceC2868a {

    /* renamed from: a */
    private final C2821a f6905a;

    /* renamed from: b */
    private final C2866c f6906b;

    /* renamed from: c */
    private final MaxAdListener f6907c;

    public C2857b(C3214m c3214m, MaxAdListener maxAdListener) {
        this.f6907c = maxAdListener;
        this.f6905a = new C2821a(c3214m);
        this.f6906b = new C2866c(c3214m, this);
    }

    @Override // com.applovin.impl.mediation.C2821a.InterfaceC2822a
    /* renamed from: a */
    public void mo8603a(final C2825c c2825c) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.b.1
            @Override // java.lang.Runnable
            public void run() {
                C2857b.this.f6907c.onAdHidden(c2825c);
            }
        }, c2825c.m8762x());
    }

    /* renamed from: a */
    public void m8601a(MaxAd maxAd) {
        this.f6906b.m8561a();
        this.f6905a.m8810a();
    }

    /* renamed from: b */
    public void m8600b(C2825c c2825c) {
        long m8764v = c2825c.m8764v();
        if (m8764v >= 0) {
            this.f6906b.m8560a(c2825c, m8764v);
        }
        if (c2825c.m8763w()) {
            this.f6905a.m8809a(c2825c, this);
        }
    }

    @Override // com.applovin.impl.mediation.C2866c.InterfaceC2868a
    /* renamed from: c */
    public void mo8554c(C2825c c2825c) {
        this.f6907c.onAdHidden(c2825c);
    }
}
