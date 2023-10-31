package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.LO */
/* loaded from: assets/audience_network.dex */
public class RunnableC5181LO implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C5953Xy A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 118);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{97, 122, 125, 98, 97, 99, 104, 99, 116, 111, 101};
    }

    public RunnableC5181LO(C5953Xy c5953Xy) {
        this.A00 = c5953Xy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            C444690 c444690 = new C444690(A00(0, 4, 88));
            c444690.A03(1);
            c444690.A04(1);
            c444690.A08(false);
            this.A00.A06().A8z(A00(4, 7, 112), C44458z.A1Y, c444690);
        } catch (Throwable otsl) {
            C5158L0.A00(otsl, this);
        }
    }
}
