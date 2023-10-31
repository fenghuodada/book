package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NJ */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5297NJ implements View.OnClickListener {
    public final /* synthetic */ C5300NM A00;

    public View$OnClickListenerC5297NJ(C5300NM c5300nm) {
        this.A00 = c5300nm;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC5303NP interfaceC5303NP;
        InterfaceC5303NP interfaceC5303NP2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC5303NP2 = this.A00.A04;
                interfaceC5303NP2.A42();
                return;
            }
            interfaceC5303NP = this.A00.A04;
            interfaceC5303NP.A43();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
