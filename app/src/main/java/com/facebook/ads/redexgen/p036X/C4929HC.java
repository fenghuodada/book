package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.HC */
/* loaded from: assets/audience_network.dex */
public final class C4929HC {
    public static byte[] A00;
    public static String[] A01 = {"qUSUHG3fl04fppScybkIwiqF9Za6ywqc", "9GxhccWehaY5est6axh3IoJrmeutmSKO", "9QjDmFUhLFBWA", "vndLW2pvMzyIddqlKbZjCiSqXs", "uUaUr8hqhvXPaN7P8w7sIXvdlccOSZG2", "lnJWg1D8BBdeQAPn86A9Flbm9l6gCzpH", "U2icgnLcubCMXREdIQwwFZ9djs5VAYY8", "jjAIDyaXekIZT"};
    public static final Pattern A02;
    public static final Pattern A03;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-78, -101, -49, 2, -6, -17, -19, -2, -17, -18, -86, -31, -49, -52, -32, -34, -34, -72, -86, -47, -7, -2, -86, -38, -17, -4, -19, -17, -8, -2, -21, -15, -17, -3, -86, -9, -1, -3, -2, -86, -17, -8, -18, -86, 1, -13, -2, -14, -86, -81, 32, -14, -29, -45, -44, -39, -54, -83, -83, -91, 1, -114, -82, -77, -81, -82, -60, -87, 53, -58, -110, -106, 22, 46, 28, 25, 45, 43, 43, -1, -1, -9, 83, -32, 0, 5, 1, 0, 22, -5};
        if (A01[5].charAt(7) == 'A') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "UIXOAUPWxceeOWimYUBL0aqZbFGzFpDD";
        strArr[4] = "y1DZlYDt8XB0NvVsmM2QDxFu33622hlo";
    }

    static {
        A03();
        A02 = Pattern.compile(A02(52, 16, 39));
        A03 = Pattern.compile(A02(68, 22, 121));
    }

    public static float A00(String str) throws NumberFormatException {
        if (str.endsWith(A02(0, 1, 47))) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException(A02(23, 27, 44));
    }

    public static long A01(String str) throws NumberFormatException {
        String[] A0l;
        long j = 0;
        String[] A0m = C5038Iz.A0m(str, A02(50, 2, 102));
        for (String subpart : C5038Iz.A0l(A0m[0], A02(1, 1, 3))) {
            j = (60 * j) + Long.parseLong(subpart);
        }
        long j2 = j * 1000;
        if (A0m.length == 2) {
            String str2 = A0m[1];
            String[] subparts = A01;
            if (subparts[5].charAt(7) == 'A') {
                throw new RuntimeException();
            }
            String[] parts = A01;
            parts[5] = "EtjYanqu7taAJaVCJ4eq2Fekx5qw52Sf";
            j2 += Long.parseLong(str2);
        }
        return 1000 * j2;
    }

    public static void A04(C5022Ij c5022Ij) throws C4890GZ {
        String line = c5022Ij.A0P();
        if (line != null && A03.matcher(line).matches()) {
            return;
        }
        throw new C4890GZ(A02(2, 21, 44) + line);
    }
}
