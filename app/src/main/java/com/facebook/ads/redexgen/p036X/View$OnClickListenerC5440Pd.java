package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pd */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5440Pd implements View.OnClickListener {
    public final /* synthetic */ C5443Pg A00;

    public View$OnClickListenerC5440Pd(C5443Pg c5443Pg) {
        this.A00 = c5443Pg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5442Pf interfaceC5442Pf;
        EnumC5441Pe enumC5441Pe;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5442Pf = this.A00.A02;
            enumC5441Pe = this.A00.A01;
            interfaceC5442Pf.ACT(enumC5441Pe);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
