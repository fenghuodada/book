package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.QA */
/* loaded from: assets/audience_network.dex */
public class C5473QA extends AbstractC44839c<C439484> {
    public final /* synthetic */ C439889 A00;

    public C5473QA(C439889 c439889) {
        this.A00 = c439889;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A00 */
    public final void A03(C439484 c439484) {
        C5483QK c5483qk;
        C5483QK c5483qk2;
        int A00 = c439484.A00();
        if (this.A00.A00 > 0) {
            c5483qk = this.A00.A0B;
            if (A00 == c5483qk.getDuration()) {
                c5483qk2 = this.A00.A0B;
                if (c5483qk2.getDuration() > this.A00.A00) {
                    return;
                }
            }
        }
        this.A00.A0e(A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    public final Class<C439484> A01() {
        return C439484.class;
    }
}
