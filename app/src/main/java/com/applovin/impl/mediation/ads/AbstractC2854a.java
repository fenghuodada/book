package com.applovin.impl.mediation.ads;

import android.app.Activity;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3333k;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p060j$.util.DesugarCollections;

/* renamed from: com.applovin.impl.mediation.ads.a */
/* loaded from: classes.dex */
public abstract class AbstractC2854a {
    @Nullable

    /* renamed from: a */
    private static C3214m f6899a;
    protected final MaxAdFormat adFormat;
    protected MaxAdListener adListener;
    @Nullable
    protected MaxAdReviewListener adReviewListener;
    protected final String adUnitId;
    protected final C3349v logger;
    @Nullable
    protected MaxAdRevenueListener revenueListener;
    protected final C3214m sdk;
    protected final String tag;
    protected final Map<String, Object> localExtraParameters = DesugarCollections.synchronizedMap(new HashMap());
    protected final Map<String, Object> extraParameters = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: com.applovin.impl.mediation.ads.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2855a extends MaxAdListener, MaxAdRevenueListener {
    }

    public AbstractC2854a(String str, MaxAdFormat maxAdFormat, String str2, C3214m c3214m) {
        this.adUnitId = str;
        this.adFormat = maxAdFormat;
        this.sdk = c3214m;
        this.tag = str2;
        this.logger = c3214m.m7487A();
    }

    public static void logApiCall(String str, String str2) {
        if (f6899a != null) {
            if (C3349v.m6862a()) {
                f6899a.m7487A().m6855b(str, str2);
                return;
            }
            return;
        }
        for (AppLovinSdk appLovinSdk : AppLovinSdk.m6793a()) {
            C3214m c3214m = appLovinSdk.coreSdk;
            if (!c3214m.m7409e()) {
                if (C3349v.m6862a()) {
                    c3214m.m7487A().m6855b(str, str2);
                }
                f6899a = c3214m;
            }
        }
    }

    /* renamed from: a */
    public void m8608a(AbstractC2823a abstractC2823a) {
        if (C3349v.m6862a()) {
            C3333k c3333k = new C3333k();
            c3333k.m6939a().m6933a("MAX Ad").m6936a(abstractC2823a).m6939a();
            this.logger.m6855b(this.tag, c3333k.toString());
        }
    }

    public void destroy() {
        this.localExtraParameters.clear();
        this.adListener = null;
        this.revenueListener = null;
    }

    public String getAdUnitId() {
        return this.adUnitId;
    }

    public void logApiCall(String str) {
        if (C3349v.m6862a()) {
            this.logger.m6855b(this.tag, str);
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Setting Ad Review creative id listener: " + maxAdReviewListener);
        }
        this.adReviewListener = maxAdReviewListener;
    }

    public void setExtraParameter(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (this.adFormat.isAdViewAd() && "ad_refresh_seconds".equals(str) && StringUtils.isValidString(str2)) {
            int parseInt = Integer.parseInt(str2);
            if (parseInt > TimeUnit.MINUTES.toSeconds(2L) && C3349v.m6862a()) {
                String str3 = this.tag;
                C3349v.m6846i(str3, "Attempting to set extra parameter \"ad_refresh_seconds\" to over 2 minutes (" + parseInt + "s) - this will be ignored");
            }
        }
        this.extraParameters.put(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Setting listener: " + maxAdListener);
        }
        this.adListener = maxAdListener;
    }

    public void setLocalExtraParameter(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        if (obj instanceof Activity) {
            if (C3349v.m6862a()) {
                this.logger.m6850e(this.tag, "Ignoring setting local extra parameter to Activity instance - please pass a WeakReference of it instead!");
                return;
            }
            return;
        }
        if ("amazon_ad_response".equals(str) || "amazon_ad_error".equals(str)) {
            setExtraParameter("is_amazon_integration", Boolean.toString(true));
        }
        this.localExtraParameters.put(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Setting revenue listener: " + maxAdRevenueListener);
        }
        this.revenueListener = maxAdRevenueListener;
    }
}
