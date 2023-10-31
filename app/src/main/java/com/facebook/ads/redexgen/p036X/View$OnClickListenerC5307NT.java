package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NT */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5307NT implements View.OnClickListener {
    public final /* synthetic */ C5667TI A00;

    public View$OnClickListenerC5307NT(C5667TI c5667ti) {
        this.A00 = c5667ti;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.ABW(EnumC40442F.A03);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
