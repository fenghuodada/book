package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* renamed from: com.facebook.ads.redexgen.X.MC */
/* loaded from: assets/audience_network.dex */
public final class C5229MC {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 97);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String truncatedBody) {
        if (truncatedBody != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(truncatedBody, A00(0, 1, 88), true);
            int i = 0;
            if (truncatedBody.length() > 90) {
                int length = truncatedBody.length();
                String A002 = A00(1, 3, 14);
                if (length > 93 || !truncatedBody.endsWith(A002)) {
                    while (stringTokenizer.hasMoreTokens()) {
                        int tokenLength = stringTokenizer.nextToken().length();
                        if (i + tokenLength < 90) {
                            i += tokenLength;
                        }
                    }
                    if (i == 0) {
                        return truncatedBody.substring(0, 90) + A002;
                    }
                    return truncatedBody.substring(0, i) + A002;
                }
                return truncatedBody;
            }
            return truncatedBody;
        }
        return truncatedBody;
    }
}
