package com.google.ads.mediation.adcolony;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.AbstractC2357x;
import com.adcolony.sdk.C2058b3;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2080d1;
import com.adcolony.sdk.C2200m;
import com.adcolony.sdk.C2201m0;
import com.adcolony.sdk.C2367y1;
import com.adcolony.sdk.RunnableC2036a;
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
import com.jirbo.adcolony.C8875c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AdColonyMediationAdapter extends RtbAdapter {
    private static final String ADCOLONY_SDK_ERROR_DOMAIN = "com.jirbo.adcolony";
    public static final int ERROR_ADCOLONY_NOT_INITIALIZED = 103;
    public static final int ERROR_ADCOLONY_SDK = 100;
    public static final int ERROR_AD_ALREADY_REQUESTED = 102;
    public static final int ERROR_BANNER_SIZE_MISMATCH = 104;
    public static final int ERROR_CONTEXT_NOT_ACTIVITY = 106;
    private static final String ERROR_DOMAIN = "com.google.ads.mediation.adcolony";
    public static final int ERROR_INVALID_SERVER_PARAMETERS = 101;
    public static final int ERROR_PRESENTATION_AD_NOT_LOADED = 105;
    public static final String TAG = "AdColonyMediationAdapter";
    private static final C2200m appOptions = new C2200m();
    private AdColonyBannerRenderer adColonyBannerRenderer;
    private AdColonyInterstitialRenderer adColonyInterstitialRenderer;
    private AdColonyRewardedRenderer adColonyRewardedRenderer;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    @NonNull
    public static AdError createAdapterError(int i, @NonNull String str) {
        return new AdError(i, str, ERROR_DOMAIN);
    }

    @NonNull
    public static AdError createSdkError() {
        return createSdkError(100, "AdColony SDK returned a failure callback.");
    }

    @NonNull
    public static AdError createSdkError(int i, @NonNull String str) {
        return new AdError(i, str, ADCOLONY_SDK_ERROR_DOMAIN);
    }

    public static C2200m getAppOptions() {
        return appOptions;
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void collectSignals(@NonNull RtbSignalData rtbSignalData, @NonNull final SignalCallbacks signalCallbacks) {
        AbstractC2357x abstractC2357x = new AbstractC2357x() { // from class: com.google.ads.mediation.adcolony.AdColonyMediationAdapter.2
            @Override // com.adcolony.sdk.AbstractC2357x
            public void onFailure() {
                AdError createSdkError = AdColonyMediationAdapter.createSdkError(100, "Failed to get signals from AdColony.");
                Log.e(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
                signalCallbacks.onFailure(createSdkError);
            }

            @Override // com.adcolony.sdk.AbstractC2357x
            public void onSuccess(String str) {
                signalCallbacks.onSuccess(str);
            }
        };
        ExecutorService executorService = C2074d.f5043a;
        if (!C2201m0.f5365c) {
            C1169e.m11129c("Ignoring call to AdColony.collectSignals() as AdColony has not yet been configured.", 0, 1, false);
        } else {
            C2058b3 m9588d = C2201m0.m9588d();
            if (C2074d.m9673d(new RunnableC2036a(m9588d, m9588d.m9686q(), abstractC2357x))) {
                return;
            }
        }
        abstractC2357x.onFailure();
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String str;
        ExecutorService executorService = C2074d.f5043a;
        if (!C2201m0.f5365c) {
            str = "";
        } else {
            C2201m0.m9588d().m9691l().getClass();
            str = "4.8.0";
        }
        String[] split = str.split("\\.");
        if (split.length >= 3) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
        }
        Log.w(TAG, String.format("Unexpected SDK version format: %s. Returning 0.0.0 for SDK version.", str));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    @NonNull
    public VersionInfo getVersionInfo() {
        String[] split = "4.8.0.0".split("\\.");
        if (split.length >= 4) {
            return new VersionInfo(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[3]) + (Integer.parseInt(split[2]) * 100));
        }
        Log.w(TAG, String.format("Unexpected adapter version format: %s. Returning 0.0.0 for adapter version.", "4.8.0.0"));
        return new VersionInfo(0, 0, 0);
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void initialize(@NonNull Context context, @NonNull final InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) {
        if (!(context instanceof Activity) && !(context instanceof Application)) {
            initializationCompleteCallback.onInitializationFailed(createAdapterError(106, "AdColony SDK requires an Activity or Application context to initialize.").toString());
            return;
        }
        HashSet hashSet = new HashSet();
        ArrayList<String> arrayList = new ArrayList<>();
        for (MediationConfiguration mediationConfiguration : list) {
            Bundle serverParameters = mediationConfiguration.getServerParameters();
            String string = serverParameters.getString(AdColonyAdapterUtils.KEY_APP_ID);
            if (!TextUtils.isEmpty(string)) {
                hashSet.add(string);
            }
            C8875c.m2914d().getClass();
            ArrayList m2912f = C8875c.m2912f(serverParameters);
            if (m2912f != null && m2912f.size() > 0) {
                arrayList.addAll(m2912f);
            }
        }
        int size = hashSet.size();
        if (size <= 0) {
            initializationCompleteCallback.onInitializationFailed(createAdapterError(101, "Missing or invalid AdColony app ID.").toString());
            return;
        }
        String str = (String) hashSet.iterator().next();
        if (size > 1) {
            Log.w(TAG, String.format("Multiple '%s' entries found: %s. Using '%s' to initialize the AdColony SDK.", AdColonyAdapterUtils.KEY_APP_ID, hashSet, str));
        }
        C2200m c2200m = appOptions;
        C2367y1 c2367y1 = c2200m.f5362b;
        C2080d1.m9660h(c2367y1, "mediation_network", "AdMob");
        C2080d1.m9660h(c2367y1, "mediation_network_version", "4.8.0.0");
        C8875c.m2914d().m2916b(context, c2200m, str, arrayList, new C8875c.InterfaceC8876a() { // from class: com.google.ads.mediation.adcolony.AdColonyMediationAdapter.1
            @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
            public void onInitializeFailed(@NonNull AdError adError) {
                initializationCompleteCallback.onInitializationFailed(adError.toString());
            }

            @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
            public void onInitializeSuccess() {
                initializationCompleteCallback.onInitializationSucceeded();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.Adapter
    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        AdColonyRewardedRenderer adColonyRewardedRenderer = new AdColonyRewardedRenderer(mediationRewardedAdConfiguration, mediationAdLoadCallback);
        this.adColonyRewardedRenderer = adColonyRewardedRenderer;
        adColonyRewardedRenderer.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        AdColonyBannerRenderer adColonyBannerRenderer = new AdColonyBannerRenderer(mediationBannerAdConfiguration, mediationAdLoadCallback);
        this.adColonyBannerRenderer = adColonyBannerRenderer;
        adColonyBannerRenderer.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        AdColonyInterstitialRenderer adColonyInterstitialRenderer = new AdColonyInterstitialRenderer(mediationInterstitialAdConfiguration, mediationAdLoadCallback);
        this.adColonyInterstitialRenderer = adColonyInterstitialRenderer;
        adColonyInterstitialRenderer.render();
    }

    @Override // com.google.android.gms.ads.mediation.rtb.RtbAdapter
    public void loadRtbRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        loadRewardedAd(mediationRewardedAdConfiguration, mediationAdLoadCallback);
    }
}
