package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Oo */
/* loaded from: assets/audience_network.dex */
public final class C5390Oo extends RelativeLayout {
    public final View A00;
    public final C5373OX A01;

    public C5390Oo(C5953Xy c5953Xy, View view) {
        super(c5953Xy);
        this.A00 = view;
        this.A01 = new C5373OX(c5953Xy);
        C5245MS.A0K(this.A01);
    }

    public final void A00(int i) {
        this.A00.setLayoutParams(new RelativeLayout.LayoutParams(-1, i));
    }

    public final void A01(@Nullable C5378Oc c5378Oc, boolean z) {
        this.A01.addView(this.A00, new RelativeLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(8, this.A00.getId());
        if (c5378Oc != null) {
            if (z) {
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                c5378Oc.setAlignment(3);
                layoutParams2.setMargins(AbstractC5381Of.A08 / 2, AbstractC5381Of.A08 / 2, AbstractC5381Of.A08 / 2, AbstractC5381Of.A08 / 2);
                linearLayout.addView(c5378Oc, layoutParams2);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{-1778384896, 0});
                gradientDrawable.setCornerRadius(0.0f);
                gradientDrawable.setGradientType(0);
                C5245MS.A0S(linearLayout, gradientDrawable);
            } else {
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams3.addRule(3, this.A01.getId());
                layoutParams3.setMargins(0, AbstractC5381Of.A08, 0, 0);
                c5378Oc.setAlignment(17);
                addView(c5378Oc, layoutParams3);
            }
        }
        this.A01.addView(linearLayout, layoutParams);
        addView(this.A01, new RelativeLayout.LayoutParams(-1, -2));
    }
}
