package com.applovin.mediation.nativeAds;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.provider.C0761g;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class MaxNativeAdLoader {

    /* renamed from: a */
    private final MaxNativeAdLoaderImpl f8900a;

    public MaxNativeAdLoader(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxNativeAdLoader(String str, AppLovinSdk appLovinSdk, Context context) {
        AbstractC2854a.logApiCall("MaxNativeAdLoader", "MaxNativeAdLoader(adUnitId=" + str + ", sdk=" + appLovinSdk + ")");
        if (str == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        }
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f8900a = new MaxNativeAdLoaderImpl(str, appLovinSdk.coreSdk);
    }

    public void destroy() {
        this.f8900a.logApiCall("destroy()");
        this.f8900a.destroy();
    }

    public void destroy(MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("destroy(nativeAd=" + maxAd + ")");
        this.f8900a.destroy(maxAd);
    }

    public String getAdUnitId() {
        return this.f8900a.getAdUnitId();
    }

    public String getPlacement() {
        this.f8900a.logApiCall("getPlacement()");
        return this.f8900a.getPlacement();
    }

    public void loadAd() {
        loadAd(null);
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("loadAd(adView=" + maxNativeAdView + ")");
        this.f8900a.loadAd(maxNativeAdView);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("render(adView=" + maxNativeAdView + ", ad=" + maxAd + ")");
        return this.f8900a.render(maxNativeAdView, maxAd);
    }

    public void setCustomData(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f8900a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8900a.logApiCall(C0761g.m11824a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f8900a.setExtraParameter(str, str2);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8900a.setLocalExtraParameter(str, obj);
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("setNativeAdListener(listener=" + maxNativeAdListener + ")");
        this.f8900a.setNativeAdListener(maxNativeAdListener);
    }

    public void setPlacement(String str) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f8900a.setPlacement(str);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = this.f8900a;
        maxNativeAdLoaderImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8900a.setRevenueListener(maxAdRevenueListener);
    }
}
