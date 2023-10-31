package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.OR */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5367OR implements View.OnClickListener {
    public final /* synthetic */ C5370OU A00;

    public View$OnClickListenerC5367OR(C5370OU c5370ou) {
        this.A00 = c5370ou;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5369OT interfaceC5369OT;
        View v;
        View[] viewArr;
        C5483QK c5483qk;
        C5483QK c5483qk2;
        C5483QK c5483qk3;
        View v2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5369OT = this.A00.A04;
            interfaceC5369OT.ABP();
            v = this.A00.A00;
            if (v != null) {
                v2 = this.A00.A00;
                C5245MS.A0L(v2);
            }
            viewArr = this.A00.A06;
            for (View v3 : viewArr) {
                C5245MS.A0N(v3, 0);
            }
            C5245MS.A0J(this.A00);
            c5483qk = this.A00.A05;
            if (c5483qk == null) {
                return;
            }
            c5483qk2 = this.A00.A05;
            C5245MS.A0N(c5483qk2, 0);
            c5483qk3 = this.A00.A05;
            c5483qk3.A0b(EnumC5469Q6.A02, 14);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
