package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.C3077c;
import com.applovin.impl.sdk.p029ad.C3079d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.nativeAd.b */
/* loaded from: classes.dex */
public class C3233b extends C3234c {

    /* renamed from: c */
    private final C3077c f8468c;

    public C3233b(C3077c c3077c, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C3214m c3214m) {
        super(C3079d.m7988a("adtoken_zone"), "TaskFetchNativeTokenAd", appLovinNativeAdLoadListener, c3214m);
        this.f8468c = c3077c;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public Map<String, String> mo7366a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f8468c.m7996a());
        hashMap.put("adtoken_prefix", this.f8468c.m7993c());
        return hashMap;
    }
}
