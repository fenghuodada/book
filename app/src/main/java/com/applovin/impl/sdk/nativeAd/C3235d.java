package com.applovin.impl.sdk.nativeAd;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.nativeAd.d */
/* loaded from: classes.dex */
public class C3235d extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final JSONObject f8470a;

    /* renamed from: c */
    private final AppLovinNativeAdLoadListener f8471c;

    public C3235d(JSONObject jSONObject, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener, C3214m c3214m) {
        super("TaskProcessNativeAdResponse", c3214m);
        this.f8470a = jSONObject;
        this.f8471c = appLovinNativeAdLoadListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8470a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (C3349v.m6862a()) {
                m7705a("Processing ad...");
            }
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) new C3236e(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()), this.f8470a, this.f8471c, this.f8192b));
            return;
        }
        if (C3349v.m6862a()) {
            m7702c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher("native_native", MaxAdFormat.NATIVE, this.f8470a, this.f8192b);
        this.f8471c.onNativeAdLoadFailed(204);
    }
}
