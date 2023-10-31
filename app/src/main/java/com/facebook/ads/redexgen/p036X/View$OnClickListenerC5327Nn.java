package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nn */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5327Nn implements View.OnClickListener {
    public final /* synthetic */ C5332Ns A00;

    public View$OnClickListenerC5327Nn(C5332Ns c5332Ns) {
        this.A00 = c5332Ns;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5331Nr interfaceC5331Nr;
        InterfaceC5331Nr interfaceC5331Nr2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5331Nr = this.A00.A04;
            if (interfaceC5331Nr == null) {
                return;
            }
            interfaceC5331Nr2 = this.A00.A04;
            interfaceC5331Nr2.AAK();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
