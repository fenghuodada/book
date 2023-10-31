package com.facebook.ads.redexgen.p036X;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.AA */
/* loaded from: assets/audience_network.dex */
public final class C4517AA extends AbstractC5645Sw {
    public static final int A02 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final View A00;
    public final boolean A01;

    public C4517AA(C5385Oj c5385Oj, boolean z) {
        super(c5385Oj, true);
        this.A01 = z;
        this.A00 = c5385Oj.A02();
        A0f();
        if (this.A01) {
            addView(c5385Oj.A02(), new RelativeLayout.LayoutParams(-1, -1));
        } else {
            FrameLayout frameLayout = new FrameLayout(c5385Oj.A05());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2, getAdDetailsView().getId());
            frameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
            layoutParams2.gravity = 17;
            layoutParams2.setMargins(AbstractC5381Of.A08, 0, AbstractC5381Of.A08, 0);
            frameLayout.addView(this.A00, layoutParams2);
            addView(frameLayout);
        }
        getAdDetailsView().bringToFront();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A02() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0B() {
        return this.A01 && super.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5645Sw, com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
        if (!this.A01 && d > 0.0d) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) ((A02 - (AbstractC5381Of.A08 * 2)) / d));
            layoutParams.gravity = 17;
            layoutParams.setMargins(AbstractC5381Of.A08, 0, AbstractC5381Of.A08, 0);
            this.A00.setLayoutParams(layoutParams);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return this.A01;
    }
}
