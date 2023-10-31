package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Sn */
/* loaded from: assets/audience_network.dex */
public class C5636Sn extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5635Sm A00;
    public final /* synthetic */ boolean A01;

    public C5636Sn(C5635Sm c5635Sm, boolean z) {
        this.A00 = c5635Sm;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5385Oj c5385Oj;
        c5385Oj = this.A00.A0E;
        AbstractC5268Mp A08 = c5385Oj.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A01 || A08.A05()) ? false : true);
        A08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
