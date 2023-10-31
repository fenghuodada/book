package com.applovin.impl.mediation.debugger.p021ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p016a.C2901a;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C3393R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
/* loaded from: classes.dex */
public class ActivityC2972a extends AbstractActivityC2918a implements C2901a.InterfaceC2902a, AdControlButton.InterfaceC2970a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C2911b f7329a;

    /* renamed from: b */
    private C3214m f7330b;

    /* renamed from: c */
    private MaxAdView f7331c;

    /* renamed from: d */
    private MaxAdView f7332d;

    /* renamed from: e */
    private MaxInterstitialAd f7333e;

    /* renamed from: f */
    private MaxRewardedInterstitialAd f7334f;

    /* renamed from: g */
    private MaxRewardedAd f7335g;

    /* renamed from: h */
    private MaxAd f7336h;

    /* renamed from: i */
    private MaxNativeAdLoader f7337i;

    /* renamed from: j */
    private String f7338j;

    /* renamed from: k */
    private AdControlButton f7339k;

    /* renamed from: l */
    private AdControlButton f7340l;

    /* renamed from: m */
    private AdControlButton f7341m;

    /* renamed from: n */
    private AdControlButton f7342n;

    /* renamed from: o */
    private AdControlButton f7343o;

    /* renamed from: p */
    private AdControlButton f7344p;

    /* renamed from: q */
    private Button f7345q;

    /* renamed from: r */
    private Button f7346r;

    /* renamed from: s */
    private FrameLayout f7347s;

    /* renamed from: t */
    private FrameLayout f7348t;

    /* renamed from: u */
    private Map<MaxAdFormat, C2901a> f7349u;

    /* renamed from: a */
    private AdControlButton m8209a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f7339k;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f7340l;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f7341m;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.f7342n;
        }
        if (str.equals(this.f7338j)) {
            return this.f7343o;
        }
        if (str.equals("test_mode_native")) {
            return this.f7344p;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
    }

    /* renamed from: a */
    private void m8213a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C3393R.C3396id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C3393R.C3396id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.f7329a.m8381p().contains(maxAdFormat)) {
            findViewById(C3393R.C3396id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f7330b.m7463Y(), this);
        this.f7331c = maxAdView;
        maxAdView.setListener(this);
        frameLayout.addView(this.f7331c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(C3393R.C3396id.banner_control_button);
        this.f7339k = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7339k.setFormat(maxAdFormat);
    }

    /* renamed from: a */
    private void m8210a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f7330b.m7478J().m8197a(this.f7329a.m8389h());
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7331c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7333e.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7334f.loadAd();
                return;
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7335g.loadAd();
                return;
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7337i.loadAd();
                return;
            } else {
                return;
            }
        } else {
            maxAdView = this.f7332d;
        }
        maxAdView.loadAd();
    }

    /* renamed from: b */
    private void m8208b() {
        this.f7347s = (FrameLayout) findViewById(C3393R.C3396id.mrec_ad_view_container);
        List<MaxAdFormat> m8381p = this.f7329a.m8381p();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!m8381p.contains(maxAdFormat)) {
            findViewById(C3393R.C3396id.mrec_control_view).setVisibility(8);
            this.f7347s.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f7330b.m7463Y(), this);
        this.f7332d = maxAdView;
        maxAdView.setListener(this);
        this.f7347s.addView(this.f7332d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(C3393R.C3396id.mrec_control_button);
        this.f7340l = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7340l.setFormat(maxAdFormat);
    }

    /* renamed from: b */
    private void m8206b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7333e.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7334f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7335g.showAd();
        }
    }

    /* renamed from: c */
    private void m8205c() {
        List<MaxAdFormat> m8381p = this.f7329a.m8381p();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!m8381p.contains(maxAdFormat)) {
            findViewById(C3393R.C3396id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f7330b.m7463Y(), this);
        this.f7333e = maxInterstitialAd;
        maxInterstitialAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C3393R.C3396id.interstitial_control_button);
        this.f7341m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7341m.setFormat(maxAdFormat);
    }

    /* renamed from: d */
    private void m8203d() {
        List<MaxAdFormat> m8381p = this.f7329a.m8381p();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!m8381p.contains(maxAdFormat)) {
            findViewById(C3393R.C3396id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f7329a.m8389h();
        this.f7338j = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f7330b.m7463Y(), this);
        this.f7335g = maxRewardedAd;
        maxRewardedAd.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C3393R.C3396id.rewarded_control_button);
        this.f7343o = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7343o.setFormat(maxAdFormat);
    }

    /* renamed from: e */
    private void m8201e() {
        this.f7348t = (FrameLayout) findViewById(C3393R.C3396id.native_ad_view_container);
        if (!this.f7329a.m8380q()) {
            findViewById(C3393R.C3396id.native_control_view).setVisibility(8);
            this.f7348t.setVisibility(8);
            return;
        }
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f7330b.m7463Y(), this);
        this.f7337i = maxNativeAdLoader;
        maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.3
            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdClicked(MaxAd maxAd) {
                ActivityC2972a.this.onAdClicked(maxAd);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoadFailed(String str, MaxError maxError) {
                ActivityC2972a.this.onAdLoadFailed(str, maxError);
            }

            @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
            public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                if (ActivityC2972a.this.f7336h != null) {
                    ActivityC2972a.this.f7337i.destroy(ActivityC2972a.this.f7336h);
                }
                ActivityC2972a.this.f7336h = maxAd;
                ActivityC2972a.this.f7348t.removeAllViews();
                ActivityC2972a.this.f7348t.addView(maxNativeAdView);
                ActivityC2972a.this.onAdLoaded(maxAd);
            }
        });
        this.f7337i.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C3393R.C3396id.native_control_button);
        this.f7344p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f7344p.setFormat(MaxAdFormat.NATIVE);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        return this.f7330b;
    }

    public void initialize(C2911b c2911b) {
        this.f7329a = c2911b;
        this.f7330b = c2911b.m8375v();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m8209a(maxAd.getAdUnitId()).setControlState(AdControlButton.EnumC2971b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p016a.C2901a.InterfaceC2902a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7331c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7333e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7334f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7335g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7337i.setLocalExtraParameter("amazon_ad_error", adError);
            }
            m8210a(maxAdFormat);
        } else {
            maxAdView = this.f7332d;
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        m8210a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton m8209a = m8209a(str);
        m8209a.setControlState(AdControlButton.EnumC2971b.LOAD);
        Utils.showAlert("", "Failed to load " + m8209a.getFormat().getLabel() + " with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        m8209a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.EnumC2971b.LOAD : AdControlButton.EnumC2971b.SHOW);
    }

    @Override // com.applovin.impl.mediation.debugger.p016a.C2901a.InterfaceC2902a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f7331c;
        } else if (MaxAdFormat.MREC != maxAdFormat) {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f7333e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f7334f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f7335g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f7337i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            m8210a(maxAdFormat);
        } else {
            maxAdView = this.f7332d;
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        m8210a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.testmode.AdControlButton.InterfaceC2970a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.EnumC2971b enumC2971b = AdControlButton.EnumC2971b.LOAD;
        if (enumC2971b != adControlButton.getControlState()) {
            if (AdControlButton.EnumC2971b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(enumC2971b);
                m8206b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.EnumC2971b.LOADING);
        Map<MaxAdFormat, C2901a> map = this.f7349u;
        if (map == null || map.get(format) == null) {
            m8210a(format);
        } else {
            this.f7349u.get(format).m8434a();
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7329a == null) {
            C3349v.m6846i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C3393R.C3398layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f7329a.m8388i() + " Test Ads");
        m8213a();
        m8208b();
        m8205c();
        m8203d();
        m8201e();
        findViewById(C3393R.C3396id.rewarded_interstitial_control_view).setVisibility(8);
        this.f7345q = (Button) findViewById(C3393R.C3396id.show_mrec_button);
        this.f7346r = (Button) findViewById(C3393R.C3396id.show_native_button);
        if (this.f7329a.m8380q() && this.f7329a.m8381p().contains(MaxAdFormat.MREC)) {
            this.f7348t.setVisibility(8);
            this.f7345q.setBackgroundColor(-1);
            this.f7346r.setBackgroundColor(-3355444);
            this.f7345q.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActivityC2972a.this.f7347s.setVisibility(0);
                    ActivityC2972a.this.f7348t.setVisibility(8);
                    ActivityC2972a.this.f7345q.setBackgroundColor(-1);
                    ActivityC2972a.this.f7346r.setBackgroundColor(-3355444);
                }
            });
            this.f7346r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ActivityC2972a.this.f7348t.setVisibility(0);
                    ActivityC2972a.this.f7347s.setVisibility(8);
                    ActivityC2972a.this.f7346r.setBackgroundColor(-1);
                    ActivityC2972a.this.f7345q.setBackgroundColor(-3355444);
                }
            });
        } else {
            this.f7345q.setVisibility(8);
            this.f7346r.setVisibility(8);
        }
        if (StringUtils.isValidString(this.f7329a.m8372y()) && this.f7329a.m8371z() != null && this.f7329a.m8371z().size() > 0) {
            AdRegistration.getInstance(this.f7329a.m8372y(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            HashMap hashMap = new HashMap(this.f7329a.m8371z().size());
            for (MaxAdFormat maxAdFormat : this.f7329a.m8371z().keySet()) {
                hashMap.put(maxAdFormat, new C2901a(this.f7329a.m8371z().get(maxAdFormat), maxAdFormat, this));
            }
            this.f7349u = hashMap;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            C3349v.m6852c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f7330b.m7478J().m8197a((String) null);
        MaxAdView maxAdView = this.f7331c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f7332d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7333e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7335g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f7337i;
        if (maxNativeAdLoader == null || (maxAd = this.f7336h) == null) {
            return;
        }
        maxNativeAdLoader.destroy(maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
