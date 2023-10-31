package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.aj */
/* loaded from: assets/audience_network.dex */
public class C6124aj implements InterfaceC43306v {
    public static String[] A01 = {"xoHvVsjIwv7W5ClpzJbisJEpOcq", "SYDRmpizq5sDZ4GfL4h8WluGMHdmoTuM", "DVzF2PeQv7hgrICuH3nyQdrZNKSxdA", "4lIziXMzxgphshR2rAqW9SlDjwpMcvxS", "Bksnruu9CDcd9v5jIjvraWrOMG1PGOq1", "vT5fBH5lG6OjAtE20tf2f7rqol7xKp1H", "b74VzSGUDjeF5gq780pkK2xwxVTOFG7b", "77MleEyOR9uHuiszCvhjWPNRz4PKDadz"};
    public final /* synthetic */ C6113aY A00;

    public C6124aj(C6113aY c6113aY) {
        this.A00 = c6113aY;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        C42856C c42856c;
        c42856c = this.A00.A02;
        String A0f = c42856c.A0f();
        if (A0f != null) {
            C6113aY c6113aY = this.A00;
            if (A01[7].charAt(13) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "f9T5AhYAPA98oVvlWKPWGyhu6RS3SO";
            strArr[0] = "b7yxm3cRAk17Eqj8H4F2BjoUql6";
            return c6113aY.A08(A0f);
        }
        return this.A00.A07(EnumC434176.A07);
    }
}
