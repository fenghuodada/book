package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dD */
/* loaded from: assets/audience_network.dex */
public class C6275dD implements InterfaceC42535f {
    public final /* synthetic */ C40061d A00;
    public final /* synthetic */ C5953Xy A01;
    public final /* synthetic */ boolean A02;

    public C6275dD(C40061d c40061d, C5953Xy c5953Xy, boolean z) {
        this.A00 = c40061d;
        this.A01 = c5953Xy;
        this.A02 = z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA1() {
        InterfaceC40051c interfaceC40051c;
        C6281dJ c6281dJ;
        if (!C5064JR.A1A(this.A01) || !this.A02) {
            interfaceC40051c = this.A00.A04;
            interfaceC40051c.A9v();
            return;
        }
        C40061d c40061d = this.A00;
        C5953Xy c5953Xy = this.A01;
        c6281dJ = c40061d.A03;
        c40061d.A02 = C5412PB.A01(c5953Xy, c6281dJ, 1, new C6276dE(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA2() {
        InterfaceC40051c interfaceC40051c;
        interfaceC40051c = this.A00.A04;
        interfaceC40051c.A9u(AdError.CACHE_ERROR);
    }
}
