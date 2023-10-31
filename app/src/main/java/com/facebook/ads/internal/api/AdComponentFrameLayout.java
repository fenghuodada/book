package com.facebook.ads.internal.api;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
@UiThread
/* loaded from: classes.dex */
public abstract class AdComponentFrameLayout extends FrameLayout implements AdComponentView {
    @Nullable
    private AdComponentViewApi mAdComponentViewApi;
    private final AdComponentViewParentApi mAdComponentViewParentApi;

    /* renamed from: com.facebook.ads.internal.api.AdComponentFrameLayout$a */
    /* loaded from: classes.dex */
    public class C3892a implements AdComponentViewParentApi {
        public C3892a() {
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void addView(View view) {
            AdComponentFrameLayout.super.addView(view);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void addView(View view, int i) {
            AdComponentFrameLayout.super.addView(view, i);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void addView(View view, int i, int i2) {
            AdComponentFrameLayout.super.addView(view, i, i2);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            AdComponentFrameLayout.super.addView(view, i, layoutParams);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView, android.view.ViewManager
        public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
            AdComponentFrameLayout.super.addView(view, layoutParams);
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void bringChildToFront(View view) {
            AdComponentFrameLayout.super.bringChildToFront(view);
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void onAttachedToWindow() {
            AdComponentFrameLayout.super.onAttachedToWindow();
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void onDetachedFromWindow() {
            AdComponentFrameLayout.super.onDetachedFromWindow();
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void onMeasure(int i, int i2) {
            AdComponentFrameLayout.super.onMeasure(i, i2);
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void onVisibilityChanged(View view, int i) {
            AdComponentFrameLayout.super.onVisibilityChanged(view, i);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void onWindowFocusChanged(boolean z) {
            AdComponentFrameLayout.super.onWindowFocusChanged(z);
        }

        @Override // com.facebook.ads.internal.api.AdComponentView
        public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            AdComponentFrameLayout.super.setLayoutParams(layoutParams);
        }

        @Override // com.facebook.ads.internal.api.AdComponentViewParentApi
        public final void setMeasuredDimension(int i, int i2) {
            AdComponentFrameLayout.super.setMeasuredDimension(i, i2);
        }
    }

    public AdComponentFrameLayout(Context context) {
        super(context);
        this.mAdComponentViewParentApi = new C3892a();
    }

    public AdComponentFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mAdComponentViewParentApi = new C3892a();
    }

    public AdComponentFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mAdComponentViewParentApi = new C3892a();
    }

    @RequiresApi(api = 21)
    public AdComponentFrameLayout(Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mAdComponentViewParentApi = new C3892a();
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view);
        } else {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i);
        } else {
            super.addView(view, i);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, i2);
        } else {
            super.addView(view, i, i2);
        }
    }

    @Override // android.view.ViewGroup, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, i, layoutParams);
        } else {
            super.addView(view, i, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager, com.facebook.ads.internal.api.AdComponentView
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.addView(view, layoutParams);
        } else {
            super.addView(view, layoutParams);
        }
    }

    public void attachAdComponentViewApi(AdComponentViewApiProvider adComponentViewApiProvider) {
        if (DynamicLoaderFactory.isFallbackMode()) {
            return;
        }
        if (this.mAdComponentViewApi != null) {
            throw new IllegalStateException("AdComponentViewApi can't be attached more then once.");
        }
        adComponentViewApiProvider.getAdComponentViewApi().onAttachedToView(this, this.mAdComponentViewParentApi);
        this.mAdComponentViewApi = adComponentViewApiProvider.getAdComponentViewApi();
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onAttachedToWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onAttachedToWindow();
        } else {
            super.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void onDetachedFromWindow() {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onDetachedFromWindow();
        } else {
            super.onDetachedFromWindow();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onMeasure(i, i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onVisibilityChanged(view, i);
        } else {
            super.onVisibilityChanged(view, i);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void onWindowFocusChanged(boolean z) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.onWindowFocusChanged(z);
        } else {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.view.View, com.facebook.ads.internal.api.AdComponentView
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AdComponentViewApi adComponentViewApi = this.mAdComponentViewApi;
        if (adComponentViewApi != null) {
            adComponentViewApi.setLayoutParams(layoutParams);
        } else {
            super.setLayoutParams(layoutParams);
        }
    }
}
