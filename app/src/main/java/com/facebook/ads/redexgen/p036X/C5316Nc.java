package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Nc */
/* loaded from: assets/audience_network.dex */
public final class C5316Nc extends LinearLayout {
    public final ImageView A00;
    public final LinearLayout A01;
    public final TextView A02;
    public static final int A05 = (int) (C5208Lr.A00 * 8.0f);
    public static final int A06 = (int) (C5208Lr.A00 * 14.5d);
    public static final int A04 = (int) (C5208Lr.A00 * 20.0f);
    public static final LinearLayout.LayoutParams A03 = new LinearLayout.LayoutParams(-1, -2);

    public C5316Nc(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A00 = new ImageView(c5953Xy);
        this.A00.setColorFilter(-10459280);
        int i = A04;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        this.A00.setLayoutParams(layoutParams);
        this.A01 = new LinearLayout(c5953Xy);
        this.A01.setOrientation(1);
        this.A01.setPadding(A05 * 2, 0, 0, 0);
        this.A01.setLayoutParams(A03);
        this.A02 = new TextView(c5953Xy);
        C5245MS.A0X(this.A02, true, 16);
        this.A02.setTextColor(-14934495);
        this.A01.addView(this.A02, A03);
        setOrientation(0);
        addView(this.A00);
        addView(this.A01);
    }

    public void setInfo(EnumC5253Ma enumC5253Ma, String str, String str2) {
        this.A00.setImageBitmap(C5254Mb.A01(enumC5253Ma));
        this.A02.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = new TextView(getContext());
            C5245MS.A0X(textView, false, 14);
            textView.setTextColor(-10459280);
            textView.setText(str2);
            this.A01.addView(textView, A03);
            int i = A05;
            setPadding(0, i, 0, i);
            return;
        }
        int i2 = A06;
        setPadding(0, i2, 0, i2);
    }
}
