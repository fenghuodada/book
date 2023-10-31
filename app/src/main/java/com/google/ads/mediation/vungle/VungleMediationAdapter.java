package com.google.ads.mediation.vungle;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import cn.hutool.core.codec.C2026c;
import com.google.ads.mediation.facebook.BuildConfig;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.rtb.VungleRtbBannerAd;
import com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.VersionInfo;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.mediation.rtb.SignalCallbacks;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.vungle.mediation.C9710c;
import com.vungle.warren.AdConfig;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.InterfaceC9782e0;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class VungleMediationAdapter extends RtbAdapter implements MediationRewardedAd, InterfaceC10136z, InterfaceC9782e0 {
    public static final int ERROR_AD_ALREADY_LOADED = 104;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 102;
    public static final int ERROR_CANNOT_PLAY_AD = 107;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.vungle";
    public static final int ERROR_INITIALIZATION_FAILURE = 105;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_REQUIRES_ACTIVITY_CONTEXT = 103;
    public static final int ERROR_VUNGLE_BANNER_NULL = 106;
    public static final String KEY_APP_ID = "appid";
    private static final String TAG = "VungleMediationAdapter";
    public static final String VUNGLE_SDK_ERROR_DOMAIN = "com.vungle.warren";
    private static final HashMap<String, WeakReference<VungleMediationAdapter>> mPlacementsInUse = new HashMap<>();
    private AdConfig mAdConfig;
    private String mAdMarkup;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private MediationRewardedAdCallback mMediationRewardedAdCallback;
    private String mPlacement;
    private String mUserID;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    /* loaded from: classes.dex */
    public static class VungleReward implements RewardItem {
        private final int mAmount;
        private final String mType;

        public VungleReward(String str, int i) {
            this.mType = str;
            this.mAmount = i;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        public int getAmount() {
            return this.mAmount;
        }

        @Override // com.google.android.gms.ads.rewarded.RewardItem
        @NonNull
        public String getType() {
            return this.mType;
        }
    }

    @NonNull
    public static AdError getAdError(@NonNull VungleException vungleException) {
        return new AdError(vungleException.f19507a, vungleException.getLocalizedMessage(), VUNGLE_SDK_ERROR_DOMAIN);
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        String availableBidTokens = Vungle.getAvailableBidTokens(rtbSignalData.getContext());
        String str = TAG;
        Log.d(str, "token=" + availableBidTokens);
        signalCallbacks.onSuccess(availableBidTokens);
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void creativeId(String str) {
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] split = "6.11.0".split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", "6.11.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull final InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (Vungle.isInitialized()) {
            initializationCompleteCallback.onInitializationSucceeded();
            return;
        }
        HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString(KEY_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        int size = hashSet.size();
        if (size > 0) {
            String str = (String) hashSet.iterator().next();
            if (size > 1) {
                Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the Vungle SDK.", KEY_APP_ID, hashSet.toString(), str));
            }
            VungleInitializer.getInstance().initialize(str, context.getApplicationContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError) {
                    Log.w(VungleMediationAdapter.TAG, adError.getMessage());
                    initializationCompleteCallback.onInitializationFailed(adError.getMessage());
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    initializationCompleteCallback.onInitializationSucceeded();
                }
            });
        } else if (initializationCompleteCallback != null) {
            AdError adError = new AdError(101, "Missing or Invalid App ID.", ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
        Bundle mediationExtras = mediationRewardedAdConfiguration.getMediationExtras();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        if (mediationExtras != null) {
            this.mUserID = mediationExtras.getString("userId");
        }
        C9710c.m1656c().getClass();
        String m1657b = C9710c.m1657b(mediationExtras, serverParameters);
        this.mPlacement = m1657b;
        if (TextUtils.isEmpty(m1657b)) {
            AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or invalid Placement ID.", ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        HashMap<String, WeakReference<VungleMediationAdapter>> hashMap = mPlacementsInUse;
        if (hashMap.containsKey(this.mPlacement) && hashMap.get(this.mPlacement).get() != null) {
            AdError adError2 = new AdError(104, "Only a maximum of one ad can be loaded per placement.", ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String string = serverParameters.getString(KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError3 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid App ID.", ERROR_DOMAIN);
            Log.w(TAG, adError3.getMessage());
            mediationAdLoadCallback.onFailure(adError3);
            return;
        }
        this.mAdMarkup = mediationRewardedAdConfiguration.getBidResponse();
        String str = TAG;
        Log.d(str, "Render rewarded mAdMarkup=" + this.mAdMarkup);
        this.mAdConfig = C2026c.m9722a(mediationExtras, false);
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        VungleInitializer.getInstance().initialize(string, mediationRewardedAdConfiguration.getContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.2
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError4) {
                Log.w(VungleMediationAdapter.TAG, adError4.getMessage());
                VungleMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError4);
                VungleMediationAdapter.mPlacementsInUse.remove(VungleMediationAdapter.this.mPlacement);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                Vungle.setIncentivizedFields(VungleMediationAdapter.this.mUserID, null, null, null, null);
                VungleMediationAdapter.mPlacementsInUse.put(VungleMediationAdapter.this.mPlacement, new WeakReference(VungleMediationAdapter.this));
                if (!Vungle.canPlayAd(VungleMediationAdapter.this.mPlacement, VungleMediationAdapter.this.mAdMarkup)) {
                    Vungle.loadAd(VungleMediationAdapter.this.mPlacement, VungleMediationAdapter.this.mAdMarkup, VungleMediationAdapter.this.mAdConfig, VungleMediationAdapter.this);
                    return;
                }
                VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
                vungleMediationAdapter.mMediationRewardedAdCallback = (MediationRewardedAdCallback) vungleMediationAdapter.mMediationAdLoadCallback.onSuccess(VungleMediationAdapter.this);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbBannerAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationBannerAdConfiguration.taggedForChildDirectedTreatment());
        new VungleRtbBannerAd(mediationBannerAdConfiguration, mediationAdLoadCallback).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbInterstitialAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationInterstitialAdConfiguration.taggedForChildDirectedTreatment());
        new VungleRtbInterstitialAd(mediationInterstitialAdConfiguration, mediationAdLoadCallback).render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        Log.d(TAG, "loadRtbRewardedAd()...");
        VungleInitializer.getInstance().updateCoppaStatus(mediationRewardedAdConfiguration.taggedForChildDirectedTreatment());
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdClick(String str) {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationRewardedAdCallback != null) {
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.reportAdClicked();
                }
            }
        });
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdEnd(final String str) {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationRewardedAdCallback != null) {
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.onAdClosed();
                }
                VungleMediationAdapter.mPlacementsInUse.remove(str);
            }
        });
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    @Deprecated
    public void onAdEnd(String str, boolean z, boolean z2) {
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdLeftApplication(String str) {
    }

    @Override // com.vungle.warren.InterfaceC10136z
    public void onAdLoad(String str) {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationAdLoadCallback != null) {
                    VungleMediationAdapter vungleMediationAdapter = VungleMediationAdapter.this;
                    vungleMediationAdapter.mMediationRewardedAdCallback = (MediationRewardedAdCallback) vungleMediationAdapter.mMediationAdLoadCallback.onSuccess(VungleMediationAdapter.this);
                }
                VungleMediationAdapter.mPlacementsInUse.put(VungleMediationAdapter.this.mPlacement, new WeakReference(VungleMediationAdapter.this));
            }
        });
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdRewarded(String str) {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationRewardedAdCallback != null) {
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.onVideoComplete();
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.onUserEarnedReward(new VungleReward("vungle", 1));
                }
            }
        });
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdStart(String str) {
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationRewardedAdCallback != null) {
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.onAdOpened();
                }
            }
        });
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public void onAdViewed(String str) {
        this.mMediationRewardedAdCallback.onVideoStart();
        this.mMediationRewardedAdCallback.reportAdImpression();
    }

    @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
    public void onError(final String str, VungleException vungleException) {
        final AdError adError = getAdError(vungleException);
        Log.w(TAG, adError.getMessage());
        this.mHandler.post(new Runnable() { // from class: com.google.ads.mediation.vungle.VungleMediationAdapter.8
            @Override // java.lang.Runnable
            public void run() {
                if (VungleMediationAdapter.this.mMediationAdLoadCallback != null) {
                    VungleMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError);
                }
                if (VungleMediationAdapter.this.mMediationRewardedAdCallback != null) {
                    VungleMediationAdapter.this.mMediationRewardedAdCallback.onAdFailedToShow(new AdError(101, "Failed to show ad from Vungle.", VungleMediationAdapter.ERROR_DOMAIN));
                }
                VungleMediationAdapter.mPlacementsInUse.remove(str);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        Vungle.playAd(this.mPlacement, this.mAdMarkup, this.mAdConfig, this);
    }
}
