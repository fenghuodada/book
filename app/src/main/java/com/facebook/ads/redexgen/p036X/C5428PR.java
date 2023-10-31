package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.PR */
/* loaded from: assets/audience_network.dex */
public final class C5428PR extends LinearLayout {
    @Nullable
    public LinearLayout A00;
    public final int A01;
    public final C5953Xy A02;
    public final C5372OW A03;
    public final C5378Oc A04;
    public static final int A07 = (int) (C5208Lr.A00 * 16.0f);
    public static final int A08 = (int) (C5208Lr.A00 * 16.0f);
    public static final int A06 = (int) (C5208Lr.A00 * 8.0f);
    public static final int A05 = (int) (C5208Lr.A00 * 72.0f);

    public C5428PR(C5426PP c5426pp) {
        super(C5426PP.A04(c5426pp));
        this.A02 = C5426PP.A04(c5426pp);
        this.A03 = new C5372OW(this.A02);
        this.A04 = new C5378Oc(this.A02, C5426PP.A02(c5426pp), true, false, true);
        this.A01 = C5426PP.A00(c5426pp);
        A03(c5426pp);
    }

    public /* synthetic */ C5428PR(C5426PP c5426pp, C5608SL c5608sl) {
        this(c5426pp);
    }

    private void A00() {
        A01(this.A03, 150);
        A01(this.A04, 170);
        LinearLayout linearLayout = this.A00;
        if (linearLayout != null) {
            A01(linearLayout, 190);
        }
    }

    private void A01(View view, int i) {
        view.setTranslationY(i);
        view.setScaleY(0.75f);
        view.setScaleX(0.75f);
        view.animate().translationYBy(-i).scaleX(1.0f).scaleY(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator(2.0f));
    }

    private void A02(C5426PP c5426pp) {
        if (!TextUtils.isEmpty(C5426PP.A05(c5426pp))) {
            this.A00 = new LinearLayout(getContext());
            this.A00.setGravity(17);
            LinearLayout linearLayout = this.A00;
            int i = A08;
            linearLayout.setPadding(i, i / 2, i, i / 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, A08 / 2, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTextColor(-1);
            C5245MS.A0X(textView, false, 16);
            textView.setText(C5426PP.A05(c5426pp));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
            ImageView imageView = new ImageView(getContext());
            new AsyncTaskC5652T3(imageView, this.A02).A04().A07(C5426PP.A06(c5426pp));
            int i2 = A07;
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i2, i2);
            layoutParams3.setMargins(0, 0, A08 / 2, 0);
            this.A00.addView(imageView, layoutParams3);
            this.A00.addView(textView, layoutParams2);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(100.0f);
            gradientDrawable.setColor(469762047);
            C5245MS.A0S(this.A00, gradientDrawable);
            addView(this.A00, layoutParams);
        }
    }

    private void A03(C5426PP c5426pp) {
        C5245MS.A0M(this.A03, 0);
        this.A03.setRadius(50);
        if (C5426PP.A01(c5426pp).A00() == EnumC39831G.A05) {
            this.A03.setFullCircleCorners(true);
        } else {
            this.A03.setRadius(A06);
        }
        new AsyncTaskC5652T3(this.A03, this.A02).A04().A07(C5426PP.A03(c5426pp).A01());
        this.A04.A01(C5426PP.A01(c5426pp).A06(), C5426PP.A03(c5426pp).A03(), null, false, true);
        this.A04.getDescriptionTextView().setAlpha(0.8f);
        this.A04.setAlignment(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i = A08;
        layoutParams.setMargins(0, i, 0, i / 2);
        View view = this.A03;
        int i2 = A05;
        addView(view, new LinearLayout.LayoutParams(i2, i2));
        addView(this.A04, layoutParams);
        A02(c5426pp);
        C5245MS.A0M(this, -14473425);
        setGravity(17);
        setOrientation(1);
    }

    public final void A04(InterfaceC5427PQ interfaceC5427PQ) {
        A00();
        postDelayed(new C5608SL(this, interfaceC5427PQ), this.A01);
    }
}
