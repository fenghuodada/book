package com.facebook.ads.redexgen.p036X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.FQ */
/* loaded from: assets/audience_network.dex */
public final class C4821FQ extends AbstractC6264d2 {
    @Nullable
    public View A00;
    public C4780El A01;

    public C4821FQ(C4780El c4780El, C40181p c40181p) {
        super(c4780El, c40181p);
        this.A01 = c4780El;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
            return;
        }
        this.A01.A0D().A3o();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0L(InterfaceC39540n interfaceC39540n, C44639H c44639h, C44619F c44619f, C40191q c40191q) {
        this.A01.A0D().A3h();
        C6301dd c6301dd = (C6301dd) interfaceC39540n;
        C6267d5 c6267d5 = new C6267d5(this, c40191q, c6301dd);
        A0C().postDelayed(c6267d5, c44639h.A05().A05());
        c6301dd.A0I(this.A01, this.A08, this.A07.A07, new C6266d4(this, c6267d5), c40191q);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0R(boolean z) {
        super.A0R(z);
        this.A00 = null;
    }
}
