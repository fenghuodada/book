package com.facebook.ads.internal.api;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
@UiThread
/* loaded from: classes.dex */
public interface RewardedInterstitialAdApi extends FullScreenAd {
    @Override // com.facebook.ads.FullScreenAd
    /* bridge */ /* synthetic */ InterfaceC3877Ad.LoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    RewardedInterstitialAd.RewardedInterstitialAdLoadConfigBuilder buildLoadAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    /* bridge */ /* synthetic */ FullScreenAd.ShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.FullScreenAd
    RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder buildShowAdConfig();

    @Override // com.facebook.ads.InterfaceC3877Ad
    void destroy();

    @Override // com.facebook.ads.InterfaceC3877Ad
    String getPlacementId();

    int getVideoDuration();

    boolean isAdLoaded();

    @Override // com.facebook.ads.InterfaceC3877Ad
    void loadAd();

    void loadAd(RewardedInterstitialAd.RewardedInterstitialLoadAdConfig rewardedInterstitialLoadAdConfig);

    void registerAdCompanionView(AdCompanionView adCompanionView);

    @Override // com.facebook.ads.InterfaceC3877Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);

    @Override // com.facebook.ads.FullScreenAd
    boolean show();

    boolean show(RewardedInterstitialAd.RewardedInterstitialShowAdConfig rewardedInterstitialShowAdConfig);

    void unregisterAdCompanionView();
}
