package com.applovin.impl.sdk.p033e;

import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.p008a.C2655c;
import com.applovin.impl.p008a.C2656d;
import com.applovin.impl.p008a.C2657e;
import com.applovin.impl.p008a.C2662i;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.p008a.C2666m;
import com.applovin.impl.p008a.EnumC2658f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdType;
import java.util.HashSet;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.e.t */
/* loaded from: classes.dex */
public class C3179t extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C2657e f8293a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f8294c;

    public C3179t(C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskRenderVastAd", c3214m);
        this.f8294c = appLovinAdLoadListener;
        this.f8293a = c2657e;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3349v.m6862a()) {
            m7705a("Rendering VAST ad...");
        }
        int size = this.f8293a.m9244b().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String str = "";
        C2662i c2662i = null;
        C2666m c2666m = null;
        C2656d c2656d = null;
        C2655c c2655c = null;
        String str2 = "";
        for (C3343r c3343r : this.f8293a.m9244b()) {
            C3343r m6879c = c3343r.m6879c(C2665l.m9214a(c3343r) ? "Wrapper" : "InLine");
            if (m6879c != null) {
                C3343r m6879c2 = m6879c.m6879c("AdSystem");
                if (m6879c2 != null) {
                    c2662i = C2662i.m9226a(m6879c2, c2662i, this.f8192b);
                }
                str = C2665l.m9213a(m6879c, "AdTitle", str);
                str2 = C2665l.m9213a(m6879c, "Description", str2);
                C2665l.m9210a(m6879c.m6883a("Impression"), hashSet, this.f8293a, this.f8192b);
                C3343r m6881b = m6879c.m6881b("ViewableImpression");
                if (m6881b != null) {
                    C2665l.m9210a(m6881b.m6883a("Viewable"), hashSet, this.f8293a, this.f8192b);
                }
                C3343r m6879c3 = m6879c.m6879c("AdVerifications");
                if (m6879c3 != null) {
                    c2655c = C2655c.m9251a(m6879c3, c2655c, this.f8293a, this.f8192b);
                }
                C2665l.m9210a(m6879c.m6883a("Error"), hashSet2, this.f8293a, this.f8192b);
                C3343r m6881b2 = m6879c.m6881b("Creatives");
                if (m6881b2 != null) {
                    for (C3343r c3343r2 : m6881b2.m6878d()) {
                        C3343r m6881b3 = c3343r2.m6881b("Linear");
                        if (m6881b3 != null) {
                            c2666m = C2666m.m9199a(m6881b3, c2666m, this.f8293a, this.f8192b);
                        } else {
                            C3343r m6879c4 = c3343r2.m6879c("CompanionAds");
                            if (m6879c4 != null) {
                                C3343r m6879c5 = m6879c4.m6879c("Companion");
                                if (m6879c5 != null) {
                                    c2656d = C2656d.m9249a(m6879c5, c2656d, this.f8293a, this.f8192b);
                                }
                            } else if (C3349v.m6862a()) {
                                m7700d("Received and will skip rendering for an unidentified creative: " + c3343r2);
                            }
                        }
                    }
                }
            } else if (C3349v.m6862a()) {
                m7700d("Did not find wrapper or inline response for node: " + c3343r);
            }
        }
        C2649a m9284a = new C2649a.C2651a().m9276a(this.f8192b).m9273a(this.f8293a.m9243c()).m9269b(this.f8293a.m9242d()).m9277a(this.f8293a.m9241e()).m9283a(this.f8293a.m9240f()).m9275a(str).m9271b(str2).m9279a(c2662i).m9278a(c2666m).m9280a(c2656d).m9281a(c2655c).m9274a(hashSet).m9281a(c2655c).m9270b(hashSet2).m9284a();
        EnumC2658f m9218a = C2665l.m9218a(m9284a);
        if (m9218a != null) {
            C2665l.m9215a(this.f8293a, this.f8294c, m9218a, -6, this.f8192b);
            return;
        }
        if (C3349v.m6862a()) {
            m7705a("Finished rendering VAST ad: " + m9284a);
        }
        m9284a.mo7884o().m8062b();
        C3142e c3142e = new C3142e(m9284a, this.f8192b, this.f8294c);
        C3163o.EnumC3165a enumC3165a = C3163o.EnumC3165a.CACHING_OTHER;
        if (((Boolean) this.f8192b.m7456a(C3109b.f7883bi)).booleanValue()) {
            if (m9284a.getType() == AppLovinAdType.REGULAR) {
                enumC3165a = C3163o.EnumC3165a.CACHING_INTERSTITIAL;
            } else if (m9284a.getType() == AppLovinAdType.INCENTIVIZED) {
                enumC3165a = C3163o.EnumC3165a.CACHING_INCENTIVIZED;
            }
        }
        this.f8192b.m7469S().m7620a(c3142e, enumC3165a);
    }
}
