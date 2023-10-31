package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import cn.hutool.core.codec.C2026c;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.mediation.C9704a;
import com.vungle.mediation.C9706b;
import com.vungle.mediation.C9710c;
import com.vungle.warren.AdConfig;

/* loaded from: classes.dex */
public class VungleRtbBannerAd implements MediationBannerAd {
    private static final String TAG = "VungleRtbBannerAd";
    private final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback;
    private final MediationBannerAdConfiguration mediationBannerAdConfiguration;
    private C9706b vungleBannerAdapter;

    public VungleRtbBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.mediationBannerAdConfiguration = mediationBannerAdConfiguration;
        this.mediationAdLoadCallback = mediationAdLoadCallback;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    @NonNull
    public View getView() {
        String str = TAG;
        Log.d(str, "getBannerView # instance: " + hashCode());
        return this.vungleBannerAdapter.f19252k;
    }

    public void render() {
        AdError adError;
        Bundle mediationExtras = this.mediationBannerAdConfiguration.getMediationExtras();
        Bundle serverParameters = this.mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString(VungleMediationAdapter.KEY_APP_ID);
        if (TextUtils.isEmpty(string)) {
            adError = new AdError(101, "Failed to load ad from Vungle. Missing or invalid app ID.", VungleMediationAdapter.ERROR_DOMAIN);
            Log.w(TAG, adError.getMessage());
        } else {
            C9710c.m1656c().getClass();
            String m1657b = C9710c.m1657b(mediationExtras, serverParameters);
            String str = TAG;
            StringBuilder m13052b = C0063d.m13052b("requestBannerAd for Placement: ", m1657b, " ### Adapter instance: ");
            m13052b.append(hashCode());
            Log.d(str, m13052b.toString());
            if (TextUtils.isEmpty(m1657b)) {
                adError = new AdError(101, "Failed to load ad from Vungle. Missing or Invalid placement ID.", VungleMediationAdapter.ERROR_DOMAIN);
            } else {
                Context context = this.mediationBannerAdConfiguration.getContext();
                AdSize adSize = this.mediationBannerAdConfiguration.getAdSize();
                AdConfig m9722a = C2026c.m9722a(mediationExtras, true);
                C9710c.m1656c().getClass();
                if (!C9710c.m1655d(context, adSize, m9722a)) {
                    adError = new AdError(102, "Failed to load ad from Vungle. Invalid banner size.", VungleMediationAdapter.ERROR_DOMAIN);
                } else {
                    C9704a.C9705a m1661a = C9704a.m1661a(mediationExtras, string);
                    String str2 = m1661a.f19240b;
                    if (!C9710c.m1656c().m1658a(m1657b, str2)) {
                        adError = new AdError(104, "Vungle adapter does not support multiple banner instances for same placement.", VungleMediationAdapter.ERROR_DOMAIN);
                    } else {
                        String bidResponse = this.mediationBannerAdConfiguration.getBidResponse();
                        Log.d(str, "Render banner mAdMarkup=" + bidResponse);
                        this.vungleBannerAdapter = new C9706b(m1657b, str2, m9722a, this);
                        Log.d(str, "New banner adapter: " + this.vungleBannerAdapter + "; size: " + m9722a.m1425a());
                        C9710c.m1656c().m1654e(m1657b, new VungleBannerAd(m1657b, this.vungleBannerAdapter));
                        StringBuilder sb = new StringBuilder("Requesting banner with ad size: ");
                        sb.append(m9722a.m1425a());
                        Log.d(str, sb.toString());
                        C9706b c9706b = this.vungleBannerAdapter;
                        String str3 = m1661a.f19239a;
                        c9706b.f19248g = this.mediationAdLoadCallback;
                        c9706b.f19250i = bidResponse;
                        c9706b.m1660a(context, str3, adSize);
                        return;
                    }
                }
            }
            Log.w(str, adError.getMessage());
        }
        this.mediationAdLoadCallback.onFailure(adError);
    }
}
