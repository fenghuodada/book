package com.facebook.ads.redexgen.p036X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ow */
/* loaded from: assets/audience_network.dex */
public final class C5398Ow {
    public static AbstractC4510A3 A00(final C5385Oj c5385Oj, int i, final String str, final C5598SB c5598sb) {
        if (i == 1) {
            return new AbstractC4510A3(c5385Oj, str, c5598sb) { // from class: com.facebook.ads.redexgen.X.1i
                public static final int A00 = (int) (C5208Lr.A00 * 20.0f);
                public static final int A01 = (int) (C5208Lr.A00 * 16.0f);

                @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.p036X.AbstractC4510A3
                public final void A0j(C5953Xy c5953Xy) {
                    C5378Oc titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(c5953Xy);
                    C5245MS.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i2 = A01;
                    linearLayout.setPadding(i2, i2, i2, i2);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AbstractC4510A3(c5385Oj, str, c5598sb) { // from class: com.facebook.ads.redexgen.X.26
            public static final int A00 = (int) (C5208Lr.A00 * 12.0f);

            @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC4510A3, com.facebook.ads.redexgen.p036X.AbstractC5381Of
            public final boolean A0B() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC4510A3
            public final void A0j(C5953Xy c5953Xy) {
                C5378Oc titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                C5245MS.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
