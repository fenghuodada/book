package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Aj */
/* loaded from: assets/audience_network.dex */
public final class C4551Aj extends C5483QK {
    public C4551Aj(C5953Xy c5953Xy) {
        super(c5953Xy);
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int newHeightSpec, int i) {
        if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
            i = newHeightSpec;
        } else if (View.MeasureSpec.getMode(i) == 1073741824) {
            newHeightSpec = i;
        }
        super.onMeasure(newHeightSpec, i);
    }
}
