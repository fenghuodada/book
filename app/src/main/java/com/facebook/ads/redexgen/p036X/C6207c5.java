package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.c5 */
/* loaded from: assets/audience_network.dex */
public class C6207c5 implements InterfaceC41383n {
    public final /* synthetic */ C4804F9 A00;

    public C6207c5(C4804F9 c4804f9) {
        this.A00 = c4804f9;
    }

    private final void A00(C41393o c41393o) {
        int i = c41393o.A00;
        if (i == 1) {
            this.A00.A06.A1Q(this.A00, c41393o.A02, c41393o.A01);
        } else if (i == 2) {
            this.A00.A06.A1R(this.A00, c41393o.A02, c41393o.A01);
        } else if (i == 4) {
            this.A00.A06.A1T(this.A00, c41393o.A02, c41393o.A01, c41393o.A03);
        } else if (i != 8) {
        } else {
            this.A00.A06.A1S(this.A00, c41393o.A02, c41393o.A01, 1);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final AbstractC41974l A5Q(int i) {
        AbstractC41974l A1G = this.A00.A1G(i, true);
        if (A1G == null || this.A00.A01.A0K(A1G.A0H)) {
            return null;
        }
        return A1G;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void A9U(int i, int i2, Object obj) {
        this.A00.A1f(i, i2, obj);
        this.A00.A0H = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void A9o(int i, int i2) {
        this.A00.A1c(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void A9p(int i, int i2) {
        this.A00.A1d(i, i2);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void A9q(int i, int i2) {
        this.A00.A1g(i, i2, true);
        C4804F9 c4804f9 = this.A00;
        c4804f9.A0G = true;
        c4804f9.A0s.A00 += i2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void A9r(int i, int i2) {
        this.A00.A1g(i, i2, false);
        this.A00.A0G = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void AAV(C41393o c41393o) {
        A00(c41393o);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC41383n
    public final void AAX(C41393o c41393o) {
        A00(c41393o);
    }
}
