package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NX */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5311NX implements View.OnClickListener {
    public final /* synthetic */ C5305NR A00;
    public final /* synthetic */ C5666TH A01;

    public View$OnClickListenerC5311NX(C5666TH c5666th, C5305NR c5305nr) {
        this.A01 = c5666th;
        this.A00 = c5305nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.ABW(EnumC40442F.A03);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
