package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.ads.AdError;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class FacebookRtbInterstitialAd implements MediationInterstitialAd, InterstitialAdExtendedListener {
    private MediationInterstitialAdConfiguration adConfiguration;
    private MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> callback;
    private InterstitialAd interstitialAd;
    private MediationInterstitialAdCallback mInterstitalAdCallback;
    private AtomicBoolean showAdCalled = new AtomicBoolean();
    private AtomicBoolean didInterstitialAdClose = new AtomicBoolean();

    public FacebookRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationInterstitialAdConfiguration;
        this.callback = mediationAdLoadCallback;
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(InterfaceC3877Ad interfaceC3877Ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mInterstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdClicked();
            this.mInterstitalAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad) {
        this.mInterstitalAdCallback = this.callback.onSuccess(this);
    }

    @Override // com.facebook.ads.AdListener
    public void onError(InterfaceC3877Ad interfaceC3877Ad, AdError adError) {
        com.google.android.gms.ads.AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
        if (!this.showAdCalled.get()) {
            this.callback.onFailure(adError2);
            return;
        }
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mInterstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
            this.mInterstitalAdCallback.onAdClosed();
        }
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public void onInterstitialActivityDestroyed() {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.didInterstitialAdClose.getAndSet(true) || (mediationInterstitialAdCallback = this.mInterstitalAdCallback) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDismissed(InterfaceC3877Ad interfaceC3877Ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback;
        if (this.didInterstitialAdClose.getAndSet(true) || (mediationInterstitialAdCallback = this.mInterstitalAdCallback) == null) {
            return;
        }
        mediationInterstitialAdCallback.onAdClosed();
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public void onInterstitialDisplayed(InterfaceC3877Ad interfaceC3877Ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mInterstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdOpened();
        }
    }

    @Override // com.facebook.ads.AdListener
    public void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad) {
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mInterstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.reportAdImpression();
        }
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdCompleted() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerFailed() {
    }

    @Override // com.facebook.ads.RewardedAdListener
    public void onRewardedAdServerSucceeded() {
    }

    public void render() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(101, "Failed to request ad. PlacementID is null or empty. ", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        this.interstitialAd = new InterstitialAd(this.adConfiguration.getContext(), placementID);
        if (!TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
            this.interstitialAd.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
        }
        InterstitialAd interstitialAd = this.interstitialAd;
        interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withBid(this.adConfiguration.getBidResponse()).withAdListener(this).build());
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.showAdCalled.set(true);
        if (this.interstitialAd.show()) {
            return;
        }
        com.google.android.gms.ads.AdError adError = new com.google.android.gms.ads.AdError(110, "Failed to present interstitial ad.", "com.google.ads.mediation.facebook");
        Log.w(FacebookMediationAdapter.TAG, adError.toString());
        MediationInterstitialAdCallback mediationInterstitialAdCallback = this.mInterstitalAdCallback;
        if (mediationInterstitialAdCallback != null) {
            mediationInterstitialAdCallback.onAdFailedToShow(adError);
        }
    }
}
