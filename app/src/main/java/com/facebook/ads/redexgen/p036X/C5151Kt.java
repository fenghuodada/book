package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Kt */
/* loaded from: assets/audience_network.dex */
public final class C5151Kt {
    public static byte[] A00;
    public static String[] A01 = {"Q0cgd8ZooYecE", "J2BVhp7vuHAIAp7SnVNGb8HH1cbMxubt", "iqQBNrIT5Q3AC", "t9KuhFyRWu3gNFkI0HekeVuTW0avorLV", "OYjVlNdFlUPlcN7lAyHGk2JCraJWPiHi", "vCXknpIYzaKLfC11Hy3POPlfgXO", "n2KyTvvQ13Vg6RKdtgKJvEFdzL71NxtZ", "o17fQXz1EMvktucDmPwTMbcvnBIuog9r"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 43);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {-48, -52, -53, -18, -38, -4, -17, -16, -3};
        if (A01[5].length() == 9) {
            throw new RuntimeException();
        }
        A01[4] = "oolqHAu5YIFMgU7X3X8w7PUngZkPIqyX";
        A00 = bArr;
    }

    static {
        A02();
    }

    public static SharedPreferences A00(Context context) {
        return context.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 9, 95), context), 0);
    }
}
