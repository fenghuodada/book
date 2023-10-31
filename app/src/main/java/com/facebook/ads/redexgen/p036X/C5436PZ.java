package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.PZ */
/* loaded from: assets/audience_network.dex */
public final class C5436PZ extends LinearLayout {
    public static final int A04 = (int) (C5208Lr.A00 * 32.0f);
    public static final int A05 = (int) (C5208Lr.A00 * 8.0f);
    public TextView A00;
    public TextView A01;
    public C5372OW A02;
    public final C5953Xy A03;

    public C5436PZ(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A03 = c5953Xy;
        A00(c5953Xy);
    }

    private final void A00(C5953Xy c5953Xy) {
        setGravity(16);
        this.A02 = new C5372OW(c5953Xy);
        this.A02.setFullCircleCorners(true);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.setMargins(0, 0, A05, 0);
        addView(this.A02, layoutParams);
        LinearLayout linearLayout = new LinearLayout(c5953Xy);
        linearLayout.setOrientation(1);
        this.A00 = new TextView(c5953Xy);
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        C5245MS.A0X(this.A00, true, 16);
        this.A00.setEllipsize(TextUtils.TruncateAt.END);
        this.A00.setSingleLine(true);
        this.A01 = new TextView(c5953Xy);
        C5245MS.A0X(this.A01, false, 14);
        linearLayout.addView(this.A00);
        linearLayout.addView(this.A01);
        addView(linearLayout, layoutParams2);
    }

    public final void A01(int i, int i2) {
        this.A00.setTextColor(i);
        this.A01.setTextColor(i2);
    }

    public void setPageDetails(C39971U c39971u) {
        AsyncTaskC5652T3 asyncTaskC5652T3 = new AsyncTaskC5652T3(this.A02, this.A03);
        int i = A04;
        asyncTaskC5652T3.A05(i, i);
        asyncTaskC5652T3.A07(c39971u.A01());
        this.A00.setText(c39971u.A02());
        this.A01.setText(c39971u.A03());
    }
}
