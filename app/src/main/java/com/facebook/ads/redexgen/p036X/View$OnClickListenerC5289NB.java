package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NB */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5289NB implements View.OnClickListener {
    public final /* synthetic */ C5671TM A00;

    public View$OnClickListenerC5289NB(C5671TM c5671tm) {
        this.A00 = c5671tm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5291ND interfaceC5291ND;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5291ND = this.A00.A06;
            interfaceC5291ND.AAo();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
