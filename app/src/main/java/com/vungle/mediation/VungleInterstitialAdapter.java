package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.activity.result.C0063d;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import cn.hutool.core.codec.C2026c;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.vungle.mediation.C9704a;
import com.vungle.warren.AdConfig;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.InterfaceC9782e0;
import com.vungle.warren.Vungle;
import com.vungle.warren.error.VungleException;

@Keep
/* loaded from: classes3.dex */
public class VungleInterstitialAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {
    private static final String TAG = "VungleInterstitialAdapter";
    private AdConfig mAdConfig;
    private MediationBannerListener mMediationBannerListener;
    private MediationInterstitialListener mMediationInterstitialListener;
    private String mPlacementForPlay;
    private C9710c mVungleManager;
    private C9706b vungleBannerAdapter;

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$a */
    /* loaded from: classes3.dex */
    public class C9701a implements VungleInitializer.VungleInitializationListener {
        public C9701a() {
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public final void onInitializeError(AdError adError) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
                Log.w(VungleInterstitialAdapter.TAG, adError.getMessage());
            }
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public final void onInitializeSuccess() {
            VungleInterstitialAdapter.this.loadAd();
        }
    }

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$b */
    /* loaded from: classes3.dex */
    public class C9702b implements InterfaceC10136z {
        public C9702b() {
        }

        @Override // com.vungle.warren.InterfaceC10136z
        public final void onAdLoad(String str) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdLoaded(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
        public final void onError(String str, VungleException vungleException) {
            AdError adError = VungleMediationAdapter.getAdError(vungleException);
            Log.w(VungleInterstitialAdapter.TAG, adError.getMessage());
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdFailedToLoad(vungleInterstitialAdapter, adError);
            }
        }
    }

