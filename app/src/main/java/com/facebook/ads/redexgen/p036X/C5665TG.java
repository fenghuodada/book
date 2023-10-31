package com.facebook.ads.redexgen.p036X;

import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TG */
/* loaded from: assets/audience_network.dex */
public final class C5665TG extends AbstractC5301NN {
    public static byte[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public final ImageView A00;
    public final LinearLayout A01;
    public final ScrollView A02;
    public final C40422D A03;
    public final C5953Xy A04;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A05 = new byte[]{53, 22, 20, 28, 105, 70, 69, 89, 79, 10, 107, 78, 10, 120, 79, 90, 69, 88, 94, 67, 68, 77};
    }

    static {
        A0C();
        A08 = (int) (C5208Lr.A00 * 8.0f);
        A07 = (int) (C5208Lr.A00 * 10.0f);
        A06 = (int) (C5208Lr.A00 * 44.0f);
    }

    public C5665TG(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str) {
        super(c5953Xy, interfaceC5080Jh, str);
        this.A04 = c5953Xy;
        this.A03 = C40432E.A00(this.A04.A00());
        this.A00 = new ImageView(getContext());
        ImageView imageView = this.A00;
        int i = A07;
        imageView.setPadding(i, i, i, i);
        this.A00.setColorFilter(-10459280);
        int i2 = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 3;
        this.A00.setLayoutParams(layoutParams);
        this.A02 = new ScrollView(getContext());
        this.A02.setFillViewport(true);
        C5245MS.A0M(this.A02, -218103809);
        this.A01 = new LinearLayout(getContext());
        this.A01.setOrientation(1);
        LinearLayout linearLayout = this.A01;
        int i3 = A08;
        linearLayout.setPadding(i3, i3, i3, i3);
        this.A02.addView(this.A01, new FrameLayout.LayoutParams(-1, -2));
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0L() {
        this.A00.setImageBitmap(C5254Mb.A01(EnumC5253Ma.CROSS));
        this.A00.setOnClickListener(new View$OnClickListenerC5320Ng(this));
        this.A00.setContentDescription(A0B(4, 18, 29));
        C5305NR c5305nr = new C5305NR(this.A04);
        c5305nr.setData(this.A03.A0H(), EnumC5253Ma.HIDE_AD);
        c5305nr.setOnClickListener(new View$OnClickListenerC5321Nh(this, c5305nr));
        C5305NR c5305nr2 = new C5305NR(this.A04);
        c5305nr2.setData(this.A03.A0L(), EnumC5253Ma.REPORT_AD);
        c5305nr2.setOnClickListener(new View$OnClickListenerC5322Ni(this, c5305nr2));
        C5305NR c5305nr3 = new C5305NR(this.A04);
        c5305nr3.setData(this.A03.A0M(), EnumC5253Ma.AD_CHOICES_ICON);
        c5305nr3.setOnClickListener(new View$OnClickListenerC5323Nj(this, c5305nr3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        layoutParams.gravity = 17;
        LinearLayout menuLayout = new LinearLayout(getContext());
        menuLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, 0);
        layoutParams2.gravity = 17;
        layoutParams2.weight = 1.0f;
        C5245MS.A0T(this.A01);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(menuLayout, layoutParams2);
        menuLayout.addView(c5305nr, layoutParams);
        menuLayout.addView(c5305nr2, layoutParams);
        menuLayout.addView(c5305nr3, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0M() {
        C5245MS.A0I(this);
        C5245MS.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0N(C40462H c40462h, EnumC40442F enumC40442F) {
        String A0H;
        EnumC5253Ma enumC5253Ma;
        int i;
        this.A00.setOnClickListener(null);
        if (enumC40442F == EnumC40442F.A05) {
            A0H = this.A03.A0F();
            enumC5253Ma = EnumC5253Ma.REPORT_AD;
            i = -552389;
        } else {
            A0H = this.A03.A0H();
            enumC5253Ma = EnumC5253Ma.HIDE_AD;
            i = -13272859;
        }
        C5300NM A0M = new C5299NL(this.A04, this.A0B).A0I(A0H).A0H(this.A03.A0D()).A0F(c40462h.A04()).A0K(false).A0E(enumC5253Ma).A0D(i).A0L(false).A0J(false).A0M();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        C5245MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(A0M, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final void A0O(C40462H c40462h, EnumC40442F enumC40442F) {
        C5319Nf c5319Nf = new C5319Nf(this.A04, c40462h, this.A0B, enumC40442F == EnumC40442F.A05 ? EnumC5253Ma.REPORT_AD : EnumC5253Ma.HIDE_AD);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, 0);
        layoutParams.gravity = 17;
        layoutParams.weight = 1.0f;
        this.A00.setImageBitmap(C5254Mb.A01(EnumC5253Ma.BACK_ARROW));
        this.A00.setOnClickListener(new View$OnClickListenerC5324Nk(this));
        this.A00.setContentDescription(A0B(0, 4, 64));
        C5245MS.A0T(this.A01);
        this.A02.fullScroll(33);
        this.A01.removeAllViews();
        this.A01.addView(this.A00);
        this.A01.addView(c5319Nf, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5301NN
    public final boolean A0P() {
        return true;
    }
}
