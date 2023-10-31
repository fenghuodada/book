package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Ls */
/* loaded from: assets/audience_network.dex */
public final class C5209Ls {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, 15, 75, 74, 91, 74, 93, 66, 70, 65, 74, 15, 70, 73, 15, 78, 95, 95, 15, 70, 92, 15, 122, 65, 70, 91, 86, 1, 24, 34, 113, 4, Utf8.REPLACEMENT_BYTE, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, 18, 9, 14, 19, 30, 84, 3, 73, 23, 11, 6, 30, 2, 21, 73, 50, 9, 14, 19, 30, 55, 11, 6, 30, 2, 21, 38, 4, 19, 14, 17, 14, 19, 30};
    }

    static {
        A01();
        A01 = C5209Ls.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i, int i2) {
        return i >= 640 && i2 >= 640;
    }

    public static boolean A05(C44148U c44148u) {
        boolean z = false;
        try {
            PackageManager packageManager = c44148u.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            boolean z2 = true;
            ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(c44148u.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                int length = activityInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (!A00(78, 38, 62).equals(activityInfoArr[i].name)) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (!z && !A03()) {
                z2 = false;
            }
            boolean isUnity = c44148u.A03().A8P();
            if (isUnity) {
                String str = A00(32, 14, 8) + z2;
            }
            return z2;
        } catch (Throwable th) {
            if (c44148u.A03().A8P()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
