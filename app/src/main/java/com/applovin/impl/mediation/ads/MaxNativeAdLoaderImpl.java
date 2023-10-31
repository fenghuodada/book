package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.C2826d;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public class MaxNativeAdLoaderImpl extends AbstractC2854a {

    /* renamed from: a */
    private final C2852a f6886a;

    /* renamed from: b */
    private String f6887b;

    /* renamed from: c */
    private String f6888c;

    /* renamed from: d */
    private MaxNativeAdListener f6889d;

    /* renamed from: e */
    private final Map<String, MaxNativeAdView> f6890e;

    /* renamed from: f */
    private final Object f6891f;

    /* renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    /* loaded from: classes.dex */
    public class C2852a implements AbstractC2854a.InterfaceC2855a {
        private C2852a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public void m8609a(MaxNativeAdView maxNativeAdView) {
            C2826d m8604c;
            C2856b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (m8604c = adViewTracker.m8604c()) == null) {
                return;
            }
            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
            maxNativeAdLoaderImpl.logger.m6855b(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            MaxNativeAdLoaderImpl.this.destroy(m8604c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C3298j.m6972a(MaxNativeAdLoaderImpl.this.f6889d, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.m8615a(((MaxErrorImpl) maxError).getLoadTag());
            C3298j.m6970a(MaxNativeAdLoaderImpl.this.f6889d, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl.logger.m6855b(maxNativeAdLoaderImpl.tag, "Native ad loaded");
                    C2826d c2826d = (C2826d) maxAd;
                    c2826d.m8709d(MaxNativeAdLoaderImpl.this.f6887b);
                    c2826d.m8708e(MaxNativeAdLoaderImpl.this.f6888c);
                    MaxNativeAdView m8615a = MaxNativeAdLoaderImpl.this.m8615a(c2826d.m8808a());
                    if (m8615a == null) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl2.logger.m6855b(maxNativeAdLoaderImpl2.tag, "No custom view provided, checking template");
                        String m8756v = c2826d.m8756v();
                        if (StringUtils.isValidString(m8756v)) {
                            MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                            C3349v c3349v = maxNativeAdLoaderImpl3.logger;
                            String str = maxNativeAdLoaderImpl3.tag;
                            c3349v.m6855b(str, "Using template: " + m8756v + "...");
                            m8615a = new MaxNativeAdView(m8756v, MaxNativeAdLoaderImpl.this.sdk.m7476L());
                        }
                    }
                    if (m8615a == null) {
                        MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                        maxNativeAdLoaderImpl4.logger.m6855b(maxNativeAdLoaderImpl4.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                        C3298j.m6971a(MaxNativeAdLoaderImpl.this.f6889d, (MaxNativeAdView) null, maxAd, true);
                        return;
                    }
                    C2852a.this.m8609a(m8615a);
                    MaxNativeAdLoaderImpl.this.m8616a(m8615a, c2826d, c2826d.getNativeAd());
                    C3298j.m6971a(MaxNativeAdLoaderImpl.this.f6889d, m8615a, maxAd, true);
                    MaxNativeAdLoaderImpl.this.m8617a(m8615a);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C3298j.m6975a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C3214m c3214m) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", c3214m);
        this.f6886a = new C2852a();
        this.f6890e = new HashMap();
        this.f6891f = new Object();
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str2 = this.tag;
            c3349v.m6855b(str2, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public MaxNativeAdView m8615a(String str) {
        MaxNativeAdView remove;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f6891f) {
            remove = this.f6890e.remove(str);
        }
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8617a(MaxNativeAdView maxNativeAdView) {
        C2856b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker != null) {
            if (C3294g.m7024c()) {
                if (!maxNativeAdView.isAttachedToWindow()) {
                    return;
                }
            } else if (maxNativeAdView.getParent() == null) {
                return;
            }
            adViewTracker.m8605b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8616a(final MaxNativeAdView maxNativeAdView, final C2826d c2826d, final MaxNativeAd maxNativeAd) {
        c2826d.m8758a(maxNativeAdView);
        m8608a(c2826d);
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl.1
            @Override // java.lang.Runnable
            public void run() {
                maxNativeAdView.render(c2826d, MaxNativeAdLoaderImpl.this.f6886a, MaxNativeAdLoaderImpl.this.sdk);
                maxNativeAd.setNativeAdView(maxNativeAdView);
                maxNativeAd.prepareViewForInteraction(maxNativeAdView);
            }
        });
    }

    /* renamed from: a */
    private void m8614a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f6891f) {
            this.f6890e.put(str, maxNativeAdView);
        }
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC2854a
    public void destroy() {
        this.f6889d = null;
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        if (!(maxAd instanceof C2826d)) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.logger;
                String str = this.tag;
                c3349v.m6855b(str, "Destroy failed on non-native ad(" + maxAd + ")");
                return;
            }
            return;
        }
        C2826d c2826d = (C2826d) maxAd;
        if (c2826d.m8755w()) {
            if (C3349v.m6862a()) {
                C3349v c3349v2 = this.logger;
                String str2 = this.tag;
                c3349v2.m6855b(str2, "Native ad(" + c2826d + ") has already been destroyed");
                return;
            }
            return;
        }
        MaxNativeAdView m8757u = c2826d.m8757u();
        if (m8757u != null) {
            C2856b adViewTracker = m8757u.getAdViewTracker();
            if (adViewTracker != null && maxAd.equals(adViewTracker.m8604c())) {
                m8757u.recycle();
            }
        } else if (C3349v.m6862a()) {
            C3349v c3349v3 = this.logger;
            String str3 = this.tag;
            c3349v3.m6855b(str3, "Destroy failed on native ad(" + c2826d + "): native ad view not found");
        }
        this.sdk.m7483E().destroyAd(c2826d);
    }

    public String getPlacement() {
        return this.f6887b;
    }

    public void loadAd(@Nullable MaxNativeAdView maxNativeAdView) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Loading native ad for '" + this.adUnitId + "' and notifying " + this.f6886a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m8614a(lowerCase, maxNativeAdView);
        this.sdk.m7483E().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.localExtraParameters, this.extraParameters, this.sdk.m7476L(), this.f6886a);
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof C2826d)) {
            C3349v.m6846i(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        } else if (maxNativeAdView == null) {
            C3349v.m6846i(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        } else {
            C2826d c2826d = (C2826d) maxAd;
            MaxNativeAd nativeAd = c2826d.getNativeAd();
            if (nativeAd == null) {
                this.logger.m6850e(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return false;
            }
            m8616a(maxNativeAdView, c2826d, nativeAd);
            m8617a(maxNativeAdView);
            return true;
        }
    }

    public void setCustomData(String str) {
        Utils.maybeLogCustomDataSizeLimit(str, this.tag);
        this.f6888c = str;
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.logger;
            String str = this.tag;
            c3349v.m6855b(str, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f6889d = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f6887b = str;
    }

    @NonNull
    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f6889d + ", revenueListener=" + this.revenueListener + '}';
    }
}
