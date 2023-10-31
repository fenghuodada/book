package com.jirbo.adcolony;

import android.util.Log;
import androidx.annotation.NonNull;
import com.adcolony.sdk.AbstractC2317u;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2249q;
import com.adcolony.sdk.C2365y;
import com.google.ads.mediation.adcolony.AdColonyMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* renamed from: com.jirbo.adcolony.a */
/* loaded from: classes3.dex */
public final class C8873a extends AbstractC2317u {

    /* renamed from: a */
    public MediationInterstitialListener f16903a;

    /* renamed from: b */
    public AdColonyAdapter f16904b;

    public C8873a(@NonNull AdColonyAdapter adColonyAdapter, @NonNull MediationInterstitialListener mediationInterstitialListener) {
        this.f16903a = mediationInterstitialListener;
        this.f16904b = adColonyAdapter;
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onClicked(C2249q c2249q) {
        MediationInterstitialListener mediationInterstitialListener;
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && (mediationInterstitialListener = this.f16903a) != null) {
            adColonyAdapter.f16892a = c2249q;
            mediationInterstitialListener.onAdClicked(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onClosed(C2249q c2249q) {
        MediationInterstitialListener mediationInterstitialListener;
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && (mediationInterstitialListener = this.f16903a) != null) {
            adColonyAdapter.f16892a = c2249q;
            mediationInterstitialListener.onAdClosed(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onExpiring(C2249q c2249q) {
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null) {
            adColonyAdapter.f16892a = c2249q;
            C2074d.m9669h(c2249q.f5484i, this, null);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onIAPEvent(C2249q c2249q, String str, int i) {
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null) {
            adColonyAdapter.f16892a = c2249q;
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onLeftApplication(C2249q c2249q) {
        MediationInterstitialListener mediationInterstitialListener;
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && (mediationInterstitialListener = this.f16903a) != null) {
            adColonyAdapter.f16892a = c2249q;
            mediationInterstitialListener.onAdLeftApplication(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onOpened(C2249q c2249q) {
        MediationInterstitialListener mediationInterstitialListener;
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && (mediationInterstitialListener = this.f16903a) != null) {
            adColonyAdapter.f16892a = c2249q;
            mediationInterstitialListener.onAdOpened(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onRequestFilled(C2249q c2249q) {
        MediationInterstitialListener mediationInterstitialListener;
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && (mediationInterstitialListener = this.f16903a) != null) {
            adColonyAdapter.f16892a = c2249q;
            mediationInterstitialListener.onAdLoaded(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public final void onRequestNotFilled(C2365y c2365y) {
        AdColonyAdapter adColonyAdapter = this.f16904b;
        if (adColonyAdapter != null && this.f16903a != null) {
            adColonyAdapter.f16892a = null;
            AdError createSdkError = AdColonyMediationAdapter.createSdkError();
            Log.w(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
            this.f16903a.onAdFailedToLoad(this.f16904b, createSdkError);
        }
    }
}
