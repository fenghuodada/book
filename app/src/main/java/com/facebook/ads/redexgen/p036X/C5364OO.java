package com.facebook.ads.redexgen.p036X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.OO */
/* loaded from: assets/audience_network.dex */
public final class C5364OO {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.2L] */
    public static C40502L A00(final C5385Oj c5385Oj, final C5721UB c5721ub, final String str, final C4525AI c4525ai) {
        return new C4518AB(c5385Oj, c5721ub, true, str, c4525ai) { // from class: com.facebook.ads.redexgen.X.2L
            @Nullable
            public View$OnClickListenerC5650T1 A00;
            @Nullable
            public C5437Pa A01;
            public final InterfaceC5080Jh A02 = this.A0I.A05().A00().A08();
            public final C5721UB A03;
            public final C4525AI A04;
            public final String A05;
            public static final int A07 = (int) (C5208Lr.A00 * (-4.0f));
            public static final int A06 = (int) (C5208Lr.A00 * 6.0f);

            {
                this.A03 = c5721ub;
                this.A05 = str;
                this.A04 = c4525ai;
                this.A03.A1K(this);
            }

            @Override // com.facebook.ads.redexgen.p036X.AbstractC5634Sl
            public void setupNativeCtaExtension(C5437Pa c5437Pa) {
                this.A01 = c5437Pa;
                int A0K = C5064JR.A0K(this.A0I.A05());
                C39871K A01 = this.A03.A0z().A0N().A01();
                this.A00 = new View$OnClickListenerC5650T1(this.A0I.A05(), this.A03.A0z().A0T(), A01, this.A02, C5344O4.getDummyListener(), this.A04.A0c(), this.A03.A19());
                this.A00.setCta(c5437Pa.A03().A0F(), this.A05, new HashMap());
                this.A03.A1K(this.A00);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                if (A0K == 1) {
                    layoutParams.addRule(12);
                    C5245MS.A0P(this.A00, A06, 5, A01.A09(false));
                    ((C4518AB) this).A06.addView(this.A00, layoutParams);
                } else if (A0K != 2) {
                } else {
                    layoutParams.addRule(3, ((C4518AB) this).A06.getId());
                    layoutParams.setMargins(0, A07, 0, 0);
                    addView(this.A00, 0, layoutParams);
                    ((C4518AB) this).A06.bringToFront();
                }
            }
        };
    }

    public static C4518AB A01(C5385Oj c5385Oj, String str, C5598SB c5598sb) {
        return new C4518AB(c5385Oj, true, str, c5598sb);
    }
}
