package com.applovin.impl.mediation.debugger.p021ui.p022a;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p016a.C2901a;
import com.applovin.impl.mediation.debugger.p016a.C2903b;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2905a;
import com.applovin.impl.mediation.debugger.p017b.p018a.C2906b;
import com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a;
import com.applovin.impl.mediation.debugger.p021ui.p022a.C2927b;
import com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2955a;
import com.applovin.impl.mediation.debugger.p021ui.p026d.C2957c;
import com.applovin.impl.mediation.debugger.p021ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* renamed from: com.applovin.impl.mediation.debugger.ui.a.a */
/* loaded from: classes.dex */
public class ActivityC2921a extends AbstractActivityC2918a implements C2901a.InterfaceC2902a, AdControlButton.InterfaceC2970a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a */
    private C3214m f7129a;

    /* renamed from: b */
    private C2905a f7130b;

    /* renamed from: c */
    private C2927b f7131c;
    @Nullable

    /* renamed from: d */
    private C2906b f7132d;

    /* renamed from: e */
    private MaxAdView f7133e;

    /* renamed from: f */
    private MaxInterstitialAd f7134f;

    /* renamed from: g */
    private MaxRewardedInterstitialAd f7135g;

    /* renamed from: h */
    private MaxRewardedAd f7136h;

    /* renamed from: i */
    private MaxNativeAdView f7137i;

    /* renamed from: j */
    private MaxNativeAdLoader f7138j;

    /* renamed from: k */
    private DialogC2934d f7139k;

    /* renamed from: l */
    private ListView f7140l;

    /* renamed from: m */
    private View f7141m;

    /* renamed from: n */
    private AdControlButton f7142n;

    /* renamed from: o */
    private TextView f7143o;

    /* renamed from: p */
    private C2901a f7144p;

    /* renamed from: a */
    private void m8353a() {
        String m8430a = this.f7130b.m8430a();
        if (this.f7130b.m8426d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(m8430a, this.f7130b.m8426d(), this.f7129a.m7463Y(), this);
            this.f7133e = maxAdView;
            maxAdView.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f7130b.m8426d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(m8430a, this.f7129a.m7463Y(), this);
            this.f7134f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7130b.m8426d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(m8430a, this.f7129a.m7463Y(), this);
            this.f7135g = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f7130b.m8426d()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(m8430a, this.f7129a.m7463Y(), this);
            this.f7136h = maxRewardedAd;
            maxRewardedAd.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f7130b.m8426d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(m8430a, this.f7129a.m7463Y(), this);
            this.f7138j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.2
                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdClicked(MaxAd maxAd) {
                    ActivityC2921a.this.onAdClicked(maxAd);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    ActivityC2921a.this.onAdLoadFailed(str, maxError);
                }

                @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    ActivityC2921a.this.f7137i = maxNativeAdView;
                    ActivityC2921a.this.onAdLoaded(maxAd);
                }
            });
            this.f7138j.setRevenueListener(this);
        }
    }

    /* renamed from: a */
    private void m8352a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.f7139k != null) {
            return;
        }
        DialogC2934d dialogC2934d = new DialogC2934d(viewGroup, size, this);
        this.f7139k = dialogC2934d;
        dialogC2934d.setOnShowListener(onShowListener);
        this.f7139k.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.4
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 instanceof MaxAdView) {
                    ((MaxAdView) viewGroup2).stopAutoRefresh();
                }
                ActivityC2921a.this.f7139k = null;
            }
        });
        this.f7139k.show();
    }

    /* renamed from: a */
    private void m8347a(MaxAdFormat maxAdFormat) {
        if (this.f7132d != null) {
            this.f7129a.m7478J().m8197a(this.f7132d.m8422a().m8412a());
            this.f7129a.m7478J().m8195a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f7133e.setPlacement("[Mediation Debugger Live Ad]");
            this.f7133e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f7130b.m8426d()) {
            this.f7134f.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7130b.m8426d()) {
            this.f7135g.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f7130b.m8426d()) {
            this.f7136h.loadAd();
        } else if (MaxAdFormat.NATIVE != this.f7130b.m8426d()) {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        } else {
            this.f7138j.setPlacement("[Mediation Debugger Live Ad]");
            this.f7138j.loadAd();
        }
    }

    /* renamed from: b */
    private void m8346b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            m8352a(this.f7133e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.3
                @Override // android.content.DialogInterface.OnShowListener
                public void onShow(DialogInterface dialogInterface) {
                    ActivityC2921a.this.f7133e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f7130b.m8426d()) {
            this.f7134f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f7130b.m8426d()) {
            this.f7135g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f7130b.m8426d()) {
            this.f7136h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f7130b.m8426d()) {
            m8352a(this.f7137i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a
    public C3214m getSdk() {
        return this.f7129a;
    }

    public void initialize(final C2905a c2905a, @Nullable C2906b c2906b, final C3214m c3214m) {
        this.f7129a = c3214m;
        this.f7130b = c2905a;
        this.f7132d = c2906b;
        C2927b c2927b = new C2927b(c2905a, c2906b, this);
        this.f7131c = c2927b;
        c2927b.m8236a(new AbstractView$OnClickListenerC2961d.InterfaceC2963a() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1
            @Override // com.applovin.impl.mediation.debugger.p021ui.p026d.AbstractView$OnClickListenerC2961d.InterfaceC2963a
            /* renamed from: a */
            public void mo8220a(C2955a c2955a, final C2957c c2957c) {
                if (c2957c instanceof C2927b.C2928a) {
                    ActivityC2921a.this.startActivity(MaxDebuggerAdUnitDetailActivity.class, c3214m.m7434af(), new AbstractActivityC2918a.InterfaceC2920a<MaxDebuggerAdUnitDetailActivity>() { // from class: com.applovin.impl.mediation.debugger.ui.a.a.1.1
                        @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a.InterfaceC2920a
                        /* renamed from: a  reason: avoid collision after fix types in other method */
                        public void mo8290a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            C2906b m8336a = ((C2927b.C2928a) c2957c).m8336a();
                            C29221 c29221 = C29221.this;
                            maxDebuggerAdUnitDetailActivity.initialize(c2905a, m8336a, c3214m);
                        }
                    });
                }
            }
        });
        m8353a();
        List<C2903b> m8413d = c2905a.m8425e().m8413d();
        if (m8413d == null || m8413d.size() <= 0) {
            return;
        }
        if (c2906b == null || c2906b.m8422a().m8409c().m8373x()) {
            this.f7144p = new C2901a(m8413d, c2905a.m8426d(), this);
        }
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
        this.f7142n.setControlState(AdControlButton.EnumC2971b.LOAD);
        this.f7143o.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f7133e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7134f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7135g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7136h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7138j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m8347a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f7142n.setControlState(AdControlButton.EnumC2971b.LOAD);
        this.f7143o.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.f7143o;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.f7142n.setControlState(AdControlButton.EnumC2971b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m8352a(this.f7133e, maxAd.getFormat().getSize(), null);
        } else if (MaxAdFormat.NATIVE == this.f7130b.m8426d()) {
            m8352a(this.f7137i, MaxAdFormat.MREC.getSize(), null);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p016a.C2901a.InterfaceC2902a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f7133e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f7134f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f7135g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f7136h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f7138j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m8347a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.testmode.AdControlButton.InterfaceC2970a
    public void onClick(AdControlButton adControlButton) {
        if (this.f7129a.m7478J().m8198a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        MaxAdFormat m8426d = this.f7130b.m8426d();
        AdControlButton.EnumC2971b enumC2971b = AdControlButton.EnumC2971b.LOAD;
        if (enumC2971b == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.EnumC2971b.LOADING);
            C2901a c2901a = this.f7144p;
            if (c2901a != null) {
                c2901a.m8434a();
            } else {
                m8347a(m8426d);
            }
        } else if (AdControlButton.EnumC2971b.SHOW == adControlButton.getControlState()) {
            if (!m8426d.isAdViewAd() && m8426d != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(enumC2971b);
            }
            m8346b(m8426d);
        }
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C3393R.C3398layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f7131c.m8344a());
        this.f7140l = (ListView) findViewById(C3393R.C3396id.listView);
        this.f7141m = findViewById(C3393R.C3396id.ad_presenter_view);
        this.f7142n = (AdControlButton) findViewById(C3393R.C3396id.ad_control_button);
        this.f7143o = (TextView) findViewById(C3393R.C3396id.status_textview);
        this.f7140l.setAdapter((ListAdapter) this.f7131c);
        this.f7143o.setText(this.f7129a.m7478J().m8198a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.f7143o.setTypeface(Typeface.DEFAULT_BOLD);
        this.f7142n.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f7141m.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.mediation.debugger.p021ui.AbstractActivityC2918a, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f7132d != null) {
            this.f7129a.m7478J().m8197a((String) null);
            this.f7129a.m7478J().m8195a(false);
        }
        MaxAdView maxAdView = this.f7133e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f7134f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f7136h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
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
