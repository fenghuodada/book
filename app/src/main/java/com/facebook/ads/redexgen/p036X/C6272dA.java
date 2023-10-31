package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dA */
/* loaded from: assets/audience_network.dex */
public class C6272dA implements InterfaceC40141l {
    public final /* synthetic */ C40061d A00;

    public C6272dA(C40061d c40061d) {
        this.A00 = c40061d;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40141l
    public final void ABm(AdError adError) {
        InterfaceC40051c interfaceC40051c;
        interfaceC40051c = this.A00.A04;
        interfaceC40051c.A9u(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40141l
    public final void ABn() {
        InterfaceC40051c interfaceC40051c;
        interfaceC40051c = this.A00.A04;
        interfaceC40051c.A9v();
    }
}
