package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Uy */
/* loaded from: assets/audience_network.dex */
public final class C5770Uy extends C4965Ho {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 82, 68, 71, 88, 89, 68, 82, 23, 84, 88, 83, 82, 13, 23};
    }

    public C5770Uy(int i, Map<String, List<String>> map, C4959Hi c4959Hi) {
        super(A00(0, 15, 69) + i, c4959Hi, 1);
        this.A00 = i;
        this.A01 = map;
    }
}
