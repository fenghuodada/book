package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Wq */
/* loaded from: assets/audience_network.dex */
public final class C5883Wq implements InterfaceC4667Cl {
    public final long A00;
    public final C4666Ck A01;

    public C5883Wq(long j) {
        this(j, 0L);
    }

    public C5883Wq(long j, long j2) {
        this.A00 = j;
        this.A01 = new C4666Ck(j2 == 0 ? C4668Cm.A04 : new C4668Cm(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return false;
    }
}
