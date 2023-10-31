package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nd */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5317Nd implements View.OnClickListener {
    public final /* synthetic */ C5319Nf A00;

    public View$OnClickListenerC5317Nd(C5319Nf c5319Nf) {
        this.A00 = c5319Nf;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5303NP interfaceC5303NP;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5303NP = this.A00.A02;
            interfaceC5303NP.A7t();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
