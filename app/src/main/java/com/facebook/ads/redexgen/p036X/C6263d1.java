package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.d1 */
/* loaded from: assets/audience_network.dex */
public class C6263d1 extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C6300dc A00;
    public final /* synthetic */ C40191q A01;
    public final /* synthetic */ C4820FP A02;

    public C6263d1(C4820FP c4820fp, C40191q c40191q, C6300dc c6300dc) {
        this.A02 = c4820fp;
        this.A01 = c40191q;
        this.A00 = c6300dc;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        C5115KH A00 = C5115KH.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0D().A4Z(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
