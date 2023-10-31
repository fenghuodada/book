package com.facebook.ads.redexgen.p036X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.SC */
/* loaded from: assets/audience_network.dex */
public class C5599SC implements InterfaceC5396Ou {
    public final /* synthetic */ C5598SB A00;

    public C5599SC(C5598SB c5598sb) {
        this.A00 = c5598sb;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5396Ou
    public final void ACm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5396Ou
    public final void ACo(View view) {
        AbstractC5634Sl abstractC5634Sl = (AbstractC5634Sl) view;
        abstractC5634Sl.A0g();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC5634Sl.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
