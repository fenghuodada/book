package com.google.ads.mediation.unity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.eventadapters.UnityInterstitialEventAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import java.lang.ref.WeakReference;

@Keep
/* loaded from: classes.dex */
public class UnityAdapter extends UnityMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private WeakReference<Activity> activityWeakReference;
    private UnityBannerAd bannerAd;
    private UnityInterstitialEventAdapter eventAdapter;
    private final IUnityAdsLoadListener mUnityLoadListener = new IUnityAdsLoadListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.1
        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsAdLoaded(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad successfully loaded for placement ID: %s", str));
            UnityAdapter.this.placementId = str;
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LOADED);
        }

        @Override // com.unity3d.ads.IUnityAdsLoadListener
        public void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
            UnityAdapter.this.placementId = str;
            AdError createSDKError = UnityAdsAdapterUtils.createSDKError(unityAdsLoadError, str2);
            Log.w(UnityMediationAdapter.TAG, createSDKError.toString());
            if (UnityAdapter.this.mediationInterstitialListener != null) {
                UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, createSDKError);
            }
        }
    };
    private final IUnityAdsShowListener mUnityShowListener = new IUnityAdsShowListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.3
        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowClick(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad was clicked for placement ID: %s", UnityAdapter.this.placementId));
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLICKED);
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad finished playing for placement ID: %s", UnityAdapter.this.placementId));
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Log.w(UnityMediationAdapter.TAG, UnityAdsAdapterUtils.createSDKError(unityAdsShowError, str2).toString());
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public void onUnityAdsShowStart(String str) {
            Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads interstitial ad started for placement ID: %s", UnityAdapter.this.placementId));
            UnityAdapter.this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.OPENED);
        }
    };
    private MediationInterstitialListener mediationInterstitialListener;
    private String placementId;

    public static boolean areValidIds(String str, String str2) {
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) ? false : true;
    }

    private void sendAdFailedToLoad(int i, String str) {
        AdError createAdError = UnityAdsAdapterUtils.createAdError(i, str);
        Log.w(UnityMediationAdapter.TAG, createAdError.toString());
        MediationInterstitialListener mediationInterstitialListener = this.mediationInterstitialListener;
        if (mediationInterstitialListener != null) {
            mediationInterstitialListener.onAdFailedToLoad(this, createAdError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.bannerAd.getBannerView();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        this.mediationInterstitialListener = null;
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        UnityBannerAd unityBannerAd = this.bannerAd;
        if (unityBannerAd != null) {
            unityBannerAd.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        UnityBannerAd unityBannerAd = new UnityBannerAd();
        this.bannerAd = unityBannerAd;
        unityBannerAd.requestBannerAd(context, mediationBannerListener, bundle, adSize, mediationAdRequest, bundle2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        this.mediationInterstitialListener = mediationInterstitialListener;
        this.eventAdapter = new UnityInterstitialEventAdapter(mediationInterstitialListener, this);
        final String string = bundle.getString("gameId");
        String string2 = bundle.getString("zoneId");
        this.placementId = string2;
        if (!areValidIds(string, string2)) {
            sendAdFailedToLoad(101, "Missing or invalid server parameters.");
        } else if (!(context instanceof Activity)) {
            sendAdFailedToLoad(105, "Unity Ads requires an Activity context to load ads.");
        } else {
            this.activityWeakReference = new WeakReference<>((Activity) context);
            UnityInitializer.getInstance().initializeUnityAds(context, string, new IUnityAdsInitializationListener() { // from class: com.google.ads.mediation.unity.UnityAdapter.2
                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationComplete() {
                    Log.d(UnityMediationAdapter.TAG, String.format("Unity Ads is initialized for game ID '%s' and can now load interstitial ad with placement ID: %s", string, UnityAdapter.this.placementId));
                }

                @Override // com.unity3d.ads.IUnityAdsInitializationListener
                public void onInitializationFailed(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
                    AdError createSDKError = UnityAdsAdapterUtils.createSDKError(unityAdsInitializationError, String.format("Unity Ads initialization failed for game ID '%s' with error message: %s", string, str));
                    Log.w(UnityMediationAdapter.TAG, createSDKError.toString());
                    if (UnityAdapter.this.mediationInterstitialListener != null) {
                        UnityAdapter.this.mediationInterstitialListener.onAdFailedToLoad(UnityAdapter.this, createSDKError);
                    }
                }
            });
            UnityAds.load(this.placementId, this.mUnityLoadListener);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        Activity activity = weakReference == null ? null : weakReference.get();
        if (activity != null) {
            if (this.placementId == null) {
                Log.w(UnityMediationAdapter.TAG, "Unity Ads received call to show before successfully loading an ad.");
            }
            UnityAds.show(activity, this.placementId, this.mUnityShowListener);
            return;
        }
        String str = UnityMediationAdapter.TAG;
        Log.w(str, "Failed to show interstitial ad for placement ID '" + this.placementId + "' from Unity Ads: Activity context is null.");
        this.eventAdapter.sendAdEvent(UnityAdsAdapterUtils.AdEvent.CLOSED);
    }
}
