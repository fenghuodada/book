package com.google.ads.mediation.facebook;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSettings;
import com.facebook.ads.BidderTokenProvider;
import com.google.ads.mediation.facebook.FacebookInitializer;
import com.google.ads.mediation.facebook.rtb.FacebookRtbBannerAd;
import com.google.ads.mediation.facebook.rtb.FacebookRtbInterstitialAd;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class FacebookMediationAdapter extends RtbAdapter {
    public static final int ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION = 111;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CREATE_NATIVE_AD_FROM_BID_PAYLOAD = 109;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.facebook";
    public static final int ERROR_FACEBOOK_INITIALIZATION = 104;
    public static final int ERROR_FAILED_TO_PRESENT_AD = 110;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_MAPPING_NATIVE_ASSETS = 108;
    public static final int ERROR_NULL_CONTEXT = 107;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_REQUIRES_UNIFIED_NATIVE_ADS = 105;
    public static final int ERROR_WRONG_NATIVE_TYPE = 106;
    public static final String FACEBOOK_SDK_ERROR_DOMAIN = "com.facebook.ads";
    public static final String PLACEMENT_PARAMETER = "pubid";
    public static final String RTB_PLACEMENT_PARAMETER = "placement_id";
    public static final String TAG = "FacebookAdapter";
    private FacebookRtbBannerAd banner;
    private FacebookRtbInterstitialAd interstitial;
    private FacebookRtbNativeAd nativeAd;
    private FacebookRewardedAd rewardedAd;
    private FacebookRewardedInterstitialAd rewardedInterstitialAd;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    @NonNull
    public static AdError getAdError(com.facebook.ads.AdError adError) {
        return new AdError(adError.getErrorCode(), adError.getErrorMessage(), "com.facebook.ads");
    }

    @Nullable
    public static String getPlacementID(@NonNull Bundle bundle) {
        String string = bundle.getString(RTB_PLACEMENT_PARAMETER);
        return string == null ? bundle.getString("pubid") : string;
    }

    public static void setMixedAudience(@NonNull MediationAdConfiguration mediationAdConfiguration) {
        if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 1) {
            AdSettings.setMixedAudience(true);
        } else if (mediationAdConfiguration.taggedForChildDirectedTreatment() == 0) {
            AdSettings.setMixedAudience(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(RtbSignalData rtbSignalData, SignalCallbacks signalCallbacks) {
        signalCallbacks.onSuccess(BidderTokenProvider.getBidderToken(rtbSignalData.getContext()));
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getSDKVersionInfo() {
        String[] split = "6.11.0".split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s.Returning 0.0.0 for SDK version.", "6.11.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public VersionInfo getVersionInfo() {
        String[] split = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s.Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(Context context, final InitializationCompleteCallback initializationCompleteCallback, List<MediationConfiguration> list) {
        if (context == null) {
            initializationCompleteCallback.onInitializationFailed("Initialization Failed. Context is null.");
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (MediationConfiguration mediationConfiguration : list) {
            String placementID = getPlacementID(mediationConfiguration.getServerParameters());
            if (!TextUtils.isEmpty(placementID)) {
                arrayList.add(placementID);
            }
        }
        if (arrayList.isEmpty()) {
            initializationCompleteCallback.onInitializationFailed("Initialization failed. No placement IDs found.");
        } else {
            FacebookInitializer.getInstance().initialize(context, arrayList, new FacebookInitializer.Listener() { // from class: com.google.ads.mediation.facebook.FacebookMediationAdapter.1
                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeError(AdError adError) {
                    initializationCompleteCallback.onInitializationFailed(adError.getMessage());
                }

                @Override // com.google.ads.mediation.facebook.FacebookInitializer.Listener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(MediationBannerAdConfiguration mediationBannerAdConfiguration, MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        FacebookRtbBannerAd facebookRtbBannerAd = new FacebookRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.banner = facebookRtbBannerAd;
        facebookRtbBannerAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        FacebookRtbInterstitialAd facebookRtbInterstitialAd = new FacebookRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.interstitial = facebookRtbInterstitialAd;
        facebookRtbInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        FacebookRtbNativeAd facebookRtbNativeAd = new FacebookRtbNativeAd(mediationNativeAdConfiguration, mediationAdLoadCallback);
        this.nativeAd = facebookRtbNativeAd;
        facebookRtbNativeAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        FacebookRewardedAd facebookRewardedAd = new FacebookRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedAd = facebookRewardedAd;
        facebookRewardedAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedInterstitialAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.w(TAG, "Facebook waterfall mediation is deprecated and will be removed in a future adapter version. Please update to serve bidding ads instead. See https://fb.me/bNFn7qt6Z0sKtF for more information.");
        FacebookRewardedInterstitialAd facebookRewardedInterstitialAd = new FacebookRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedInterstitialAd = facebookRewardedInterstitialAd;
        facebookRewardedInterstitialAd.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        FacebookRewardedInterstitialAd facebookRewardedInterstitialAd = new FacebookRewardedInterstitialAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.rewardedInterstitialAd = facebookRewardedInterstitialAd;
        facebookRewardedInterstitialAd.render();
    }
}
