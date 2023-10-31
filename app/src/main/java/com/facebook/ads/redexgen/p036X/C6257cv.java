package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.cv */
/* loaded from: assets/audience_network.dex */
public class C6257cv extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C4839Fi A00;
    public final /* synthetic */ C40191q A01;
    public final /* synthetic */ C4816FL A02;

    public C6257cv(C4816FL c4816fl, C40191q c40191q, C4839Fi c4839Fi) {
        this.A02 = c4816fl;
        this.A01 = c40191q;
        this.A00 = c4839Fi;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0D().A4Z(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new C5115KH(adErrorType, ""));
    }
}
