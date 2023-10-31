package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.bj */
/* loaded from: assets/audience_network.dex */
public class C6186bj extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C6185bi A00;
    public final /* synthetic */ C4508A1 A01;

    public C6186bj(C6185bi c6185bi, C4508A1 c4508a1) {
        this.A00 = c6185bi;
        this.A01 = c4508a1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1A());
        this.A00.A02.A1c(true, true);
    }
}
