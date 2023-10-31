package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.d5 */
/* loaded from: assets/audience_network.dex */
public class C6267d5 extends AbstractRunnableC5165L8 {
    public static byte[] A03;
    public final /* synthetic */ C6301dd A00;
    public final /* synthetic */ C40191q A01;
    public final /* synthetic */ C4821FQ A02;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{32, 5, 0, 17, 21, 4, 19, 65, 21, 8, 12, 4, 14, 20, 21, 79};
    }

    public C6267d5(C4821FQ c4821fq, C40191q c40191q, C6301dd c6301dd) {
        this.A02 = c4821fq;
        this.A01 = c40191q;
        this.A00 = c6301dd;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        this.A02.A0N(this.A01);
        this.A02.A0K(this.A00);
        this.A02.AAi(new C5115KH(AdErrorType.NETWORK_ERROR, A00(0, 16, 43)));
    }
}
