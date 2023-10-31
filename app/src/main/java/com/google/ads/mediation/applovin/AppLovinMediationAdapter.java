package com.google.ads.mediation.applovin;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.mediation.AppLovinIncentivizedAdListener;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.ApplovinAdapter;
import com.applovin.mediation.BuildConfig;
import com.applovin.mediation.rtb.AppLovinRtbBannerRenderer;
import com.applovin.mediation.rtb.AppLovinRtbInterstitialRenderer;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinInitializer;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdFormat;
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
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class AppLovinMediationAdapter extends RtbAdapter implements MediationRewardedAd, AppLovinAdLoadListener {
    public static final String APPLOVIN_SDK_ERROR_DOMAIN = "com.applovin.sdk";
    private static final String DEFAULT_ZONE = "";
    public static final int ERROR_AD_ALREADY_REQUESTED = 105;
    public static final int ERROR_AD_FORMAT_UNSUPPORTED = 108;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 101;
    public static final String ERROR_DOMAIN = "com.google.ads.mediation.applovin";
    public static final int ERROR_EMPTY_BID_TOKEN = 104;
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 110;
    public static final int ERROR_PRESENTATON_AD_NOT_READY = 106;
    public static final HashMap<String, AppLovinIncentivizedInterstitial> INCENTIVIZED_ADS = new HashMap<>();
    private static final Object INCENTIVIZED_ADS_LOCK = new Object();
    public static AppLovinSdkSettings appLovinSdkSettings = null;
    private static boolean isRtbAd = true;

    /* renamed from: ad */
    private AppLovinAd f10016ad;
    private MediationRewardedAdConfiguration adConfiguration;
    private AppLovinIncentivizedInterstitial mIncentivizedInterstitial;
    private MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mMediationAdLoadCallback;
    private Bundle mNetworkExtras;
    private MediationRewardedAdCallback mRewardedAdCallback;
    private AppLovinRtbBannerRenderer mRtbBannerRenderer;
    private AppLovinRtbInterstitialRenderer mRtbInterstitialRenderer;
    private AppLovinSdk mSdk;
    private String mZoneId;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    @NonNull
    public static AppLovinSdkSettings getSdkSettings(@NonNull Context context) {
        if (appLovinSdkSettings == null) {
            appLovinSdkSettings = new AppLovinSdkSettings(context);
        }
        return appLovinSdkSettings;
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        this.f10016ad = appLovinAd;
        Log.d("INFO", "Rewarded video did load ad: " + this.f10016ad.getAdIdNumber());
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.mRewardedAdCallback = (MediationRewardedAdCallback) appLovinMediationAdapter.mMediationAdLoadCallback.onSuccess(AppLovinMediationAdapter.this);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull SignalCallbacks signalCallbacks) {
        MediationConfiguration configuration = rtbSignalData.getConfiguration();
        if (configuration.getFormat() == AdFormat.NATIVE) {
            AdError adError = new AdError(108, "Requested to collect signal for unsupported native ad format. Ignoring...", ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.getMessage());
            signalCallbacks.onFailure(adError);
            return;
        }
        ApplovinAdapter.log(4, "Extras for signal collection: " + rtbSignalData.getNetworkExtras());
        String bidToken = AppLovinUtils.retrieveSdk(configuration.getServerParameters(), rtbSignalData.getContext()).getAdService().getBidToken();
        if (TextUtils.isEmpty(bidToken)) {
            AdError adError2 = new AdError(104, "Failed to generate bid token.", ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError2.getMessage());
            signalCallbacks.onFailure(adError2);
            return;
        }
        ApplovinAdapter.log(4, "Generated bid token: " + bidToken);
        signalCallbacks.onSuccess(bidToken);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(final int i) {
        if (!isRtbAd) {
            INCENTIVIZED_ADS.remove(this.mZoneId);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                AdError adError = AppLovinUtils.getAdError(i);
                ApplovinAdapter.log(5, adError.getMessage());
                AppLovinMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String str = AppLovinSdk.VERSION;
        String[] split = str.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        ApplovinAdapter.log(5, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = BuildConfig.ADAPTER_VERSION.split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        ApplovinAdapter.log(5, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", BuildConfig.ADAPTER_VERSION));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull final InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        final HashSet hashSet = new HashSet();
        for (MediationConfiguration mediationConfiguration : list) {
            String string = mediationConfiguration.getServerParameters().getString(AppLovinUtils.ServerParameterKeys.SDK_KEY);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
        }
        String retrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, null);
        if (!TextUtils.isEmpty(retrieveSdkKey)) {
            hashSet.add(retrieveSdkKey);
        }
        if (hashSet.isEmpty()) {
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", ERROR_DOMAIN);
            ApplovinAdapter.log(5, adError.getMessage());
            initializationCompleteCallback.onInitializationFailed(adError.getMessage());
            return;
        }
        final HashSet hashSet2 = new HashSet();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AppLovinInitializer.getInstance().initialize(context, (String) it.next(), new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.1
                @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                public void onInitializeSuccess(@NonNull String str) {
                    hashSet2.add(str);
                    if (hashSet2.equals(hashSet)) {
                        initializationCompleteCallback.onInitializationSucceeded();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        AppLovinRtbBannerRenderer appLovinRtbBannerRenderer = new AppLovinRtbBannerRenderer(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.mRtbBannerRenderer = appLovinRtbBannerRenderer;
        appLovinRtbBannerRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        AppLovinRtbInterstitialRenderer appLovinRtbInterstitialRenderer = new AppLovinRtbInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.mRtbInterstitialRenderer = appLovinRtbInterstitialRenderer;
        appLovinRtbInterstitialRenderer.loadAd();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        final Context context = mediationRewardedAdConfiguration.getContext();
        if (mediationRewardedAdConfiguration.getBidResponse().equals("")) {
            isRtbAd = false;
        }
        if (isRtbAd) {
            this.mMediationAdLoadCallback = mediationAdLoadCallback;
            this.mNetworkExtras = this.adConfiguration.getMediationExtras();
            AppLovinSdk retrieveSdk = AppLovinUtils.retrieveSdk(this.adConfiguration.getServerParameters(), context);
            this.mSdk = retrieveSdk;
            this.mIncentivizedInterstitial = AppLovinIncentivizedInterstitial.create(retrieveSdk);
            this.mSdk.getAdService().loadNextAdForAdToken(this.adConfiguration.getBidResponse(), this);
            return;
        }
        synchronized (INCENTIVIZED_ADS_LOCK) {
            final Bundle serverParameters = this.adConfiguration.getServerParameters();
            String retrieveSdkKey = AppLovinUtils.retrieveSdkKey(context, serverParameters);
            if (!TextUtils.isEmpty(retrieveSdkKey)) {
                AppLovinInitializer.getInstance().initialize(context, retrieveSdkKey, new AppLovinInitializer.OnInitializeSuccessListener() { // from class: com.google.ads.mediation.applovin.AppLovinMediationAdapter.2
                    @Override // com.google.ads.mediation.applovin.AppLovinInitializer.OnInitializeSuccessListener
                    public void onInitializeSuccess(@NonNull String str) {
                        AppLovinMediationAdapter appLovinMediationAdapter;
                        AppLovinIncentivizedInterstitial create;
                        AppLovinMediationAdapter.this.mZoneId = AppLovinUtils.retrieveZoneId(serverParameters);
                        AppLovinMediationAdapter.this.mSdk = AppLovinUtils.retrieveSdk(serverParameters, context);
                        AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                        appLovinMediationAdapter2.mNetworkExtras = appLovinMediationAdapter2.adConfiguration.getMediationExtras();
                        AppLovinMediationAdapter.this.mMediationAdLoadCallback = mediationAdLoadCallback;
                        ApplovinAdapter.log(3, String.format("Requesting rewarded video for zone '%s'", AppLovinMediationAdapter.this.mZoneId));
                        HashMap<String, AppLovinIncentivizedInterstitial> hashMap = AppLovinMediationAdapter.INCENTIVIZED_ADS;
                        if (hashMap.containsKey(AppLovinMediationAdapter.this.mZoneId)) {
                            AppLovinMediationAdapter appLovinMediationAdapter3 = AppLovinMediationAdapter.this;
                            appLovinMediationAdapter3.mIncentivizedInterstitial = hashMap.get(appLovinMediationAdapter3.mZoneId);
                            AdError adError = new AdError(105, "Cannot load multiple rewarded ads with the same Zone ID. Display one ad before attempting to load another.", AppLovinMediationAdapter.ERROR_DOMAIN);
                            ApplovinAdapter.log(6, adError.getMessage());
                            AppLovinMediationAdapter.this.mMediationAdLoadCallback.onFailure(adError);
                            return;
                        }
                        if ("".equals(AppLovinMediationAdapter.this.mZoneId)) {
                            appLovinMediationAdapter = AppLovinMediationAdapter.this;
                            create = AppLovinIncentivizedInterstitial.create(appLovinMediationAdapter.mSdk);
                        } else {
                            appLovinMediationAdapter = AppLovinMediationAdapter.this;
                            create = AppLovinIncentivizedInterstitial.create(appLovinMediationAdapter.mZoneId, AppLovinMediationAdapter.this.mSdk);
                        }
                        appLovinMediationAdapter.mIncentivizedInterstitial = create;
                        hashMap.put(AppLovinMediationAdapter.this.mZoneId, AppLovinMediationAdapter.this.mIncentivizedInterstitial);
                    }
                });
                this.mIncentivizedInterstitial.preload(this);
                return;
            }
            AdError adError = new AdError(110, "Missing or invalid SDK Key.", ERROR_DOMAIN);
            ApplovinAdapter.log(6, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        this.mSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.mNetworkExtras));
        AppLovinIncentivizedAdListener appLovinIncentivizedAdListener = new AppLovinIncentivizedAdListener(this.adConfiguration, this.mRewardedAdCallback);
        if (isRtbAd) {
            this.mIncentivizedInterstitial.show(this.f10016ad, context, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener);
            return;
        }
        String str = this.mZoneId;
        if (str != null) {
            ApplovinAdapter.log(3, String.format("Showing rewarded video for zone '%s'", str));
        }
        if (this.mIncentivizedInterstitial.isAdReadyToDisplay()) {
            this.mIncentivizedInterstitial.show(context, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener);
            return;
        }
        AdError adError = new AdError(106, "Ad not ready to show.", ERROR_DOMAIN);
        ApplovinAdapter.log(6, adError.getMessage());
        this.mRewardedAdCallback.onAdFailedToShow(adError);
    }
}
