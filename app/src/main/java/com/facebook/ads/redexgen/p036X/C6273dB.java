package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.dB */
/* loaded from: assets/audience_network.dex */
public class C6273dB implements InterfaceC43577M {
    public static String[] A03 = {"SGxBKOT0PnlxeQ2jGccieZy3bFeI", "1PQaT", "uVEahNbfwTxCxKVGO7p", "rVPhbhRBlKfAg8fviAhE", "2ov", "KrP87Bn8e271VzBAE5Wi", "4No2VIB7eIWgh7ub8hExBeYUcY", "mEjh"};
    public final /* synthetic */ C40061d A00;
    public final /* synthetic */ C5953Xy A01;
    public final /* synthetic */ boolean A02;

    public C6273dB(C40061d c40061d, C5953Xy c5953Xy, boolean z) {
        this.A00 = c40061d;
        this.A01 = c5953Xy;
        this.A02 = z;
    }

    private void A00(boolean z) {
        InterfaceC40051c interfaceC40051c;
        InterfaceC40051c interfaceC40051c2;
        C6281dJ c6281dJ;
        if (!z) {
            interfaceC40051c = this.A00.A04;
            String[] strArr = A03;
            if (strArr[7].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "3TR1ccuSepVqqTAhPt5x";
            strArr2[3] = "2nf30Z9fIqCCPDXuu277";
            interfaceC40051c.A9u(AdError.CACHE_ERROR);
            return;
        }
        if (C5064JR.A1A(this.A01)) {
            boolean z2 = this.A02;
            String[] strArr3 = A03;
            if (strArr3[7].length() == strArr3[0].length()) {
                throw new RuntimeException();
            }
            A03[4] = "td5rO8fwqS2g7pt7eIgv7CCFkrrD";
            if (z2) {
                C40061d c40061d = this.A00;
                C5953Xy c5953Xy = this.A01;
                c6281dJ = c40061d.A03;
                c40061d.A02 = C5412PB.A01(c5953Xy, c6281dJ, 1, new C6274dC(this));
                return;
            }
        }
        interfaceC40051c2 = this.A00.A04;
        interfaceC40051c2.A9v();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAH() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43577M
    public final void AAO() {
        A00(true);
    }
}
