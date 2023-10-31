package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.e.j */
/* loaded from: classes.dex */
public class C3154j extends C3155k {

    /* renamed from: c */
    private final List<String> f8230c;

    public C3154j(List<String> list, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super(C3079d.m7988a(m7632a(list)), appLovinAdLoadListener, "TaskFetchMultizoneAd", c3214m);
        this.f8230c = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    private static String m7632a(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("No zone identifiers specified");
        }
        return list.get(0);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: a */
    public Map<String, String> mo7366a() {
        HashMap hashMap = new HashMap(1);
        List<String> list = this.f8230c;
        hashMap.put(AdColonyAdapterUtils.KEY_ZONE_IDS, CollectionUtils.implode(list, list.size()));
        return hashMap;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3148h
    /* renamed from: h */
    public EnumC3076b mo7631h() {
        return EnumC3076b.APPLOVIN_MULTIZONE;
    }
}
