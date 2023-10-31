package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OS */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5368OS implements View.OnClickListener {
    public final /* synthetic */ C5370OU A00;

    public View$OnClickListenerC5368OS(C5370OU c5370ou) {
        this.A00 = c5370ou;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
