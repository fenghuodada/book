package com.google.ads.mediation.adcolony;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import com.adcolony.sdk.AbstractC2187l;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2114g;
import com.adcolony.sdk.C2124h;
import com.adcolony.sdk.C2178k;
import com.adcolony.sdk.C2365y;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.jirbo.adcolony.C8875c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AdColonyBannerRenderer extends AbstractC2187l implements MediationBannerAd {
    private C2178k adColonyAdView;
    private final MediationBannerAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mAdLoadCallback;
    private MediationBannerAdCallback mBannerAdCallback;

    public AdColonyBannerRenderer(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.mAdLoadCallback = mediationAdLoadCallback;
        this.adConfiguration = mediationBannerAdConfiguration;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        return this.adColonyAdView;
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onClicked(C2178k c2178k) {
        this.mBannerAdCallback.reportAdClicked();
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onClosed(C2178k c2178k) {
        this.mBannerAdCallback.onAdClosed();
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onLeftApplication(C2178k c2178k) {
        this.mBannerAdCallback.onAdLeftApplication();
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onOpened(C2178k c2178k) {
        this.mBannerAdCallback.onAdOpened();
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onRequestFilled(C2178k c2178k) {
        this.adColonyAdView = c2178k;
        this.mBannerAdCallback = this.mAdLoadCallback.onSuccess(this);
    }

    @Override // com.adcolony.sdk.AbstractC2187l
    public void onRequestNotFilled(C2365y c2365y) {
        AdError createSdkError = AdColonyMediationAdapter.createSdkError();
        Log.w(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
        this.mAdLoadCallback.onFailure(createSdkError);
    }

    public void render() {
        if (this.adConfiguration.getAdSize() == null) {
            AdError createAdapterError = AdColonyMediationAdapter.createAdapterError(101, "Failed to request banner with unsupported size: null");
            Log.e(AdColonyMediationAdapter.TAG, createAdapterError.getMessage());
            this.mAdLoadCallback.onFailure(createAdapterError);
            return;
        }
        C8875c m2914d = C8875c.m2914d();
        MediationBannerAdConfiguration mediationBannerAdConfiguration = this.adConfiguration;
        m2914d.getClass();
        C2114g m2915c = C8875c.m2915c(mediationBannerAdConfiguration);
        C8875c m2914d2 = C8875c.m2914d();
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        m2914d2.getClass();
        ArrayList m2912f = C8875c.m2912f(serverParameters);
        C8875c m2914d3 = C8875c.m2914d();
        Bundle mediationExtras = this.adConfiguration.getMediationExtras();
        m2914d3.getClass();
        C2074d.m9670g(C8875c.m2913e(m2912f, mediationExtras), this, new C2124h(AdColonyAdapterUtils.convertPixelsToDp(this.adConfiguration.getAdSize().getWidthInPixels(this.adConfiguration.getContext())), AdColonyAdapterUtils.convertPixelsToDp(this.adConfiguration.getAdSize().getHeightInPixels(this.adConfiguration.getContext()))), m2915c);
    }
}
