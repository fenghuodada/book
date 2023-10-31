package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.NM */
/* loaded from: assets/audience_network.dex */
public final class C5300NM extends RelativeLayout {
    public final int A00;
    public final int A01;
    public final C40422D A02;
    public final C5953Xy A03;
    public final InterfaceC5303NP A04;
    public final boolean A05;
    public static final int A09 = (int) (C5208Lr.A00 * 16.0f);
    public static final int A0A = (int) (C5208Lr.A00 * 8.0f);
    public static final int A0D = (int) (C5208Lr.A00 * 44.0f);
    public static final int A08 = (int) (C5208Lr.A00 * 10.0f);
    public static final int A07 = A09 - A08;
    public static final int A0E = (int) (C5208Lr.A00 * 75.0f);
    public static final int A0B = (int) (C5208Lr.A00 * 25.0f);
    public static final int A0F = (int) (C5208Lr.A00 * 45.0f);
    public static final int A0C = (int) (C5208Lr.A00 * 15.0f);
    public static final int A06 = (int) (C5208Lr.A00 * 16.0f);

    public C5300NM(C5299NL c5299nl) {
        super(C5299NL.A01(c5299nl));
        this.A03 = C5299NL.A01(c5299nl);
        this.A02 = C40432E.A00(this.A03.A00());
        this.A04 = C5299NL.A03(c5299nl);
        this.A01 = C5299NL.A09(c5299nl) ? A0E : A0F;
        this.A00 = C5299NL.A09(c5299nl) ? A0B : A0C;
        this.A05 = C5299NL.A0A(c5299nl);
        setFocusable(true);
        View A01 = A01(c5299nl);
        View A00 = A00(c5299nl);
        View footerView = getFooterView();
        C5245MS.A0K(A01);
        C5245MS.A0K(A00);
        C5245MS.A0K(footerView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        layoutParams2.addRule(3, A01.getId());
        layoutParams2.addRule(2, footerView.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(12);
        int i = A09;
        layoutParams3.setMargins(i, 0, i, i);
        addView(A01, layoutParams);
        addView(A00, layoutParams2);
        addView(footerView, layoutParams3);
        footerView.setVisibility(C5299NL.A0B(c5299nl) ? 0 : 8);
    }

    public /* synthetic */ C5300NM(C5299NL c5299nl, View$OnClickListenerC5297NJ view$OnClickListenerC5297NJ) {
        this(c5299nl);
    }

    private View A00(C5299NL c5299nl) {
        ImageView imageView = new ImageView(getContext());
        int i = this.A00;
        imageView.setPadding(i, i, i, i);
        imageView.setImageBitmap(C5254Mb.A01(C5299NL.A02(c5299nl)));
        imageView.setColorFilter(-1);
        int i2 = this.A01;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C5299NL.A00(c5299nl));
        C5245MS.A0S(imageView, gradientDrawable);
        layoutParams.gravity = 17;
        int i3 = A09;
        layoutParams.setMargins(i3, 0, i3, i3);
        TextView textView = new TextView(getContext());
        C5245MS.A0X(textView, true, 20);
        textView.setTextColor(-14934495);
        textView.setText(C5299NL.A04(c5299nl));
        textView.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        int i4 = A09;
        layoutParams2.setMargins(i4, 0, i4, i4);
        TextView textView2 = new TextView(getContext());
        C5245MS.A0X(textView2, false, 16);
        textView2.setTextColor(-10459280);
        textView2.setText(C5299NL.A05(c5299nl));
        textView2.setGravity(17);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i5 = A09;
        layoutParams3.setMargins(i5, 0, i5, i5);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        linearLayout.addView(textView2, layoutParams3);
        if (C5299NL.A08(c5299nl)) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(17);
            if (!TextUtils.isEmpty(C5299NL.A06(c5299nl))) {
                C5372OW c5372ow = new C5372OW(this.A03);
                int i6 = A0F;
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i6, i6);
                layoutParams4.setMargins(0, 0, A0A, 0);
                c5372ow.setFullCircleCorners(true);
                AsyncTaskC5652T3 asyncTaskC5652T3 = new AsyncTaskC5652T3(c5372ow, this.A03);
                int i7 = A0F;
                asyncTaskC5652T3.A05(i7, i7).A07(C5299NL.A06(c5299nl));
                linearLayout2.addView(c5372ow, layoutParams4);
            }
            C5305NR c5305nr = new C5305NR(this.A03);
            c5305nr.setData(C5299NL.A07(c5299nl), EnumC5253Ma.CHECKMARK);
            c5305nr.setSelected(true);
            LinearLayout.LayoutParams selectedOptionParams = new LinearLayout.LayoutParams(-2, -2);
            linearLayout2.addView(c5305nr, selectedOptionParams);
            linearLayout.addView(linearLayout2);
        }
        return linearLayout;
    }

    private View A01(C5299NL c5299nl) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        if (C5299NL.A0C(c5299nl)) {
            ImageView imageView = new ImageView(getContext());
            int i = A08;
            imageView.setPadding(i, i, i, i);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setImageBitmap(C5254Mb.A01(EnumC5253Ma.CROSS));
            imageView.setOnClickListener(new View$OnClickListenerC5297NJ(this));
            int i2 = A0D;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
            int i3 = A07;
            layoutParams.setMargins(i3, i3, i3, i3);
            linearLayout.addView(imageView, layoutParams);
        }
        return linearLayout;
    }

    private View getFooterView() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(C5254Mb.A01(EnumC5253Ma.SETTINGS));
        imageView.setColorFilter(-13272859);
        int i = A06;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        TextView textView = new TextView(getContext());
        C5245MS.A0X(textView, false, 16);
        textView.setTextColor(-13272859);
        int i2 = A0A;
        textView.setPadding(i2, i2, i2, i2);
        textView.setText(this.A02.A0J());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        linearLayout.setOnClickListener(new View$OnClickListenerC5298NK(this));
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }
}
