package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.d3 */
/* loaded from: assets/audience_network.dex */
public class C6265d3 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ AbstractC6264d2 A00;
    public final /* synthetic */ C5115KH A01;

    public C6265d3(AbstractC6264d2 abstractC6264d2, C5115KH c5115kh) {
        this.A00 = abstractC6264d2;
        this.A01 = c5115kh;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A00.A0B.A0D().A4Z(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A06 != null) {
            this.A00.A06.A0G(this.A01);
        }
    }
}
