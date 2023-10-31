package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;
import java.util.Arrays;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.0e */
/* loaded from: assets/audience_network.dex */
public enum EnumC39460e {
    A02,
    A03;
    
    public static byte[] A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-25, -27, -14, -14, -13, -8, 3, -13, -12, -23, -14, -6, -8, 5, 5, 6, 11, 22, 11, 9, -8, -6, 2};
    }

    static {
        A01();
    }

    public static boolean A02(@Nullable EnumC39460e enumC39460e) {
        return A02.equals(enumC39460e) || A03.equals(enumC39460e);
    }
}
