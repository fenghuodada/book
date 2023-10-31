package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.e.s */
/* loaded from: classes.dex */
public class C3178s extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final JSONObject f8289a;

    /* renamed from: c */
    private final JSONObject f8290c;

    /* renamed from: d */
    private final AppLovinAdLoadListener f8291d;

    /* renamed from: e */
    private final EnumC3076b f8292e;

    public C3178s(JSONObject jSONObject, JSONObject jSONObject2, EnumC3076b enumC3076b, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskRenderAppLovinAd", c3214m);
        this.f8289a = jSONObject;
        this.f8290c = jSONObject2;
        this.f8292e = enumC3076b;
        this.f8291d = appLovinAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C3349v.m6862a()) {
            m7705a("Rendering ad...");
        }
        C3075a c3075a = new C3075a(this.f8289a, this.f8290c, this.f8292e, this.f8192b);
        boolean booleanValue = JsonUtils.getBoolean(this.f8289a, "gs_load_immediately", Boolean.FALSE).booleanValue();
        boolean booleanValue2 = JsonUtils.getBoolean(this.f8289a, "vs_load_immediately", Boolean.TRUE).booleanValue();
        C3141d c3141d = new C3141d(c3075a, this.f8192b, this.f8291d);
        c3141d.m7660a(booleanValue2);
        c3141d.m7659b(booleanValue);
        C3163o.EnumC3165a enumC3165a = C3163o.EnumC3165a.CACHING_OTHER;
        if (((Boolean) this.f8192b.m7456a(C3109b.f7883bi)).booleanValue()) {
            AppLovinAdSize size = c3075a.getSize();
            AppLovinAdSize appLovinAdSize = AppLovinAdSize.INTERSTITIAL;
            if (size == appLovinAdSize && c3075a.getType() == AppLovinAdType.REGULAR) {
                enumC3165a = C3163o.EnumC3165a.CACHING_INTERSTITIAL;
            } else if (c3075a.getSize() == appLovinAdSize && c3075a.getType() == AppLovinAdType.INCENTIVIZED) {
                enumC3165a = C3163o.EnumC3165a.CACHING_INCENTIVIZED;
            }
        }
        this.f8192b.m7469S().m7620a(c3141d, enumC3165a);
    }
}
