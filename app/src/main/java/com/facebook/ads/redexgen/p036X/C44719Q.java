package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.9Q */
/* loaded from: assets/audience_network.dex */
public final class C44719Q {
    public static HashMap<String, String> A00;
    public static byte[] A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 101);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{Utf8.REPLACEMENT_BYTE, 46, 46, 60, 43, 55, 50, 58, 118, 103, 103, 121, 118, 122, 114, 27, 10, 10, 12, 31, 8, 9, 14, 25, 2, 8, 0, 9, 47, 45, 38, 39, 46, 15, 19, 53, 41, 44, Utf8.REPLACEMENT_BYTE, 40, 41, 101, 114, 125, 114, 101, 106, 126, 119, 100, 115, 114, 104, 110, 111, 126, 104, 126, 126, 100, 98, 99, 114, 100, 105, 51, 60, 54, 32, 61, 59, 54};
    }

    public static synchronized Map<String, String> A01(C44148U c44148u) {
        synchronized (C44719Q.class) {
            if (A00 != null) {
                return new HashMap(A00);
            }
            A00 = new HashMap<>();
            A00.put(A00(22, 6, 41), c44148u.getPackageName());
            A02(c44148u, A00);
            return new HashMap(A00);
        }
    }

    public static synchronized Map<String, String> A02(C44148U c44148u, Map<String, String> map) {
        synchronized (C44719Q.class) {
            map.put(A00(41, 3, 83), A00(65, 7, 55));
            map.put(A00(44, 11, 68), c44148u.A03().A7n());
            map.put(A00(33, 2, 37), c44148u.A03().A7m());
            map.put(A00(35, 6, 31), C445599.A03);
            C445599 c445599 = new C445599(c44148u);
            map.put(A00(15, 7, 63), c445599.A06());
            map.put(A00(8, 7, 82), c445599.A05());
            map.put(A00(0, 8, 27), String.valueOf(c445599.A04()));
            map.put(A00(28, 5, 7), c445599.A0A());
            map.put(A00(55, 10, 72), c44148u.A07().A02());
        }
        return map;
    }
}
