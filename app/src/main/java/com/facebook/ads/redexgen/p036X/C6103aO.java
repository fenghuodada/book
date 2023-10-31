package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aO */
/* loaded from: assets/audience_network.dex */
public class C6103aO implements InterfaceC43306v {
    public static byte[] A01;
    public static String[] A02 = {"ksa9uXkx89dXxbCURV7PiRCel6d7bK9j", "eXuTZs6W3v0JJtnWIbv2wG4QRruqx6j8", "WGgalorghCXwLSZ9oN", "BSejCupF6vxF", "vAQOCQWHxXMHYUUvXYDH6ypyDqGR6HRf", "iKQXn2EsxsEQ3pyGOtesmJGftglzEEjH", "dCL4N6ovXvI3jfuXevzoM7RKt4XsOwpl", "Cl5pJnrztL7k"};
    public final /* synthetic */ C6092aD A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] - i3;
            if (A02[4].charAt(5) == 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "eya4WcuMkKlP";
            strArr[7] = "iVKlWYkTLkVv";
            copyOfRange[i4] = (byte) (i5 - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-56, -63, -66, -58, -77, -71, -73};
    }

    static {
        A01();
    }

    public C6103aO(C6092aD c6092aD) {
        this.A00 = c6092aD;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC43306v
    public final AbstractC43457A A5J() {
        return this.A00.A0A(A00(0, 7, 21), Integer.MIN_VALUE);
    }
}
