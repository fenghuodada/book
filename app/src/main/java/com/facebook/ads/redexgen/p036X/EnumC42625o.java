package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.5o */
/* loaded from: assets/audience_network.dex */
public enum EnumC42625o {
    A04(A01(16, 5, 50)),
    A06(A01(27, 5, 29)),
    A05(A01(21, 6, 93));
    
    public static byte[] A01;
    public static String[] A02 = {"k9IbPcfog7a2vud71ZD1yiSptuKC", "7LgXLJxVBX0dpNGH2cpdo2FqGbwHr2dh", "LRipwKypnEKMqg6PamR7G8YuQckBwe", "JMyIsM6N3mQ5xBBSQQoIEfTakpln9APf", "n5EonvV2d0ynVphuWIfrU3PhJk0DBM6W", "TLMtZWSWcMyBHKhNGVy3rrDPFywR", "JEnYl3ig6b1G3QZnd7pVPdvbWtuLiuax", "SOFQxOre1ZQqrgpFIrPfi6IMKTKD0s"};
    public final String A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[3].charAt(7) != 'N') {
                throw new RuntimeException();
            }
            A02[4] = "tSWii36WTWypzTcQeixtwPDDv3BIvAiF";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A01 = new byte[]{-51, -47, -59, -53, -55, 11, -1, 16, 9, 19, 14, 25, 12, 7, 8, 18, 18, 22, 10, 16, 14, 65, 53, 70, Utf8.REPLACEMENT_BYTE, 73, 68, 10, -3, -8, -7, 3};
    }

    static {
        A02();
    }

    EnumC42625o(String str) {
        this.A00 = str;
    }

    @Nullable
    public static EnumC42625o A00(@Nullable String str) {
        EnumC42625o[] values;
        for (EnumC42625o enumC42625o : values()) {
            if (enumC42625o.A00.equals(str)) {
                return enumC42625o;
            }
        }
        return null;
    }
}
