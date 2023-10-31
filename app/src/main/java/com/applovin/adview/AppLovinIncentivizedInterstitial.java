package com.applovin.adview;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p030b.C3091a;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinIncentivizedInterstitial {

    /* renamed from: a */
    private final C3091a f6232a;

    public AppLovinIncentivizedInterstitial(Context context) {
        this(AppLovinSdk.getInstance(context));
    }

    public AppLovinIncentivizedInterstitial(AppLovinSdk appLovinSdk) {
        this(null, appLovinSdk);
    }

    public AppLovinIncentivizedInterstitial(String str, AppLovinSdk appLovinSdk) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f6232a = createIncentivizedAdController(str, appLovinSdk);
    }

    public static AppLovinIncentivizedInterstitial create(Context context) {
        return create(AppLovinSdk.getInstance(context));
    }

    public static AppLovinIncentivizedInterstitial create(AppLovinSdk appLovinSdk) {
        return create(null, appLovinSdk);
    }

    public static AppLovinIncentivizedInterstitial create(String str, AppLovinSdk appLovinSdk) {
        return new AppLovinIncentivizedInterstitial(str, appLovinSdk);
    }

    public C3091a createIncentivizedAdController(String str, AppLovinSdk appLovinSdk) {
        return new C3091a(str, appLovinSdk);
    }

    public String getZoneId() {
        return this.f6232a.m7846b();
    }

    public boolean isAdReadyToDisplay() {
        return this.f6232a.m7861a();
    }

    public void preload(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (appLovinAdLoadListener == null && C3349v.m6862a()) {
            C3349v.m6848g("AppLovinIncentivizedInterstitial", "AppLovinAdLoadListener was null when preloading incentivized interstitials; using a listener is highly recommended.");
        }
        this.f6232a.m7848a(appLovinAdLoadListener);
    }

    public void show(Context context) {
        show(context, null, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        show(context, appLovinAdRewardListener, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        show(context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, null);
    }

    public void show(Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        show(null, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        this.f6232a.m7851a(appLovinAd, context, null, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void show(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        this.f6232a.m7850a(appLovinAd, viewGroup, abstractC1464h, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public String toString() {
        return "AppLovinIncentivizedInterstitial{zoneId='" + getZoneId() + "', isAdReadyToDisplay=" + isAdReadyToDisplay() + '}';
    }
}
