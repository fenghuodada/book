package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1u */
/* loaded from: assets/audience_network.dex */
public enum EnumC40231u {
    A03,
    A07,
    A06,
    A08,
    A09,
    A04,
    A05;
    
    public static byte[] A00;
    public static String[] A01 = {"qS0jzzy053U49Su1PxhqxbWBiRBDhrlz", "Xt2DRLlKFdB95NsINvyqeyDnMxOOuDLx", "yf08nX9dIZfcKypKRld4zDkH94BCZAU7", "tfbakkmOh5dxCJghzZjKfCWWzPpI", "7IyHNSQ2TJBMgpMVEgH3C5YFRcP1ce7U", "xEQSxTjWMbA9c974QplA5JGviijwmXcM", "x69Rlf5MxzDhXyXzxEdLcnVcx3iMgH2Y", "aVnA9Ux0owpYjW5hlcDkLBIQBKS6Kuco"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-91, -76, -89, -93, -74, -89, -90, -57, -56, -42, -41, -43, -46, -36, -56, -57, 117, -126, -126, Byte.MAX_VALUE, -126, -111, -108, -122, -119, -118, -119, -50, -47, -61, -58, -53, -48, -55, 110, 99, 106, 114, 100, 105, 98, -40, -51, -44, -36, -45};
        if (A01[1].charAt(25) == 'M') {
            throw new RuntimeException();
        }
        A01[1] = "ORHYqq2J4PQNu3tNdzrtPOmYFobQNh7q";
    }

    static {
        A01();
    }
}
