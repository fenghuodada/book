package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.C3077c;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.l */
/* loaded from: classes.dex */
public class C3156l extends C3155k {

    /* renamed from: c */
    private final C3077c f8232c;

    public C3156l(C3077c c3077c, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super(C3079d.m7988a("adtoken_zone"), appLovinAdLoadListener, "TaskFetchTokenAd", c3214m);
        this.f8232c = c3077c;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public Map<String, String> mo7366a() {
        HashMap hashMap = new HashMap(2);
        hashMap.put("adtoken", this.f8232c.m7996a());
        hashMap.put("adtoken_prefix", this.f8232c.m7993c());
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: h */
    public EnumC3076b mo7631h() {
        return EnumC3076b.REGULAR_AD_TOKEN;
    }
}
