package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.ads.C2856b;
import com.applovin.impl.mediation.p011a.C2826d;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.C3393R;
import java.lang.ref.WeakReference;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a */
    private final View f8901a;

    /* renamed from: b */
    private final TextView f8902b;

    /* renamed from: c */
    private final TextView f8903c;

    /* renamed from: d */
    private final TextView f8904d;

    /* renamed from: e */
    private final ImageView f8905e;

    /* renamed from: f */
    private final FrameLayout f8906f;

    /* renamed from: g */
    private final ViewGroup f8907g;

    /* renamed from: h */
    private final FrameLayout f8908h;

    /* renamed from: i */
    private final ViewGroup f8909i;

    /* renamed from: j */
    private final FrameLayout f8910j;

    /* renamed from: k */
    private final Button f8911k;
    @Nullable

    /* renamed from: l */
    private C2856b f8912l;

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f8901a = view;
        } else {
            this.f8901a = LayoutInflater.from(context).inflate(z ? m6804a(maxNativeAdViewBinder.templateType, format) : maxNativeAdViewBinder.layoutResourceId, (ViewGroup) this, false);
        }
        addView(this.f8901a);
        this.f8902b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f8903c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f8904d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f8905e = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f8906f = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f8907g = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f8908h = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f8909i = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f8910j = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        this.f8911k = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        if (maxNativeAd != null) {
            m6805a(maxNativeAd);
        }
    }

    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaxNativeAdView(@androidx.annotation.Nullable com.applovin.mediation.nativeAds.MaxNativeAd r3, @androidx.annotation.Nullable java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.C3393R.C3396id.native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    /* renamed from: a */
    private int m6804a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return C3393R.C3398layout.max_native_ad_small_template_1;
            }
            if ("medium_template_1".equalsIgnoreCase(str)) {
                return C3393R.C3398layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException(C0552c.m12192b("Attempting to render MAX native ad with invalid format: ", str));
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return C3393R.C3398layout.max_native_ad_vertical_banner_view;
            }
            if (!"media_banner_template".equals(str) && !"no_body_banner_template".equals(str)) {
                if ("vertical_media_banner_template".equals(str)) {
                    return C3393R.C3398layout.max_native_ad_vertical_media_banner_view;
                }
                return C3393R.C3398layout.max_native_ad_banner_view;
            }
            return C3393R.C3398layout.max_native_ad_media_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return C3393R.C3398layout.max_native_ad_vertical_leader_view;
            }
            return C3393R.C3398layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return C3393R.C3398layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    /* renamed from: a */
    private void m6806a() {
        final ViewGroup viewGroup = (ViewGroup) findViewById(C3393R.C3396id.inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            final WeakReference weakReference = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.2
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) weakReference.get();
                    if (viewTreeObserver2 == null || !viewTreeObserver2.isAlive()) {
                        C3214m c3214m = AppLovinSdk.getInstance(MaxNativeAdView.this.getContext()).coreSdk;
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6851d("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                        }
                    } else {
                        viewTreeObserver2.removeOnPreDrawListener(this);
                    }
                    weakReference.clear();
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) viewGroup.getLayoutParams();
                    layoutParams.height = ((View) viewGroup.getParent()).getWidth();
                    viewGroup.setLayoutParams(layoutParams);
                    return true;
                }
            });
        }
    }

    /* renamed from: a */
    private void m6805a(MaxNativeAd maxNativeAd) {
        this.f8902b.setText(maxNativeAd.getTitle());
        if (this.f8903c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f8903c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f8903c.setVisibility(8);
            }
        }
        if (this.f8904d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f8904d.setText(maxNativeAd.getBody());
            } else {
                this.f8904d.setVisibility(4);
            }
        }
        if (this.f8911k != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f8911k.setText(maxNativeAd.getCallToAction());
            } else {
                this.f8911k.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f8906f;
        if (frameLayout != null) {
            if (icon == null || this.f8905e == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f8906f.removeAllViews();
                    this.f8906f.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f8905e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f8906f.setVisibility(8);
            } else {
                this.f8905e.setImageURI(icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f8908h;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f8908h.addView(optionsView);
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f8910j != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f8910j.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f8910j.setVisibility(8);
            }
        }
        m6806a();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView.1
            @Override // java.lang.Runnable
            public void run() {
                MaxNativeAdView.this.setSelected(true);
            }
        }, 2000L);
    }

    /* renamed from: b */
    private void m6803b(MaxNativeAd maxNativeAd) {
        if (this.f8902b != null) {
            if (StringUtils.isValidString(maxNativeAd.getTitle())) {
                this.f8902b.setText(maxNativeAd.getTitle());
            } else {
                this.f8902b.setText((CharSequence) null);
            }
        }
        String body = maxNativeAd.getBody();
        if (this.f8904d != null) {
            if (StringUtils.isValidString(body)) {
                this.f8904d.setText(body);
            } else {
                this.f8904d.setText((CharSequence) null);
            }
        }
        String advertiser = maxNativeAd.getAdvertiser();
        if (this.f8903c != null) {
            if (StringUtils.isValidString(advertiser)) {
                this.f8903c.setText(advertiser);
            } else {
                this.f8903c.setText((CharSequence) null);
            }
        }
        String callToAction = maxNativeAd.getCallToAction();
        if (this.f8911k != null) {
            if (StringUtils.isValidString(callToAction)) {
                this.f8911k.setText(callToAction);
            } else {
                this.f8911k.setText((CharSequence) null);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f8905e;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.f8905e.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                this.f8905e.setImageURI(icon.getUri());
            } else {
                this.f8905e.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f8909i;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f8909i.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f8907g;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f8907g.addView(optionsView);
            }
        }
    }

    @Nullable
    public C2856b getAdViewTracker() {
        return this.f8912l;
    }

    public TextView getAdvertiserTextView() {
        return this.f8903c;
    }

    public TextView getBodyTextView() {
        return this.f8904d;
    }

    public Button getCallToActionButton() {
        return this.f8911k;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f8906f;
    }

    public ImageView getIconImageView() {
        return this.f8905e;
    }

    public View getMainView() {
        return this.f8901a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f8910j;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f8909i;
        return viewGroup != null ? viewGroup : this.f8910j;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f8908h;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f8907g;
        return viewGroup != null ? viewGroup : this.f8908h;
    }

    public TextView getTitleTextView() {
        return this.f8902b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2856b c2856b = this.f8912l;
        if (c2856b != null) {
            c2856b.m8605b();
        }
        if (isHardwareAccelerated() || !C3349v.m6862a()) {
            return;
        }
        C3349v.m6847h("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        C2856b c2856b = this.f8912l;
        if (c2856b != null) {
            c2856b.m8607a();
            this.f8912l = null;
        }
        View view = this.f8901a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f8901a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f8901a);
    }

    public void render(C2826d c2826d, AbstractC2854a.InterfaceC2855a interfaceC2855a, C3214m c3214m) {
        recycle();
        if (!c2826d.m8753y().get() || !c2826d.m8754x().get()) {
            this.f8912l = new C2856b(c2826d, interfaceC2855a, c3214m);
        }
        MaxNativeAd nativeAd = c2826d.getNativeAd();
        if (StringUtils.isValidString(c2826d.m8756v())) {
            m6805a(nativeAd);
        } else {
            m6803b(nativeAd);
        }
    }
}
