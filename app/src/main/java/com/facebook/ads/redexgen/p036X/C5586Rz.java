package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Rz */
/* loaded from: assets/audience_network.dex */
public class C5586Rz implements InterfaceC421957 {
    public final /* synthetic */ C422159 A00;
    public final /* synthetic */ C44068K A01;

    public C5586Rz(C44068K c44068k, C422159 c422159) {
        this.A01 = c44068k;
        this.A00 = c422159;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC421957
    public final boolean A8M() {
        boolean A0Y;
        boolean A0Z;
        if (!this.A01.A0X()) {
            A0Y = this.A01.A0Y();
            if (A0Y) {
                return true;
            }
            A0Z = this.A01.A0Z();
            return A0Z;
        }
        this.A01.A0W(this.A00);
        return true;
    }
}
