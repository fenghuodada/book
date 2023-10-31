package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.bZ */
/* loaded from: assets/audience_network.dex */
public class C6176bZ extends AbstractRunnableC5153Kv {
    public final /* synthetic */ C6173bW A00;
    public final /* synthetic */ C5115KH A01;

    public C6176bZ(C6173bW c6173bW, C5115KH c5115kh) {
        this.A00 = c6173bW;
        this.A01 = c5115kh;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5153Kv
    public final void A01() {
        C42385Q c42385q;
        C42385Q c42385q2;
        c42385q = this.A00.A00;
        if (c42385q.A00() != null) {
            c42385q2 = this.A00.A00;
            c42385q2.A00().onAdError(C5194Ld.A00(this.A01));
        }
    }
}
