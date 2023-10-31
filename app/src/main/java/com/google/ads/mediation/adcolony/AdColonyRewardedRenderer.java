package com.google.ads.mediation.adcolony;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2080d1;
import com.adcolony.sdk.C2114g;
import com.adcolony.sdk.C2200m;
import com.adcolony.sdk.C2201m0;
import com.adcolony.sdk.C2249q;
import com.adcolony.sdk.C2326v;
import com.adcolony.sdk.C2365y;
import com.adcolony.sdk.InterfaceC2349w;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.jirbo.adcolony.C8875c;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class AdColonyRewardedRenderer implements MediationRewardedAd {
    private final MediationRewardedAdConfiguration adConfiguration;
    private C2249q mAdColonyInterstitial;
    private final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mAdLoadCallback;
    private MediationRewardedAdCallback mRewardedAdCallback;

    public AdColonyRewardedRenderer(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.adConfiguration = mediationRewardedAdConfiguration;
        this.mAdLoadCallback = mediationAdLoadCallback;
    }

    public void onClicked(C2249q c2249q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.reportAdClicked();
        }
    }

    public void onClosed(C2249q c2249q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdClosed();
        }
    }

    public void onExpiring(C2249q c2249q) {
        this.mAdColonyInterstitial = null;
        C2074d.m9669h(c2249q.f5484i, AdColonyRewardedEventForwarder.getInstance(), null);
    }

    public void onIAPEvent(C2249q c2249q, String str, int i) {
    }

    public void onLeftApplication(C2249q c2249q) {
    }

    public void onOpened(C2249q c2249q) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onAdOpened();
            this.mRewardedAdCallback.onVideoStart();
            this.mRewardedAdCallback.reportAdImpression();
        }
    }

    public void onRequestFilled(C2249q c2249q) {
        this.mAdColonyInterstitial = c2249q;
        this.mRewardedAdCallback = this.mAdLoadCallback.onSuccess(this);
    }

    public void onRequestNotFilled(C2365y c2365y) {
        AdError createSdkError = AdColonyMediationAdapter.createSdkError();
        Log.w(AdColonyMediationAdapter.TAG, createSdkError.getMessage());
        this.mAdLoadCallback.onFailure(createSdkError);
    }

    public void onReward(C2326v c2326v) {
        MediationRewardedAdCallback mediationRewardedAdCallback = this.mRewardedAdCallback;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onVideoComplete();
            if (c2326v.f5640d) {
                this.mRewardedAdCallback.onUserEarnedReward(new AdColonyReward(c2326v.f5638b, c2326v.f5637a));
            }
        }
    }

    public void render() {
        C8875c m2914d = C8875c.m2914d();
        Bundle serverParameters = this.adConfiguration.getServerParameters();
        m2914d.getClass();
        ArrayList m2912f = C8875c.m2912f(serverParameters);
        C8875c m2914d2 = C8875c.m2914d();
        Bundle mediationExtras = this.adConfiguration.getMediationExtras();
        m2914d2.getClass();
        final String m2913e = C8875c.m2913e(m2912f, mediationExtras);
        if (AdColonyRewardedEventForwarder.getInstance().isListenerAvailable(m2913e) && this.adConfiguration.getBidResponse().isEmpty()) {
            AdError createAdapterError = AdColonyMediationAdapter.createAdapterError(102, "Failed to load ad from AdColony: Only a maximum of one ad can be loaded per Zone ID.");
            Log.e(AdColonyMediationAdapter.TAG, createAdapterError.getMessage());
            this.mAdLoadCallback.onFailure(createAdapterError);
            return;
        }
        C8875c m2914d3 = C8875c.m2914d();
        MediationRewardedAdConfiguration mediationRewardedAdConfiguration = this.adConfiguration;
        C8875c.InterfaceC8876a interfaceC8876a = new C8875c.InterfaceC8876a() { // from class: com.google.ads.mediation.adcolony.AdColonyRewardedRenderer.1
            @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
            public void onInitializeFailed(@NonNull AdError adError) {
                Log.w(AdColonyMediationAdapter.TAG, adError.getMessage());
                AdColonyRewardedRenderer.this.mAdLoadCallback.onFailure(adError);
            }

            @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
            public void onInitializeSuccess() {
                if (TextUtils.isEmpty(m2913e)) {
                    AdError createAdapterError2 = AdColonyMediationAdapter.createAdapterError(101, "Missing or invalid Zone ID.");
                    Log.e(AdColonyMediationAdapter.TAG, createAdapterError2.getMessage());
                    AdColonyRewardedRenderer.this.mAdLoadCallback.onFailure(createAdapterError2);
                    return;
                }
                C8875c m2914d4 = C8875c.m2914d();
                MediationRewardedAdConfiguration mediationRewardedAdConfiguration2 = AdColonyRewardedRenderer.this.adConfiguration;
                m2914d4.getClass();
                C2114g m2915c = C8875c.m2915c(mediationRewardedAdConfiguration2);
                C2074d.m9668i(AdColonyRewardedEventForwarder.getInstance());
                AdColonyRewardedEventForwarder.getInstance().addListener(m2913e, AdColonyRewardedRenderer.this);
                C2074d.m9669h(m2913e, AdColonyRewardedEventForwarder.getInstance(), m2915c);
            }
        };
        m2914d3.getClass();
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters2 = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters2.getString(AdColonyAdapterUtils.KEY_APP_ID);
        ArrayList<String> m2912f2 = C8875c.m2912f(serverParameters2);
        C2200m appOptions = AdColonyMediationAdapter.getAppOptions();
        if (mediationRewardedAdConfiguration.isTestRequest()) {
            C2080d1.m9656l(appOptions.f5362b, "test_mode", true);
        }
        m2914d3.m2916b(context, appOptions, string, m2912f2, interfaceC8876a);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(@NonNull Context context) {
        InterfaceC2349w interfaceC2349w;
        if (this.mAdColonyInterstitial == null) {
            AdError createAdapterError = AdColonyMediationAdapter.createAdapterError(105, "No ad to show.");
            Log.w(AdColonyMediationAdapter.TAG, createAdapterError.getMessage());
            this.mRewardedAdCallback.onAdFailedToShow(createAdapterError);
            return;
        }
        ExecutorService executorService = C2074d.f5043a;
        if (!C2201m0.f5365c) {
            interfaceC2349w = null;
        } else {
            interfaceC2349w = C2201m0.m9588d().f4998p;
        }
        if (interfaceC2349w != AdColonyRewardedEventForwarder.getInstance()) {
            Log.w(AdColonyMediationAdapter.TAG, "AdColony's reward listener has been changed since load time. Setting the listener back to the Google AdColony adapter to be able to detect rewarded events.");
            C2074d.m9668i(AdColonyRewardedEventForwarder.getInstance());
        }
        this.mAdColonyInterstitial.m9519c();
    }
}
