package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.6t */
/* loaded from: assets/audience_network.dex */
public enum EnumC43286t {
    A03,
    A04;
    
    public static byte[] A00;
    public static String[] A01 = {"k9YgwMNoBobey2P3", "e6gY2KwdCyhxzyJg", "XekGxBcgkm9Piqw4gBfizkkV5P8", "1GcTjvefwXiEODDnEjfMRtb0cPUGlX75", "ZdzTHxr5JGj0Sa8aqJDa45W8xDvcUiPL", "P27kcHiKxsYV8bH7Xsbi006fslBpGCcl", "HgqSjgTeAT7xF2FFP9WgcaMTZUlmKzh3", "gTwzg4IRAV6UOuzo00Z4w5gIHW3"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
            String[] strArr = A01;
            if (strArr[5].charAt(29) == strArr[6].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "FPFgBqqJeEkyPdeC";
            strArr2[0] = "lf6fPO1AOsDcBdk1";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{65, 70, 76, 61, Utf8.REPLACEMENT_BYTE, 61, 74, 22, 23, 21, 12, 17, 10};
    }

    static {
        A01();
    }
}
