package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0484a;
import androidx.concurrent.futures.C0486c;
import androidx.fragment.app.C1431t;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.mediation.p011a.C2831h;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.mediation.g */
/* loaded from: classes.dex */
public class C2980g {

    /* renamed from: b */
    private final C3214m f7377b;

    /* renamed from: c */
    private final C3349v f7378c;

    /* renamed from: d */
    private final String f7379d;

    /* renamed from: e */
    private final C2828f f7380e;

    /* renamed from: f */
    private final String f7381f;

    /* renamed from: g */
    private MaxAdapter f7382g;

    /* renamed from: h */
    private String f7383h;

    /* renamed from: i */
    private AbstractC2823a f7384i;

    /* renamed from: j */
    private View f7385j;

    /* renamed from: k */
    private MaxNativeAd f7386k;

    /* renamed from: l */
    private MaxNativeAdView f7387l;

    /* renamed from: n */
    private MaxAdapterResponseParameters f7389n;

    /* renamed from: r */
    private final boolean f7393r;

    /* renamed from: a */
    private final Handler f7376a = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private final C3000a f7388m = new C3000a(this, null);

    /* renamed from: o */
    private final AtomicBoolean f7390o = new AtomicBoolean(true);

    /* renamed from: p */
    private final AtomicBoolean f7391p = new AtomicBoolean(false);

    /* renamed from: q */
    private final AtomicBoolean f7392q = new AtomicBoolean(false);

    /* renamed from: com.applovin.impl.mediation.g$1 */
    /* loaded from: classes.dex */
    public class RunnableC29811 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ MaxAdapterInitializationParameters f7394a;

        /* renamed from: b */
        final /* synthetic */ Activity f7395b;

        /* renamed from: c */
        final /* synthetic */ Runnable f7396c;

        public RunnableC29811(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, Runnable runnable) {
            this.f7394a = maxAdapterInitializationParameters;
            this.f7395b = activity;
            this.f7396c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6855b("MediationAdapterWrapper", "Initializing " + C2980g.this.f7381f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + C2980g.this.f7380e.m8736S());
            }
            C2980g.this.f7382g.initialize(this.f7394a, this.f7395b, new MaxAdapter.OnCompletionListener() { // from class: com.applovin.impl.mediation.g.1.1
                @Override // com.applovin.mediation.adapter.MaxAdapter.OnCompletionListener
                public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
                    AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.g.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            C29821 c29821 = C29821.this;
                            C2980g.this.f7377b.m7484D().m8187a(C2980g.this.f7380e, elapsedRealtime2 - elapsedRealtime, initializationStatus, str);
                            Runnable runnable = RunnableC29811.this.f7396c;
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }, C2980g.this.f7380e.m8731X());
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$a */
    /* loaded from: classes.dex */
    public class C3000a implements MaxAdViewAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {

        /* renamed from: b */
        private MediationServiceImpl.C2819a f7451b;

        private C3000a() {
        }

        public /* synthetic */ C3000a(C2980g c2980g, RunnableC29811 runnableC29811) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8128a(MediationServiceImpl.C2819a c2819a) {
            if (c2819a == null) {
                throw new IllegalArgumentException("No listener specified");
            }
            this.f7451b = c2819a;
        }

