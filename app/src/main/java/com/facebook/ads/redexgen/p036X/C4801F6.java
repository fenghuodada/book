package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.facebook.ads.redexgen.X.F6 */
/* loaded from: assets/audience_network.dex */
public final class C4801F6 extends C6179bc {
    public InterfaceC5458Pv A00;

    public final void A04(C5953Xy c5953Xy, NativeBannerAd nativeBannerAd, C5106K7 c5106k7, NativeAdLayout nativeAdLayout) {
        MediaView adIconView = new MediaView(nativeAdLayout.getContext());
        AdOptionsView adOptionsView = new AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd, nativeAdLayout);
        c5106k7.A09(adOptionsView, 20);
        this.A00 = new C5578Rr(c5953Xy, nativeBannerAd, c5106k7, C5721UB.A0L(nativeBannerAd.getInternalNativeAd()).A17(), adIconView, adOptionsView);
        C5245MS.A0M(nativeAdLayout, c5106k7.A00());
        nativeBannerAd.registerViewForInteraction(nativeAdLayout, adIconView, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.C42265E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
