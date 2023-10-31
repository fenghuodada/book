package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import com.applovin.mediation.MaxAdFormat;

/* loaded from: classes.dex */
public class MaxNativeAd {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final String title;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private MaxAdFormat f8887a;

        /* renamed from: b */
        private String f8888b;

        /* renamed from: c */
        private String f8889c;

        /* renamed from: d */
        private String f8890d;

        /* renamed from: e */
        private String f8891e;

        /* renamed from: f */
        private MaxNativeAdImage f8892f;

        /* renamed from: g */
        private View f8893g;

        /* renamed from: h */
        private View f8894h;

        /* renamed from: i */
        private View f8895i;

        /* renamed from: j */
        private MaxNativeAdImage f8896j;

        /* renamed from: k */
        private float f8897k;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f8887a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f8889c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f8890d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f8891e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f8892f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f8893g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f8896j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f8897k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f8895i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f8894h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f8888b = str;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static class MaxNativeAdImage {

        /* renamed from: a */
        private Drawable f8898a;

        /* renamed from: b */
        private Uri f8899b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f8898a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f8899b = uri;
        }

        public Drawable getDrawable() {
            return this.f8898a;
        }

        public Uri getUri() {
            return this.f8899b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f8887a;
        this.title = builder.f8888b;
        this.advertiser = builder.f8889c;
        this.body = builder.f8890d;
        this.callToAction = builder.f8891e;
        this.icon = builder.f8892f;
        this.iconView = builder.f8893g;
        this.optionsView = builder.f8894h;
        this.mediaView = builder.f8895i;
        this.mainImage = builder.f8896j;
        this.mediaContentAspectRatio = builder.f8897k;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    @NonNull
    public final String getTitle() {
        return this.title;
    }

    @UiThread
    public final void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }
}
