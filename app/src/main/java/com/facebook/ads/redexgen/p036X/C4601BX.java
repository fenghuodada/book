package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.BX */
/* loaded from: assets/audience_network.dex */
public final class C4601BX extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{88, 108, 125, 112, 118, 77, 107, 120, 122, 114, 57, 110, 107, 112, 109, 124, 57, Byte.MAX_VALUE, 120, 112, 117, 124, 125, 35, 57};
    }

    public C4601BX(int i) {
        super(A00(0, 25, 85) + i);
        this.A00 = i;
    }
}
