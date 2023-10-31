package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Tn */
/* loaded from: assets/audience_network.dex */
public class C5697Tn implements InterfaceC5225M8 {
    public final C5224M7 A00;
    public final InterfaceC5225M8 A01;

    public C5697Tn(InterfaceC5225M8 interfaceC5225M8, int i, int i2) {
        this.A01 = interfaceC5225M8;
        this.A00 = new C5224M7(i, i2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void ADK(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() != null) {
            A08 = C5227MA.A08(this.A00);
            if (A08) {
                this.A01.ADK(this.A00.A02());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5225M8
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = C5227MA.A08(this.A00);
            if (A08) {
                this.A01.ADK(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
