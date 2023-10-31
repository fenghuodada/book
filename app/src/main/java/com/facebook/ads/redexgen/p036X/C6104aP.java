package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aP */
/* loaded from: assets/audience_network.dex */
public class C6104aP implements InterfaceC43306v {
    public static byte[] A01;
    public final /* synthetic */ C6092aD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 127);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{64, 49, 47, 52, 58, 59, 56, 59, 51, 69};
    }

    public C6104aP(C6092aD c6092aD) {
        this.A00 = c6092aD;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A09(A00(0, 10, 77));
    }
}
