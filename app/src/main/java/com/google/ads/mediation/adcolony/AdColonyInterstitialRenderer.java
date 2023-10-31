package com.google.ads.mediation.adcolony;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adcolony.sdk.AbstractC2317u;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2114g;
import com.adcolony.sdk.C2249q;
import com.adcolony.sdk.C2365y;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.jirbo.adcolony.C8875c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class AdColonyInterstitialRenderer extends AbstractC2317u implements MediationInterstitialAd {
    private C2249q adColonyInterstitial;
    private final MediationInterstitialAdConfiguration adConfiguration;
    private final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mAdLoadCallback;
    private MediationInterstitialAdCallback mInterstitialAdCallback;

    public AdColonyInterstitialRenderer(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.mAdLoadCallback = mediationAdLoadCallback;
        this.adConfiguration = mediationInterstitialAdConfiguration;
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onClosed(C2249q c2249q) {
        super.onClosed(c2249q);
        this.mInterstitialAdCallback.onAdClosed();
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onExpiring(C2249q c2249q) {
        super.onExpiring(c2249q);
        C2074d.m9669h(c2249q.f5484i, this, null);
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onLeftApplication(C2249q c2249q) {
        super.onLeftApplication(c2249q);
        this.mInterstitialAdCallback.reportAdClicked();
        this.mInterstitialAdCallback.onAdLeftApplication();
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onOpened(C2249q c2249q) {
        super.onOpened(c2249q);
        this.mInterstitialAdCallback.onAdOpened();
        this.mInterstitialAdCallback.reportAdImpression();
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onRequestFilled(C2249q c2249q) {
        this.adColonyInterstitial = c2249q;
        this.mInterstitialAdCallback = this.mAdLoadCallback.onSuccess(this);
    }

    @Override // com.adcolony.sdk.AbstractC2317u
    public void onRequestNotFilled(C2365y c2365y) {
        AdError createSdkError = AdColonyMediationAdapter.createSdkError();
        Log.w(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
        this.mAdLoadCallback.onFailure(createSdkError);
    }

    public void render() {
        C8875c m2914d = C8875c.m2914d();
        MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration = this.adConfiguration;
        m2914d.getClass();
        C2114g m2915c = C8875c.m2915c(mediationInterstitialAdConfiguration);
        C8875c m2914d2 = C8875c.m2914d();
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        m2914d2.getClass();
        ArrayList m2912f = C8875c.m2912f(serverParameters);
        C8875c m2914d3 = C8875c.m2914d();
        Bundle mediationExtras = this.adConfiguration.getMediationExtras();
        m2914d3.getClass();
        C2074d.m9669h(C8875c.m2913e(m2912f, mediationExtras), this, m2915c);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(@NonNull Context context) {
        this.adColonyInterstitial.m9519c();
    }
}
