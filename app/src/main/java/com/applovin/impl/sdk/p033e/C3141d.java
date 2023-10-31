package com.applovin.impl.sdk.p033e;

import android.net.Uri;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.sdk.AppLovinAdLoadListener;

/* renamed from: com.applovin.impl.sdk.e.d */
/* loaded from: classes.dex */
public class C3141d extends AbstractC3138c {

    /* renamed from: c */
    private final C3075a f8211c;

    /* renamed from: d */
    private boolean f8212d;

    /* renamed from: e */
    private boolean f8213e;

    public C3141d(C3075a c3075a, C3214m c3214m, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", c3075a, c3214m, appLovinAdLoadListener);
        this.f8211c = c3075a;
    }

    /* renamed from: j */
    private void m7658j() {
        if (C3349v.m6862a()) {
            m7705a("Caching HTML resources...");
        }
        this.f8211c.m8008a(m7675a(this.f8211c.m8006b(), this.f8211c.m7967H(), this.f8211c));
        this.f8211c.m7942a(true);
        if (C3349v.m6862a()) {
            m7705a("Finish caching non-video resources for ad #" + this.f8211c.getAdIdNumber());
            C3349v m7487A = this.f8192b.m7487A();
            String m7699e = m7699e();
            m7487A.m6858a(m7699e, "Ad updated with cachedHTML = " + this.f8211c.m8006b());
        }
    }

    /* renamed from: k */
    private void m7657k() {
        Uri m7666e;
        if (m7673b() || (m7666e = m7666e(this.f8211c.m8002i())) == null) {
            return;
        }
        if (this.f8211c.m7931aK()) {
            this.f8211c.m8008a(this.f8211c.m8006b().replaceFirst(this.f8211c.m8004e(), m7666e.toString()));
            if (C3349v.m6862a()) {
                m7705a("Replaced video URL with cached video URI in HTML for web video ad");
            }
        }
        this.f8211c.m8003g();
        this.f8211c.m8009a(m7666e);
    }

    /* renamed from: a */
    public void m7660a(boolean z) {
        this.f8212d = z;
    }

    /* renamed from: b */
    public void m7659b(boolean z) {
        this.f8213e = z;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3138c, java.lang.Runnable
    public void run() {
        super.run();
        boolean mo7890f = this.f8211c.mo7890f();
        boolean z = this.f8213e;
        if (mo7890f || z) {
            if (C3349v.m6862a()) {
                m7705a("Begin caching for streaming ad #" + this.f8211c.getAdIdNumber() + "...");
            }
            m7669c();
            if (mo7890f) {
                if (this.f8212d) {
                    mo7655i();
                }
                m7658j();
                if (!this.f8212d) {
                    mo7655i();
                }
                m7657k();
            } else {
                mo7655i();
                m7658j();
            }
        } else {
            if (C3349v.m6862a()) {
                m7705a("Begin processing for non-streaming ad #" + this.f8211c.getAdIdNumber() + "...");
            }
            m7669c();
            m7658j();
            m7657k();
            mo7655i();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f8211c.getCreatedAtMillis();
        C3123d.m7748a(this.f8211c, this.f8192b);
        C3123d.m7749a(currentTimeMillis, this.f8211c, this.f8192b);
        m7680a(this.f8211c);
        m7682a();
    }
}
