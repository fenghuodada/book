package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.VZ */
/* loaded from: assets/audience_network.dex */
public final class C5807VZ implements InterfaceC4852Fv {
    public final int A00;
    public final /* synthetic */ C4644CE A01;

    public C5807VZ(C4644CE c4644ce, int i) {
        this.A01 = c4644ce;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4852Fv
    public final boolean A8c() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4852Fv
    public final void A9X() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4852Fv
    public final int ADa(C4541AZ c4541az, C5895X2 c5895x2, boolean z) {
        return this.A01.A0P(this.A00, c4541az, c5895x2, z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4852Fv
    public final int AEs(long j) {
        return this.A01.A0O(this.A00, j);
    }
}
