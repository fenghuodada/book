package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sv */
/* loaded from: assets/audience_network.dex */
public final class C5644Sv extends AbstractC5381Of {
    public C5644Sv(C5385Oj c5385Oj, boolean z) {
        super(c5385Oj, true);
        RelativeLayout relativeLayout = new RelativeLayout(c5385Oj.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        C5245MS.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c5385Oj.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        C5245MS.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC5381Of.A08, 0, AbstractC5381Of.A08, AbstractC5381Of.A08);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? AbstractC5381Of.A08 : 0, z ? 0 : AbstractC5381Of.A08, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        LinearLayout auxContainer = getTitleDescContainer();
        linearLayout.addView(auxContainer, layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        addView(c5385Oj.A02(), new RelativeLayout.LayoutParams(-1, -1));
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return true;
    }
}
