package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.NW */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5310NW implements View.OnClickListener {
    public final /* synthetic */ C5666TH A00;

    public View$OnClickListenerC5310NW(C5666TH c5666th) {
        this.A00 = c5666th;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A7t();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
