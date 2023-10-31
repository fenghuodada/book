package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Pu */
/* loaded from: assets/audience_network.dex */
public class C5457Pu extends AbstractC44839c<C439788> {
    public final /* synthetic */ C439889 A00;

    public C5457Pu(C439889 c439889) {
        this.A00 = c439889;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A00 */
    public final void A03(C439788 c439788) {
        int A00 = c439788.A00();
        int A01 = c439788.A01();
        if (this.A00.A00 > 0 && A00 == A01 && A01 > this.A00.A00) {
            return;
        }
        if (A01 < A00 + 500) {
            if (A01 == 0) {
                C439889 c439889 = this.A00;
                c439889.A0d(c439889.A00);
                return;
            }
            this.A00.A0d(A01);
            return;
        }
        this.A00.A0d(A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    public final Class<C439788> A01() {
        return C439788.class;
    }
}
