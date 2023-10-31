package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.NativeAd;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.bX */
/* loaded from: assets/audience_network.dex */
public class C6174bX implements InterfaceC43577M {
    public final List<C6298da> A00;
    public final /* synthetic */ C6173bW A01;

    public C6174bX(C6173bW c6173bW, List<C6298da> list) {
        this.A01 = c6173bW;
        this.A00 = list;
    }

    private void A00() {
        C42385Q c42385q;
        C42385Q c42385q2;
        C42385Q c42385q3;
        C5953Xy c5953Xy;
        C42385Q c42385q4;
        C42385Q c42385q5;
        C5953Xy c5953Xy2;
        c42385q = this.A01.A00;
        c42385q.A05(true);
        c42385q2 = this.A01.A00;
        c42385q2.A02();
        c42385q3 = this.A01.A00;
        c42385q3.A03(0);
        for (C6298da c6298da : this.A00) {
            c5953Xy = this.A01.A01;
            InterfaceC5103K4 A0K = C5721UB.A0K();
            c42385q4 = this.A01.A00;
            C5721UB c5721ub = new C5721UB(c5953Xy, c6298da, null, A0K, c42385q4.A01());
            C6298da nativeAdapter = c5721ub.A0y();
            if (nativeAdapter != null) {
                C6298da nativeAdapter2 = c5721ub.A0y();
                if (nativeAdapter2.A0F() != null) {
                    C6298da nativeAdapter3 = c5721ub.A0y();
                    ((AbstractC6259cx) nativeAdapter3.A0F()).A00(c5721ub);
                }
            }
            c42385q5 = this.A01.A00;
            c5953Xy2 = this.A01.A01;
            c42385q5.A04(new NativeAd(c5953Xy2, c5721ub));
        }
        C5157Kz.A00(new C6175bY(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAH() {
        A00();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAO() {
        A00();
    }
}
