package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.E9 */
/* loaded from: assets/audience_network.dex */
public class C4746E9 extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{36, Utf8.REPLACEMENT_BYTE, 71, 74, 67, 66, -2, 82, 77, -2, 79, 83, 67, 80, 87, -2, 83, 76, 66, 67, 80, 74, 87, 71, 76, 69, -2, 75, 67, 66, 71, Utf8.REPLACEMENT_BYTE, -2, 65, 77, 66, 67, 65, 81};
    }

    public C4746E9(Throwable th) {
        super(A00(0, 39, 121), th);
    }
}
