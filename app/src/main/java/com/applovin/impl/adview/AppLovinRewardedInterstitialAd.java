package com.applovin.impl.adview;

import android.content.Context;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;

/* loaded from: classes.dex */
public class AppLovinRewardedInterstitialAd {

    /* renamed from: a */
    private final AppLovinIncentivizedInterstitial f6351a;

    /* renamed from: b */
    private AppLovinAdDisplayListener f6352b;

    /* renamed from: c */
    private AppLovinAdClickListener f6353c;

    /* renamed from: d */
    private AppLovinAdVideoPlaybackListener f6354d;

    public AppLovinRewardedInterstitialAd(AppLovinSdk appLovinSdk) {
        this.f6351a = new AppLovinIncentivizedInterstitial(appLovinSdk);
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6353c = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6352b = appLovinAdDisplayListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6354d = appLovinAdVideoPlaybackListener;
    }

    public void show(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f6351a.show(appLovinAd, context, appLovinAdRewardListener, this.f6354d, this.f6352b, this.f6353c);
    }

    public String toString() {
        return "AppLovinRewardedInterstitialAd{}";
    }
}
