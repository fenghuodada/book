package com.applovin.impl.sdk.p030b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.activity.result.C0063d;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.C3086f;
import com.applovin.impl.sdk.p029ad.InterfaceC3087g;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p033e.C3133aa;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3182v;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.a */
/* loaded from: classes.dex */
public class C3091a {

    /* renamed from: a */
    protected final C3214m f7704a;

    /* renamed from: b */
    protected final AppLovinAdServiceImpl f7705b;

    /* renamed from: c */
    private AppLovinAd f7706c;

    /* renamed from: d */
    private String f7707d;

    /* renamed from: e */
    private SoftReference<AppLovinAdLoadListener> f7708e;

    /* renamed from: g */
    private volatile String f7710g;

    /* renamed from: f */
    private final Object f7709f = new Object();

    /* renamed from: h */
    private volatile boolean f7711h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a */
    /* loaded from: classes.dex */
    public class C3093a implements AppLovinAdLoadListener {

        /* renamed from: b */
        private final AppLovinAdLoadListener f7714b;

        public C3093a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f7714b = appLovinAdLoadListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            C3091a.this.f7706c = appLovinAd;
            if (this.f7714b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C3093a.this.f7714b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            if (C3349v.m6862a()) {
                                C3349v.m6852c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                            }
                        }
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f7714b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.b.a.a.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            C3093a.this.f7714b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            if (C3349v.m6862a()) {
                                C3349v.m6852c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                            }
                        }
                    }
                });
            }
        }
    }

    /* renamed from: com.applovin.impl.sdk.b.a$b */
    /* loaded from: classes.dex */
    public class C3096b implements InterfaceC3087g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b */
        private final AppLovinAdDisplayListener f7720b;

        /* renamed from: c */
        private final AppLovinAdClickListener f7721c;

        /* renamed from: d */
        private final AppLovinAdVideoPlaybackListener f7722d;

        /* renamed from: e */
        private final AppLovinAdRewardListener f7723e;

        private C3096b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f7720b = appLovinAdDisplayListener;
            this.f7721c = appLovinAdClickListener;
            this.f7722d = appLovinAdVideoPlaybackListener;
            this.f7723e = appLovinAdRewardListener;
        }

        /* renamed from: a */
        private void m7837a(AbstractC3080e abstractC3080e) {
            String str;
            int i;
            String m7840d = C3091a.this.m7840d();
            if (!StringUtils.isValidString(m7840d) || !C3091a.this.f7711h) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = C3091a.this.f7704a.m7487A();
                    StringBuilder m13052b = C0063d.m13052b("Invalid reward state - result: ", m7840d, " and wasFullyEngaged: ");
                    m13052b.append(C3091a.this.f7711h);
                    m7487A.m6850e("IncentivizedAdController", m13052b.toString());
                    C3091a.this.f7704a.m7487A().m6855b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                abstractC3080e.m7936aF();
                if (C3091a.this.f7711h) {
                    if (C3349v.m6862a()) {
                        C3091a.this.f7704a.m7487A().m6850e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (C3349v.m6862a()) {
                        C3091a.this.f7704a.m7487A().m6850e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    str = "user_closed_video";
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                abstractC3080e.m7943a(C3105c.m7823a(str));
                if (C3349v.m6862a()) {
                    C3091a.this.f7704a.m7487A().m6855b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                C3298j.m6965a(this.f7723e, abstractC3080e, i);
            }
            C3091a.this.m7853a(abstractC3080e);
            if (C3349v.m6862a()) {
                C3091a.this.f7704a.m7487A().m6855b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            C3298j.m6955b(this.f7720b, abstractC3080e);
            if (!abstractC3080e.m7923ag().getAndSet(true)) {
                if (C3349v.m6862a()) {
                    C3091a.this.f7704a.m7487A().m6855b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                C3091a.this.f7704a.m7469S().m7620a(new C3182v(abstractC3080e, C3091a.this.f7704a), C3163o.EnumC3165a.REWARD);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            C3298j.m6968a(this.f7721c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            C3298j.m6967a(this.f7720b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof C3086f) {
                appLovinAd = ((C3086f) appLovinAd).m7872a();
            }
            if (appLovinAd instanceof AbstractC3080e) {
                m7837a((AbstractC3080e) appLovinAd);
            } else if (C3349v.m6862a()) {
                C3349v m7487A = C3091a.this.f7704a.m7487A();
                m7487A.m6850e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        @Override // com.applovin.impl.sdk.p029ad.InterfaceC3087g
        public void onAdDisplayFailed(String str) {
            C3298j.m6966a(this.f7720b, str);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            C3091a.this.m7847a("quota_exceeded");
            C3298j.m6954b(this.f7723e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            C3091a.this.m7847a("rejected");
            C3298j.m6950c(this.f7723e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            C3091a.this.m7847a("accepted");
            C3298j.m6964a(this.f7723e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C3091a.this.m7847a("network_timeout");
            C3298j.m6965a(this.f7723e, appLovinAd, i);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            C3298j.m6963a(this.f7722d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            C3298j.m6962a(this.f7722d, appLovinAd, d, z);
            C3091a.this.f7711h = z;
        }
    }

    public C3091a(String str, AppLovinSdk appLovinSdk) {
        this.f7704a = appLovinSdk.coreSdk;
        this.f7705b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f7707d = str;
    }

    /* renamed from: a */
    private void m7860a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f7704a.m7487A();
                m7487A.m6850e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            m7849a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f7704a);
        if (maybeRetrieveNonDummyAd == null) {
            m7849a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f7704a.m7463Y(), context);
        C3096b c3096b = new C3096b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(c3096b);
        create.setAdVideoPlaybackListener(c3096b);
        create.setAdClickListener(c3096b);
        create.showAndRender(maybeRetrieveNonDummyAd);
        if (maybeRetrieveNonDummyAd instanceof AbstractC3080e) {
            m7858a((AbstractC3080e) maybeRetrieveNonDummyAd, c3096b);
        }
    }

    /* renamed from: a */
    private void m7859a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() != AppLovinAdType.INCENTIVIZED && appLovinAdImpl.getType() != AppLovinAdType.AUTO_INCENTIVIZED) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f7704a.m7487A();
                m7487A.m6850e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
            }
            m7849a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f7704a);
        if (maybeRetrieveNonDummyAd == null) {
            m7849a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
            return;
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f7704a.m7463Y(), context);
        C3096b c3096b = new C3096b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        create.setAdDisplayListener(c3096b);
        create.setAdVideoPlaybackListener(c3096b);
        create.setAdClickListener(c3096b);
        create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, abstractC1464h);
        if (maybeRetrieveNonDummyAd instanceof AbstractC3080e) {
            m7858a((AbstractC3080e) maybeRetrieveNonDummyAd, c3096b);
        }
    }

    /* renamed from: a */
    private void m7858a(AbstractC3080e abstractC3080e, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f7704a.m7469S().m7620a(new C3133aa(abstractC3080e, appLovinAdRewardListener, this.f7704a), C3163o.EnumC3165a.REWARD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7853a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f7706c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof C3086f) {
                if (appLovinAd != ((C3086f) appLovinAd2).m7872a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f7706c = null;
        }
    }

    /* renamed from: a */
    private void m7852a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f7706c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            m7860a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m7841c();
    }

    /* renamed from: a */
    private void m7849a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f7704a.m7468T().m7719a(C3125f.f8170j);
        C3298j.m6962a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        C3298j.m6955b(appLovinAdDisplayListener, appLovinAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7847a(String str) {
        synchronized (this.f7709f) {
            this.f7710g = str;
        }
    }

    /* renamed from: b */
    private void m7843b(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f7706c;
        if (appLovinAdImpl != null) {
            m7859a(appLovinAdImpl, viewGroup, abstractC1464h, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        }
        m7841c();
    }

    /* renamed from: b */
    private void m7842b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f7705b.loadNextIncentivizedAd(this.f7707d, appLovinAdLoadListener);
    }

    /* renamed from: c */
    private void m7841c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f7708e;
        if (softReference == null || (appLovinAdLoadListener = softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public String m7840d() {
        String str;
        synchronized (this.f7709f) {
            str = this.f7710g;
        }
        return str;
    }

    /* renamed from: e */
    private AppLovinAdRewardListener m7839e() {
        return new AppLovinAdRewardListener() { // from class: com.applovin.impl.sdk.b.a.1
            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = C3091a.this.f7704a.m7487A();
                    m7487A.m6850e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = C3091a.this.f7704a.m7487A();
                    m7487A.m6850e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = C3091a.this.f7704a.m7487A();
                    m7487A.m6855b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            @Override // com.applovin.sdk.AppLovinAdRewardListener
            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = C3091a.this.f7704a.m7487A();
                    m7487A.m6850e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }

    /* renamed from: a */
    public void m7851a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m7839e();
        }
        m7852a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void m7850a(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        m7843b(appLovinAd, viewGroup, abstractC1464h, context, appLovinAdRewardListener == null ? m7839e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* renamed from: a */
    public void m7848a(AppLovinAdLoadListener appLovinAdLoadListener) {
        if (C3349v.m6862a()) {
            this.f7704a.m7487A().m6855b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f7708e = new SoftReference<>(appLovinAdLoadListener);
        if (!m7861a()) {
            m7842b(new C3093a(appLovinAdLoadListener));
            return;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        }
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f7706c);
        }
    }

    /* renamed from: a */
    public boolean m7861a() {
        return this.f7706c != null;
    }

    /* renamed from: b */
    public String m7846b() {
        return this.f7707d;
    }
}
