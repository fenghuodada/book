package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8A */
/* loaded from: assets/audience_network.dex */
public enum EnumC43998A {
    A09,
    A07,
    A08,
    A06,
    A05,
    A03,
    A04,
    A0B,
    A02,
    A0A;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{110, 121, 121, -79, -66, -66, -69, -76, -80, -67, 96, 101, 94, 111, -68, -57, -51, -70, -60, -67, -81, -75, -72, -86, -67, -111, -106, -100, -74, -71, -72, -79, -31, -24, -33, -33, -108, -106, -115, -111, -115, -104, -115, -102, -119, -46, -45, -47, -56, -51, -58};
    }

    static {
        A01();
    }
}
