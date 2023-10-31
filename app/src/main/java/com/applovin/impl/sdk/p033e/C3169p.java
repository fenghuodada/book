package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.google.android.gms.ads.AdError;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.p */
/* loaded from: classes.dex */
public class C3169p extends AbstractRunnableC3131a implements AppLovinAdLoadListener {

    /* renamed from: a */
    private final JSONObject f8275a;

    /* renamed from: c */
    private final C3079d f8276c;

    /* renamed from: d */
    private final EnumC3076b f8277d;

    /* renamed from: e */
    private final AppLovinAdLoadListener f8278e;

    public C3169p(JSONObject jSONObject, C3079d c3079d, EnumC3076b enumC3076b, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskProcessAdResponse", c3214m);
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c3079d == null) {
            throw new IllegalArgumentException("No zone specified");
        }
        this.f8275a = jSONObject;
        this.f8276c = c3079d;
        this.f8277d = enumC3076b;
        this.f8278e = appLovinAdLoadListener;
    }

    /* renamed from: a */
    private void m7605a(JSONObject jSONObject) {
        AbstractRunnableC3131a c3170q;
        String string = JsonUtils.getString(jSONObject, "type", AdError.UNDEFINED_DOMAIN);
        if ("applovin".equalsIgnoreCase(string)) {
            if (C3349v.m6862a()) {
                m7705a("Starting task for AppLovin ad...");
            }
            c3170q = new C3178s(jSONObject, this.f8275a, this.f8277d, this, this.f8192b);
        } else if ("vast".equalsIgnoreCase(string)) {
            if (C3349v.m6862a()) {
                m7705a("Starting task for VAST ad...");
            }
            this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) AbstractC3173r.m7592a(jSONObject, this.f8275a, this.f8277d, this, this.f8192b));
            return;
        } else if (!"js_tag".equalsIgnoreCase(string)) {
            if (C3349v.m6862a()) {
                m7702c("Unable to process ad of unknown type: " + string);
            }
            failedToReceiveAd(AppLovinErrorCodes.INVALID_RESPONSE);
            return;
        } else {
            if (C3349v.m6862a()) {
                m7705a("Starting task for JS tag ad...");
            }
            c3170q = new C3170q(jSONObject, this.f8275a, this.f8277d, this, this.f8192b);
        }
        this.f8192b.m7469S().m7621a(c3170q);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8278e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(appLovinAd);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8278e;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        JSONArray jSONArray = JsonUtils.getJSONArray(this.f8275a, "ads", new JSONArray());
        if (jSONArray.length() > 0) {
            if (C3349v.m6862a()) {
                m7705a("Processing ad...");
            }
            m7605a(JsonUtils.getJSONObject(jSONArray, 0, new JSONObject()));
            return;
        }
        if (C3349v.m6862a()) {
            m7702c("No ads were returned from the server");
        }
        Utils.maybeHandleNoFillResponseForPublisher(this.f8276c.m7991a(), this.f8276c.m7986b(), this.f8275a, this.f8192b);
        failedToReceiveAd(204);
    }
}
