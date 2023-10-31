package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.NativeBannerAd;

/* renamed from: com.facebook.ads.redexgen.X.Ps */
/* loaded from: assets/audience_network.dex */
public final class C5455Ps extends LinearLayout {
    public C5455Ps(C5953Xy c5953Xy, NativeBannerAd nativeBannerAd, EnumC5107K8 enumC5107K8, C5106K7 c5106k7, AdOptionsView adOptionsView) {
        super(c5953Xy);
        TextView textView = new TextView(getContext());
        c5106k7.A08(textView);
        textView.setText(nativeBannerAd.getAdvertiserName());
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        TextView textView2 = new TextView(getContext());
        c5106k7.A06(textView2);
        textView2.setText(nativeBannerAd.getAdUntrimmedBodyText());
        textView2.setLines(enumC5107K8 == EnumC5107K8.A07 ? 2 : 1);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        linearLayout.addView(textView, layoutParams);
        linearLayout.addView(adOptionsView, new LinearLayout.LayoutParams(-2, -2));
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        addView(linearLayout, layoutParams2);
        addView(textView2, layoutParams2);
    }
}
