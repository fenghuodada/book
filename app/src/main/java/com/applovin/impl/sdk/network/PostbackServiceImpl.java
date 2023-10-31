package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p033e.C3145g;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a */
    private final C3214m f8494a;

    public PostbackServiceImpl(C3214m c3214m) {
        this.f8494a = c3214m;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(C3265i.m7194b(this.f8494a).mo7186a(str).mo7173c(false).mo7190a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(C3265i c3265i, C3163o.EnumC3165a enumC3165a, AppLovinPostbackListener appLovinPostbackListener) {
        this.f8494a.m7469S().m7620a(new C3145g(c3265i, enumC3165a, this.f8494a, appLovinPostbackListener), enumC3165a);
    }

    public void dispatchPostbackRequest(C3265i c3265i, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(c3265i, C3163o.EnumC3165a.POSTBACKS, appLovinPostbackListener);
    }

    public String toString() {
        return "PostbackService{}";
    }
}
