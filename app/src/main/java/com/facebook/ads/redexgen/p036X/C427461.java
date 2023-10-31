package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.61 */
/* loaded from: assets/audience_network.dex */
public final class C427461 {
    @Nullable
    public static InterfaceC427562 A00;
    public static boolean A01;
    public static byte[] A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-24, -21, -12, -23, -18, -13, -25, -8, -15};
    }

    static {
        A02();
        A01 = false;
        A00 = null;
    }

    public static void A01() {
        synchronized (C427461.class) {
            if (A00 == null) {
                return;
            }
            C444690 c444690 = new C444690(A00.AE2());
            c444690.A03(1);
            C5952Xx sdkContext = C44138T.A00();
            if (sdkContext != null) {
                sdkContext.A06().A8y(A00(0, 9, 109), 3401, c444690);
            }
            A00.reset();
        }
    }

    public static void A03(final long j) {
        if (j > 0) {
            A00 = new C6159bI();
            new Thread(j) { // from class: com.facebook.ads.redexgen.X.63
                public final long A00;

                {
                    this.A00 = j;
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    if (C5158L0.A02(this)) {
                        return;
                    }
                    while (true) {
                        try {
                            try {
                                Thread.sleep(this.A00);
                            } catch (InterruptedException unused) {
                            }
                            C427461.A01();
                        } catch (Throwable th) {
                            C5158L0.A00(th, this);
                            return;
                        }
                    }
                }
            };
        }
    }
}
