package com.applovin.mediation.ads;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.provider.C0761g;
import androidx.lifecycle.AbstractC1464h;
import com.adcolony.sdk.C2362x3;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.ads.MaxFullscreenAdImpl;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class MaxRewardedInterstitialAd implements MaxFullscreenAdImpl.InterfaceC2843a {

    /* renamed from: a */
    private static WeakReference<Activity> f8885a = new WeakReference<>(null);

    /* renamed from: b */
    private final MaxFullscreenAdImpl f8886b;

    public MaxRewardedInterstitialAd(String str, Activity activity) {
        this(str, AppLovinSdk.getInstance(activity), activity);
    }

    public MaxRewardedInterstitialAd(String str, AppLovinSdk appLovinSdk, Activity activity) {
        AbstractC2854a.logApiCall("MaxRewardedInterstitialAd", "MaxRewardedInterstitialAd(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
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
        f8885a = new WeakReference<>(activity);
        this.f8886b = new MaxFullscreenAdImpl(str, MaxAdFormat.REWARDED_INTERSTITIAL, this, "MaxRewardedInterstitialAd", appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f8886b.logApiCall("destroy()");
        this.f8886b.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC2843a
    public Activity getActivity() {
        this.f8886b.logApiCall("getActivity()");
        return f8885a.get();
    }

    public boolean isReady() {
        boolean isReady = this.f8886b.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f8886b.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f8886b.logApiCall("loadAd()");
        this.f8886b.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8886b.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8886b.logApiCall(C0761g.m11824a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f8886b.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f8886b.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8886b.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8886b.setRevenueListener(maxAdRevenueListener);
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
        this.f8886b.logApiCall(C0761g.m11824a("showAd(placement=", str, ", customData=", str2, ")"));
        this.f8886b.showAd(str, str2, getActivity());
    }

    public String toString() {
        return "" + this.f8886b;
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8886b;
        StringBuilder m9460b = C2362x3.m9460b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        m9460b.append(viewGroup);
        m9460b.append(", lifecycle=");
        m9460b.append(abstractC1464h);
        m9460b.append(")");
        maxFullscreenAdImpl.logApiCall(m9460b.toString());
        this.f8886b.showAd(str, str2, viewGroup, abstractC1464h, getActivity());
    }
}
