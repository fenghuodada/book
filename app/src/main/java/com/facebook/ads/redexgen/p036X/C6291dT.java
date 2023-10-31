package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dT */
/* loaded from: assets/audience_network.dex */
public class C6291dT extends AbstractRunnableC5165L8 {
    public static byte[] A01;
    public final /* synthetic */ C6290dS A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C6291dT(C6290dS c6290dS) {
        this.A00 = c6290dS;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5953Xy c5953Xy;
        AbstractC5346O6 abstractC5346O6;
        C6292dU c6292dU;
        c5953Xy = this.A00.A02;
        c5953Xy.A0D().AFY();
        abstractC5346O6 = this.A00.A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(0, 11, 35));
        c6292dU = this.A00.A00;
        sb.append(c6292dU.A03());
        abstractC5346O6.loadUrl(sb.toString());
    }
}
