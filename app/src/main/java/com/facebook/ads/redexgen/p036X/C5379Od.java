package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.Od */
/* loaded from: assets/audience_network.dex */
public final class C5379Od {
    public static final int A00 = C5245MS.A00();

    public static void A00(C5953Xy c5953Xy, ViewGroup viewGroup, String str) {
        new AsyncTaskC5652T3(viewGroup, c5953Xy).A07(str);
        View view = new View(c5953Xy);
        view.setId(A00);
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        C5245MS.A0R(view, c5953Xy);
        viewGroup.addView(view, 0);
    }
}
