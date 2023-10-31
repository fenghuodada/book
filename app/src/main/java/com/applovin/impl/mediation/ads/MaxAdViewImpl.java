package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.concurrent.futures.C0486c;
import androidx.constraintlayout.core.widgets.C0539e;
import androidx.datastore.preferences.protobuf.C1169e;
import com.applovin.impl.adview.C2808x;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.C2824b;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3068aa;
import com.applovin.impl.sdk.C3116d;
import com.applovin.impl.sdk.C3127e;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.C3358z;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3288b;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.C3340q;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxAdViewImpl extends AbstractC2854a implements C3068aa.InterfaceC3071a, C3116d.InterfaceC3118a, C3127e.InterfaceC3130a {

    /* renamed from: A */
    private boolean f6803A;

    /* renamed from: B */
    private boolean f6804B;

    /* renamed from: a */
    private final Context f6805a;

    /* renamed from: b */
    private final MaxAdView f6806b;

    /* renamed from: c */
    private final String f6807c;

    /* renamed from: d */
    private final View f6808d;

    /* renamed from: e */
    private long f6809e;

    /* renamed from: f */
    private C2824b f6810f;

    /* renamed from: g */
    private String f6811g;

    /* renamed from: h */
    private String f6812h;

    /* renamed from: i */
    private String f6813i;

    /* renamed from: j */
    private String f6814j;

    /* renamed from: k */
    private final C2836a f6815k;

    /* renamed from: l */
    private final C2838c f6816l;

    /* renamed from: m */
    private final C3116d f6817m;

    /* renamed from: n */
    private final C3358z f6818n;

    /* renamed from: o */
    private final C3068aa f6819o;

    /* renamed from: p */
    private final Object f6820p;

    /* renamed from: q */
    private C2824b f6821q;

    /* renamed from: r */
    private boolean f6822r;

    /* renamed from: s */
    private boolean f6823s;

    /* renamed from: t */
    private boolean f6824t;

    /* renamed from: u */
    private boolean f6825u;

    /* renamed from: v */
    private boolean f6826v;

    /* renamed from: w */
    private boolean f6827w;

    /* renamed from: x */
    private boolean f6828x;

    /* renamed from: y */
    private boolean f6829y;

    /* renamed from: z */
    private boolean f6830z;

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$a */
    /* loaded from: classes.dex */
    public class C2836a extends AbstractC2837b {
        private C2836a() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C3349v.m6862a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                C3349v c3349v = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                c3349v.m6855b(str2, "Calling ad load failed callback for publisher: " + MaxAdViewImpl.this.adListener);
            }
            C3298j.m6977a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m8680a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.f6826v) {
                if (C3349v.m6862a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    C3349v c3349v = maxAdViewImpl.logger;
                    String str = maxAdViewImpl.tag;
                    c3349v.m6855b(str, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.m7483E().destroyAd(maxAd);
                return;
            }
            C2824b c2824b = (C2824b) maxAd;
            c2824b.m8709d(MaxAdViewImpl.this.f6813i);
            c2824b.m8708e(MaxAdViewImpl.this.f6814j);
            if (c2824b.m8778w() != null) {
                MaxAdViewImpl.this.m8693a(c2824b);
                if (c2824b.m8776y()) {
                    long m8775z = c2824b.m8775z();
                    if (C3349v.m6862a()) {
                        C3349v m7487A = MaxAdViewImpl.this.sdk.m7487A();
                        String str2 = MaxAdViewImpl.this.tag;
                        StringBuilder m12390a = C0486c.m12390a("Scheduling banner ad refresh ", m8775z, " milliseconds from now for '");
                        m12390a.append(MaxAdViewImpl.this.adUnitId);
                        m12390a.append("'...");
                        m7487A.m6855b(str2, m12390a.toString());
                    }
                    MaxAdViewImpl.this.f6817m.m7776a(m8775z);
                    if (MaxAdViewImpl.this.f6817m.m7769f() || MaxAdViewImpl.this.f6823s) {
                        if (C3349v.m6862a()) {
                            MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                            maxAdViewImpl2.logger.m6855b(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                        }
                        MaxAdViewImpl.this.f6817m.m7771d();
                    }
                }
                if (C3349v.m6862a()) {
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    C3349v c3349v2 = maxAdViewImpl3.logger;
                    String str3 = maxAdViewImpl3.tag;
                    c3349v2.m6855b(str3, "Calling ad load success callback for publisher: " + MaxAdViewImpl.this.adListener);
                }
                C3298j.m6979a(MaxAdViewImpl.this.adListener, maxAd, true);
                return;
            }
            MaxAdViewImpl.this.sdk.m7483E().destroyAd(c2824b);
            onAdLoadFailed(c2824b.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    /* loaded from: classes.dex */
    public abstract class AbstractC2837b implements AbstractC2854a.InterfaceC2855a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener {

        /* renamed from: a */
        private boolean f6838a;

        private AbstractC2837b() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                C3298j.m6948d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                if ((MaxAdViewImpl.this.f6821q.m8782A() || MaxAdViewImpl.this.f6830z) && this.f6838a) {
                    this.f6838a = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C3298j.m6940h(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                C3298j.m6982a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                C3298j.m6957b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                if ((MaxAdViewImpl.this.f6821q.m8782A() || MaxAdViewImpl.this.f6830z) && !MaxAdViewImpl.this.f6817m.m7769f()) {
                    this.f6838a = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C3298j.m6942g(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f6821q)) {
                C3298j.m6951c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C3298j.m6975a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    /* loaded from: classes.dex */
    public class C2838c extends AbstractC2837b {
        private C2838c() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            if (C3349v.m6862a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                C3349v c3349v = maxAdViewImpl.logger;
                String str2 = maxAdViewImpl.tag;
                c3349v.m6855b(str2, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m8680a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f6826v) {
                if (C3349v.m6862a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m6855b(maxAdViewImpl.tag, "Successfully pre-cached ad for refresh");
                }
                MaxAdViewImpl.this.m8681a(maxAd);
                return;
            }
            if (C3349v.m6862a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                C3349v c3349v = maxAdViewImpl2.logger;
                String str = maxAdViewImpl2.tag;
                c3349v.m6855b(str, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.m7483E().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdView maxAdView, View view, C3214m c3214m, Context context) {
        super(str, maxAdFormat, "MaxAdView", c3214m);
        this.f6807c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f6809e = Long.MAX_VALUE;
        this.f6820p = new Object();
        this.f6821q = null;
        this.f6826v = false;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f6805a = context.getApplicationContext();
        this.f6806b = maxAdView;
        this.f6808d = view;
        this.f6815k = new C2836a();
        this.f6816l = new C2838c();
        this.f6817m = new C3116d(c3214m, this);
        this.f6818n = new C3358z(maxAdView, c3214m);
        this.f6819o = new C3068aa(maxAdView, c3214m, this);
        c3214m.m7486B().m7712a(this);
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str2 = this.tag;
            c3349v.m6855b(str2, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8696a() {
        C2824b c2824b;
        MaxAdView maxAdView = this.f6806b;
        if (maxAdView != null) {
            C3288b.m7045a(maxAdView, this.f6808d);
        }
        this.f6819o.m8027a();
        synchronized (this.f6820p) {
            c2824b = this.f6821q;
        }
        if (c2824b != null) {
            this.sdk.m7483E().destroyAd(c2824b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8695a(long j) {
        if (!Utils.bitMaskContainsFlag(j, ((Long) this.sdk.m7456a(C3108a.f7789y)).longValue()) || this.f6803A) {
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "No undesired viewability flags matched or forcing pre-cache - scheduling viewability");
            }
            this.f6822r = false;
            m8678b();
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
            this.logger.m6855b(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f6822r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8694a(View view, C2824b c2824b) {
        int m8780u = c2824b.m8780u();
        int m8779v = c2824b.m8779v();
        int dpToPx = m8780u == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), m8780u);
        int dpToPx2 = m8779v != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), m8779v) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(dpToPx, dpToPx2);
        } else {
            layoutParams.width = dpToPx;
            layoutParams.height = dpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "Pinning ad view to MAX ad view with width: " + dpToPx + " and height: " + dpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : C3340q.m6888a(this.f6806b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8693a(final C2824b c2824b) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.2
            /* JADX WARN: Removed duplicated region for block: B:44:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 303
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.RunnableC28332.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8692a(C2824b c2824b, long j) {
        if (C3349v.m6862a()) {
            this.logger.m6855b(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.m7483E().processViewabilityAdImpressionPostback(c2824b, j, this.f6815k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8682a(final AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (!m8668e()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.1
                @Override // java.lang.Runnable
                public void run() {
                    if (MaxAdViewImpl.this.f6821q != null) {
                        long m6825a = MaxAdViewImpl.this.f6818n.m6825a(MaxAdViewImpl.this.f6821q);
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.extraParameters.put("visible_ad_ad_unit_id", maxAdViewImpl.f6821q.getAdUnitId());
                        MaxAdViewImpl.this.extraParameters.put("viewability_flags", Long.valueOf(m6825a));
                    } else {
                        MaxAdViewImpl.this.extraParameters.remove("visible_ad_ad_unit_id");
                        MaxAdViewImpl.this.extraParameters.remove("viewability_flags");
                    }
                    int pxToDp = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f6806b.getContext(), MaxAdViewImpl.this.f6806b.getWidth());
                    int pxToDp2 = AppLovinSdkUtils.pxToDp(MaxAdViewImpl.this.f6806b.getContext(), MaxAdViewImpl.this.f6806b.getHeight());
                    MaxAdViewImpl.this.extraParameters.put("viewport_width", Integer.valueOf(pxToDp));
                    MaxAdViewImpl.this.extraParameters.put("viewport_height", Integer.valueOf(pxToDp2));
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(maxAdViewImpl2.f6817m.m7769f() || MaxAdViewImpl.this.f6823s));
                    MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                    maxAdViewImpl3.extraParameters.put("auto_retries_disabled", Boolean.valueOf(maxAdViewImpl3.f6828x));
                    if (C3349v.m6862a()) {
                        MaxAdViewImpl maxAdViewImpl4 = MaxAdViewImpl.this;
                        C3349v c3349v = maxAdViewImpl4.logger;
                        String str = maxAdViewImpl4.tag;
                        c3349v.m6855b(str, "Loading " + MaxAdViewImpl.this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + MaxAdViewImpl.this.adUnitId + "' and notifying " + interfaceC2855a + "...");
                    }
                    MediationServiceImpl m7483E = MaxAdViewImpl.this.sdk.m7483E();
                    MaxAdViewImpl maxAdViewImpl5 = MaxAdViewImpl.this;
                    String str2 = maxAdViewImpl5.adUnitId;
                    String str3 = maxAdViewImpl5.f6807c;
                    MaxAdViewImpl maxAdViewImpl6 = MaxAdViewImpl.this;
                    m7483E.loadAd(str2, str3, maxAdViewImpl6.adFormat, maxAdViewImpl6.localExtraParameters, maxAdViewImpl6.extraParameters, maxAdViewImpl6.f6805a, interfaceC2855a);
                }
            });
        } else if (C3349v.m6862a()) {
            C3349v.m6846i(this.tag, "Failed to load new ad - this instance is already destroyed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8681a(MaxAd maxAd) {
        this.f6825u = false;
        if (!this.f6824t) {
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "Saving pre-cache ad...");
            }
            this.f6810f = (C2824b) maxAd;
            return;
        }
        this.f6824t = false;
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
        }
        this.f6815k.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8680a(MaxError maxError) {
        if (this.sdk.m7423b(C3108a.f7779o).contains(String.valueOf(maxError.getCode()))) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.sdk.m7487A();
                String str = this.tag;
                m7487A.m6855b(str, "Ignoring banner ad refresh for error code " + maxError.getCode());
            }
        } else if (this.f6823s || this.f6817m.m7769f()) {
            if (this.f6825u) {
                this.logger.m6855b(this.tag, "Refresh pre-cache failed when auto-refresh is stopped");
                this.f6825u = false;
            }
            if (this.f6824t) {
                this.logger.m6855b(this.tag, "Refresh pre-cache failed - calling ad load failed callback for publisher");
                C3298j.m6978a(this.adListener, this.adUnitId, maxError);
            }
        } else {
            this.f6822r = true;
            this.f6825u = false;
            long longValue = ((Long) this.sdk.m7456a(C3108a.f7778n)).longValue();
            if (longValue >= 0) {
                if (C3349v.m6862a()) {
                    C3349v m7487A2 = this.sdk.m7487A();
                    String str2 = this.tag;
                    StringBuilder m12390a = C0486c.m12390a("Scheduling failed banner ad refresh ", longValue, " milliseconds from now for '");
                    m12390a.append(this.adUnitId);
                    m12390a.append("'...");
                    m7487A2.m6855b(str2, m12390a.toString());
                }
                this.f6817m.m7776a(longValue);
            }
        }
    }

    /* renamed from: b */
    private void m8678b() {
        if (m8670d()) {
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "Scheduling refresh precache request now");
            }
            this.f6825u = true;
            this.sdk.m7469S().m7620a(new C3189z(this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    if (C3349v.m6862a()) {
                        MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                        maxAdViewImpl.logger.m6855b(maxAdViewImpl.tag, "Loading ad for pre-cache request...");
                    }
                    MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                    maxAdViewImpl2.m8682a(maxAdViewImpl2.f6816l);
                }
            }), C2895c.m8457a(this.adFormat));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8677b(C2824b c2824b) {
        AppLovinSdkUtils.Size size;
        String str;
        int height = this.f6806b.getHeight();
        int width = this.f6806b.getWidth();
        if (height <= 0 && width <= 0) {
            return;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f6805a, height);
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f6805a, width);
        MaxAdFormat format = c2824b.getFormat();
        if (this.f6804B) {
            size = format.getAdaptiveSize(pxToDp2, this.f6805a);
        } else {
            size = format.getSize();
        }
        int height2 = size.getHeight();
        int width2 = format.getSize().getWidth();
        if (C3349v.m6862a()) {
            if (pxToDp < height2 || pxToDp2 < width2) {
                StringBuilder m11130b = C1169e.m11130b("\n**************************************************\n`MaxAdView` size ", pxToDp2, "x", pxToDp, " dp smaller than required ");
                if (this.f6804B) {
                    str = "adaptive ";
                } else {
                    str = "";
                }
                m11130b.append(str);
                m11130b.append("size: ");
                m11130b.append(width2);
                m11130b.append("x");
                this.logger.m6850e("AppLovinSdk", C0539e.m12264b(m11130b, height2, " dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n"));
            }
        }
    }

    /* renamed from: c */
    private void m8673c() {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Rendering for cached ad: " + this.f6810f + "...");
        }
        this.f6815k.onAdLoaded(this.f6810f);
        this.f6810f = null;
    }

    /* renamed from: d */
    private boolean m8670d() {
        if (this.f6829y) {
            return false;
        }
        return ((Boolean) this.sdk.m7456a(C3108a.f7790z)).booleanValue();
    }

    /* renamed from: e */
    private boolean m8668e() {
        boolean z;
        synchronized (this.f6820p) {
            z = this.f6826v;
        }
        return z;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC2854a
    public void destroy() {
        m8696a();
        if (this.f6810f != null) {
            this.sdk.m7483E().destroyAd(this.f6810f);
        }
        synchronized (this.f6820p) {
            this.f6826v = true;
        }
        this.f6817m.m7772c();
        this.sdk.m7486B().m7709b(this);
        super.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f6813i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (com.applovin.impl.sdk.C3349v.m6862a() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if (com.applovin.impl.sdk.C3349v.m6862a() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00be, code lost:
        r5.logger.m6855b(r5.tag, "Loading ad...");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadAd() {
        /*
            r5 = this;
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto L2a
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = " Loading ad for "
            r2.append(r3)
            java.lang.String r3 = r5.adUnitId
            r2.append(r3)
            java.lang.String r3 = "..."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.m6855b(r1, r2)
        L2a:
            boolean r0 = r5.f6827w
            r1 = 1
            if (r0 != 0) goto L42
            com.applovin.impl.sdk.m r0 = r5.sdk
            com.applovin.impl.sdk.c.b<java.lang.Boolean> r2 = com.applovin.impl.sdk.p031c.C3108a.f7785u
            java.lang.Object r0 = r0.m7456a(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L40
            goto L42
        L40:
            r0 = 0
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L80
            com.applovin.impl.sdk.d r2 = r5.f6817m
            boolean r2 = r2.m7769f()
            if (r2 != 0) goto L80
            com.applovin.impl.sdk.d r2 = r5.f6817m
            boolean r2 = r2.m7777a()
            if (r2 == 0) goto L80
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto L7f
            java.lang.String r0 = r5.tag
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to load a new ad. An ad refresh has already been scheduled in "
            r1.<init>(r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.applovin.impl.sdk.d r3 = r5.f6817m
            long r3 = r3.m7774b()
            long r2 = r2.toSeconds(r3)
            r1.append(r2)
            java.lang.String r2 = " seconds."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.applovin.impl.sdk.C3349v.m6846i(r0, r1)
        L7f:
            return
        L80:
            java.lang.String r2 = "Loading ad..."
            if (r0 == 0) goto Lb8
            com.applovin.impl.mediation.a.b r0 = r5.f6810f
            if (r0 == 0) goto L9b
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto L97
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            java.lang.String r2 = "Rendering cached ad"
            r0.m6855b(r1, r2)
        L97:
            r5.m8673c()
            goto Lca
        L9b:
            boolean r0 = r5.f6825u
            if (r0 == 0) goto Lb1
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto Lae
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r2 = r5.tag
            java.lang.String r3 = "Waiting for precache ad to load to render"
            r0.m6855b(r2, r3)
        Lae:
            r5.f6824t = r1
            goto Lca
        Lb1:
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto Lc5
            goto Lbe
        Lb8:
            boolean r0 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r0 == 0) goto Lc5
        Lbe:
            com.applovin.impl.sdk.v r0 = r5.logger
            java.lang.String r1 = r5.tag
            r0.m6855b(r1, r2)
        Lc5:
            com.applovin.impl.mediation.ads.MaxAdViewImpl$a r0 = r5.f6815k
            r5.m8682a(r0)
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.ads.MaxAdViewImpl.loadAd():void");
    }

    @Override // com.applovin.impl.sdk.C3116d.InterfaceC3118a
    public void onAdRefresh() {
        C3349v c3349v;
        String str;
        String str2;
        this.f6824t = false;
        if (this.f6810f != null) {
            m8673c();
        } else if (!m8670d()) {
            if (C3349v.m6862a()) {
                c3349v = this.logger;
                str = this.tag;
                str2 = "Refreshing ad from network...";
                c3349v.m6855b(str, str2);
            }
            loadAd();
        } else if (!this.f6822r) {
            if (C3349v.m6862a()) {
                this.logger.m6850e(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f6824t = true;
        } else {
            if (C3349v.m6862a()) {
                c3349v = this.logger;
                str = this.tag;
                str2 = "Refreshing ad from network due to viewability requirements not met for refresh request...";
                c3349v.m6855b(str, str2);
            }
            loadAd();
        }
    }

    @Override // com.applovin.impl.sdk.C3127e.InterfaceC3130a
    public void onCreativeIdGenerated(String str, String str2) {
        C2824b c2824b = this.f6821q;
        if (c2824b != null && c2824b.m8798f().equalsIgnoreCase(str)) {
            C3298j.m6974a(this.adReviewListener, str2, this.f6821q);
            return;
        }
        C2824b c2824b2 = this.f6810f;
        if (c2824b2 == null || !c2824b2.m8798f().equalsIgnoreCase(str)) {
            return;
        }
        this.f6812h = str;
        this.f6811g = str2;
    }

    @Override // com.applovin.impl.sdk.C3068aa.InterfaceC3071a
    public void onLogVisibilityImpression() {
        m8692a(this.f6821q, this.f6818n.m6825a(this.f6821q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.m7456a(C3108a.f7783s)).booleanValue() && this.f6817m.m7777a()) {
            if (C3340q.m6890a(i)) {
                if (C3349v.m6862a()) {
                    this.logger.m6855b(this.tag, "Ad view visible");
                }
                this.f6817m.m7767h();
                return;
            }
            if (C3349v.m6862a()) {
                this.logger.m6855b(this.tag, "Ad view hidden");
            }
            this.f6817m.m7768g();
        }
    }

    public void setCustomData(String str) {
        if (this.f6821q != null) {
            String str2 = this.tag;
            C3349v.m6846i(str2, "Custom data for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this custom data, please set the custom data before loading the " + this.adFormat.getLabel() + ".");
        }
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f6814j = str;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC2854a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m8679a(str, str2);
    }

    public void setPlacement(String str) {
        if (C3349v.m6862a() && this.f6821q != null) {
            String str2 = this.tag;
            C3349v.m6846i(str2, "Placement for Ad Unit ID (" + this.adUnitId + ") was set after load was called. For the ads to be correctly attributed to this placement, please set the placement before loading the " + this.adFormat.getLabel() + ".");
        }
        this.f6813i = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f6809e = i;
    }

    public void startAutoRefresh() {
        C3349v c3349v;
        String str;
        String str2;
        this.f6823s = false;
        if (this.f6817m.m7769f()) {
            this.f6817m.m7770e();
            if (!C3349v.m6862a()) {
                return;
            }
            c3349v = this.logger;
            str = this.tag;
            str2 = "Resumed auto-refresh with remaining time: " + this.f6817m.m7774b() + "ms";
        } else if (!C3349v.m6862a()) {
            return;
        } else {
            c3349v = this.logger;
            str = this.tag;
            str2 = "Ignoring call to startAutoRefresh() - ad refresh is not paused";
        }
        c3349v.m6855b(str, str2);
    }

    public void stopAutoRefresh() {
        if (this.f6821q == null) {
            if (this.f6827w || ((Boolean) this.sdk.m7456a(C3108a.f7785u)).booleanValue()) {
                this.f6823s = true;
                return;
            } else if (C3349v.m6862a()) {
                C3349v.m6847h(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            } else {
                return;
            }
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Pausing auto-refresh with remaining time: " + this.f6817m.m7774b() + "ms");
        }
        this.f6817m.m7771d();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f6806b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        sb.append(m8668e());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m8679a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated allow immediate auto-refresh pause and ad load to: ", str2, this.logger, this.tag);
            }
            this.f6827w = Boolean.parseBoolean(str2);
        } else if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated disable auto-retries to: ", str2, this.logger, this.tag);
            }
            this.f6828x = Boolean.parseBoolean(str2);
        } else if ("disable_precache".equalsIgnoreCase(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated precached disabled to: ", str2, this.logger, this.tag);
            }
            this.f6829y = Boolean.parseBoolean(str2);
        } else if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated should stop auto-refresh on ad expand to: ", str2, this.logger, this.tag);
            }
            this.f6830z = Boolean.parseBoolean(str2);
        } else if ("force_precache".equals(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated force precache to: ", str2, this.logger, this.tag);
            }
            this.f6803A = Boolean.parseBoolean(str2);
        } else if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C3349v.m6862a()) {
                C2808x.m8855b("Updated is adaptive banner to: ", str2, this.logger, this.tag);
            }
            this.f6804B = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }
}
