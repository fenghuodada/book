package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.Em */
/* loaded from: assets/audience_network.dex */
public final class C4781Em extends C6179bc {
    public InterfaceC5458Pv A00;

    public final void A04(NativeAdLayout nativeAdLayout, C5953Xy c5953Xy, NativeAd nativeAd, C5106K7 c5106k7) {
        C5372OW c5372ow = new C5372OW(c5953Xy);
        MediaView mediaView = new MediaView(c5953Xy);
        AdOptionsView adOptionsView = new AdOptionsView(c5953Xy, nativeAd, nativeAdLayout);
        c5106k7.A09(adOptionsView, 28);
        this.A00 = new C5577Rq(c5953Xy, nativeAd, c5106k7, C5721UB.A0L(nativeAd.getInternalNativeAd()).A17(), c5372ow, mediaView, adOptionsView);
        C5245MS.A0M(nativeAdLayout, c5106k7.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c5372ow, this.A00.getViewsForInteraction());
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
