package com.applovin.impl.mediation.p015d;

import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* renamed from: com.applovin.impl.mediation.d.a */
/* loaded from: classes.dex */
public class C2893a implements AbstractC2854a.InterfaceC2855a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private final AbstractC2854a.InterfaceC2855a f7020a;

    public C2893a(AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        this.f7020a = interfaceC2855a;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        C3298j.m6949d(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        C3298j.m6941h(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        C3298j.m6983a(this.f7020a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        C3298j.m6958b(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        C3298j.m6943g(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        C3298j.m6952c(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        C3298j.m6978a(this.f7020a, str, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        C3298j.m6984a((MaxAdListener) this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        C3298j.m6976a((MaxAdRevenueListener) this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        C3298j.m6945f(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        C3298j.m6947e(this.f7020a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        C3298j.m6981a(this.f7020a, maxAd, maxReward);
    }
}