    /* renamed from: com.vungle.mediation.VungleInterstitialAdapter$c */
    /* loaded from: classes3.dex */
    public class C9703c implements InterfaceC9782e0 {
        public C9703c() {
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void creativeId(String str) {
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdClick(String str) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdClicked(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdEnd(String str) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdClosed(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdEnd(String str, boolean z, boolean z2) {
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdLeftApplication(String str) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdLeftApplication(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdRewarded(String str) {
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdStart(String str) {
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdOpened(vungleInterstitialAdapter);
            }
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onAdViewed(String str) {
        }

        @Override // com.vungle.warren.InterfaceC9782e0
        public final void onError(String str, VungleException vungleException) {
            Log.w(VungleInterstitialAdapter.TAG, VungleMediationAdapter.getAdError(vungleException).getMessage());
            VungleInterstitialAdapter vungleInterstitialAdapter = VungleInterstitialAdapter.this;
            if (vungleInterstitialAdapter.mMediationInterstitialListener != null) {
                vungleInterstitialAdapter.mMediationInterstitialListener.onAdClosed(vungleInterstitialAdapter);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd() {
        boolean z;
        if (Vungle.canPlayAd(this.mPlacementForPlay)) {
            MediationInterstitialListener mediationInterstitialListener = this.mMediationInterstitialListener;
            if (mediationInterstitialListener != null) {
                mediationInterstitialListener.onAdLoaded(this);
                return;
            }
            return;
        }
        C9710c c9710c = this.mVungleManager;
        String str = this.mPlacementForPlay;
        c9710c.getClass();
        if (Vungle.isInitialized() && Vungle.getValidPlacements().contains(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (this.mMediationInterstitialListener != null) {
                AdError adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(TAG, adError.getMessage());
                this.mMediationInterstitialListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        Vungle.loadAd(this.mPlacementForPlay, new C9702b());
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        String str = TAG;
        Log.d(str, "getBannerView # instance: " + hashCode());
        return this.vungleBannerAdapter.f19252k;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        String str = TAG;
        Log.d(str, "onDestroy: " + hashCode());
        C9706b c9706b = this.vungleBannerAdapter;
        if (c9706b != null) {
            c9706b.getClass();
            Log.d("b", "Vungle banner adapter destroy:" + c9706b);
            c9706b.f19255n = false;
            c9706b.f19253l.m1653f(c9706b.f19242a, c9706b.f19251j);
            VungleBannerAd vungleBannerAd = c9706b.f19251j;
            if (vungleBannerAd != null) {
                vungleBannerAd.detach();
                c9706b.f19251j.destroyAd();
            }
            c9706b.f19251j = null;
            c9706b.f19254m = false;
            this.vungleBannerAdapter = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
        Log.d(TAG, "onPause");
        C9706b c9706b = this.vungleBannerAdapter;
        if (c9706b != null) {
            c9706b.m1659b(false);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
        Log.d(TAG, "onResume");
        C9706b c9706b = this.vungleBannerAdapter;
        if (c9706b != null) {
            c9706b.m1659b(true);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        AdError adError;
        this.mMediationBannerListener = mediationBannerListener;
        String string = bundle.getString(VungleMediationAdapter.KEY_APP_ID);
        C9704a.C9705a m1661a = C9704a.m1661a(bundle2, string);
        if (TextUtils.isEmpty(string)) {
            if (mediationBannerListener != null) {
                AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or invalid app ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(TAG, adError2.getMessage());
                mediationBannerListener.onAdFailedToLoad(this, adError2);
                return;
            }
            return;
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
        C9710c m1656c = C9710c.m1656c();
        this.mVungleManager = m1656c;
        m1656c.getClass();
        String m1657b = C9710c.m1657b(bundle2, bundle);
        String str = TAG;
        StringBuilder m13052b = C0063d.m13052b("requestBannerAd for Placement: ", m1657b, " ### Adapter instance: ");
        m13052b.append(hashCode());
        Log.d(str, m13052b.toString());
        if (TextUtils.isEmpty(m1657b)) {
            adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
        } else {
            AdConfig m9722a = C2026c.m9722a(bundle2, true);
            C9710c.m1656c().getClass();
            if (!C9710c.m1655d(context, adSize, m9722a)) {
                adError = new AdError(102, "Failed to load ad from Vungle. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
            } else {
                String str2 = m1661a.f19240b;
                if (!this.mVungleManager.m1658a(m1657b, str2)) {
                    adError = new AdError(104, "Vungle adapter does not support multiple banner instances for same placement.", VungleMediationAdapter.ERROR_DOMAIN);
                } else {
                    this.vungleBannerAdapter = new C9706b(m1657b, str2, m9722a, this);
                    Log.d(str, "New banner adapter: " + this.vungleBannerAdapter + "; size: " + m9722a.m1425a());
                    this.mVungleManager.m1654e(m1657b, new VungleBannerAd(m1657b, this.vungleBannerAdapter));
                    StringBuilder sb = new StringBuilder("Requesting banner with ad size: ");
                    sb.append(m9722a.m1425a());
                    Log.d(str, sb.toString());
                    C9706b c9706b = this.vungleBannerAdapter;
                    String str3 = m1661a.f19239a;
                    c9706b.f19246e = this.mMediationBannerListener;
                    c9706b.m1660a(context, str3, adSize);
                    return;
                }
            }
        }
        Log.w(str, adError.getMessage());
        this.mMediationBannerListener.onAdFailedToLoad(this, adError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        String string = bundle.getString(VungleMediationAdapter.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            if (mediationInterstitialListener != null) {
                AdError adError = new AdError(101, "Missing or invalid App ID.", VungleMediationAdapter.ERROR_DOMAIN);
                Log.w(TAG, adError.getMessage());
                mediationInterstitialListener.onAdFailedToLoad(this, adError);
                return;
            }
            return;
        }
        this.mMediationInterstitialListener = mediationInterstitialListener;
        C9710c m1656c = C9710c.m1656c();
        this.mVungleManager = m1656c;
        m1656c.getClass();
        String m1657b = C9710c.m1657b(bundle2, bundle);
        this.mPlacementForPlay = m1657b;
        if (TextUtils.isEmpty(m1657b)) {
            AdError adError2 = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid Placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(TAG, adError2.getMessage());
            this.mMediationInterstitialListener.onAdFailedToLoad(this, adError2);
            return;
        }
        VungleInitializer.getInstance().updateCoppaStatus(mediationAdRequest.taggedForChildDirectedTreatment());
        C9704a.C9705a m1661a = C9704a.m1661a(bundle2, string);
        this.mAdConfig = C2026c.m9722a(bundle2, false);
        VungleInitializer.getInstance().initialize(m1661a.f19239a, context.getApplicationContext(), new C9701a());
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        Vungle.playAd(this.mPlacementForPlay, this.mAdConfig, new C9703c());
    }
}
