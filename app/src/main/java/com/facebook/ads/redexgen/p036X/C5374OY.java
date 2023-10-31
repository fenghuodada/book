package com.facebook.ads.redexgen.p036X;

import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.OY */
/* loaded from: assets/audience_network.dex */
public final class C5374OY extends LinearLayout {
    public static final int A06 = (int) (C5208Lr.A00 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C5953Xy A04;
    public final C5375OZ[] A05;

    public C5374OY(C5953Xy c5953Xy, int i, int i2, int i3, int i4) {
        super(c5953Xy);
        this.A00 = A06;
        this.A04 = c5953Xy;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new C5375OZ[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private C5375OZ A00() {
        C5375OZ c5375oz = new C5375OZ(this.A04, this.A01, this.A02);
        int i = this.A03;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 16;
        c5375oz.setLayoutParams(layoutParams);
        return c5375oz;
    }

    private void A01() {
        int i = 0;
        while (true) {
            C5375OZ[] c5375ozArr = this.A05;
            if (i < c5375ozArr.length) {
                ((LinearLayout.LayoutParams) c5375ozArr[i].getLayoutParams()).leftMargin = i == 0 ? 0 : this.A00;
                i++;
            } else {
                requestLayout();
                return;
            }
        }
    }

    private void A02(float f) {
        for (int i = 0; i < this.A05.length; i++) {
            float min = Math.min(1.0f, f - i);
            if (min < 0.0f) {
                min = 0.0f;
            }
            this.A05[i].setFillRatio(min);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
