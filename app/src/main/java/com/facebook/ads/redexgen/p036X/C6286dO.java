package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.dO */
/* loaded from: assets/audience_network.dex */
public class C6286dO implements InterfaceC5355OF {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC6285dN A01;
    public final /* synthetic */ C5721UB A02;

    public C6286dO(AbstractC6285dN abstractC6285dN, int i, C5721UB c5721ub) {
        this.A01 = abstractC6285dN;
        this.A00 = i;
        this.A02 = c5721ub;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5355OF
    public final void AAx(boolean z) {
        AbstractC5520Qv abstractC5520Qv;
        if (this.A00 == 0) {
            C5721UB c5721ub = this.A02;
            abstractC5520Qv = this.A01.A04;
            c5721ub.A1Z(abstractC5520Qv);
        }
        this.A02.A1c(z, true);
    }
}
