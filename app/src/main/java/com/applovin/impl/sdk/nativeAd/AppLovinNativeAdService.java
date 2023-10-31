package com.applovin.impl.sdk.nativeAd;

import android.text.TextUtils;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.C3077c;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdService {
    private static final String TAG = "AppLovinNativeAdService";
    private final C3349v logger;
    private final C3214m sdk;

    public AppLovinNativeAdService(C3214m c3214m) {
        this.sdk = c3214m;
        this.logger = c3214m.m7487A();
    }

    public void loadNextAdForAdToken(String str, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        StringBuilder sb;
        String trim = str != null ? str.trim() : null;
        if (TextUtils.isEmpty(trim)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i(TAG, "Invalid ad token specified");
            }
            C3298j.m6985a(appLovinNativeAdLoadListener, -8);
            return;
        }
        C3077c c3077c = new C3077c(trim, this.sdk);
        if (c3077c.m7994b() == C3077c.EnumC3078a.REGULAR) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.logger;
                c3349v.m6855b(TAG, "Loading next ad for token: " + c3077c);
            }
            this.sdk.m7469S().m7620a(new C3233b(c3077c, appLovinNativeAdLoadListener, this.sdk), C3163o.EnumC3165a.MAIN);
        } else if (c3077c.m7994b() != C3077c.EnumC3078a.AD_RESPONSE_JSON) {
            if (C3349v.m6862a()) {
                sb = new StringBuilder("Invalid ad token specified: ");
                sb.append(c3077c);
                C3349v.m6846i(TAG, sb.toString());
            }
            C3298j.m6985a(appLovinNativeAdLoadListener, -8);
        } else {
            JSONObject m7992d = c3077c.m7992d();
            if (m7992d == null) {
                if (C3349v.m6862a()) {
                    sb = new StringBuilder("Unable to retrieve ad response JSON from token: ");
                    sb.append(c3077c);
                    C3349v.m6846i(TAG, sb.toString());
                }
                C3298j.m6985a(appLovinNativeAdLoadListener, -8);
            }
            C3295h.m6999f(m7992d, this.sdk);
            C3295h.m7003d(m7992d, this.sdk);
            C3295h.m7004c(m7992d, this.sdk);
            C3295h.m7001e(m7992d, this.sdk);
            if (JsonUtils.getJSONArray(m7992d, "ads", new JSONArray()).length() > 0) {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.logger;
                    c3349v2.m6855b(TAG, "Rendering ad for token: " + c3077c);
                }
                this.sdk.m7469S().m7620a(new C3235d(m7992d, appLovinNativeAdLoadListener, this.sdk), C3163o.EnumC3165a.MAIN);
                return;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v3 = this.logger;
                c3349v3.m6850e(TAG, "No ad returned from the server for token: " + c3077c);
            }
            C3298j.m6985a(appLovinNativeAdLoadListener, 204);
        }
    }
}
