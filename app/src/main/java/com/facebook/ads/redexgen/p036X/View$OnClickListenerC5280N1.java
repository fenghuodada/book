package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.N1 */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5280N1 implements View.OnClickListener {
    public final /* synthetic */ C5673TO A00;

    public View$OnClickListenerC5280N1(C5673TO c5673to) {
        this.A00 = c5673to;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0X(false);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
