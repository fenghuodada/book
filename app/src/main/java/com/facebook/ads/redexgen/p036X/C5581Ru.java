package com.facebook.ads.redexgen.p036X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ru */
/* loaded from: assets/audience_network.dex */
public final class C5581Ru extends C5373OX {
    public final ImageView A00;
    public final C5953Xy A01;

    public C5581Ru(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A01 = c5953Xy;
        this.A00 = new ImageView(c5953Xy);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC5652T3 asyncTaskC5652T3 = new AsyncTaskC5652T3(this.A00, this.A01);
        asyncTaskC5652T3.A04();
        asyncTaskC5652T3.A07(str);
    }
}
