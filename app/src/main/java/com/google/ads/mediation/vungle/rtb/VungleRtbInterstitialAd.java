package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.hutool.core.codec.C2026c;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.vungle.mediation.C9704a;
import com.vungle.mediation.C9710c;
import com.vungle.warren.AdConfig;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.InterfaceC9782e0;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

/* loaded from: classes.dex */
public class VungleRtbInterstitialAd implements MediationInterstitialAd {
    private static final String TAG = "VungleRtbInterstitialAd";
    private AdConfig mAdConfig;
    private String mAdMarkup;
    @NonNull
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mMediationAdLoadCallback;
    private String mPlacementForPlay;
    @Nullable
    private MediationInterstitialAdCallback mediationInterstitialAdCallback;
    @NonNull
    private final MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration;

    public VungleRtbInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.mediationInterstitialAdConfiguration = mediationInterstitialAdConfiguration;
        this.mMediationAdLoadCallback = mediationAdLoadCallback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd() {
        boolean z;
        if (Vungle.canPlayAd(this.mPlacementForPlay, this.mAdMarkup)) {
            this.mediationInterstitialAdCallback = this.mMediationAdLoadCallback.onSuccess(this);
            return;
        }
        C9710c m1656c = C9710c.m1656c();
        String str = this.mPlacementForPlay;
        m1656c.getClass();
        if (Vungle.isInitialized() && Vungle.getValidPlacements().contains(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            this.mMediationAdLoadCallback.onFailure(adError);
            return;
        }
        Vungle.loadAd(this.mPlacementForPlay, this.mAdMarkup, this.mAdConfig, new InterfaceC10136z() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.2
            @Override // com.vungle.warren.InterfaceC10136z
            public void onAdLoad(String str2) {
                VungleRtbInterstitialAd vungleRtbInterstitialAd = VungleRtbInterstitialAd.this;
                vungleRtbInterstitialAd.mediationInterstitialAdCallback = (MediationInterstitialAdCallback) vungleRtbInterstitialAd.mMediationAdLoadCallback.onSuccess(VungleRtbInterstitialAd.this);
            }

            @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
            public void onError(String str2, VungleException vungleException) {
                AdError adError2 = VungleMediationAdapter.getAdError(vungleException);
                Log.w(VungleRtbInterstitialAd.TAG, adError2.getMessage());
                VungleRtbInterstitialAd.this.mMediationAdLoadCallback.onFailure(adError2);
            }
        });
    }

    public void render() {
        Bundle mediationExtras = this.mediationInterstitialAdConfiguration.getMediationExtras();
        Bundle serverParameters = this.mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(VungleMediationAdapter.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
            this.mMediationAdLoadCallback.onFailure(adError);
            return;
        }
        C9710c.m1656c().getClass();
        String m1657b = C9710c.m1657b(mediationExtras, serverParameters);
        this.mPlacementForPlay = m1657b;
        if (TextUtils.isEmpty(m1657b)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            this.mMediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.mAdMarkup = this.mediationInterstitialAdConfiguration.getBidResponse();
        String str = TAG;
        Log.d(str, "Render interstitial mAdMarkup=" + this.mAdMarkup);
        C9704a.C9705a m1661a = C9704a.m1661a(mediationExtras, string);
        this.mAdConfig = C2026c.m9722a(mediationExtras, false);
        VungleInitializer.getInstance().initialize(m1661a.f19239a, this.mediationInterstitialAdConfiguration.getContext(), new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.1
            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeError(AdError adError3) {
                Log.w(VungleRtbInterstitialAd.TAG, adError3.getMessage());
                VungleRtbInterstitialAd.this.mMediationAdLoadCallback.onFailure(adError3);
            }

            @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
            public void onInitializeSuccess() {
                VungleRtbInterstitialAd.this.loadAd();
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        Vungle.playAd(this.mPlacementForPlay, this.mAdMarkup, this.mAdConfig, new InterfaceC9782e0() { // from class: com.google.ads.mediation.vungle.rtb.VungleRtbInterstitialAd.3
            @Override // com.vungle.warren.InterfaceC9782e0
            public void creativeId(String str) {
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdClick(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.reportAdClicked();
                }
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdEnd(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdClosed();
                }
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdEnd(String str, boolean z, boolean z2) {
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdLeftApplication(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdLeftApplication();
                }
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdRewarded(String str) {
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdStart(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdOpened();
                }
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onAdViewed(String str) {
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.reportAdImpression();
                }
            }

            @Override // com.vungle.warren.InterfaceC9782e0
            public void onError(String str, VungleException vungleException) {
                Log.w(VungleRtbInterstitialAd.TAG, VungleMediationAdapter.getAdError(vungleException).getMessage());
                if (VungleRtbInterstitialAd.this.mediationInterstitialAdCallback != null) {
                    VungleRtbInterstitialAd.this.mediationInterstitialAdCallback.onAdClosed();
                }
            }
        });
    }
}
