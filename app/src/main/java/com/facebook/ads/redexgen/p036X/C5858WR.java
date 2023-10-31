package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.WR */
/* loaded from: assets/audience_network.dex */
public class C5858WR implements InterfaceC4667Cl {
    public final /* synthetic */ C5857WQ A00;

    public C5858WR(C5857WQ c5857wq) {
        this.A00 = c5857wq;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        AbstractC4709DY abstractC4709DY;
        long j;
        abstractC4709DY = this.A00.A0B;
        j = this.A00.A07;
        return abstractC4709DY.A03(j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long granule) {
        AbstractC4709DY abstractC4709DY;
        long j;
        long A00;
        long j2;
        if (granule == 0) {
            j2 = this.A00.A09;
            return new C4666Ck(new C4668Cm(0L, j2));
        }
        abstractC4709DY = this.A00.A0B;
        long A04 = abstractC4709DY.A04(granule);
        C5857WQ c5857wq = this.A00;
        j = c5857wq.A09;
        A00 = c5857wq.A00(j, A04, 30000L);
        return new C4666Ck(new C4668Cm(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return true;
    }
}
