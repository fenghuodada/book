package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.provider.C0761g;
import androidx.lifecycle.AbstractC1464h;
import com.adcolony.sdk.C2362x3;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxInterstitialAd implements MaxFullscreenAdImpl.InterfaceC2843a {

    /* renamed from: a */
    private static WeakReference<Activity> f8879a = new WeakReference<>(null);

    /* renamed from: b */
    private final MaxFullscreenAdImpl f8880b;

    public MaxInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        AbstractC2854a.logApiCall("MaxInterstitialAd", "MaxInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        f8879a = new WeakReference<>(activity);
        this.f8880b = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.INTERSTITIAL, this, "MaxInterstitialAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f8880b.logApiCall("destroy()");
        this.f8880b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC2843a
    public Activity getActivity() {
        this.f8880b.logApiCall("getActivity()");
        return f8879a.get();
    }

    public String getAdUnitId() {
        return this.f8880b.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f8880b.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f8880b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f8880b.logApiCall("loadAd()");
        this.f8880b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8880b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8880b.logApiCall(C0761g.m11824a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f8880b.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdListener maxAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxAdListener + ")");
        this.f8880b.setListener(maxAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8880b.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8880b.setRevenueListener(maxAdRevenueListener);
    }

    public void showAd() {
        showAd(null);
    }

    public void showAd(ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        showAd(null, viewGroup, abstractC1464h);
    }

    public void showAd(String str) {
        showAd(str, (String) null);
    }

    public void showAd(String str, ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        showAd(str, null, viewGroup, abstractC1464h);
    }

    public void showAd(String str, String str2) {
        this.f8880b.logApiCall(C0761g.m11824a("showAd(placement=", str, ", customData=", str2, ")"));
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxInterstitialAd");
        this.f8880b.showAd(str, str2, getActivity());
    }

    public String toString() {
        return "" + this.f8880b;
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8880b;
        StringBuilder m9460b = C2362x3.m9460b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        m9460b.append(viewGroup);
        m9460b.append(", lifecycle=");
        m9460b.append(abstractC1464h);
        m9460b.append(")");
        maxFullscreenAdImpl.logApiCall(m9460b.toString());
        this.f8880b.showAd(str, str2, viewGroup, abstractC1464h, getActivity());
    }
}
