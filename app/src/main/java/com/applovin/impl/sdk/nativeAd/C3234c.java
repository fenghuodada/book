package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p033e.AbstractC3148h;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.C3295h;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.c */
/* loaded from: classes.dex */
public class C3234c extends AbstractC3148h {

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f8469c;

    public C3234c(C3079d c3079d, String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C3214m c3214m) {
        super(c3079d, str, c3214m);
        this.f8469c = appLovinNativeAdLoadListener;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public AbstractRunnableC3131a mo7364a(JSONObject jSONObject) {
        return new C3235d(jSONObject, this.f8469c, this.f8192b);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public void mo7365a(int i) {
        super.mo7365a(i);
        this.f8469c.onNativeAdLoadFailed(i);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: b */
    public String mo7363b() {
        return C3295h.m6996i(this.f8192b);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: c */
    public String mo7362c() {
        return C3295h.m6995j(this.f8192b);
    }
}
