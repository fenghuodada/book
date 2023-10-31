package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.sdk.AppLovinAdLoadListener;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.k */
/* loaded from: classes.dex */
public class C3155k extends AbstractC3148h {

    /* renamed from: c */
    private final AppLovinAdLoadListener f8231c;

    public C3155k(C3079d c3079d, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        this(c3079d, appLovinAdLoadListener, "TaskFetchNextAd", c3214m);
    }

    public C3155k(C3079d c3079d, AppLovinAdLoadListener appLovinAdLoadListener, String str, C3214m c3214m) {
        super(c3079d, str, c3214m);
        this.f8231c = appLovinAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public AbstractRunnableC3131a mo7364a(JSONObject jSONObject) {
        return new C3169p(jSONObject, ((AbstractC3148h) this).f8222a, mo7631h(), this.f8231c, this.f8192b);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public void mo7365a(int i) {
        super.mo7365a(i);
        this.f8231c.failedToReceiveAd(i);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: b */
    public String mo7363b() {
        return C3295h.m6998g(this.f8192b);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: c */
    public String mo7362c() {
        return C3295h.m6997h(this.f8192b);
    }
}
