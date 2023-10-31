package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.IF */
/* loaded from: assets/audience_network.dex */
public final class C4992IF {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-40, -21, -30, -46, -33, -40, -31, -10, 9, 0, -16, 3, -10, -11, -6, 3};
    }

    public static long A00(InterfaceC4991IE interfaceC4991IE) {
        return interfaceC4991IE.A5X(A02(0, 7, 27), -1L);
    }

    @Nullable
    public static Uri A01(InterfaceC4991IE interfaceC4991IE) {
        String A5Z = interfaceC4991IE.A5Z(A02(7, 9, 57), null);
        if (A5Z == null) {
            return null;
        }
        return Uri.parse(A5Z);
    }

    public static void A04(C4993IG c4993ig) {
        c4993ig.A01(A02(7, 9, 57));
    }

    public static void A05(C4993IG c4993ig, long j) {
        c4993ig.A02(A02(0, 7, 27), j);
    }

    public static void A06(C4993IG c4993ig, Uri uri) {
        c4993ig.A03(A02(7, 9, 57), uri.toString());
    }
}
