package com.facebook.ads.redexgen.p036X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Mu */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5273Mu implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public View$OnClickListenerC5273Mu(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC5267Mo interfaceC5267Mo;
        C5288NA c5288na;
        InterfaceC5267Mo interfaceC5267Mo2;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            interfaceC5267Mo = this.A00.A00;
            if (interfaceC5267Mo != null) {
                c5288na = this.A00.A05;
                if (c5288na.A03()) {
                    interfaceC5267Mo2 = this.A00.A00;
                    interfaceC5267Mo2.AAK();
                }
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
