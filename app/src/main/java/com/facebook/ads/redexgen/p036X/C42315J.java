package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.5J */
/* loaded from: assets/audience_network.dex */
public final class C42315J implements InterstitialAd.InterstitialAdLoadConfigBuilder, InterstitialAd.InterstitialLoadAdConfig {
    public C42305I A00;
    @Nullable
    public String A01;
    public EnumSet<CacheFlag> A02;
    public boolean A03;

    public C42315J(C42305I c42305i) {
        this.A00 = c42305i;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = CacheFlag.ALL;
        }
        this.A00.A05(this.A02, this.A01, this.A03);
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final InterstitialAd.InterstitialLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withAdCompanionView(boolean z) {
        this.A03 = z;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withAdListener(InterstitialAdListener interstitialAdListener) {
        this.A00.A02(interstitialAdListener);
        if (interstitialAdListener instanceof InterstitialAdExtendedListener) {
            this.A00.A04((InterstitialAdExtendedListener) interstitialAdListener);
        }
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withBid(String str) {
        this.A01 = str;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withCacheFlags(EnumSet<CacheFlag> cacheFlags) {
        this.A02 = cacheFlags;
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A00.A03(rewardData);
        return this;
    }

    @Override // com.facebook.ads.InterstitialAd.InterstitialAdLoadConfigBuilder
    public final InterstitialAd.InterstitialAdLoadConfigBuilder withRewardedAdListener(RewardedAdListener rewardedAdListener) {
        this.A00.A04(rewardedAdListener);
        return this;
    }
}
