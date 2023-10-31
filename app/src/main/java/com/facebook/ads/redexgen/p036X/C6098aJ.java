package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aJ */
/* loaded from: assets/audience_network.dex */
public class C6098aJ implements InterfaceC43306v {
    public static byte[] A01;
    public final /* synthetic */ C6092aD A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{74, 59, 67, 70, 59, 72, 55, 74, 75, 72, 59};
    }

    public C6098aJ(C6092aD c6092aD) {
        this.A00 = c6092aD;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A0A(A00(0, 11, 116), Integer.MIN_VALUE);
    }
}
