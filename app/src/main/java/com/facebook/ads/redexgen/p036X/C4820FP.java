package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.FP */
/* loaded from: assets/audience_network.dex */
public final class C4820FP extends AbstractC6264d2 {
    public C4820FP(C5953Xy c5953Xy, C40181p c40181p) {
        super(c5953Xy, c40181p);
    }

    private InterfaceC39640x A00(Runnable runnable) {
        return new C6262d0(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0J() {
        ((C6300dc) this.A01).A0B();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6264d2
    public final void A0L(InterfaceC39540n interfaceC39540n, C44639H c44639h, C44619F c44619f, C40191q c40191q) {
        C6300dc c6300dc = (C6300dc) interfaceC39540n;
        C6263d1 c6263d1 = new C6263d1(this, c40191q, c6300dc);
        A0C().postDelayed(c6263d1, c44639h.A05().A05());
        c6300dc.A0A(this.A0B, A00(c6263d1), c40191q, this.A07.A0A, this.A07.A04, this.A07.A05, this.A07.A02);
    }

    public final AbstractC397518 A0T() {
        return ((C6300dc) this.A01).A09();
    }
}
