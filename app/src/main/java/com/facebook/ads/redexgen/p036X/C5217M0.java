package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.M0 */
/* loaded from: assets/audience_network.dex */
public final class C5217M0 {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{38, 42, 40, 107, 35, 36, 38, 32, 39, 42, 42, 46, 107, 46, 36, 49, 36, 43, 36};
    }

    @Nullable
    public static PackageInfo A00(C44148U c44148u) {
        return A01(c44148u, A02(0, 19, 59));
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static PackageInfo A01(C44148U c44148u, String str) {
        PackageManager packageManager;
        if (TextUtils.isEmpty(str) || (packageManager = c44148u.getPackageManager()) == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(str, 1);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public static boolean A04(C44148U c44148u, String str) {
        PackageInfo packageInfo = A01(c44148u, str);
        return packageInfo != null;
    }
}
