package com.facebook.ads.redexgen.p036X;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.KO */
/* loaded from: assets/audience_network.dex */
public final class C5121KO {
    public static EnumC5119KM A00(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.widthPixels / displayMetrics.density);
        int i2 = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (C5209Ls.A04(i, i2)) {
            return EnumC5119KM.A0H;
        }
        if (i2 > i) {
            return EnumC5119KM.A0J;
        }
        return EnumC5119KM.A0G;
    }

    public static void A01(DisplayMetrics displayMetrics, View view, EnumC5117KK enumC5117KK) {
        int ceil;
        if (((int) (displayMetrics.widthPixels / displayMetrics.density)) >= enumC5117KK.A03()) {
            ceil = displayMetrics.widthPixels;
        } else {
            ceil = (int) Math.ceil(enumC5117KK.A03() * displayMetrics.density);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ceil, (int) Math.ceil(enumC5117KK.A02() * displayMetrics.density));
        layoutParams.addRule(14, -1);
        view.setLayoutParams(layoutParams);
    }
}
