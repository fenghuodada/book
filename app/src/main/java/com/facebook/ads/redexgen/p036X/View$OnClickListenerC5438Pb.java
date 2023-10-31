package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5438Pb implements View.OnClickListener {
    public final /* synthetic */ C5439Pc A00;

    public View$OnClickListenerC5438Pb(C5439Pc c5439Pc) {
        this.A00 = c5439Pc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C43246p c43246p;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            c43246p = this.A00.A05;
            c43246p.performClick();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
