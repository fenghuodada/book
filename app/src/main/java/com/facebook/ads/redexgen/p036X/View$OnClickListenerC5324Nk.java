package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nk */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5324Nk implements View.OnClickListener {
    public final /* synthetic */ C5665TG A00;

    public View$OnClickListenerC5324Nk(C5665TG c5665tg) {
        this.A00 = c5665tg;
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
