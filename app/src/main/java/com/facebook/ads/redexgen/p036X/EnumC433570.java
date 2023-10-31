package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.70 */
/* loaded from: assets/audience_network.dex */
public enum EnumC433570 {
    A04(0),
    A05(100);
    
    public static byte[] A01;
    public static final Map<Integer, EnumC433570> A02;
    public int A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-98, -97, -96, -101, -81, -90, -82, -104, -103, -105, -104};
    }

    static {
        EnumC433570[] values;
        A02();
        A02 = new HashMap();
        for (EnumC433570 enumC433570 : values()) {
            A02.put(Integer.valueOf(enumC433570.A00), enumC433570);
        }
    }

    EnumC433570(int i) {
        this.A00 = i;
    }

    public static EnumC433570 A00(int i) {
        EnumC433570 enumC433570 = A02.get(Integer.valueOf(i));
        return enumC433570 == null ? A04 : enumC433570;
    }
}
