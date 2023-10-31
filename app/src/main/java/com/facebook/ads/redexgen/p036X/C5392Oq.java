package com.facebook.ads.redexgen.p036X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Oq */
/* loaded from: assets/audience_network.dex */
public final class C5392Oq extends FrameLayout {
    public final int A00;
    public final RelativeLayout A01;
    public final View$OnClickListenerC5650T1 A02;
    public final C5385Oj A03;
    public static final int A06 = (int) (C5208Lr.A00 * 36.0f);
    public static final int A07 = (int) (C5208Lr.A00 * 36.0f);
    public static final int A04 = (int) (C5208Lr.A00 * 23.0f);
    public static final int A05 = (int) (C5208Lr.A00 * 3.0f);
    public static final int A08 = (int) (C5208Lr.A00 * 4.0f);

    public C5392Oq(C5385Oj c5385Oj, String str, C39871K c39871k, InterfaceC5362OM interfaceC5362OM) {
        super(c5385Oj.A05());
        this.A03 = c5385Oj;
        this.A00 = c39871k.A08(true);
        this.A01 = new RelativeLayout(c5385Oj.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A01(str);
        this.A02 = new View$OnClickListenerC5650T1(c5385Oj.A05(), c5385Oj.A04().A0T(), null, c5385Oj.A06(), c5385Oj.A09(), c5385Oj.A0B(), c5385Oj.A07());
        this.A02.setCta(c5385Oj.A04().A0O().A0F(), c5385Oj.A04().A0U(), new HashMap(), interfaceC5362OM);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A00(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(C5254Mb.A01(EnumC5253Ma.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A04;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A05;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A01(String str) {
        Button button = new Button(this.A03.A05());
        C5245MS.A0K(button);
        int i = A07;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        C5245MS.A0O(button, this.A00, A08);
        button.setTextColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A06);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(button, layoutParams);
        A00(button);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}
