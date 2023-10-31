package com.facebook.ads.redexgen.p036X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.RK */
/* loaded from: assets/audience_network.dex */
public final class C5545RK {
    @Nullable
    public static InterfaceC5525R0 A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 121, 104, 23, 81, 81, 30, 99, 22, 103, Byte.MAX_VALUE, 85, 116, 20, 73, 126, 19, 74, 72, 66, 77, 20, 78, 81, 86, 20, 115, 73, 85, 77, 27, 44, 9, 86, 113, 76, 80, 116, 73, 92, 87, 72, 84, 17, 109, 87, 92, 126, 82, 76, 72, 8, 83, 108, 82, 21, 67, 104, 73, 7, 48, 14, 124, 116, 29, 56, 9, 120, 53, 0, 15, 40, 32, 37, 120, 62, 60, 56, 53, 61, 13, 9, 47, 54, 20, 3, 41, 13, 113, 70, 1, 42, 59, 56, 32, 61, 36, 38, 33, 40, 111, 45, 42, 41, 32, 61, 42, 111, 38, 33, 38, 59, 110, 125, Byte.MAX_VALUE, 125, 108, 19, 68, 75, Byte.MAX_VALUE, 71, 65, 110, 67, 14, 81, 68, 112, 119, 65, 75, 92, 112, 109, 16, 76, 85, 66, 104, 24, 47, 72, 64, 91, 89, 69, 72, 71, 76, 118, 68, 70, 77, 76, 118, 70, 71, 57, 50, 35, 32, 56, 37, 60, 29, 6, 51, 91, 46, 59, 7, 59, 3, 42, 80, 57, 92, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 60, 13, 42, 25, 38, 27, 47, 33, 81, 5, 15, 56, 84, 99};
    }

    static {
        A07();
        A03 = new HashSet();
        A04 = new HashSet();
        A03.add(A05(3, 29, 30));
        A04.add(A05(165, 29, 81));
        A04.add(A05(32, 29, 2));
        A04.add(A05(61, 29, 116));
        A04.add(A05(113, 29, 29));
        A05 = new AtomicBoolean();
    }

    public static InterfaceC5527R2 A00(C44148U c44148u) {
        return A03(true, c44148u);
    }

    public static InterfaceC5527R2 A01(C44148U c44148u) {
        return A02(true, c44148u);
    }

    public static InterfaceC5527R2 A02(boolean z, C44148U c44148u) {
        C5531R6 c5531r6 = new C5531R6();
        C5534R9 A042 = A04(c44148u);
        if (!A0B(c44148u)) {
            c5531r6.A02(A04);
            c5531r6.A01(A03);
        }
        if (C5193Lc.A04()) {
            Map<String, String> A022 = C5193Lc.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        return AbstractC5529R4.A00().A01(c5531r6.A00(A042.A09()).A03(z).A04(c44148u.A03().A8P()).A05(), c44148u.A06(), ExecutorC5250MX.A01());
    }

    public static InterfaceC5527R2 A03(boolean z, C44148U c44148u) {
        return AbstractC5529R4.A00().A01(new C5531R6().A03(z).A00(A04(c44148u).A09()).A04(c44148u.A03().A8P()).A05(), c44148u.A06(), ExecutorC5250MX.A01());
    }

    public static C5534R9 A04(C44148U c44148u) {
        A08(c44148u);
        C5534R9 c5534r9 = new C5534R9();
        if (A0B(c44148u)) {
            c5534r9.A02(360000).A04(120000);
        } else {
            c5534r9.A02(C5064JR.A07(c44148u)).A04(C5064JR.A09(c44148u));
        }
        c5534r9.A03(C5064JR.A08(c44148u)).A05(C5064JR.A0A(c44148u)).A06(C5064JR.A0B(c44148u));
        synchronized (C5545RK.class) {
            if (A00 != null && (A00 instanceof InterfaceC5525R0)) {
                c5534r9.A07(A00);
            }
        }
        return c5534r9;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C44148U c44148u) {
        if (!A05.get()) {
            c44148u.A06().A8y(A05(158, 7, 111), C44458z.A20, new C444690(A05(90, 23, 119)));
        }
    }

    public static synchronized void A09(InterfaceC5525R0 interfaceC5525R0) {
        synchronized (C5545RK.class) {
            A00 = interfaceC5525R0;
        }
    }

    public static boolean A0A(C44148U c44148u) {
        int i = Build.VERSION.SDK_INT;
        String A052 = A05(142, 16, 17);
        if (i < 17) {
            return Settings.System.getInt(c44148u.getContentResolver(), A052, 0) != 0;
        }
        int i2 = Settings.Global.getInt(c44148u.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i2 != 0;
    }

    public static boolean A0B(C44148U c44148u) {
        String urlPrefix = c44148u.A03().A7l();
        return !TextUtils.isEmpty(urlPrefix) && urlPrefix.endsWith(A05(0, 3, 50));
    }
}
