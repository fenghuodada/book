package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.WY */
/* loaded from: assets/audience_network.dex */
public final class C5865WY implements InterfaceC4682D5 {
    public final int A00;
    public final int A01;
    public final C5022Ij A02;

    public C5865WY(C5866WZ c5866wz) {
        this.A02 = c5866wz.A00;
        this.A02.A0Y(12);
        this.A00 = this.A02.A0H();
        this.A01 = this.A02.A0H();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4682D5
    public final int A7J() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4682D5
    public final boolean A8U() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4682D5
    public final int ADd() {
        int i = this.A00;
        return i == 0 ? this.A02.A0H() : i;
    }
}
