package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import androidx.annotation.Nullable;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.facebook.ads.redexgen.X.MA */
/* loaded from: assets/audience_network.dex */
public final class C5227MA {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = i;
        if (new Random().nextFloat() >= 1.0f / rate) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, @Nullable Throwable th) {
        return A06(th, C5064JR.A0G(context), C5064JR.A01(context), C5064JR.A13(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(@Nullable Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C5700Tq c5700Tq = new C5700Tq();
            InterfaceC5225M8 interfaceC5225M8 = c5700Tq;
            if (i2 >= 0) {
                interfaceC5225M8 = new C5698To(interfaceC5225M8, i2);
            }
            if (i >= 0) {
                interfaceC5225M8 = new C5697Tn(interfaceC5225M8, i, i);
            }
            if (z) {
                interfaceC5225M8 = new C5699Tp(interfaceC5225M8);
            }
            C5701Tr c5701Tr = new C5701Tr(c5700Tq, 1, interfaceC5225M8);
            th.printStackTrace(new PrintWriter(new C5226M9(c5701Tr)));
            c5701Tr.flush();
            return c5700Tq.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(C5224M7 c5224m7) {
        String A02 = c5224m7.A02();
        if (A02 == null) {
            return false;
        }
        if (A0A(A02)) {
            return true;
        }
        for (String str : c5224m7.A01()) {
            if (A0A(str)) {
                return true;
            }
        }
        for (String str2 : c5224m7.A00()) {
            if (A0A(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
