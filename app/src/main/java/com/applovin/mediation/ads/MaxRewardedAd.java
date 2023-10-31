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
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.sdk.AppLovinSdk;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class MaxRewardedAd implements MaxFullscreenAdImpl.InterfaceC2843a {

    /* renamed from: a */
    private static final Map<String, MaxRewardedAd> f8881a = new HashMap();

    /* renamed from: b */
    private static final Object f8882b = new Object();

    /* renamed from: c */
    private static WeakReference<Activity> f8883c = new WeakReference<>(null);

    /* renamed from: d */
    private final MaxFullscreenAdImpl f8884d;

    private MaxRewardedAd(String str, AppLovinSdk appLovinSdk) {
        this.f8884d = new MaxFullscreenAdImpl(str.trim(), MaxAdFormat.REWARDED, this, "MaxRewardedAd", appLovinSdk.coreSdk);
    }

    public static MaxRewardedAd getInstance(String str, Activity activity) {
        return getInstance(str, AppLovinSdk.getInstance(activity), activity);
    }

    public static MaxRewardedAd getInstance(String str, AppLovinSdk appLovinSdk, Activity activity) {
        AbstractC2854a.logApiCall("MaxRewardedAd", "getInstance(adUnitId=" + str + ", sdk=" + appLovinSdk + ", activity=" + activity + ")");
        if (str != null) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Empty ad unit ID specified");
            }
            if (activity != null) {
                if (appLovinSdk != null) {
                    updateActivity(activity);
                    synchronized (f8882b) {
                        Map<String, MaxRewardedAd> map = f8881a;
                        MaxRewardedAd maxRewardedAd = map.get(str);
                        if (maxRewardedAd != null) {
                            return maxRewardedAd;
                        }
                        MaxRewardedAd maxRewardedAd2 = new MaxRewardedAd(str, appLovinSdk);
                        map.put(str, maxRewardedAd2);
                        return maxRewardedAd2;
                    }
                }
                throw new IllegalArgumentException("No sdk specified");
            }
            throw new IllegalArgumentException("No activity specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public static void updateActivity(Activity activity) {
        AbstractC2854a.logApiCall("MaxRewardedAd", "updateActivity(activity=" + activity + ")");
        if (activity != null) {
            f8883c = new WeakReference<>(activity);
        }
    }

    public void destroy() {
        this.f8884d.logApiCall("destroy()");
        synchronized (f8882b) {
            f8881a.remove(this.f8884d.getAdUnitId());
        }
        this.f8884d.destroy();
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.InterfaceC2843a
    public Activity getActivity() {
        this.f8884d.logApiCall("getActivity()");
        return f8883c.get();
    }

    public String getAdUnitId() {
        return this.f8884d.getAdUnitId();
    }

    public boolean isReady() {
        boolean isReady = this.f8884d.isReady();
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        maxFullscreenAdImpl.logApiCall("isReady() " + isReady + " for ad unit id " + this.f8884d.getAdUnitId());
        return isReady;
    }

    public void loadAd() {
        this.f8884d.logApiCall("loadAd()");
        this.f8884d.loadAd(getActivity());
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        maxFullscreenAdImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f8884d.setAdReviewListener(maxAdReviewListener);
    }

    public void setExtraParameter(String str, String str2) {
        this.f8884d.logApiCall(C0761g.m11824a("setExtraParameter(key=", str, ", value=", str2, ")"));
        this.f8884d.setExtraParameter(str, str2);
    }

    public void setListener(MaxRewardedAdListener maxRewardedAdListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        maxFullscreenAdImpl.logApiCall("setListener(listener=" + maxRewardedAdListener + ")");
        this.f8884d.setListener(maxRewardedAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        maxFullscreenAdImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f8884d.setLocalExtraParameter(str, obj);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        maxFullscreenAdImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f8884d.setRevenueListener(maxAdRevenueListener);
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
        this.f8884d.logApiCall(C0761g.m11824a("showAd(placement=", str, ", customData=", str2, ")"));
        Utils.maybeLogCustomDataSizeLimit(str2, "MaxRewardedAd");
        this.f8884d.showAd(str, str2, getActivity());
    }

    public String toString() {
        return "" + this.f8884d;
    }

    public void showAd(String str, String str2, ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        MaxFullscreenAdImpl maxFullscreenAdImpl = this.f8884d;
        StringBuilder m9460b = C2362x3.m9460b("showAd(placement=", str, ", customData=", str2, ", containerView=");
        m9460b.append(viewGroup);
        m9460b.append(", lifecycle=");
        m9460b.append(abstractC1464h);
        m9460b.append(")");
        maxFullscreenAdImpl.logApiCall(m9460b.toString());
        this.f8884d.showAd(str, str2, viewGroup, abstractC1464h, getActivity());
    }
}
