package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Pa */
/* loaded from: assets/audience_network.dex */
public final class C5437Pa {
    public static byte[] A03;
    public final int A00;
    public final int A01;
    public final C39781B A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-27, -29, -12, -26, -27, -16, -10, 12, 10, 27, 13, 18, 23, 13};
    }

    public C5437Pa(int i, int i2, C39781B c39781b) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = c39781b;
    }

    public final int A02() {
        return this.A01;
    }

    public final C39781B A03() {
        return this.A02;
    }

    public final Map<String, String> A04() {
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        String A00 = A00(0, 0, 12);
        sb.append(A00);
        hashMap.put(A00(7, 7, 94), sb.toString());
        hashMap.put(A00(0, 7, 55), this.A00 + A00);
        return hashMap;
    }
}
