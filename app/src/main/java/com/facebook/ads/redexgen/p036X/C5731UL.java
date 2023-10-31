package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.UL */
/* loaded from: assets/audience_network.dex */
public class C5731UL extends AbstractC39550o {
    public static byte[] A01;
    public final /* synthetic */ C5721UB A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, Utf8.REPLACEMENT_BYTE, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public C5731UL(C5721UB c5721ub) {
        this.A00 = c5721ub;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0B(C6298da c6298da) {
        this.A00.A1T(c6298da);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0C() {
        InterfaceC5720UA interfaceC5720UA;
        InterfaceC5720UA interfaceC5720UA2;
        interfaceC5720UA = this.A00.A0G;
        if (interfaceC5720UA != null) {
            interfaceC5720UA2 = this.A00.A0G;
            interfaceC5720UA2.A9s();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0F(InterfaceC39540n interfaceC39540n) {
        C4819FO c4819fo;
        C4819FO c4819fo2;
        c4819fo = this.A00.A0A;
        if (c4819fo != null) {
            c4819fo2 = this.A00.A0A;
            c4819fo2.A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0G(C5115KH c5115kh) {
        long j;
        InterfaceC5720UA interfaceC5720UA;
        InterfaceC5720UA interfaceC5720UA2;
        InterfaceC39330R A0D = this.A00.A11().A0D();
        j = this.A00.A00;
        A0D.A2a(C5236MJ.A01(j), c5115kh.A03().getErrorCode(), c5115kh.A04());
        interfaceC5720UA = this.A00.A0G;
        if (interfaceC5720UA != null) {
            interfaceC5720UA2 = this.A00.A0G;
            interfaceC5720UA2.AAi(c5115kh);
        }
    }
}
