package com.applovin.mediation.nativeAds.adPlacer;

import android.content.Context;
import android.view.View;
import com.applovin.impl.mediation.p011a.C2826d;
import com.applovin.impl.mediation.p012b.p013a.C2859a;
import com.applovin.impl.mediation.p012b.p013a.C2860b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes.dex */
public class MaxAdPlacer implements C2860b.InterfaceC2861a {

    /* renamed from: a */
    private AppLovinSdkUtils.Size f8930a;

    /* renamed from: b */
    private MaxNativeAdViewBinder f8931b;

    /* renamed from: c */
    private final C2859a f8932c;

    /* renamed from: d */
    private final C2860b f8933d;

    /* renamed from: e */
    private Listener f8934e;
    protected final C3349v logger;
    protected final C3214m sdk;

    /* loaded from: classes.dex */
    public interface Listener {
        void onAdClicked(MaxAd maxAd);

        void onAdLoaded(int i);

        void onAdRemoved(int i);

        void onAdRevenuePaid(MaxAd maxAd);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, Context context) {
        this(maxAdPlacerSettings, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdPlacer(MaxAdPlacerSettings maxAdPlacerSettings, AppLovinSdk appLovinSdk, Context context) {
        this.f8930a = AppLovinSdkUtils.Size.ZERO;
        C3214m c3214m = appLovinSdk.coreSdk;
        this.sdk = c3214m;
        C3349v m7487A = c3214m.m7487A();
        this.logger = m7487A;
        this.f8932c = new C2859a(maxAdPlacerSettings);
        this.f8933d = new C2860b(maxAdPlacerSettings.getAdUnitId(), maxAdPlacerSettings.getMaxPreloadedAdCount(), context, this);
        m7487A.m6855b("MaxAdPlacer", "Initializing ad placer with settings: " + maxAdPlacerSettings);
    }

    /* renamed from: a */
    private void m6802a() {
        int m8599a;
        while (this.f8933d.m8577b() && (m8599a = this.f8932c.m8599a()) != -1) {
            C3349v c3349v = this.logger;
            c3349v.m6855b("MaxAdPlacer", "Placing ad at position: " + m8599a);
            this.f8932c.m8595a(this.f8933d.m8575d(), m8599a);
            Listener listener = this.f8934e;
            if (listener != null) {
                listener.onAdLoaded(m8599a);
            }
        }
    }

    /* renamed from: a */
    private void m6800a(Collection<Integer> collection, Runnable runnable) {
        for (Integer num : collection) {
            this.f8933d.m8579a(this.f8932c.m8588c(num.intValue()));
        }
        runnable.run();
        if (collection.isEmpty()) {
            return;
        }
        C3349v c3349v = this.logger;
        c3349v.m6855b("MaxAdPlacer", "Removed " + collection.size() + " ads from stream: " + collection);
        if (this.f8934e != null) {
            for (Integer num2 : collection) {
                this.f8934e.onAdRemoved(num2.intValue());
            }
        }
    }

    public void clearAds() {
        m6800a(this.f8932c.m8592b(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.1
            @Override // java.lang.Runnable
            public void run() {
                MaxAdPlacer.this.logger.m6855b("MaxAdPlacer", "Clearing all cached ads");
                MaxAdPlacer.this.f8932c.m8589c();
                MaxAdPlacer.this.f8933d.m8574e();
            }
        });
    }

    public Collection<Integer> clearTrailingAds(final int i) {
        final Collection<Integer> m8586d = this.f8932c.m8586d(i);
        if (!m8586d.isEmpty()) {
            m6800a(m8586d, new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.2
                @Override // java.lang.Runnable
                public void run() {
                    C3349v c3349v = MaxAdPlacer.this.logger;
                    c3349v.m6855b("MaxAdPlacer", "Clearing trailing ads after position " + i);
                    MaxAdPlacer.this.f8932c.m8593a(m8586d);
                }
            });
        }
        return m8586d;
    }

    public void destroy() {
        this.logger.m6855b("MaxAdPlacer", "Destroying ad placer");
        clearAds();
        this.f8933d.m8580a();
    }

    public long getAdItemId(int i) {
        if (isFilledPosition(i)) {
            return -System.identityHashCode(this.f8932c.m8588c(i));
        }
        return 0L;
    }

    public AppLovinSdkUtils.Size getAdSize(int i, int i2) {
        if (isFilledPosition(i)) {
            AppLovinSdkUtils.Size size = this.f8930a;
            boolean z = size != AppLovinSdkUtils.Size.ZERO;
            int min = Math.min(z ? size.getWidth() : 360, i2);
            C2826d c2826d = (C2826d) this.f8932c.m8588c(i);
            if ("small_template_1".equalsIgnoreCase(c2826d.m8756v())) {
                return new AppLovinSdkUtils.Size(min, z ? this.f8930a.getHeight() : 120);
            } else if ("medium_template_1".equalsIgnoreCase(c2826d.m8756v())) {
                return new AppLovinSdkUtils.Size(min, (int) (min / (z ? this.f8930a.getWidth() / this.f8930a.getHeight() : 1.2d)));
            } else if (z) {
                return this.f8930a;
            } else {
                if (c2826d.m8757u() != null) {
                    View mainView = c2826d.m8757u().getMainView();
                    return new AppLovinSdkUtils.Size(mainView.getMeasuredWidth(), mainView.getMeasuredHeight());
                }
            }
        }
        return AppLovinSdkUtils.Size.ZERO;
    }

    public int getAdjustedCount(int i) {
        return this.f8932c.m8585e(i);
    }

    public int getAdjustedPosition(int i) {
        return this.f8932c.m8584f(i);
    }

    public int getOriginalPosition(int i) {
        return this.f8932c.m8583g(i);
    }

    public void insertItem(int i) {
        C3349v c3349v = this.logger;
        c3349v.m6855b("MaxAdPlacer", "Inserting item at position: " + i);
        this.f8932c.m8582h(i);
    }

    public boolean isAdPosition(int i) {
        return this.f8932c.m8598a(i);
    }

    public boolean isFilledPosition(int i) {
        return this.f8932c.m8591b(i);
    }

    public void loadAds() {
        this.logger.m6855b("MaxAdPlacer", "Loading ads");
        this.f8933d.m8576c();
    }

    public void moveItem(int i, int i2) {
        this.f8932c.m8590b(i, i2);
    }

    @Override // com.applovin.impl.mediation.p012b.p013a.C2860b.InterfaceC2861a
    public void onAdRevenuePaid(MaxAd maxAd) {
        Listener listener = this.f8934e;
        if (listener != null) {
            listener.onAdRevenuePaid(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.p012b.p013a.C2860b.InterfaceC2861a
    public void onNativeAdClicked(MaxAd maxAd) {
        Listener listener = this.f8934e;
        if (listener != null) {
            listener.onAdClicked(maxAd);
        }
    }

    @Override // com.applovin.impl.mediation.p012b.p013a.C2860b.InterfaceC2861a
    public void onNativeAdLoadFailed(String str, MaxError maxError) {
        C3349v c3349v = this.logger;
        c3349v.m6850e("MaxAdPlacer", "Native ad failed to load: " + maxError);
    }

    @Override // com.applovin.impl.mediation.p012b.p013a.C2860b.InterfaceC2861a
    public void onNativeAdLoaded() {
        this.logger.m6855b("MaxAdPlacer", "Native ad enqueued");
        m6802a();
    }

    public void removeItem(final int i) {
        m6800a(isFilledPosition(i) ? Collections.singletonList(Integer.valueOf(i)) : Collections.emptyList(), new Runnable() { // from class: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.3
            @Override // java.lang.Runnable
            public void run() {
                C3349v c3349v = MaxAdPlacer.this.logger;
                c3349v.m6855b("MaxAdPlacer", "Removing item at position: " + i);
                MaxAdPlacer.this.f8932c.m8581i(i);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void renderAd(int r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            com.applovin.impl.mediation.b.a.a r0 = r6.f8932c
            com.applovin.mediation.MaxAd r0 = r0.m8588c(r7)
            java.lang.String r1 = "MaxAdPlacer"
            if (r0 != 0) goto L1e
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "An ad is not available for position: "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.m6855b(r1, r7)
            return
        L1e:
            r2 = r0
            com.applovin.impl.mediation.a.d r2 = (com.applovin.impl.mediation.p011a.C2826d) r2
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = r2.m8757u()
            if (r2 == 0) goto L3b
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Using pre-rendered ad at position: "
            r3.<init>(r4)
        L30:
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r0.m6855b(r1, r7)
            goto L6f
        L3b:
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r2 = r6.f8931b
            java.lang.String r3 = "Unable to render ad at position: "
            if (r2 == 0) goto L97
            com.applovin.mediation.nativeAds.MaxNativeAdView r2 = new com.applovin.mediation.nativeAds.MaxNativeAdView
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r6.f8931b
            android.content.Context r5 = r8.getContext()
            r2.<init>(r4, r5)
            com.applovin.impl.mediation.b.a.b r4 = r6.f8933d
            boolean r0 = r4.m8578a(r2, r0)
            if (r0 == 0) goto L5e
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Rendered ad at position: "
            r3.<init>(r4)
            goto L30
        L5e:
            com.applovin.impl.sdk.v r0 = r6.logger
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r0.m6850e(r1, r7)
        L6f:
            int r7 = r8.getChildCount()
        L73:
            if (r7 < 0) goto L83
            android.view.View r0 = r8.getChildAt(r7)
            boolean r0 = r0 instanceof com.applovin.mediation.nativeAds.MaxNativeAdView
            if (r0 == 0) goto L80
            r8.removeViewAt(r7)
        L80:
            int r7 = r7 + (-1)
            goto L73
        L83:
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L92
            android.view.ViewParent r7 = r2.getParent()
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r7.removeView(r2)
        L92:
            r7 = -1
            r8.addView(r2, r7, r7)
            return
        L97:
            com.applovin.impl.sdk.v r8 = r6.logger
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r7)
            java.lang.String r7 = ". If you're using a custom ad template, check that nativeAdViewBinder is set."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r8.m6850e(r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.adPlacer.MaxAdPlacer.renderAd(int, android.view.ViewGroup):void");
    }

    public void setAdSize(int i, int i2) {
        this.f8930a = new AppLovinSdkUtils.Size(i, i2);
    }

    public void setListener(Listener listener) {
        this.f8934e = listener;
    }

    public void setNativeAdViewBinder(MaxNativeAdViewBinder maxNativeAdViewBinder) {
        this.f8931b = maxNativeAdViewBinder;
    }

    public void updateFillablePositions(int i, int i2) {
        this.f8932c.m8597a(i, i2);
        if (i == -1 || i2 == -1) {
            return;
        }
        m6802a();
    }
}
