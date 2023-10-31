package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.e6 */
/* loaded from: assets/audience_network.dex */
public enum EnumC6330e6 {
    A02,
    A05,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 76);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{124, 113, 106, 124, 100, 110, 21, 25, 1, 26, 29, 116, Byte.MAX_VALUE, 108, Byte.MAX_VALUE, 104, 116, 111, 106, 111, 110, 118, 111};
    }

    static {
        A01();
    }
}
