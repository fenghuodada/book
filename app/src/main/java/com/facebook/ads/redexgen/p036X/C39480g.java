package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.0g */
/* loaded from: assets/audience_network.dex */
public final class C39480g {
    public static byte[] A00;
    public static final String A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 33);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{111, 84, 91, 88, 86, 95, 26, 78, 85, 26, 74, 91, 72, 73, 95, 26, 80, 73, 85, 84, 26, 94, 91, 78, 91, 26, 83, 84, 26, 123, 94, 123, 89, 78, 83, 85, 84, 124, 91, 89, 78, 85, 72, 67, 20, 19, 22, 3, 22, 82, 83, 78, 84, 73, 88, 65, 94, 75, 64, 113, 66, 71, 64, 69, 98, 115, 96, 97, 123, 124, 117, 27, 10, 24, 24, 31, 3, 25, 4, 30, 12, 3, 39, 32, 59, 38, 49, 47, 41, 46, 62, 51, 44, 33, 32, 42, 26, 48, 55, 41};
    }

    static {
        A03();
        A01 = C39480g.class.getSimpleName();
    }

    @Nullable
    public static AbstractC39470f A00(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, @Nullable Uri uri, Map<String, String> extraData) {
        return A01(c5953Xy, interfaceC5080Jh, str, uri, extraData, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.AbstractC39470f A01(com.facebook.ads.redexgen.p036X.C5953Xy r15, com.facebook.ads.redexgen.p036X.InterfaceC5080Jh r16, java.lang.String r17, @androidx.annotation.Nullable android.net.Uri r18, java.util.Map<java.lang.String, java.lang.String> r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C39480g.A01(com.facebook.ads.redexgen.X.Xy, com.facebook.ads.redexgen.X.Jh, java.lang.String, android.net.Uri, java.util.Map, boolean, boolean):com.facebook.ads.redexgen.X.0f");
    }

    public static boolean A04(String str) {
        return A02(82, 5, 117).equalsIgnoreCase(str) || A02(55, 9, 15).equalsIgnoreCase(str);
    }
}
