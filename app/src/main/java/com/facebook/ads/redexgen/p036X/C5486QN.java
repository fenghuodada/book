package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.QN */
/* loaded from: assets/audience_network.dex */
public class C5486QN extends AbstractRunnableC5165L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5483QK A02;

    public C5486QN(C5483QK c5483qk, int i, int i2) {
        this.A02 = c5483qk;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C44829b c44829b;
        c44829b = this.A02.A0B;
        c44829b.A02(new C5159L1(this.A00, this.A01));
    }
}
