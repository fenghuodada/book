package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NK */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5298NK implements View.OnClickListener {
    public final /* synthetic */ C5300NM A00;

    public View$OnClickListenerC5298NK(C5300NM c5300nm) {
        this.A00 = c5300nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5303NP interfaceC5303NP;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5303NP = this.A00.A04;
            interfaceC5303NP.A8k();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