        /* renamed from: a */
        private void m8124a(String str, @Nullable final Bundle bundle) {
            C2980g.this.f7392q.set(true);
            m8123a(str, this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C2980g.this.f7391p.compareAndSet(false, true)) {
                        C3000a.this.f7451b.m8814a(C2980g.this.f7384i, bundle);
                    }
                }
            });
        }

        /* renamed from: a */
        private void m8123a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            C2980g.this.f7376a.post(new Runnable() { // from class: com.applovin.impl.mediation.g.a.14
                @Override // java.lang.Runnable
                public void run() {
                    String str2;
                    try {
                        runnable.run();
                    } catch (Exception e) {
                        MaxAdListener maxAdListener2 = maxAdListener;
                        if (maxAdListener2 != null) {
                            str2 = maxAdListener2.getClass().getName();
                        } else {
                            str2 = null;
                        }
                        if (C3349v.m6862a()) {
                            C3349v.m6852c("MediationAdapterWrapper", C1431t.m10577a(new StringBuilder("Failed to forward call ("), str, ") to ", str2), e);
                        }
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8122a(String str, final MaxError maxError) {
            m8123a(str, this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.12
                @Override // java.lang.Runnable
                public void run() {
                    if (C2980g.this.f7391p.compareAndSet(false, true)) {
                        C3000a.this.f7451b.onAdLoadFailed(C2980g.this.f7383h, maxError);
                    }
                }
            });
        }

        /* renamed from: b */
        private void m8120b(String str, @Nullable final Bundle bundle) {
            if (C2980g.this.f7384i.m8785s().compareAndSet(false, true)) {
                m8123a(str, this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.15
                    @Override // java.lang.Runnable
                    public void run() {
                        C3000a.this.f7451b.m8813b(C2980g.this.f7384i, bundle);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public void m8119b(String str, final MaxError maxError) {
            m8123a(str, this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.16
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onAdDisplayFailed(C2980g.this.f7384i, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked() {
            onAdViewAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdClicked(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad clicked with extra info: " + bundle);
            }
            m8123a("onAdViewAdClicked", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.8
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8811d(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdCollapsed() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad collapsed");
            }
            m8123a("onAdViewAdCollapsed", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.11
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onAdCollapsed(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            m8119b("onAdViewAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdDisplayed(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad displayed with extra info: " + bundle);
            }
            m8120b("onAdViewAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdExpanded() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad expanded");
            }
            m8123a("onAdViewAdExpanded", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.10
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onAdExpanded(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden() {
            onAdViewAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdHidden(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad hidden with extra info: " + bundle);
            }
            m8123a("onAdViewAdHidden", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.9
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8812c(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            m8122a("onAdViewAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener
        public void onAdViewAdLoaded(View view, @Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": adview ad loaded with extra info: " + bundle);
            }
            C2980g.this.f7385j = view;
            m8124a("onAdViewAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked() {
            onInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdClicked(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad clicked with extra info: " + bundle);
            }
            m8123a("onInterstitialAdClicked", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.17
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8811d(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            m8119b("onInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdDisplayed(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad displayed with extra info: " + bundle);
            }
            m8120b("onInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden() {
            onInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdHidden(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad hidden with extra info " + bundle);
            }
            m8123a("onInterstitialAdHidden", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.18
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8812c(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            m8122a("onInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener
        public void onInterstitialAdLoaded(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": interstitial ad loaded with extra info: " + bundle);
            }
            m8124a("onInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdClicked() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": native ad clicked");
            }
            m8123a("onNativeAdClicked", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.13
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onAdClicked(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdDisplayed(Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": native ad displayed with extra info: " + bundle);
            }
            m8120b("onNativeAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            m8122a("onNativeAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener
        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": native ad loaded with extra info: " + bundle);
            }
            C2980g.this.f7386k = maxNativeAd;
            m8124a("onNativeAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked() {
            onRewardedAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdClicked(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad clicked with extra info: " + bundle);
            }
            m8123a("onRewardedAdClicked", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.19
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8811d(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            m8119b("onRewardedAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdDisplayed(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad displayed with extra info: " + bundle);
            }
            m8120b("onRewardedAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden() {
            onRewardedAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdHidden(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad hidden with extra info: " + bundle);
            }
            m8123a("onRewardedAdHidden", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.20
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8812c(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m8122a("onRewardedAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded() {
            onRewardedAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdLoaded(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad loaded with extra info: " + bundle);
            }
            m8124a("onRewardedAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoCompleted() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded video completed");
            }
            m8123a("onRewardedAdVideoCompleted", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.3
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onRewardedVideoCompleted(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener
        public void onRewardedAdVideoStarted() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded video started");
            }
            m8123a("onRewardedAdVideoStarted", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.2
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onRewardedVideoStarted(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            m8123a("onRewardedInterstitialAdClicked", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.4
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8811d(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            m8119b("onRewardedInterstitialAdDisplayFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdDisplayed(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            m8120b("onRewardedInterstitialAdDisplayed", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdHidden(final Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            m8123a("onRewardedInterstitialAdHidden", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.5
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.m8812c(C2980g.this.f7384i, bundle);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6851d("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            m8122a("onRewardedInterstitialAdLoadFailed", maxAdapterError);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded(null);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdLoaded(@Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            m8124a("onRewardedInterstitialAdLoaded", bundle);
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoCompleted() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial completed");
            }
            m8123a("onRewardedInterstitialAdVideoCompleted", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.7
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onRewardedVideoCompleted(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onRewardedInterstitialAdVideoStarted() {
            if (C3349v.m6862a()) {
                C3349v c3349v = C2980g.this.f7378c;
                c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": rewarded interstitial started");
            }
            m8123a("onRewardedInterstitialAdVideoStarted", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.6
                @Override // java.lang.Runnable
                public void run() {
                    C3000a.this.f7451b.onRewardedVideoStarted(C2980g.this.f7384i);
                }
            });
        }

        @Override // com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener, com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener
        public void onUserRewarded(final MaxReward maxReward) {
            if (C2980g.this.f7384i instanceof C2825c) {
                final C2825c c2825c = (C2825c) C2980g.this.f7384i;
                if (c2825c.m8767H().compareAndSet(false, true)) {
                    if (C3349v.m6862a()) {
                        C3349v c3349v = C2980g.this.f7378c;
                        c3349v.m6853c("MediationAdapterWrapper", C2980g.this.f7381f + ": user was rewarded: " + maxReward);
                    }
                    m8123a("onUserRewarded", this.f7451b, new Runnable() { // from class: com.applovin.impl.mediation.g.a.21
                        @Override // java.lang.Runnable
                        public void run() {
                            C3000a.this.f7451b.onUserRewarded(c2825c, maxReward);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$b */
    /* loaded from: classes.dex */
    public static class C3022b {

        /* renamed from: a */
        private final C2831h f7490a;

        /* renamed from: b */
        private final MaxSignalCollectionListener f7491b;

        /* renamed from: c */
        private final AtomicBoolean f7492c = new AtomicBoolean();

        public C3022b(C2831h c2831h, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f7490a = c2831h;
            this.f7491b = maxSignalCollectionListener;
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$c */
    /* loaded from: classes.dex */
    public class C3023c extends AbstractRunnableC3131a {
        private C3023c() {
            super("TaskTimeoutMediatedAd", C2980g.this.f7377b);
        }

        public /* synthetic */ C3023c(C2980g c2980g, RunnableC29811 runnableC29811) {
            this();
        }

        /* renamed from: a */
        private void m8115a(AbstractC2823a abstractC2823a) {
            if (abstractC2823a != null) {
                this.f8192b.m7480H().m8114a(abstractC2823a);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2980g.this.f7391p.get()) {
                return;
            }
            if (C2980g.this.f7384i.m8793k()) {
                if (C3349v.m6862a()) {
                    m7705a(C2980g.this.f7381f + " is timing out, considering JS Tag ad loaded: " + C2980g.this.f7384i);
                }
                m8115a(C2980g.this.f7384i);
                return;
            }
            if (C3349v.m6862a()) {
                m7700d(C2980g.this.f7381f + " is timing out " + C2980g.this.f7384i + "...");
            }
            m8115a(C2980g.this.f7384i);
            C2980g.this.f7388m.m8122a(m7699e(), new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.g$d */
    /* loaded from: classes.dex */
    public class C3024d extends AbstractRunnableC3131a {

        /* renamed from: c */
        private final C3022b f7495c;

        private C3024d(C3022b c3022b) {
            super("TaskTimeoutSignalCollection", C2980g.this.f7377b);
            this.f7495c = c3022b;
        }

        public /* synthetic */ C3024d(C2980g c2980g, C3022b c3022b, RunnableC29811 runnableC29811) {
            this(c3022b);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7495c.f7492c.get()) {
                return;
            }
            if (C3349v.m6862a()) {
                m7700d(C2980g.this.f7381f + " is timing out " + this.f7495c.f7490a + "...");
            }
            C2980g c2980g = C2980g.this;
            c2980g.m8148b("The adapter (" + C2980g.this.f7381f + ") timed out", this.f7495c);
        }
    }

    public C2980g(C2828f c2828f, MaxAdapter maxAdapter, boolean z, C3214m c3214m) {
        if (c2828f == null) {
            throw new IllegalArgumentException("No adapter name specified");
        }
        if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        this.f7379d = c2828f.m8743L();
        this.f7382g = maxAdapter;
        this.f7377b = c3214m;
        this.f7378c = c3214m.m7487A();
        this.f7380e = c2828f;
        this.f7381f = maxAdapter.getClass().getSimpleName();
        this.f7393r = z;
    }

    /* renamed from: a */
    private void m8158a(final Runnable runnable, final AbstractC2823a abstractC2823a) {
        m8153a("show_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.5
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad" + abstractC2823a + " : " + th;
                    if (C3349v.m6862a()) {
                        C3349v.m6846i("MediationAdapterWrapper", str);
                    }
                    C2980g.this.f7388m.m8119b("show_ad", new MaxErrorImpl(-1, str));
                    C2980g.this.m8157a("show_ad");
                    C2980g.this.f7377b.m7485C().m8175a(C2980g.this.f7380e.m8744K(), "show_ad", C2980g.this.f7384i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8155a(String str, C3022b c3022b) {
        if (!c3022b.f7492c.compareAndSet(false, true) || c3022b.f7491b == null) {
            return;
        }
        c3022b.f7491b.onSignalCollected(str);
    }

    /* renamed from: a */
    private void m8153a(final String str, final Runnable runnable) {
        Runnable runnable2 = new Runnable() { // from class: com.applovin.impl.mediation.g.8
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C3349v.m6862a()) {
                        C3349v c3349v = C2980g.this.f7378c;
                        c3349v.m6855b("MediationAdapterWrapper", C2980g.this.f7381f + ": running " + str + "...");
                    }
                    runnable.run();
                    if (C3349v.m6862a()) {
                        C3349v c3349v2 = C2980g.this.f7378c;
                        c3349v2.m6855b("MediationAdapterWrapper", C2980g.this.f7381f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("MediationAdapterWrapper", "Unable to run adapter operation " + str + ", marking " + C2980g.this.f7381f + " as disabled", th);
                    }
                    C2980g c2980g = C2980g.this;
                    c2980g.m8157a("fail_" + str);
                    if (str.equals("destroy")) {
                        return;
                    }
                    C2980g.this.f7377b.m7485C().m8175a(C2980g.this.f7380e.m8744K(), str, C2980g.this.f7384i);
                }
            }
        };
        if (this.f7380e.m8736S()) {
            this.f7376a.post(runnable2);
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8148b(String str, C3022b c3022b) {
        if (!c3022b.f7492c.compareAndSet(false, true) || c3022b.f7491b == null) {
            return;
        }
        c3022b.f7491b.onSignalCollectionFailed(str);
    }

    /* renamed from: b */
    private boolean m8151b(AbstractC2823a abstractC2823a, Activity activity) {
        if (abstractC2823a != null) {
            if (abstractC2823a.m8797g() == null) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i("MediationAdapterWrapper", "Adapter has been garbage collected");
                }
                this.f7388m.m8119b("ad_show", new MaxErrorImpl(-1, "Adapter has been garbage collected"));
                return false;
            } else if (abstractC2823a.m8797g() == this) {
                if (activity != null) {
                    if (!this.f7390o.get()) {
                        String m12392a = C0484a.m12392a(new StringBuilder("Mediation adapter '"), this.f7381f, "' is disabled. Showing ads with this adapter is disabled.");
                        if (C3349v.m6862a()) {
                            C3349v.m6846i("MediationAdapterWrapper", m12392a);
                        }
                        this.f7388m.m8119b("ad_show", new MaxErrorImpl(-1, m12392a));
                        return false;
                    } else if (m8139g()) {
                        return true;
                    } else {
                        throw new IllegalStateException(C0484a.m12392a(new StringBuilder("Mediation adapter '"), this.f7381f, "' does not have an ad loaded. Please load an ad first"));
                    }
                }
                throw new IllegalArgumentException("No activity specified");
            } else {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            }
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    /* renamed from: a */
    public View m8171a() {
        return this.f7385j;
    }

    /* renamed from: a */
    public void m8170a(AbstractC2823a abstractC2823a, final Activity activity) {
        Runnable runnable;
        if (m8151b(abstractC2823a, activity)) {
            if (abstractC2823a.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.15
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdapter) C2980g.this.f7382g).showInterstitialAd(C2980g.this.f7389n, activity, C2980g.this.f7388m);
                    }
                };
            } else if (abstractC2823a.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.16
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdapter) C2980g.this.f7382g).showRewardedAd(C2980g.this.f7389n, activity, C2980g.this.f7388m);
                    }
                };
            } else if (abstractC2823a.getFormat() != MaxAdFormat.REWARDED_INTERSTITIAL) {
                throw new IllegalStateException("Failed to show " + abstractC2823a + ": " + abstractC2823a.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) C2980g.this.f7382g).showRewardedInterstitialAd(C2980g.this.f7389n, activity, C2980g.this.f7388m);
                    }
                };
            }
            m8158a(runnable, abstractC2823a);
        }
    }

    /* renamed from: a */
    public void m8169a(AbstractC2823a abstractC2823a, final ViewGroup viewGroup, final AbstractC1464h abstractC1464h, final Activity activity) {
        Runnable runnable;
        if (m8151b(abstractC2823a, activity)) {
            if (abstractC2823a.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.3
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) C2980g.this.f7382g).showInterstitialAd(C2980g.this.f7389n, viewGroup, abstractC1464h, activity, C2980g.this.f7388m);
                    }
                };
            } else if (abstractC2823a.getFormat() != MaxAdFormat.REWARDED) {
                throw new IllegalStateException("Failed to show " + abstractC2823a + ": " + abstractC2823a.getFormat() + " is not a supported ad format");
            } else {
                runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.4
                    @Override // java.lang.Runnable
                    public void run() {
                        ((MaxRewardedAdViewAdapter) C2980g.this.f7382g).showRewardedAd(C2980g.this.f7389n, viewGroup, abstractC1464h, activity, C2980g.this.f7388m);
                    }
                };
            }
            m8158a(runnable, abstractC2823a);
        }
    }

    /* renamed from: a */
    public void m8161a(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, @Nullable Runnable runnable) {
        m8153a("initialize", new RunnableC29811(maxAdapterInitializationParameters, activity, runnable));
    }

    /* renamed from: a */
    public void m8160a(final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, final C2831h c2831h, final Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        if (this.f7390o.get()) {
            final C3022b c3022b = new C3022b(c2831h, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f7382g;
            if (!(maxAdapter instanceof MaxSignalProvider)) {
                m8148b(C0484a.m12392a(new StringBuilder("The adapter ("), this.f7381f, ") does not support signal collection"), c3022b);
                return;
            }
            final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
            m8153a("collect_signal", new Runnable() { // from class: com.applovin.impl.mediation.g.6
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters, activity, new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.g.6.1
                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollected(String str) {
                                RunnableC29956 runnableC29956 = RunnableC29956.this;
                                C2980g.this.m8155a(str, c3022b);
                            }

                            @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                            public void onSignalCollectionFailed(String str) {
                                RunnableC29956 runnableC29956 = RunnableC29956.this;
                                C2980g.this.m8148b(str, c3022b);
                            }
                        });
                    } catch (Throwable th) {
                        C2980g c2980g = C2980g.this;
                        c2980g.m8148b("Failed signal collection for " + C2980g.this.f7379d + " due to exception: " + th, c3022b);
                        C2980g.this.m8157a("collect_signal");
                        C2980g.this.f7377b.m7485C().m8175a(C2980g.this.f7380e.m8744K(), "collect_signal", C2980g.this.f7384i);
                    }
                    if (c3022b.f7492c.get()) {
                        return;
                    }
                    if (c2831h.m8732W() == 0) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v = C2980g.this.f7378c;
                            c3349v.m6855b("MediationAdapterWrapper", "Failing signal collection " + c2831h + " since it has 0 timeout");
                        }
                        C2980g c2980g2 = C2980g.this;
                        c2980g2.m8148b("The adapter (" + C2980g.this.f7381f + ") has 0 timeout", c3022b);
                    } else if (c2831h.m8732W() <= 0) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v2 = C2980g.this.f7378c;
                            c3349v2.m6855b("MediationAdapterWrapper", "Negative timeout set for " + c2831h + ", not scheduling a timeout");
                        }
                    } else {
                        if (C3349v.m6862a()) {
                            C3349v c3349v3 = C2980g.this.f7378c;
                            c3349v3.m6855b("MediationAdapterWrapper", "Setting timeout " + c2831h.m8732W() + "ms. for " + c2831h);
                        }
                        C2980g.this.f7377b.m7469S().m7619a(new C3024d(C2980g.this, c3022b, null), C3163o.EnumC3165a.MEDIATION_TIMEOUT, c2831h.m8732W());
                    }
                }
            });
            return;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("MediationAdapterWrapper", "Mediation adapter '" + this.f7381f + "' is disabled. Signal collection ads with this adapter is disabled.");
        }
        maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f7381f + ") is disabled");
    }

    /* renamed from: a */
    public void m8159a(MaxNativeAdView maxNativeAdView) {
        this.f7387l = maxNativeAdView;
    }

    /* renamed from: a */
    public void m8156a(String str, AbstractC2823a abstractC2823a) {
        this.f7383h = str;
        this.f7384i = abstractC2823a;
    }

    /* renamed from: b */
    public MaxNativeAd m8152b() {
        return this.f7386k;
    }

    @Nullable
    /* renamed from: c */
    public MaxNativeAdView m8147c() {
        return this.f7387l;
    }

    /* renamed from: d */
    public String m8145d() {
        return this.f7379d;
    }

    /* renamed from: e */
    public MediationServiceImpl.C2819a m8143e() {
        return this.f7388m.f7451b;
    }

    /* renamed from: f */
    public boolean m8141f() {
        return this.f7390o.get();
    }

    /* renamed from: g */
    public boolean m8139g() {
        return this.f7391p.get() && this.f7392q.get();
    }

    /* renamed from: h */
    public String m8137h() {
        MaxAdapter maxAdapter = this.f7382g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getSdkVersion();
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    C3349v.m6852c("MediationAdapterWrapper", "Unable to get adapter's SDK version, marking " + this + " as disabled", th);
                }
                m8157a("sdk_version");
                this.f7377b.m7485C().m8175a(this.f7380e.m8744K(), "sdk_version", this.f7384i);
                return null;
            }
        }
        return null;
    }

    /* renamed from: i */
    public String m8135i() {
        MaxAdapter maxAdapter = this.f7382g;
        if (maxAdapter != null) {
            try {
                return maxAdapter.getAdapterVersion();
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    C3349v.m6852c("MediationAdapterWrapper", "Unable to get adapter version, marking " + this + " as disabled", th);
                }
                m8157a("adapter_version");
                this.f7377b.m7485C().m8175a(this.f7380e.m8744K(), "adapter_version", this.f7384i);
                return null;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m8133j() {
        if (this.f7393r) {
            return;
        }
        m8153a("destroy", new Runnable() { // from class: com.applovin.impl.mediation.g.7
            @Override // java.lang.Runnable
            public void run() {
                C2980g.this.m8157a("destroy");
                C2980g.this.f7382g.onDestroy();
                C2980g.this.f7382g = null;
                C2980g.this.f7385j = null;
                C2980g.this.f7386k = null;
                C2980g.this.f7387l = null;
            }
        });
    }

    public String toString() {
        return C0484a.m12392a(new StringBuilder("MediationAdapterWrapper{adapterTag='"), this.f7381f, "'}");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8157a(String str) {
        if (C3349v.m6862a()) {
            this.f7378c.m6853c("MediationAdapterWrapper", C1431t.m10577a(new StringBuilder("Marking "), this.f7381f, " as disabled due to: ", str));
        }
        this.f7390o.set(false);
    }

    /* renamed from: a */
    public void m8154a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final AbstractC2823a abstractC2823a, final Activity activity, MediationServiceImpl.C2819a c2819a) {
        final Runnable runnable;
        if (abstractC2823a == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (!this.f7390o.get()) {
            String m12392a = C0484a.m12392a(new StringBuilder("Mediation adapter '"), this.f7381f, "' was disabled due to earlier failures. Loading ads with this adapter is disabled.");
            if (C3349v.m6862a()) {
                C3349v.m6846i("MediationAdapterWrapper", m12392a);
            }
            c2819a.onAdLoadFailed(str, new MaxErrorImpl(-1, m12392a));
            return;
        }
        this.f7389n = maxAdapterResponseParameters;
        this.f7388m.m8128a(c2819a);
        if (abstractC2823a.getFormat() == MaxAdFormat.INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.9
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxInterstitialAdapter) C2980g.this.f7382g).loadInterstitialAd(maxAdapterResponseParameters, activity, C2980g.this.f7388m);
                }
            };
        } else if (abstractC2823a.getFormat() == MaxAdFormat.REWARDED) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.10
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedAdapter) C2980g.this.f7382g).loadRewardedAd(maxAdapterResponseParameters, activity, C2980g.this.f7388m);
                }
            };
        } else if (abstractC2823a.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.11
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxRewardedInterstitialAdapter) C2980g.this.f7382g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, C2980g.this.f7388m);
                }
            };
        } else if (abstractC2823a.getFormat() == MaxAdFormat.NATIVE) {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.12
                @Override // java.lang.Runnable
                public void run() {
                    ((MediationAdapterBase) C2980g.this.f7382g).loadNativeAd(maxAdapterResponseParameters, activity, C2980g.this.f7388m);
                }
            };
        } else if (!abstractC2823a.getFormat().isAdViewAd()) {
            throw new IllegalStateException("Failed to load " + abstractC2823a + ": " + abstractC2823a.getFormat() + " is not a supported ad format");
        } else {
            runnable = new Runnable() { // from class: com.applovin.impl.mediation.g.13
                @Override // java.lang.Runnable
                public void run() {
                    ((MaxAdViewAdapter) C2980g.this.f7382g).loadAdViewAd(maxAdapterResponseParameters, abstractC2823a.getFormat(), activity, C2980g.this.f7388m);
                }
            };
        }
        m8153a("load_ad", new Runnable() { // from class: com.applovin.impl.mediation.g.14
            @Override // java.lang.Runnable
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str2 = "Failed start loading " + abstractC2823a + " : " + th;
                    if (C3349v.m6862a()) {
                        C3349v.m6846i("MediationAdapterWrapper", str2);
                    }
                    C2980g.this.f7388m.m8122a("load_ad", new MaxErrorImpl(-1, str2));
                    C2980g.this.m8157a("load_ad");
                    C2980g.this.f7377b.m7485C().m8175a(C2980g.this.f7380e.m8744K(), "load_ad", C2980g.this.f7384i);
                }
                if (!C2980g.this.f7391p.get()) {
                    long m8732W = C2980g.this.f7380e.m8732W();
                    if (m8732W > 0) {
                        if (C3349v.m6862a()) {
                            C3349v c3349v = C2980g.this.f7378c;
                            StringBuilder m12390a = C0486c.m12390a("Setting timeout ", m8732W, "ms. for ");
                            m12390a.append(abstractC2823a);
                            c3349v.m6855b("MediationAdapterWrapper", m12390a.toString());
                        }
                        C2980g.this.f7377b.m7469S().m7619a(new C3023c(C2980g.this, null), C3163o.EnumC3165a.MEDIATION_TIMEOUT, m8732W);
                    } else if (C3349v.m6862a()) {
                        C2980g.this.f7378c.m6855b("MediationAdapterWrapper", "Negative timeout set for " + abstractC2823a + ", not scheduling a timeout");
                    }
                }
            }
        });
    }
}
