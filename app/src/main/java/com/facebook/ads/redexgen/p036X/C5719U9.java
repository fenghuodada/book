package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.U9 */
/* loaded from: assets/audience_network.dex */
public class C5719U9 extends AbstractRunnableC5153Kv {
    public final /* synthetic */ C4585BH A00;
    public final /* synthetic */ C5115KH A01;

    public C5719U9(C4585BH c4585bh, C5115KH c5115kh) {
        this.A00 = c4585bh;
        this.A01 = c5115kh;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5153Kv
    public final void A01() {
        this.A00.A01.onError(this.A00.A00, C5194Ld.A00(this.A01));
    }
}
