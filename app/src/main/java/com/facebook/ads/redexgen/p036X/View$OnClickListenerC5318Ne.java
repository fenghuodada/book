package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5318Ne implements View.OnClickListener {
    public final /* synthetic */ C40462H A00;
    public final /* synthetic */ C5305NR A01;
    public final /* synthetic */ C5319Nf A02;

    public View$OnClickListenerC5318Ne(C5319Nf c5319Nf, C5305NR c5305nr, C40462H c40462h) {
        this.A02 = c5319Nf;
        this.A01 = c5305nr;
        this.A00 = c40462h;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5303NP interfaceC5303NP;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            interfaceC5303NP = this.A02.A02;
            interfaceC5303NP.ABf(this.A00);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
