package com.jirbo.adcolony;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.AdColonyInterstitialActivity;
import com.adcolony.sdk.C2074d;
import com.adcolony.sdk.C2080d1;
import com.adcolony.sdk.C2100e2;
import com.adcolony.sdk.C2120g4;
import com.adcolony.sdk.C2124h;
import com.adcolony.sdk.C2178k;
import com.adcolony.sdk.C2201m0;
import com.adcolony.sdk.C2232o6;
import com.adcolony.sdk.C2249q;
import com.adcolony.sdk.C2367y1;
import com.adcolony.sdk.RunnableC2133i;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import com.google.ads.mediation.adcolony.AdColonyMediationAdapter;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.jirbo.adcolony.C8875c;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
public class AdColonyAdapter extends AdColonyMediationAdapter implements MediationInterstitialAdapter, MediationBannerAdapter {

    /* renamed from: a */
    public C2249q f16892a;

    /* renamed from: b */
    public C8873a f16893b;

    /* renamed from: c */
    public C2178k f16894c;

    /* renamed from: d */
    public C8874b f16895d;

    /* renamed from: com.jirbo.adcolony.AdColonyAdapter$a */
    /* loaded from: classes3.dex */
    public class C8871a implements C8875c.InterfaceC8876a {

        /* renamed from: a */
        public final /* synthetic */ String f16896a;

        /* renamed from: b */
        public final /* synthetic */ MediationInterstitialListener f16897b;

        public C8871a(String str, MediationInterstitialListener mediationInterstitialListener) {
            this.f16896a = str;
            this.f16897b = mediationInterstitialListener;
        }

        @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
        public final void onInitializeFailed(@NonNull AdError adError) {
            Log.w(AdColonyMediationAdapter.TAG, adError.getMessage());
            this.f16897b.onAdFailedToLoad(AdColonyAdapter.this, adError);
        }

        @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
        public final void onInitializeSuccess() {
            C2074d.m9669h(this.f16896a, AdColonyAdapter.this.f16893b, null);
        }
    }

    /* renamed from: com.jirbo.adcolony.AdColonyAdapter$b */
    /* loaded from: classes3.dex */
    public class C8872b implements C8875c.InterfaceC8876a {

        /* renamed from: a */
        public final /* synthetic */ C2124h f16899a;

        /* renamed from: b */
        public final /* synthetic */ String f16900b;

        /* renamed from: c */
        public final /* synthetic */ MediationBannerListener f16901c;

        public C8872b(C2124h c2124h, String str, MediationBannerListener mediationBannerListener) {
            this.f16899a = c2124h;
            this.f16900b = str;
            this.f16901c = mediationBannerListener;
        }

        @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
        public final void onInitializeFailed(@NonNull AdError adError) {
            Log.w(AdColonyMediationAdapter.TAG, adError.getMessage());
            this.f16901c.onAdFailedToLoad(AdColonyAdapter.this, adError);
        }

        @Override // com.jirbo.adcolony.C8875c.InterfaceC8876a
        public final void onInitializeSuccess() {
            Locale locale = Locale.US;
            C2124h c2124h = this.f16899a;
            Log.d(AdColonyMediationAdapter.TAG, String.format(locale, "Requesting banner with ad size: %dx%d", Integer.valueOf(c2124h.f5160a), Integer.valueOf(c2124h.f5161b)));
            C2074d.m9670g(this.f16900b, AdColonyAdapter.this.f16895d, c2124h, null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    @NonNull
    public View getBannerView() {
        return this.f16894c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
        Context context;
        C2249q c2249q = this.f16892a;
        if (c2249q != null) {
            if (c2249q.f5478c != null && ((context = C2201m0.f5363a) == null || (context instanceof AdColonyInterstitialActivity))) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, c2249q.f5478c.f5203l);
                new C2100e2(c2249q.f5478c.f5202k, c2367y1, "AdSession.on_request_close").m9640b();
            }
            C2249q c2249q2 = this.f16892a;
            c2249q2.getClass();
            C2201m0.m9588d().m9692k().f5266c.remove(c2249q2.f5482g);
        }
        C8873a c8873a = this.f16893b;
        if (c8873a != null) {
            c8873a.f16904b = null;
            c8873a.f16903a = null;
        }
        C2178k c2178k = this.f16894c;
        if (c2178k != null) {
            if (c2178k.f5320l) {
                C1169e.m11129c("Ignoring duplicate call to destroy().", 0, 1, false);
            } else {
                c2178k.f5320l = true;
                C2120g4 c2120g4 = c2178k.f5317i;
                if (c2120g4 != null && c2120g4.f5137a != null) {
                    c2120g4.m9623d();
                }
                C2232o6.m9548o(new RunnableC2133i(c2178k));
            }
        }
        C8874b c8874b = this.f16895d;
        if (c8874b != null) {
            c8874b.f16906e = null;
            c8874b.f16905d = null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(@NonNull Context context, @NonNull MediationBannerListener mediationBannerListener, @NonNull Bundle bundle, @NonNull AdSize adSize, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        C2124h adColonyAdSizeFromAdMobAdSize = AdColonyAdapterUtils.adColonyAdSizeFromAdMobAdSize(context, adSize);
        if (adColonyAdSizeFromAdMobAdSize == null) {
            AdError createAdapterError = AdColonyMediationAdapter.createAdapterError(104, "Failed to request banner with unsupported size: " + adSize);
            Log.e(AdColonyMediationAdapter.TAG, createAdapterError.getMessage());
            mediationBannerListener.onAdFailedToLoad(this, createAdapterError);
            return;
        }
        C8875c.m2914d().getClass();
        ArrayList m2912f = C8875c.m2912f(bundle);
        C8875c.m2914d().getClass();
        String m2913e = C8875c.m2913e(m2912f, bundle2);
        if (!TextUtils.isEmpty(m2913e)) {
            this.f16895d = new C8874b(this, mediationBannerListener);
            C8875c.m2914d().m2917a(context, bundle, mediationAdRequest, new C8872b(adColonyAdSizeFromAdMobAdSize, m2913e, mediationBannerListener));
            return;
        }
        AdError createAdapterError2 = AdColonyMediationAdapter.createAdapterError(101, "Failed to request ad: zone ID is null or empty");
        Log.e(AdColonyMediationAdapter.TAG, createAdapterError2.getMessage());
        mediationBannerListener.onAdFailedToLoad(this, createAdapterError2);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(@NonNull Context context, @NonNull MediationInterstitialListener mediationInterstitialListener, @NonNull Bundle bundle, @NonNull MediationAdRequest mediationAdRequest, @Nullable Bundle bundle2) {
        C8875c.m2914d().getClass();
        ArrayList m2912f = C8875c.m2912f(bundle);
        C8875c.m2914d().getClass();
        String m2913e = C8875c.m2913e(m2912f, bundle2);
        if (!TextUtils.isEmpty(m2913e)) {
            this.f16893b = new C8873a(this, mediationInterstitialListener);
            C8875c.m2914d().m2917a(context, bundle, mediationAdRequest, new C8871a(m2913e, mediationInterstitialListener));
            return;
        }
        AdError createAdapterError = AdColonyMediationAdapter.createAdapterError(101, "Missing or invalid Zone ID.");
        Log.e(AdColonyMediationAdapter.TAG, createAdapterError.getMessage());
        mediationInterstitialListener.onAdFailedToLoad(this, createAdapterError);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        C2249q c2249q = this.f16892a;
        if (c2249q != null) {
            c2249q.m9519c();
        }
    }
}
