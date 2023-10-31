package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.QL */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC5484QL implements View.OnClickListener {
    public final /* synthetic */ C5125KS A00;

    public View$OnClickListenerC5484QL(C5125KS c5125ks) {
        this.A00 = c5125ks;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C5088Jp c5088Jp;
        C5953Xy c5953Xy;
        C5483QK c5483qk;
        boolean A07;
        C5483QK c5483qk2;
        C5483QK c5483qk3;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            c5088Jp = this.A00.A03;
            c5088Jp.A02(EnumC5087Jo.A0d, null);
            c5953Xy = this.A00.A02;
            c5953Xy.A0D().A2z();
            c5483qk = this.A00.A00;
            if (c5483qk != null) {
                A07 = this.A00.A07();
                if (A07) {
                    c5483qk3 = this.A00.A00;
                    c5483qk3.setVolume(1.0f);
                } else {
                    c5483qk2 = this.A00.A00;
                    c5483qk2.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
