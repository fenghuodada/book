package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.eK */
/* loaded from: assets/audience_network.dex */
public enum EnumC6339eK {
    A02,
    A04,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-54, -45, -39, -54, -41, -38, -19, -34, -23, -15, -20, -32, -35, -16, -31};
    }

    static {
        A01();
    }
}
