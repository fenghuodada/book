package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.76 */
/* loaded from: assets/audience_network.dex */
public enum EnumC434176 {
    A08(0),
    A06(1),
    A07(2),
    A05(3),
    A04(4);
    
    public static byte[] A01;
    public static String[] A02 = {"hSeSDY0of3XMKYBSawTW6", "sohFiklnBFgr2LMW5unaYXIdoh7LpqJ4", "J1GkrQhOQSKZr22Vk671BdQ9PLpp91zg", "xQM0SIi3n9Poy2F", "WAUXlS76Mh78MuMCacZeL0Bf36KHKL6J", "Ow19vI2XbPOH", "viGaH6ErnKztM5tSpUcz87FTndzVVCSd", "WNqW8CjWCVSKFZCXl6PMQeKqqDuJb9Ju"};
    public int A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        if (A02[6].charAt(17) == 'X') {
            throw new RuntimeException();
        }
        A02[4] = "pgudaYbRqTPjGMZ4ZZfMqbLkPBqXKu6s";
        A01 = new byte[]{-79, -78, -73, -62, -84, -80, -77, -81, -88, -80, -88, -79, -73, -88, -89, -42, -41, -36, -25, -37, -35, -40, -40, -41, -38, -36, -51, -52, 23, 24, 40, 25, 14, 27, 22, 18, 28, 28, 18, 24, 23, -70, -63, -72, -72, -67, -74, -77, -74, -73, -65, -74};
    }

    static {
        A01();
    }

    EnumC434176(int i) {
        this.A00 = i;
    }

    public final int A02() {
        return this.A00;
    }
}
