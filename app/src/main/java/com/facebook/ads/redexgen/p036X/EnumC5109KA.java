package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.KA */
/* loaded from: assets/audience_network.dex */
public enum EnumC5109KA {
    A03,
    A05,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, 22, 21};
    }

    static {
        A02();
    }

    public static VideoAutoplayBehavior A00(EnumC5109KA enumC5109KA) {
        if (enumC5109KA == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        int i = C5108K9.A00[enumC5109KA.ordinal()];
        if (i != 1) {
            if (A01[1].charAt(9) != 'M') {
                A01[5] = "KWBYg9gUO";
                if (i != 2) {
                    if (i != 3) {
                        VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
                        String[] strArr = A01;
                        if (strArr[0].charAt(5) == strArr[4].charAt(5)) {
                            A01[2] = "D4DDJWMfk";
                            return videoAutoplayBehavior;
                        }
                        String[] strArr2 = A01;
                        strArr2[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
                        strArr2[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
                        return videoAutoplayBehavior;
                    }
                    return VideoAutoplayBehavior.OFF;
                }
                return VideoAutoplayBehavior.ON;
            }
            throw new RuntimeException();
        }
        return VideoAutoplayBehavior.DEFAULT;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EnumC5109KA[] valuesCustom() {
        EnumC5109KA[] valuesCustom = values();
        if (A01[1].charAt(9) != 'M') {
            String[] strArr = A01;
            strArr[6] = "qrA";
            strArr[3] = "mB";
            return (EnumC5109KA[]) valuesCustom.clone();
        }
        throw new RuntimeException();
    }
}
