package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.7X */
/* loaded from: assets/audience_network.dex */
public final class C43687X {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, 24, 19, 38, 25, 37, 41, 25, 39, 40, 19, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, 22, 24, 29, 26, 20, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, 26, 14, 20, 18, 11, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C43687X.class.getSimpleName();
        A05 = C44458z.A0o;
        A06 = C44458z.A0s;
        A02 = C44458z.A0l;
        A01 = C44458z.A0k;
        A03 = C44458z.A0m;
        A00 = C44458z.A0i;
        A04 = C44458z.A0n;
        A07 = C44458z.A0t;
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A02(C44148U c44148u, C43587N c43587n, int i, String str, long j) {
        if (!A06(c44148u)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c43587n.A00);
            jSONObject.put(A00(134, 13, 118), c43587n.A01);
            if (j > 0) {
                jSONObject.put(A00(191, 9, 97), C5236MJ.A06(System.currentTimeMillis() - j));
            }
            C444690 c444690 = new C444690(str);
            c444690.A05(jSONObject);
            c444690.A03(1);
            c44148u.A06().A8z(A00(154, 5, 17), i, c444690);
        } catch (Throwable th) {
            c44148u.A06().A3R(th);
        }
    }

    public static void A03(C44148U c44148u, C43637S c43637s, String str, int i, @Nullable String str2, @Nullable Long l, @Nullable Long l2) {
        if (A06(c44148u)) {
            A05(c44148u, c43637s.A05, c43637s.A06, c43637s.A07, A00(186, 5, 111), str, i, str2, l, l2, null);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A04(C44148U c44148u, C43677W c43677w, boolean z) {
        if (!A06(c44148u)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c43677w.A01);
            jSONObject.put(A00(134, 13, 118), c43677w.A03);
            jSONObject.put(A00(104, 16, 42), c43677w.A02);
            jSONObject.put(A00(159, 13, 119), c43677w.A00);
            if (C5064JR.A1g(c44148u)) {
                jSONObject.put(A00(200, 3, 82), c43677w.A04);
            }
            String A002 = z ? A00(61, 10, 0) : A00(71, 11, 55);
            int i = z ? A05 : A06;
            C444690 c444690 = new C444690(A002);
            c444690.A05(jSONObject);
            c444690.A03(1);
            c44148u.A06().A8z(A00(154, 5, 17), i, c444690);
        } catch (Throwable th) {
            c44148u.A06().A3R(th);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A05(C44148U c44148u, String str, String str2, String str3, String str4, String str5, int i, @Nullable String str6, @Nullable Long l, @Nullable Long l2, @Nullable Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(134, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (l != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(l));
            }
            if (l2 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l2));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (C5064JR.A1g(c44148u)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String A002 = A00(19, 19, 64);
            if (i == A03) {
                A002 = A00(38, 23, 64);
            } else if (i == A01) {
                A002 = A00(0, 19, 7);
            }
            C444690 c444690 = new C444690(A002);
            c444690.A05(jSONObject);
            c444690.A03(1);
            c44148u.A06().A8z(A00(154, 5, 17), i, c444690);
        } catch (Throwable th) {
            c44148u.A06().A3R(th);
        }
    }

    public static boolean A06(C44148U c44148u) {
        int A062;
        if (c44148u.A03().A8P()) {
            A062 = 1;
        } else {
            A062 = C5066JT.A06(c44148u);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c44148u.A07().A00() <= 1.0d / ((double) A062);
    }
}
