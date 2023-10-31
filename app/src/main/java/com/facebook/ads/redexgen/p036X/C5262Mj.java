package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Mj */
/* loaded from: assets/audience_network.dex */
public final class C5262Mj {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 23);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{100, -105, -126, -124, -113, -109, -120, -114, -115, Utf8.REPLACEMENT_BYTE, -120, -115, Utf8.REPLACEMENT_BYTE, -110, -126, -111, -124, -124, -115, Utf8.REPLACEMENT_BYTE, -120, -115, -109, -124, -111, Byte.MIN_VALUE, -126, -109, -120, -107, -124, Utf8.REPLACEMENT_BYTE, -126, -121, -124, -126, -118, 75, Utf8.REPLACEMENT_BYTE, Byte.MIN_VALUE, -110, -110, -108, -116, -120, -115, -122, Utf8.REPLACEMENT_BYTE, -120, -115, -109, -124, -111, Byte.MIN_VALUE, -126, -109, -120, -107, -124, 77, -103, -104, -96, -114, -101, -46, -55, -45, -53, -39};
    }

    static {
        A01();
        A01 = C5262Mj.class.getSimpleName();
    }

    public static boolean A02(C5953Xy c5953Xy) {
        return A03(c5953Xy) && C5263Mk.A03(c5953Xy);
    }

    public static boolean A03(C5953Xy c5953Xy) {
        if (c5953Xy == null) {
            return true;
        }
        try {
            PowerManager powerManager = (PowerManager) c5953Xy.getSystemService(A00(60, 5, 18));
            if (Build.VERSION.SDK_INT >= 20) {
                return powerManager.isInteractive();
            }
            return powerManager.isScreenOn();
        } catch (Exception e) {
            Log.e(A01, A00(0, 60, 8), e);
            c5953Xy.A06().A8y(A00(65, 5, 73), C44458z.A2R, new C444690(e));
            return true;
        }
    }
}
