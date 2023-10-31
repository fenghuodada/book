package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.2E */
/* loaded from: assets/audience_network.dex */
public final class C40432E {
    public static C40422D A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, Utf8.REPLACEMENT_BYTE, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 24, 29, 6, 11, 28, 9, 22, 11, 13, 16, 23, 30, 6, 26, 22, 23, 31, 16, 30};
    }

    public static C40422D A00(C5952Xx c5952Xx) {
        if (A00 == null) {
            synchronized (C40422D.class) {
                if (A00 == null) {
                    A00 = new C40422D(new C6232cW(c5952Xx.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c5952Xx), 0)));
                }
            }
        }
        return A00;
    }
}
