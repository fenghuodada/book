package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.PU */
/* loaded from: assets/audience_network.dex */
public final class C5431PU {
    public final int[] A00(View view, int i, int i2) {
        C41804U c41804u = (C41804U) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), c41804u.width), ViewGroup.getChildMeasureSpec(i2, view.getPaddingTop() + view.getPaddingBottom(), c41804u.height));
        return new int[]{view.getMeasuredWidth() + c41804u.leftMargin + c41804u.rightMargin, view.getMeasuredHeight() + c41804u.bottomMargin + c41804u.topMargin};
    }
}
