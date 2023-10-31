package com.google.android.ads.nativetemplates;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.ads.nativetemplates.C6420R;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;

/* loaded from: classes.dex */
public class TemplateView extends FrameLayout {

    /* renamed from: a */
    public int f10045a;

    /* renamed from: b */
    public C6427a f10046b;

    /* renamed from: c */
    public NativeAdView f10047c;

    /* renamed from: d */
    public TextView f10048d;

    /* renamed from: e */
    public TextView f10049e;

    /* renamed from: f */
    public RatingBar f10050f;

    /* renamed from: g */
    public TextView f10051g;

    /* renamed from: h */
    public ImageView f10052h;

    /* renamed from: i */
    public MediaView f10053i;

    /* renamed from: j */
    public Button f10054j;

    public TemplateView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C6420R.styleable.TemplateView, 0, 0);
        try {
            this.f10045a = obtainStyledAttributes.getResourceId(C6420R.styleable.TemplateView_gnt_template_type, C6420R.C6425layout.gnt_medium_template_view);
            obtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f10045a, this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f10047c;
    }

    public String getTemplateTypeName() {
        int i = this.f10045a;
        return i == C6420R.C6425layout.gnt_medium_template_view ? "medium_template" : i == C6420R.C6425layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f10047c = (NativeAdView) findViewById(C6420R.C6423id.native_ad_view);
        this.f10048d = (TextView) findViewById(C6420R.C6423id.primary);
        this.f10049e = (TextView) findViewById(C6420R.C6423id.secondary);
        this.f10051g = (TextView) findViewById(C6420R.C6423id.body);
        RatingBar ratingBar = (RatingBar) findViewById(C6420R.C6423id.rating_bar);
        this.f10050f = ratingBar;
        ratingBar.setEnabled(false);
        this.f10054j = (Button) findViewById(C6420R.C6423id.cta);
        this.f10052h = (ImageView) findViewById(C6420R.C6423id.icon);
        this.f10053i = (MediaView) findViewById(C6420R.C6423id.media_view);
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(C6420R.C6423id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        boolean z;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        NativeAd.Image icon = nativeAd.getIcon();
        this.f10047c.setCallToActionView(this.f10054j);
        this.f10047c.setHeadlineView(this.f10048d);
        this.f10047c.setMediaView(this.f10053i);
        this.f10049e.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f10047c.setStoreView(this.f10049e);
        } else if (!TextUtils.isEmpty(advertiser)) {
            this.f10047c.setAdvertiserView(this.f10049e);
            store = advertiser;
        } else {
            store = "";
        }
        this.f10048d.setText(headline);
        this.f10054j.setText(callToAction);
        if (starRating != null && starRating.doubleValue() > 0.0d) {
            this.f10049e.setVisibility(8);
            this.f10050f.setVisibility(0);
            this.f10050f.setRating(starRating.floatValue());
            this.f10047c.setStarRatingView(this.f10050f);
        } else {
            this.f10049e.setText(store);
            this.f10049e.setVisibility(0);
            this.f10050f.setVisibility(8);
        }
        ImageView imageView = this.f10052h;
        if (icon != null) {
            imageView.setVisibility(0);
            this.f10052h.setImageDrawable(icon.getDrawable());
        } else {
            imageView.setVisibility(8);
        }
        TextView textView = this.f10051g;
        if (textView != null) {
            textView.setText(body);
            this.f10047c.setBodyView(this.f10051g);
        }
        this.f10047c.setNativeAd(nativeAd);
    }

    public void setStyles(C6427a c6427a) {
        Button button;
        this.f10046b = c6427a;
        c6427a.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        ColorDrawable colorDrawable = this.f10046b.f10055a;
        if (colorDrawable != null && (button = this.f10054j) != null) {
            button.setBackground(colorDrawable);
        }
        this.f10046b.getClass();
        this.f10046b.getClass();
        this.f10046b.getClass();
        invalidate();
        requestLayout();
    }
}
