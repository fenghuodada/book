package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8b */
/* loaded from: assets/audience_network.dex */
public final class C44218b {
    public static byte[] A03;
    public final int A00;
    public final String A01;
    public final String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 117);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{2};
    }

    public C44218b(int i, String str, String str2) {
        this.A00 = i;
        this.A01 = str;
        this.A02 = str2;
    }

    public final String A02() {
        return this.A01 + A00(0, 1, 109) + this.A02;
    }
}
