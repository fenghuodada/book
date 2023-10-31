package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.JZ */
/* loaded from: assets/audience_network.dex */
public enum EnumC5072JZ {
    A02,
    A03,
    A04;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 14);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{98, 101, 92, 90, 92, 97, 84, 95, -49, -47, -66, -49, -63, -51, -47, -63, -54, -48, 122, 109, 105, 123, 101, 102, 109, 112, 109, 120, 125};
    }

    static {
        A01();
    }
}
