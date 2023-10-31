package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.concurrent.futures.C0484a;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.impl.mediation.C2857b;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3088b;
import com.applovin.impl.sdk.C3127e;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class MaxFullscreenAdImpl extends AbstractC2854a implements C3088b.InterfaceC3090a, C3127e.InterfaceC3130a {

    /* renamed from: a */
    private final InterfaceC2843a f6841a;

    /* renamed from: b */
    private final C3088b f6842b;

    /* renamed from: c */
    private final C2857b f6843c;

    /* renamed from: d */
    private final Object f6844d;

    /* renamed from: e */
    private C2825c f6845e;

    /* renamed from: f */
    private EnumC2850c f6846f;

    /* renamed from: g */
    private final AtomicBoolean f6847g;

    /* renamed from: h */
    private boolean f6848h;

    /* renamed from: i */
    private boolean f6849i;

    /* renamed from: j */
    private WeakReference<Activity> f6850j;

    /* renamed from: k */
    private WeakReference<ViewGroup> f6851k;

    /* renamed from: l */
    private WeakReference<AbstractC1464h> f6852l;
    protected final C2844b listenerWrapper;

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2843a {
        Activity getActivity();
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    /* loaded from: classes.dex */
    public class C2844b implements AbstractC2854a.InterfaceC2855a, MaxAdListener, MaxAdRevenueListener, MaxRewardedAdListener {
        private C2844b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C3298j.m6948d(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final boolean z = MaxFullscreenAdImpl.this.f6849i;
            MaxFullscreenAdImpl.this.f6849i = false;
            final C2825c c2825c = (C2825c) maxAd;
            MaxFullscreenAdImpl.this.m8647a(EnumC2850c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.m8639a(maxAd);
                    if (!z && c2825c.m8773B() && MaxFullscreenAdImpl.this.sdk.m7479I().m8485a(MaxFullscreenAdImpl.this.adUnitId)) {
                        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MaxFullscreenAdImpl.this.f6849i = true;
                                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                                maxFullscreenAdImpl.loadAd(maxFullscreenAdImpl.f6841a.getActivity());
                            }
                        });
                    } else {
                        C3298j.m6982a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
                    }
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f6849i = false;
            MaxFullscreenAdImpl.this.f6842b.m7867a();
            C3298j.m6957b(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f6849i = false;
            MaxFullscreenAdImpl.this.f6843c.m8601a(maxAd);
            MaxFullscreenAdImpl.this.m8647a(EnumC2850c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.m8639a(maxAd);
                    C3298j.m6951c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.m8637b();
            MaxFullscreenAdImpl.this.m8647a(EnumC2850c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C3298j.m6977a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m8648a((C2825c) maxAd);
            if (MaxFullscreenAdImpl.this.f6847g.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            } else {
                MaxFullscreenAdImpl.this.m8647a(EnumC2850c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.b.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!MaxFullscreenAdImpl.this.f6849i) {
                            C3298j.m6979a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                            return;
                        }
                        Activity activity = (Activity) MaxFullscreenAdImpl.this.f6850j.get();
                        if (activity == null) {
                            activity = MaxFullscreenAdImpl.this.sdk.m7426an();
                        }
                        Activity activity2 = activity;
                        if (MaxFullscreenAdImpl.this.f6848h) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            maxFullscreenAdImpl.showAd(maxFullscreenAdImpl.f6845e.getPlacement(), MaxFullscreenAdImpl.this.f6845e.m8729Z(), (ViewGroup) MaxFullscreenAdImpl.this.f6851k.get(), (AbstractC1464h) MaxFullscreenAdImpl.this.f6852l.get(), activity2);
                            return;
                        }
                        MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                        maxFullscreenAdImpl2.showAd(maxFullscreenAdImpl2.f6845e.getPlacement(), MaxFullscreenAdImpl.this.f6845e.m8729Z(), activity2);
                    }
                });
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C3298j.m6976a(MaxFullscreenAdImpl.this.revenueListener, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C3298j.m6944f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            C3298j.m6946e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C3298j.m6980a(MaxFullscreenAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    /* loaded from: classes.dex */
    public enum EnumC2850c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, InterfaceC2843a interfaceC2843a, String str2, C3214m c3214m) {
        super(str, maxAdFormat, str2, c3214m);
        this.f6844d = new Object();
        this.f6845e = null;
        this.f6846f = EnumC2850c.IDLE;
        this.f6847g = new AtomicBoolean();
        this.f6850j = new WeakReference<>(null);
        this.f6851k = new WeakReference<>(null);
        this.f6852l = new WeakReference<>(null);
        this.f6841a = interfaceC2843a;
        C2844b c2844b = new C2844b();
        this.listenerWrapper = c2844b;
        this.f6842b = new C3088b(c3214m, this);
        this.f6843c = new C2857b(c3214m, c2844b);
        c3214m.m7486B().m7712a(this);
        if (C3349v.m6862a()) {
            C3349v.m6849f(str2, "Created new " + str2 + " (" + this + ")");
        }
    }

    /* renamed from: a */
    private void m8650a() {
        C2825c c2825c;
        synchronized (this.f6844d) {
            c2825c = this.f6845e;
            this.f6845e = null;
        }
        this.sdk.m7483E().destroyAd(c2825c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8648a(C2825c c2825c) {
        long m8765u = c2825c.m8765u() - (SystemClock.elapsedRealtime() - c2825c.m8787q());
        if (m8765u <= TimeUnit.SECONDS.toMillis(2L)) {
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired();
            return;
        }
        this.f6845e = c2825c;
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Handle ad loaded for regular ad: " + c2825c);
            C3349v c3349v2 = this.logger;
            String str2 = this.tag;
            c3349v2.m6855b(str2, "Scheduling ad expiration " + TimeUnit.MILLISECONDS.toSeconds(m8765u) + " seconds from now for " + getAdUnitId() + "...");
        }
        this.f6842b.m7866a(m8765u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8647a(EnumC2850c enumC2850c, Runnable runnable) {
        boolean z;
        C3349v c3349v;
        String str;
        String str2;
        String str3;
        String str4;
        EnumC2850c enumC2850c2 = this.f6846f;
        synchronized (this.f6844d) {
            EnumC2850c enumC2850c3 = EnumC2850c.IDLE;
            z = true;
            if (enumC2850c2 != enumC2850c3) {
                EnumC2850c enumC2850c4 = EnumC2850c.LOADING;
                if (enumC2850c2 != enumC2850c4) {
                    EnumC2850c enumC2850c5 = EnumC2850c.READY;
                    if (enumC2850c2 != enumC2850c5) {
                        EnumC2850c enumC2850c6 = EnumC2850c.SHOWING;
                        if (enumC2850c2 != enumC2850c6) {
                            if (enumC2850c2 == EnumC2850c.DESTROYED) {
                                if (C3349v.m6862a()) {
                                    str3 = this.tag;
                                    str4 = "No operations are allowed on a destroyed instance";
                                    C3349v.m6846i(str3, str4);
                                }
                            } else if (C3349v.m6862a()) {
                                c3349v = this.logger;
                                str = this.tag;
                                str2 = "Unknown state: " + this.f6846f;
                                c3349v.m6850e(str, str2);
                            }
                            z = false;
                        } else if (enumC2850c != enumC2850c3) {
                            if (enumC2850c == enumC2850c4) {
                                if (C3349v.m6862a()) {
                                    str3 = this.tag;
                                    str4 = "Can not load another ad while the ad is showing";
                                    C3349v.m6846i(str3, str4);
                                }
                                z = false;
                            } else {
                                if (enumC2850c == enumC2850c5) {
                                    if (C3349v.m6862a()) {
                                        c3349v = this.logger;
                                        str = this.tag;
                                        str2 = "An ad is already showing, ignoring";
                                        c3349v.m6850e(str, str2);
                                    }
                                } else if (enumC2850c == enumC2850c6) {
                                    if (C3349v.m6862a()) {
                                        str3 = this.tag;
                                        str4 = "The ad is already showing, not showing another one";
                                        C3349v.m6846i(str3, str4);
                                    }
                                } else if (enumC2850c != EnumC2850c.DESTROYED) {
                                    if (C3349v.m6862a()) {
                                        this.logger.m6850e(this.tag, "Unable to transition to: " + enumC2850c);
                                    }
                                }
                                z = false;
                            }
                        }
                    } else if (enumC2850c != enumC2850c3) {
                        if (enumC2850c == enumC2850c4) {
                            if (C3349v.m6862a()) {
                                str3 = this.tag;
                                str4 = "An ad is already loaded";
                                C3349v.m6846i(str3, str4);
                            }
                        } else if (enumC2850c == enumC2850c5) {
                            if (C3349v.m6862a()) {
                                c3349v = this.logger;
                                str = this.tag;
                                str2 = "An ad is already marked as ready";
                                c3349v.m6850e(str, str2);
                            }
                        } else if (enumC2850c != EnumC2850c.SHOWING && enumC2850c != EnumC2850c.DESTROYED) {
                            if (C3349v.m6862a()) {
                                this.logger.m6850e(this.tag, "Unable to transition to: " + enumC2850c);
                            }
                        }
                        z = false;
                    }
                } else if (enumC2850c != enumC2850c3) {
                    if (enumC2850c == enumC2850c4) {
                        if (C3349v.m6862a()) {
                            str3 = this.tag;
                            str4 = "An ad is already loading";
                            C3349v.m6846i(str3, str4);
                        }
                        z = false;
                    } else if (enumC2850c != EnumC2850c.READY) {
                        if (enumC2850c == EnumC2850c.SHOWING) {
                            if (C3349v.m6862a()) {
                                str3 = this.tag;
                                str4 = "An ad is not ready to be shown yet";
                                C3349v.m6846i(str3, str4);
                            }
                        } else if (enumC2850c != EnumC2850c.DESTROYED) {
                            if (C3349v.m6862a()) {
                                c3349v = this.logger;
                                str = this.tag;
                                str2 = "Unable to transition to: " + enumC2850c;
                                c3349v.m6850e(str, str2);
                            }
                        }
                        z = false;
                    }
                }
            } else if (enumC2850c != EnumC2850c.LOADING && enumC2850c != EnumC2850c.DESTROYED) {
                if (enumC2850c == EnumC2850c.SHOWING) {
                    if (C3349v.m6862a()) {
                        str3 = this.tag;
                        str4 = "No ad is loading or loaded";
                        C3349v.m6846i(str3, str4);
                    }
                } else if (C3349v.m6862a()) {
                    c3349v = this.logger;
                    str = this.tag;
                    str2 = "Unable to transition to: " + enumC2850c;
                    c3349v.m6850e(str, str2);
                }
                z = false;
            }
            if (z) {
                if (C3349v.m6862a()) {
                    this.logger.m6855b(this.tag, "Transitioning from " + this.f6846f + " to " + enumC2850c + "...");
                }
                this.f6846f = enumC2850c;
            } else if (C3349v.m6862a()) {
                this.logger.m6851d(this.tag, "Not allowed transition from " + this.f6846f + " to " + enumC2850c);
            }
        }
        if (!z || runnable == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8639a(MaxAd maxAd) {
        this.f6842b.m7867a();
        m8650a();
        this.sdk.m7482F().m6842b((AbstractC2823a) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8638a(String str, String str2) {
        this.f6843c.m8600b(this.f6845e);
        this.f6845e.m8709d(str);
        this.f6845e.m8708e(str2);
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str3 = this.tag;
            c3349v.m6855b(str3, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f6845e + "...");
        }
        m8608a((AbstractC2823a) this.f6845e);
    }

    /* renamed from: a */
    private boolean m8649a(Activity activity) {
        boolean z;
        if (activity != null) {
            if (!isReady()) {
                String m12392a = C0484a.m12392a(new StringBuilder("Attempting to show ad before it is ready - please check ad readiness using "), this.tag, "#isReady()");
                if (C3349v.m6862a()) {
                    C3349v.m6846i(this.tag, m12392a);
                }
                C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-24, m12392a), true);
                return false;
            }
            if (Utils.getAlwaysFinishActivitiesSetting(activity) != 0 && this.sdk.m7396p().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
                if (!Utils.isPubInDebugMode(activity, this.sdk)) {
                    if (((Boolean) this.sdk.m7456a(C3108a.f7762T)).booleanValue()) {
                        if (C3349v.m6862a()) {
                            C3349v.m6846i(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                        }
                        C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!"), true);
                        return false;
                    }
                } else {
                    throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                }
            }
            if (((Boolean) this.sdk.m7456a(C3108a.f7743A)).booleanValue() && (this.sdk.m7435ae().m7072a() || this.sdk.m7435ae().m7068b())) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
                }
                C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing"), true);
                return false;
            } else if (((Boolean) this.sdk.m7456a(C3108a.f7744B)).booleanValue() && !C3295h.m7013a(activity)) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i(this.tag, "Attempting to show ad with no internet connection");
                }
                C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-1009), true);
                return false;
            } else {
                String str = this.sdk.m7396p().getExtraParameters().get("fullscreen_ads_block_showing_if_activity_is_finishing");
                if (StringUtils.isValidString(str) && Boolean.valueOf(str).booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if ((!z && !((Boolean) this.sdk.m7456a(C3108a.f7745C)).booleanValue()) || !activity.isFinishing()) {
                    return true;
                }
                if (C3349v.m6862a()) {
                    C3349v.m6846i(this.tag, "Attempting to show ad when activity is finishing");
                }
                C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-5601, "Attempting to show ad when activity is finishing"), true);
                return false;
            }
        }
        throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8637b() {
        C2825c c2825c;
        if (this.f6847g.compareAndSet(true, false)) {
            synchronized (this.f6844d) {
                c2825c = this.f6845e;
                this.f6845e = null;
            }
            this.sdk.m7483E().destroyAd(c2825c);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC2854a
    public void destroy() {
        m8647a(EnumC2850c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.1
            @Override // java.lang.Runnable
            public void run() {
                synchronized (MaxFullscreenAdImpl.this.f6844d) {
                    if (MaxFullscreenAdImpl.this.f6845e != null) {
                        if (C3349v.m6862a()) {
                            MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                            C3349v c3349v = maxFullscreenAdImpl.logger;
                            String str = maxFullscreenAdImpl.tag;
                            c3349v.m6855b(str, "Destroying ad for '" + MaxFullscreenAdImpl.this.adUnitId + "'; current ad: " + MaxFullscreenAdImpl.this.f6845e + "...");
                        }
                        MaxFullscreenAdImpl.this.sdk.m7483E().destroyAd(MaxFullscreenAdImpl.this.f6845e);
                    }
                }
                MaxFullscreenAdImpl.this.sdk.m7486B().m7709b(MaxFullscreenAdImpl.this);
                MaxFullscreenAdImpl.super.destroy();
            }
        });
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f6844d) {
            C2825c c2825c = this.f6845e;
            z = c2825c != null && c2825c.m8799e() && this.f6846f == EnumC2850c.READY;
        }
        return z;
    }

    public void loadAd(final Activity activity) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (!isReady()) {
            m8647a(EnumC2850c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.2
                @Override // java.lang.Runnable
                public void run() {
                    Context context = activity;
                    if (context == null) {
                        context = MaxFullscreenAdImpl.this.sdk.m7426an() != null ? MaxFullscreenAdImpl.this.sdk.m7426an() : MaxFullscreenAdImpl.this.sdk.m7476L();
                    }
                    Context context2 = context;
                    MediationServiceImpl m7483E = MaxFullscreenAdImpl.this.sdk.m7483E();
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    m7483E.loadAd(maxFullscreenAdImpl.adUnitId, null, maxFullscreenAdImpl.adFormat, maxFullscreenAdImpl.localExtraParameters, maxFullscreenAdImpl.extraParameters, context2, maxFullscreenAdImpl.listenerWrapper);
                }
            });
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v2 = this.logger;
            String str2 = this.tag;
            c3349v2.m6855b(str2, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        C3298j.m6979a(this.adListener, (MaxAd) this.f6845e, true);
    }

    @Override // com.applovin.impl.sdk.C3088b.InterfaceC3090a
    public void onAdExpired() {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Ad expired " + getAdUnitId());
        }
        this.f6847g.set(true);
        Activity activity = this.f6841a.getActivity();
        if (activity == null && (activity = this.sdk.m7434af().m8070a()) == null) {
            m8637b();
            this.listenerWrapper.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
            return;
        }
        this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
        this.sdk.m7483E().loadAd(this.adUnitId, null, this.adFormat, this.localExtraParameters, this.extraParameters, activity, this.listenerWrapper);
    }

    @Override // com.applovin.impl.sdk.C3127e.InterfaceC3130a
    public void onCreativeIdGenerated(String str, String str2) {
        C2825c c2825c = this.f6845e;
        if (c2825c == null || !c2825c.m8798f().equalsIgnoreCase(str)) {
            return;
        }
        C3298j.m6974a(this.adReviewListener, str2, this.f6845e);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        if (activity == null) {
            activity = this.sdk.m7426an();
        }
        if (m8649a(activity)) {
            m8647a(EnumC2850c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.m8638a(str, str2);
                    MaxFullscreenAdImpl.this.f6848h = false;
                    MaxFullscreenAdImpl.this.f6850j = new WeakReference(activity);
                    MaxFullscreenAdImpl.this.sdk.m7483E().showFullscreenAd(MaxFullscreenAdImpl.this.f6845e, activity, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final AbstractC1464h abstractC1464h, Activity activity) {
        if (viewGroup == null || abstractC1464h == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            }
            C3298j.m6982a(this.adListener, (MaxAd) this.f6845e, (MaxError) new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle."), true);
            return;
        }
        if (activity == null) {
            activity = this.sdk.m7426an();
        }
        final Activity activity2 = activity;
        if (m8649a(activity2)) {
            m8647a(EnumC2850c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    MaxFullscreenAdImpl.this.m8638a(str, str2);
                    MaxFullscreenAdImpl.this.f6848h = true;
                    MaxFullscreenAdImpl.this.f6850j = new WeakReference(activity2);
                    MaxFullscreenAdImpl.this.f6851k = new WeakReference(viewGroup);
                    MaxFullscreenAdImpl.this.f6852l = new WeakReference(abstractC1464h);
                    MaxFullscreenAdImpl.this.sdk.m7483E().showFullscreenAd(MaxFullscreenAdImpl.this.f6845e, viewGroup, abstractC1464h, activity2, MaxFullscreenAdImpl.this.listenerWrapper);
                }
            });
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f6841a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append('}');
        return sb.toString();
    }
}
