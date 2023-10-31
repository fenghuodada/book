package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.RewardedInterstitialAd;

/* renamed from: com.facebook.ads.redexgen.X.5a */
/* loaded from: assets/audience_network.dex */
public final class C42485a implements RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, RewardedInterstitialAd.RewardedInterstitialShowAdConfig {
    public final C42515d A00;

    public C42485a(C42515d c42515d) {
        this.A00 = c42515d;
    }

    public final C42515d A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder, com.facebook.ads.FullScreenAd.ShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialShowAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder
    public final RewardedInterstitialAd.RewardedInterstitialAdShowConfigBuilder withAppOrientation(int i) {
        this.A00.withAppOrientation(i);
        return this;
    }
}
