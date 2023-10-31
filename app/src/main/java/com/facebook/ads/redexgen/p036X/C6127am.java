package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.am */
/* loaded from: assets/audience_network.dex */
public class C6127am implements InterfaceC43306v {
    public final /* synthetic */ C6113aY A00;

    public C6127am(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws Throwable {
        C42856C c42856c;
        C43507F c43507f;
        c42856c = this.A00.A02;
        if (c42856c.A0a() != EnumC43346z.A0I) {
            c43507f = this.A00.A03;
            String A06 = c43507f.A06(10010);
            if (A06 != null) {
                return this.A00.A08(A06);
            }
            return this.A00.A07(EnumC434176.A07);
        }
        return this.A00.A07(EnumC434176.A04);
    }
}
