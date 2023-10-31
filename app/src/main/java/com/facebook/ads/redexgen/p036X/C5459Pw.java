package com.facebook.ads.redexgen.p036X;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeAd;

/* renamed from: com.facebook.ads.redexgen.X.Pw */
/* loaded from: assets/audience_network.dex */
public final class C5459Pw extends LinearLayout {
    public static final int A00 = (int) (C5208Lr.A00 * 32.0f);
    public static final int A01 = (int) (C5208Lr.A00 * 8.0f);

    public C5459Pw(C5953Xy c5953Xy, NativeAd nativeAd, C5106K7 c5106k7, C5372OW c5372ow, AdOptionsView adOptionsView) {
        super(c5953Xy);
        setOrientation(0);
        c5372ow.setFullCircleCorners(true);
        int i = A00;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        layoutParams.setMargins(0, 0, A01, 0);
        addView(c5372ow, layoutParams);
        TextView textView = new TextView(c5953Xy);
        c5106k7.A08(textView);
        textView.setMaxLines(1);
        textView.setText(nativeAd.getAdvertiserName());
        TextView textView2 = new TextView(c5953Xy);
        c5106k7.A06(textView2);
        textView2.setMaxLines(1);
        textView2.setText(nativeAd.getSponsoredTranslation());
        LinearLayout linearLayout = new LinearLayout(c5953Xy);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        layoutParams2.gravity = 16;
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-1, -2));
        addView(linearLayout, layoutParams2);
        addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
    }
}
