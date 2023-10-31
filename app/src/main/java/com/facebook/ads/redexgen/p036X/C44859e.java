package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9e */
/* loaded from: assets/audience_network.dex */
public final class C44859e {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static InterfaceC44879g A00(C5952Xx c5952Xx) {
        try {
            return new C5917XO(c5952Xx);
        } catch (IOException e) {
            c5952Xx.A06().A8y(A02(0, 15, 89), C44458z.A2J, new C444690(e));
            return new C5920XR();
        }
    }

    public static C4742E5 A01(C5952Xx c5952Xx) {
        return new C4742E5(c5952Xx);
    }
}
