package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Im */
/* loaded from: assets/audience_network.dex */
public class C5025Im extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33, 45, 101, 100, 106, 101, 104, 126, 121, 48, 61, 31, 4, 2, 31, 4, 25, 20, 77, 25, 2, 2, 77, 1, 2, 26, 77, 54, 29, 31, 4, 2, 31, 4, 25, 20, 80, 65};
    }

    public C5025Im(int i, int i2) {
        super(A00(10, 27, 94) + i + A00(0, 10, 62) + i2 + A00(37, 1, 47));
    }
}
