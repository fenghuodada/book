package com.applovin.mediation.nativeAds;

import androidx.annotation.Nullable;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public abstract class MaxNativeAdListener {
    public void onNativeAdClicked(MaxAd maxAd) {
    }

    public void onNativeAdLoadFailed(String str, MaxError maxError) {
    }

    public void onNativeAdLoaded(@Nullable MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
    }
}
