package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.an */
/* loaded from: assets/audience_network.dex */
public class C6128an implements InterfaceC43306v {
    public static String[] A01 = {"hvm87xlnXDULJgpudJIAxjipYcLfVpPe", "aPn41y0iNcbQ3vA5A69njqeDstAsTpsV", "WXmwgMFdLW61FUxTxJC7XlBGpuRVL7Wu", "ePkGYIfh56SCQIxOGTOw2FZrMqM6oOvD", "H4G3VitdwZHOwCvFNAwNX1rKXwUNte3T", "QqBVensdyxYwCHnIBjshd9TsYmlVQcVc", "Npnx1Hqps9YG5SIKMksWN5UpsP86zlug", "K4PmfDIjqE3AfePNsovy4"};
    public final /* synthetic */ C6113aY A00;

    public C6128an(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() throws Exception {
        C43507F c43507f;
        c43507f = this.A00.A03;
        String A06 = c43507f.A06(10005);
        if (A06 != null) {
            C6113aY c6113aY = this.A00;
            if (A01[7].length() != 21) {
                throw new RuntimeException();
            }
            A01[7] = "XG8OcIRWX82QEKbSmFw2M";
            return c6113aY.A08(A06);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
