package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.dh */
/* loaded from: assets/audience_network.dex */
public class C6305dh extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C6304dg A00;
    public final /* synthetic */ C4508A1 A01;

    public C6305dh(C6304dg c6304dg, C4508A1 c4508a1) {
        this.A00 = c6304dg;
        this.A01 = c4508a1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5521Qw c5521Qw;
        C5521Qw c5521Qw2;
        C5521Qw c5521Qw3;
        this.A00.A00.A09();
        c5521Qw = this.A00.A00.A0A;
        if (c5521Qw != null) {
            C4508A1 c4508a1 = this.A01;
            c5521Qw2 = this.A00.A00.A0A;
            c4508a1.setAdViewabilityChecker(c5521Qw2);
            c5521Qw3 = this.A00.A00.A0A;
            c5521Qw3.A0U();
        }
    }
}
