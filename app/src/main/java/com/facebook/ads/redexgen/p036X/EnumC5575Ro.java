package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Ro */
/* loaded from: assets/audience_network.dex */
public enum EnumC5575Ro {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));
    
    public static byte[] A01;
    public String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 86);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, 15, 23, 2, 13, 10, 5, -63, 20, 6, 19, 23, 6, 19, -63, 19, 6, 20, 17, 16, 15, 20, 6, -37, -63, -58, 20, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    EnumC5575Ro(String str) {
        this.A00 = str;
    }

    public static EnumC5575Ro A00(String str) {
        EnumC5575Ro[] values;
        for (EnumC5575Ro enumC5575Ro : values()) {
            if (enumC5575Ro.A00.equals(str)) {
                return enumC5575Ro;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
