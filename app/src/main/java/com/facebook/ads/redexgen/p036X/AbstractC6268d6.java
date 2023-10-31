package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.d6 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6268d6 implements InterfaceC43577M {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC6268d6(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAH() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAO() {
        A01(true);
    }
}
