package com.jirbo.adcolony;

import android.util.Log;
import androidx.annotation.NonNull;
import com.adcolony.sdk.AbstractC2187l;
import com.adcolony.sdk.C2178k;
import com.adcolony.sdk.C2365y;
import com.google.ads.mediation.adcolony.AdColonyMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* renamed from: com.jirbo.adcolony.b */
/* loaded from: classes3.dex */
public final class C8874b extends AbstractC2187l {

    /* renamed from: d */
    public MediationBannerListener f16905d;

    /* renamed from: e */
    public AdColonyAdapter f16906e;

    public C8874b(@NonNull AdColonyAdapter adColonyAdapter, @NonNull MediationBannerListener mediationBannerListener) {
        this.f16905d = mediationBannerListener;
        this.f16906e = adColonyAdapter;
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onClicked(C2178k c2178k) {
        AdColonyAdapter adColonyAdapter;
        MediationBannerListener mediationBannerListener = this.f16905d;
        if (mediationBannerListener == null || (adColonyAdapter = this.f16906e) == null) {
            return;
        }
        mediationBannerListener.onAdClicked(adColonyAdapter);
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onClosed(C2178k c2178k) {
        AdColonyAdapter adColonyAdapter;
        MediationBannerListener mediationBannerListener = this.f16905d;
        if (mediationBannerListener == null || (adColonyAdapter = this.f16906e) == null) {
            return;
        }
        mediationBannerListener.onAdClosed(adColonyAdapter);
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onLeftApplication(C2178k c2178k) {
        AdColonyAdapter adColonyAdapter;
        MediationBannerListener mediationBannerListener = this.f16905d;
        if (mediationBannerListener == null || (adColonyAdapter = this.f16906e) == null) {
            return;
        }
        mediationBannerListener.onAdLeftApplication(adColonyAdapter);
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onOpened(C2178k c2178k) {
        AdColonyAdapter adColonyAdapter;
        MediationBannerListener mediationBannerListener = this.f16905d;
        if (mediationBannerListener == null || (adColonyAdapter = this.f16906e) == null) {
            return;
        }
        mediationBannerListener.onAdOpened(adColonyAdapter);
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onRequestFilled(C2178k c2178k) {
        AdColonyAdapter adColonyAdapter;
        MediationBannerListener mediationBannerListener = this.f16905d;
        if (mediationBannerListener != null && (adColonyAdapter = this.f16906e) != null) {
            adColonyAdapter.f16894c = c2178k;
            mediationBannerListener.onAdLoaded(adColonyAdapter);
        }
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public final void onRequestNotFilled(C2365y c2365y) {
        if (this.f16905d == null || this.f16906e == null) {
            return;
        }
        AdError createSdkError = AdColonyMediationAdapter.createSdkError();
        Log.w(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
        this.f16905d.onAdFailedToLoad(this.f16906e, createSdkError);
    }
}
