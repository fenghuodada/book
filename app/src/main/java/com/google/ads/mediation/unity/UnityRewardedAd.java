package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.eventadapters.UnityRewardedEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;

/* loaded from: classes.dex */
public class UnityRewardedAd implements MediationRewardedAd {
    private UnityRewardedEventAdapter eventAdapter;
    private final IUnityAdsLoadListener mUnityLoadListener = new IUnityAdsLoadListener() { // from class: com.google.ads.mediation.unity.UnityRewardedAd.1
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads rewarded ad successfully loaded placement ID: %s", str));
            UnityRewardedAd.this.placementId = str;
            UnityRewardedAd.this.sendRewardedLoadSuccess();
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityRewardedAd.this.placementId = str;
            UnityRewardedAd.this.sendRewardedLoadFailure(UnityAdsAdapterUtils.createSDKError(unityAdsLoadError, str2));
        }
    };
    private final IUnityAdsShowListener mUnityShowListener = new IUnityAdsShowListener() { // from class: com.google.ads.mediation.unity.UnityRewardedAd.3
        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            if (unityAdsShowCompletionState == UnityAds.UnityAdsShowCompletionState.COMPLETED) {
                UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE);
                UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.REWARD);
            }
            UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            if (UnityRewardedAd.this.mediationRewardedAdCallback != null) {
                UnityRewardedAd.this.mediationRewardedAdCallback.onAdFailedToShow(UnityAdsAdapterUtils.createSDKError(unityAdsShowError, str2));
            }
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
            UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.IMPRESSION);
            UnityRewardedAd.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.VIDEO_START);
        }
    };
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback;
    private MediationRewardedAdCallback mediationRewardedAdCallback;
    private String placementId;

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRewardedLoadFailure(AdError adError) {
        Log.w(UnityMediationAdapter.TAG, adError.toString());
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendRewardedLoadSuccess() {
        MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback = this.mediationAdLoadCallback;
        if (mediationAdLoadCallback != null) {
            MediationRewardedAdCallback onSuccess = mediationAdLoadCallback.onSuccess(this);
            this.mediationRewardedAdCallback = onSuccess;
            this.eventAdapter = new UnityRewardedEventAdapter(onSuccess);
        }
    }

    public void load(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        Context context = mediationRewardedAdConfiguration.getContext();
        if (!(context instanceof Activity)) {
            sendRewardedLoadFailure(UnityAdsAdapterUtils.createAdError(105, "Unity Ads requires an Activity context to load ads."));
            return;
        }
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        final String string = serverParameters.getString("gameId");
        final String string2 = serverParameters.getString("zoneId");
        if (!UnityAdapter.areValidIds(string, string2)) {
            sendRewardedLoadFailure(UnityAdsAdapterUtils.createAdError(101, "Missing or invalid server parameters."));
            return;
        }
        UnityInitializer.getInstance().initializeUnityAds(context, string, new IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityRewardedAd.2
            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationComplete() {
                Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load rewarded ad with placement ID: %s", string, string2));
            }

            @Override // com.unity3d.ads.IUnityAdsInitializationListener
            public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                UnityRewardedAd.this.sendRewardedLoadFailure(UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", string, str)));
            }
        });
        UnityAds.load(string2, this.mUnityLoadListener);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (this.placementId == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAds.show(activity, this.placementId, this.mUnityShowListener);
            return;
        }
        AdError createAdError = UnityAdsAdapterUtils.createAdError(105, "Unity Ads requires an Activity context to show ads.");
        Log.e(UnityMediationAdapter.TAG, createAdError.toString());
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mediationRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdFailedToShow(createAdError);
        }
    }
}
