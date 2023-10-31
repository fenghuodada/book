package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.6w */
/* loaded from: assets/audience_network.dex */
public enum EnumC43316w {
    A04(0),
    A07(1024),
    A05(2048),
    A06(4096);
    
    public static byte[] A01;
    public static final Map<Integer, EnumC43316w> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-104, -101, -92, -97, -99, -92, -75, -97, -99, -92, -91, -88, -101, 120, 105, 122, 105, 118, 119, 113, 108, Byte.MAX_VALUE, 110, 123, 113, 124, 122, -116, Byte.MIN_VALUE, 110, 122, 125, 121, 114, -91, -89, -91, -94, -101, -107, -101, -95, -89, -91};
    }

    static {
        EnumC43316w[] values;
        A02();
        A02 = new HashMap();
        for (EnumC43316w enumC43316w : values()) {
            A02.put(Integer.valueOf(enumC43316w.A00), enumC43316w);
        }
    }

    EnumC43316w(int i) {
        this.A00 = i;
    }

    public static EnumC43316w A00(int i) {
        EnumC43316w enumC43316w = A02.get(Integer.valueOf(i));
        return enumC43316w == null ? A04 : enumC43316w;
    }

    public final int A03() {
        return this.A00;
    }
}
