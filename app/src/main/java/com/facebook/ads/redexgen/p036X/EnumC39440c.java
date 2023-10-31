package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.0c */
/* loaded from: assets/audience_network.dex */
public enum EnumC39440c {
    A09(A00(103, 5, 27)),
    A07(A00(90, 5, 74)),
    A03(A00(54, 8, 22)),
    A08(A00(95, 8, 13)),
    A04(A00(62, 10, 107)),
    A06(A00(81, 9, 102)),
    A05(A00(72, 9, 56));
    
    public static byte[] A01;
    public final String A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{19, 17, 2, 31, 5, 3, 21, 28, 23, 0, 31, 12, 27, 10, 17, 1, 26, 23, 116, 99, 124, 111, 121, 125, 113, 119, 117, 22, 1, 30, 13, 4, 27, 22, 23, 29, 101, 97, 109, 107, 105, 78, 82, 95, 71, 95, 92, 82, 91, 92, 67, 78, 79, 69, 71, 69, 86, 75, 81, 87, 65, 72, 61, 42, 53, 6, 49, 32, 59, 43, 48, 61, 110, 121, 102, 85, 99, 103, 107, 109, 111, 48, 39, 56, 11, 34, 61, 48, 49, 59, 17, 21, 25, 31, 29, 79, 83, 94, 70, 94, 93, 83, 90, 95, 64, 77, 76, 70};
    }

    static {
        A01();
    }

    EnumC39440c(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
