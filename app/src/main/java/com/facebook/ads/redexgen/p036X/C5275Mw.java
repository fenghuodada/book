package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.api.AdNativeComponentView;

/* renamed from: com.facebook.ads.redexgen.X.Mw */
/* loaded from: assets/audience_network.dex */
public final class C5275Mw extends AdNativeComponentView {
    public static final int A01 = (int) (C5208Lr.A00 * 1.0f);
    public final ImageView A00;

    public C5275Mw(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A00 = new C5287N8(c5953Xy);
        this.A00.setScaleType(ImageView.ScaleType.CENTER_CROP);
        EnumC5213Lw.A04(this.A00, EnumC5213Lw.A0A);
        addView(this.A00, new ViewGroup.LayoutParams(-1, -1));
        C5245MS.A0M(this.A00, -2130706433);
        int i = A01;
        setPadding(i, i, i, i);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public View getAdContentsView() {
        return this.A00;
    }

    public ImageView getImageCardView() {
        return this.A00;
    }
}
