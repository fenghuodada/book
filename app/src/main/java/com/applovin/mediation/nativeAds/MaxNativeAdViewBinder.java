package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    @IdRes
    protected final int advertiserTextViewId;
    @IdRes
    protected final int bodyTextViewId;
    @IdRes
    protected final int callToActionButtonId;
    @IdRes
    protected final int iconContentViewId;
    @IdRes
    protected final int iconImageViewId;
    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;
    @IdRes
    protected final int mediaContentFrameLayoutId;
    @IdRes
    protected final int mediaContentViewGroupId;
    @IdRes
    protected final int optionsContentFrameLayoutId;
    @IdRes
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    @IdRes
    protected final int titleTextViewId;

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a */
        private final View f8917a;
        @LayoutRes

        /* renamed from: b */
        private final int f8918b;
        @IdRes

        /* renamed from: c */
        private int f8919c;
        @IdRes

        /* renamed from: d */
        private int f8920d;
        @IdRes

        /* renamed from: e */
        private int f8921e;
        @IdRes

        /* renamed from: f */
        private int f8922f;
        @IdRes

        /* renamed from: g */
        private int f8923g;
        @IdRes

        /* renamed from: h */
        private int f8924h;
        @IdRes

        /* renamed from: i */
        private int f8925i;
        @IdRes

        /* renamed from: j */
        private int f8926j;
        @IdRes

        /* renamed from: k */
        private int f8927k;
        @IdRes

        /* renamed from: l */
        private int f8928l;

        /* renamed from: m */
        private String f8929m;

        public Builder(@LayoutRes int i) {
            this(i, null);
        }

        private Builder(@LayoutRes int i, View view) {
            this.f8919c = -1;
            this.f8920d = -1;
            this.f8921e = -1;
            this.f8922f = -1;
            this.f8923g = -1;
            this.f8924h = -1;
            this.f8925i = -1;
            this.f8926j = -1;
            this.f8927k = -1;
            this.f8928l = -1;
            this.f8918b = i;
            this.f8917a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f8917a, this.f8918b, this.f8919c, this.f8920d, this.f8921e, this.f8922f, this.f8923g, this.f8924h, this.f8925i, this.f8926j, this.f8927k, this.f8928l, this.f8929m);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i) {
            this.f8920d = i;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i) {
            this.f8921e = i;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i) {
            this.f8928l = i;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(@IdRes int i) {
            this.f8923g = i;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i) {
            this.f8922f = i;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i) {
            this.f8927k = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i) {
            this.f8926j = i;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i) {
            this.f8925i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i) {
            this.f8924h = i;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f8929m = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i) {
            this.f8919c = i;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, @LayoutRes int i, @IdRes int i2, @IdRes int i3, @IdRes int i4, @IdRes int i5, @IdRes int i6, @IdRes int i7, @IdRes int i8, @IdRes int i9, @IdRes int i10, @IdRes int i11, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.optionsContentViewGroupId = i7;
        this.optionsContentFrameLayoutId = i8;
        this.mediaContentViewGroupId = i9;
        this.mediaContentFrameLayoutId = i10;
        this.callToActionButtonId = i11;
        this.templateType = str;
    }
}
