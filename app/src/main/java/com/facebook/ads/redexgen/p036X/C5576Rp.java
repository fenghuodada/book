package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Rp */
/* loaded from: assets/audience_network.dex */
public class C5576Rp extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5460Px A00;

    public C5576Rp(C5460Px c5460Px) {
        this.A00 = c5460Px;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5483QK c5483qk;
        AbstractC5282N3 abstractC5282N3;
        AbstractC5216Lz abstractC5216Lz;
        AbstractC5285N6 abstractC5285N6;
        c5483qk = this.A00.A02;
        C44829b<AbstractC44839c, C44819a> eventBus = c5483qk.getEventBus();
        abstractC5282N3 = this.A00.A04;
        abstractC5216Lz = this.A00.A05;
        abstractC5285N6 = this.A00.A03;
        eventBus.A04(abstractC5282N3, abstractC5216Lz, abstractC5285N6);
    }
}
