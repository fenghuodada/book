package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.LZ */
/* loaded from: assets/audience_network.dex */
public final class C5190LZ {
    public static byte[] A00;
    public static String[] A01 = {"HfGv3264Bq2TQ34NqRtE4P30TXR", "AZVpgJ8fi5FDz5AiC", "FCmmf0GU", "NGZF99o8OEHjBvmOxlLxN", "MEp80XUn5zKurDhCJ73", "hVp2plT6ulDLwck", "CErebgOhZelO8plRL7vU3", "v0a34uu5Y8rm3tpqkSr554RtUBdvL4ru"};

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{-47, -17, -4, -75, 2, -82, 1, 2, -17, 0, 2, -82, -49, 3, -14, -9, -13, -4, -15, -13, -36, -13, 2, 5, -3, 0, -7, -49, -15, 2, -9, 4, -9, 2, 7, -68, -82, -37, -17, -7, -13, -82, 1, 3, 0, -13, -82, 2, -10, -17, 2, -82, -9, 2, -75, 1, -82, -9, -4, -82, 7, -3, 3, 0, -82, -49, -4, -14, 0, -3, -9, -14, -37, -17, -4, -9, -12, -13, 1, 2, -68, 6, -5, -6, -82, -12, -9, -6, -13, -68, -15, -19, -20, 32, 15, 20, 16, 25, 14, 16, -7, 16, 31, 34, 26, 29, 22, -26, -13, -28, -26, -24, -7, -18, -5, -18, -7, -2, 24, 37, 27, 41, 38, 32, 27, -27, 32, 37, 43, 28, 37, 43, -27, 24, 26, 43, 32, 38, 37, -27, 13, 0, -4, 14, -60, -47, -57, -43, -46, -52, -57, -111, -52, -47, -41, -56, -47, -41, -111, -58, -60, -41, -56, -54, -46, -43, -36, -111, -91, -75, -78, -70, -74, -92, -91, -81, -88, -32, -16, -19, -11, -15, -29, -16, -45, -48, -54, -23, -25, -14, -14, -21, -8, -49, -22, -82, -73, -76, -80, -71, -65, -97, -70, -74, -80, -71, -56, -44, -46, -109, -58, -45, -55, -41, -44, -50, -55, -109, -57, -41, -44, -36, -40, -54, -41, -109, -58, -43, -43, -47, -50, -56, -58, -39, -50, -44, -45, -60, -50, -55, -47, -35, -37, -100, -49, -36, -46, -32, -35, -41, -46, -100, -28, -45, -36, -46, -41, -36, -43, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -22, -32, -13, -32, -19, -32, -89, -74, -87, -91, -72, -87, -93, -78, -87, -69, -93, -72, -91, -90, -13, -17, -70, -77, -64, -74, -66, -73, -60, -90, -69, -65, -73, -73, -61, -61, -65, -34, -22, -22, -26, -80, -91, -91, -26, -30, -41, -17, -92, -35, -27, -27, -35, -30, -37, -92, -39, -27, -29, -91, -23, -22, -27, -24, -37, -91, -41, -26, -26, -23, -91, -67, -55, -55, -59, -56, -67, -79, -62, -69, -75, -60, -54, -47, -64, -51, -57, -68, -44, 37, 33, 22, 46, -29, 28, 36, 36, 28, 33, 26, -29, 24, 36, 34, 12, -1, -5, 13, -22, 15, 6, -5};
    }

    static {
        A04();
    }

    public static Intent A00(Uri uri) {
        Intent intent = new Intent(A03(118, 26, 123), uri);
        intent.setComponent(null);
        if (Build.VERSION.SDK_INT >= 15) {
            intent.setSelector(null);
        }
        return intent;
    }

    @VisibleForTesting
    public static Intent A01(C5953Xy c5953Xy, Uri uri) {
        Intent A002 = A00(uri);
        A002.addCategory(A03(144, 33, 39));
        A002.addFlags(268435456);
        A002.putExtra(A03(206, 34, 41), c5953Xy.getPackageName());
        A002.putExtra(A03(278, 14, 8), false);
        if (C5064JR.A1M(c5953Xy)) {
            if (A03(292, 2, 81).equals(uri.getScheme())) {
                A002.setPackage(A03(259, 19, 67));
            }
        }
        return A002;
    }

    public static Intent A02(C5953Xy c5953Xy, Uri uri) {
        Intent A002 = A00(uri);
        A002.setPackage(A03(240, 19, 50));
        A002.putExtra(A03(187, 8, 74), c5953Xy.getPackageName());
        A002.putExtra(A03(354, 7, 31), true);
        return A002;
    }

    private void A05(C5953Xy c5953Xy, Uri uri) throws C5178LL {
        C5180LN.A0B(c5953Xy, A01(c5953Xy, uri));
    }

    private final void A06(C5953Xy c5953Xy, Uri uri) throws C5188LX, C5178LL {
        if (A0C(c5953Xy)) {
            if (C5064JR.A1f(c5953Xy) && C5180LN.A0C(c5953Xy, A02(c5953Xy, uri))) {
                return;
            }
            Intent A012 = A01(c5953Xy, uri);
            A012.setPackage(A03(240, 19, 50));
            C5180LN.A0B(c5953Xy, A012);
            return;
        }
        throw new C5188LX();
    }

    private void A07(C5953Xy c5953Xy, Uri uri, String str) {
        AdActivityIntent A04 = C5180LN.A04(c5953Xy);
        A04.addFlags(268435456);
        A04.putExtra(A03(376, 8, 90), EnumC5149Kq.A02);
        A04.putExtra(A03(177, 10, 66), uri.toString());
        A04.putExtra(A03(195, 11, 15), str);
        A04.putExtra(A03(294, 11, 22), System.currentTimeMillis());
        try {
            C5180LN.A09(c5953Xy, A04);
        } catch (C5178LL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c5953Xy.A06().A8y(A03(107, 11, 73), C44458z.A0D, new C444690(th));
            Log.e(A03(90, 17, 111), A03(0, 90, 82), th);
        }
    }

    private final void A08(C5953Xy c5953Xy, Uri uri, String str) throws C5178LL {
        boolean A05 = C5065JS.A05(c5953Xy);
        if (A0B(uri) && A05) {
            A07(c5953Xy, uri, str);
            return;
        }
        c5953Xy.A0D().A89(A05);
        A05(c5953Xy, uri);
    }

    public static void A09(C5190LZ c5190lz, C5953Xy c5953Xy, Uri uri, String str) {
        c5190lz.A0D(c5953Xy, uri, str);
    }

    public static void A0A(C5190LZ c5190lz, C5953Xy c5953Xy, Uri uri, String str) throws C5178LL {
        boolean z;
        try {
            if (A0B(uri)) {
                if (A03(361, 15, 121).equals(uri.getHost())) {
                    z = true;
                    if (!A03(348, 6, 20).equals(uri.getScheme()) || z) {
                        c5190lz.A06(c5953Xy, uri);
                        return;
                    } else {
                        c5190lz.A08(c5953Xy, uri, str);
                        return;
                    }
                }
            }
            c5190lz.A06(c5953Xy, uri);
            return;
        } catch (C5188LX unused) {
            c5190lz.A08(c5953Xy, uri, str);
            return;
        }
        z = false;
        if (!A03(348, 6, 20).equals(uri.getScheme())) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        if (r0.equalsIgnoreCase(r3) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0B(android.net.Uri r5) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r0 = 24
            if (r1 < r0) goto L38
            android.security.NetworkSecurityPolicy r0 = android.security.NetworkSecurityPolicy.getInstance()
            boolean r3 = r0.isCleartextTrafficPermitted()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5190LZ.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L61
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5190LZ.A01
            java.lang.String r1 = "9DaYNTGnU6m41BFJKxw5hEDOoLHVmNBK"
            r0 = 7
            r2[r0] = r1
            if (r3 != 0) goto L38
            android.security.NetworkSecurityPolicy r1 = android.security.NetworkSecurityPolicy.getInstance()
            java.lang.String r0 = r5.getHost()
            boolean r0 = r1.isCleartextTrafficPermitted(r0)
            if (r0 == 0) goto L5f
        L38:
            r0 = 1
        L39:
            java.lang.String r3 = r5.getScheme()
            if (r0 == 0) goto L4e
            r2 = 305(0x131, float:4.27E-43)
            r1 = 4
            r0 = 19
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L5d
        L4e:
            r2 = 343(0x157, float:4.8E-43)
            r1 = 5
            r0 = 25
            java.lang.String r0 = A03(r2, r1, r0)
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L5e
        L5d:
            r4 = 1
        L5e:
            return r4
        L5f:
            r0 = 0
            goto L39
        L61:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5190LZ.A0B(android.net.Uri):boolean");
    }

    private boolean A0C(C5953Xy c5953Xy) {
        for (ResolveInfo appInfo : c5953Xy.getPackageManager().queryIntentActivities(new Intent(A03(118, 26, 123), C5191La.A00(A03(309, 34, 58))), 0)) {
            if (appInfo.activityInfo.applicationInfo.packageName.equals(A03(240, 19, 50))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0D(C5953Xy c5953Xy, Uri uri, String str) {
        return C5180LN.A0E(c5953Xy, uri, str);
    }

    public static boolean A0E(C5190LZ c5190lz, C5953Xy c5953Xy, Uri uri, String str) {
        try {
            A0A(c5190lz, c5953Xy, uri, str);
            return true;
        } catch (C5178LL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            c5953Xy.A06().A8y(A03(107, 11, 73), C44458z.A05, new C444690(th));
            return false;
        }
    }
}
