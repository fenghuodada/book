package com.facebook.ads.redexgen.p036X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.St */
/* loaded from: assets/audience_network.dex */
public final class C5642St extends AbstractC5381Of {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C5390Oo A00;

    public C5642St(C5385Oj c5385Oj, boolean z) {
        super(c5385Oj, z);
        this.A00 = new C5390Oo(c5385Oj.A05(), c5385Oj.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC5381Of.A08, AbstractC5381Of.A08, AbstractC5381Of.A08, AbstractC5381Of.A08);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c5385Oj.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC5381Of.A08, 0, AbstractC5381Of.A08, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A02() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
        if (d > 0.0d) {
            this.A00.A00((int) ((A01 - (AbstractC5381Of.A08 * 2)) / d));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return false;
    }
}
