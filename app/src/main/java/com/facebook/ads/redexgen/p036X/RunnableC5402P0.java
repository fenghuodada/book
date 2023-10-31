package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.P0 */
/* loaded from: assets/audience_network.dex */
public class RunnableC5402P0 implements Runnable {
    public static byte[] A01;
    public final /* synthetic */ C44609E A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-44, -25, -30, -29, -19, -50, -22, -33, -9, -32, -33, -31, -23, -61, -16, -16, -19, -16};
    }

    public RunnableC5402P0(C44609E c44609e) {
        this.A00 = c44609e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A00.A00.A0I(A00(0, 18, 82));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
