package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TH */
/* loaded from: assets/audience_network.dex */
public final class C5666TH extends AbstractC5301NN {
    public static byte[] A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public final HorizontalScrollView A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final LinearLayout A03;
    public final C40422D A04;
    public final C5953Xy A05;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A06 = new byte[]{-57, -26, -24, -16, -92, -51, -48, -44, -58, -127, -94, -59, -127, -77, -58, -47, -48, -45, -43, -54, -49, -56};
    }

    static {
        A0C();
        A09 = (int) (C5208Lr.A00 * 4.0f);
        A08 = (int) (C5208Lr.A00 * 10.0f);
        A07 = (int) (C5208Lr.A00 * 44.0f);
    }

    public C5666TH(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str) {
        super(c5953Xy, interfaceC5080Jh, str);
        this.A05 = c5953Xy;
        this.A04 = C40432E.A00(c5953Xy.A00());
        this.A01 = new ImageView(getContext());
        ImageView imageView = this.A01;
        int i = A08;
        imageView.setPadding(i, i, i, i);
        this.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A01.setColorFilter(-10459280);
        int i2 = A07;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 16;
        this.A02 = new LinearLayout(getContext());
        this.A02.setOrientation(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 17;
        this.A00 = new HorizontalScrollView(getContext());
        this.A00.setHorizontalScrollBarEnabled(false);
        this.A00.setLayoutParams(layoutParams2);
        this.A00.addView(this.A02, layoutParams2);
        this.A03 = new LinearLayout(getContext());
        this.A03.setOrientation(0);
        C5245MS.A0M(this.A03, -218103809);
        this.A03.setMotionEventSplittingEnabled(false);
        this.A03.addView(this.A01, layoutParams);
        this.A03.addView(this.A00, layoutParams2);
        addView(this.A03, new FrameLayout.LayoutParams(-1, -1));
        this.A03.setClickable(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0L() {
        this.A01.setImageBitmap(C5254Mb.A01(EnumC5253Ma.CROSS));
        this.A01.setOnClickListener(new View$OnClickListenerC5310NW(this));
        this.A01.setContentDescription(A0B(4, 18, 89));
        C5305NR c5305nr = new C5305NR(this.A05);
        c5305nr.setData(this.A04.A0H(), EnumC5253Ma.HIDE_AD);
        c5305nr.setOnClickListener(new View$OnClickListenerC5311NX(this, c5305nr));
        C5305NR c5305nr2 = new C5305NR(this.A05);
        c5305nr2.setData(this.A04.A0L(), EnumC5253Ma.REPORT_AD);
        c5305nr2.setOnClickListener(new View$OnClickListenerC5312NY(this, c5305nr2));
        C5305NR c5305nr3 = new C5305NR(this.A05);
        c5305nr3.setData(this.A04.A0M(), EnumC5253Ma.AD_CHOICES_ICON);
        c5305nr3.setOnClickListener(new View$OnClickListenerC5313NZ(this, c5305nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        C5245MS.A0T(this.A03);
        this.A02.removeAllViews();
        this.A02.addView(c5305nr, layoutParams);
        this.A02.addView(c5305nr2, layoutParams);
        this.A02.addView(c5305nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0M() {
        C5245MS.A0I(this);
        C5245MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0N(C40462H c40462h, EnumC40442F enumC40442F) {
        this.A01.setOnClickListener(null);
        TextView textView = new TextView(getContext());
        C5245MS.A0X(textView, true, 14);
        textView.setText(this.A04.A0D());
        textView.setGravity(17);
        C5245MS.A0T(this.A03);
        this.A03.removeAllViews();
        this.A03.addView(textView, new LinearLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0O(C40462H c40462h, EnumC40442F enumC40442F) {
        C5245MS.A0T(this.A03);
        this.A01.setImageBitmap(C5254Mb.A01(EnumC5253Ma.BACK_ARROW));
        this.A01.setOnClickListener(new View$OnClickListenerC5314Na(this));
        this.A01.setContentDescription(A0B(0, 4, 125));
        this.A02.removeAllViews();
        this.A00.fullScroll(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A09;
        layoutParams.setMargins(0, i, i, i);
        for (C40462H c40462h2 : c40462h.A05()) {
            C5305NR c5305nr = new C5305NR(this.A05);
            c5305nr.setData(c40462h2.A04(), null);
            c5305nr.setOnClickListener(new View$OnClickListenerC5315Nb(this, c5305nr, c40462h2));
            this.A02.addView(c5305nr, layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final boolean A0P() {
        return true;
    }
}
