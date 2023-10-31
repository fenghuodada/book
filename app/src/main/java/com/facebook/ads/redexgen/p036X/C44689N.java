package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.9N */
/* loaded from: assets/audience_network.dex */
public final class C44689N {
    public static boolean A00;
    public static boolean A01;
    public static byte[] A02;
    public static String[] A03 = {"qrNp1wG", "4f9SKAEMWw8LBpPH9ClfYFaSVVluVAOE", "62aVnpwn360RV3u8SEcmxFYidJmBvefX", "Gce9ySP9MgoEln4cNVrEo5sJO8CSkBrv", "GAv6eBsy68sSiadtgyjEU9blJSusD372", "OMedkGV5dbFzDsS0dZcen", "wlEAAxVLaYYUt0VSnPi", "2B4l1t7rFez9Iyb0KdS6JKEUq9HBo8Fu"};
    public static final AtomicBoolean A04;
    public static final AtomicBoolean A05;
    public static final AtomicBoolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A03[1].charAt(3) == 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "IDfTBPjSyvL4biEe7dLkbKSavqcQmadb";
            strArr[2] = "Oy3yacq1X2KDRnpIDSUXWs28RTZJmhMt";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
            i4++;
        }
    }

    public static void A03() {
        A02 = new byte[]{-56, -7, -10, -56, -52, -8, -57, -58, -66, -70, -71, -19, -36, -31, -35, -26, -37, -35, -58, -35, -20, -17, -25, -22, -29, -62, -77, -70, -113, -40, -35, -40, -29, -40, -48, -37, -40, -23, -48, -29, -40, -34, -35, -113, -30, -29, -48, -31, -29, -44, -45, -60, -43, -36, -111, -24, -46, -28, -111, -46, -35, -29, -42, -46, -43, -22, -111, -38, -33, -38, -27, -38, -46, -35, -38, -21, -42, -43, -110, -111, -60, -36, -38, -31, -31, -38, -33, -40, -97, -62, -40, -34, -119, -51, -40, -41, -112, -35, -119, -52, -54, -43, -43, -119, -86, -34, -51, -46, -50, -41, -52, -50, -73, -50, -35, -32, -40, -37, -44, -86, -51, -36, -105, -46, -41, -46, -35, -46, -54, -43, -46, -29, -50, -111, -110, -105, -119, -68, -40, -42, -50, -119, -49, -34, -41, -52, -35, -46, -40, -41, -54, -43, -46, -35, -30, -119, -42, -54, -30, -119, -41, -40, -35, -119, -32, -40, -37, -44, -119, -39, -37, -40, -39, -50, -37, -43, -30, -105, -66, -51, -58, -31, -33, -24, -33, -20, -29, -35, -9, -4, -9, 2, -9, -17, -6, -9, 8, -13, 5, 10, 5, 16, 5, -3, 8, 5, 22, 1, -60, -59, -68, 10, 11, 16, -68, -1, -3, 8, 8, 1, 0, -54};
    }

    static {
        A03();
        A06 = new AtomicBoolean();
        A04 = new AtomicBoolean();
        A05 = new AtomicBoolean();
    }

    public static InterfaceC5156Ky A00() {
        return new C5937Xi();
    }

    public static InterfaceC5171LE A01(C5952Xx c5952Xx) {
        return new C5936Xh(c5952Xx);
    }

    public static void A04(AudienceNetworkAds.InitListener initListener, AudienceNetworkAds.InitResult initResult) {
        ExecutorC5239MM.A01.execute(new C5938Xj(initListener, initResult));
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A06(C5952Xx c5952Xx) {
        if (C5066JT.A0P(c5952Xx) && !A05.getAndSet(true)) {
            try {
                C44358p reportHandler = new C44358p(Thread.getDefaultUncaughtExceptionHandler(), c5952Xx, new C5934Xf());
                Thread.setDefaultUncaughtExceptionHandler(reportHandler);
            } catch (Exception e) {
                c5952Xx.A06().A8y(A02(181, 7, 62), C44458z.A1X, new C444690(e));
            }
        }
    }

    public static void A07(C5952Xx c5952Xx) {
        A0G(c5952Xx, null, null, 3);
    }

    public static void A08(C5952Xx c5952Xx) {
        A0G(c5952Xx, null, null, 3);
    }

    public static void A09(C5952Xx c5952Xx) {
        if (C5064JR.A1b(c5952Xx)) {
            A0E(c5952Xx, 0);
        }
        if (C5064JR.A1i(c5952Xx)) {
            A0B(c5952Xx);
        }
    }

    public static void A0A(C5952Xx c5952Xx) {
        if (C5064JR.A1c(c5952Xx)) {
            A0F(c5952Xx, null, 3);
        }
    }

    public static void A0B(C5952Xx c5952Xx) {
        ExecutorC5250MX.A06.execute(new C5939Xk(c5952Xx));
    }

    public static void A0C(C5952Xx c5952Xx) {
        C44398t.A0C(c5952Xx, new C5933Xe(c5952Xx), new C5943Xo(), BuildConfigApi.isDebug());
        c5952Xx.A08();
        C428168.A04(c5952Xx, null);
    }

    public static void A0E(C5952Xx c5952Xx, int i) {
        C44138T.A01(c5952Xx);
        if (A04.getAndSet(true)) {
            return;
        }
        if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isDebuggerOn()) {
            C5128KV.A02();
        }
        A06(c5952Xx);
        C5168LB.A00(C5064JR.A0k(c5952Xx), BuildConfigApi.isDebug(), A00(), A01(c5952Xx));
        C427461.A03(C5064JR.A02(c5952Xx));
        C5545RK.A09(new C5935Xg(c5952Xx));
        if (i == 3) {
            Log.e(A02(8, 17, 60), A02(89, 89, 45));
            c5952Xx.A06().A9I(A02(178, 3, 33), C44458z.A0R, new C444690(A02(198, 24, 96)));
        }
        ActivityUtils.A04(c5952Xx, AudienceNetworkActivity.class);
        ExecutorC5250MX.A05(c5952Xx);
        C5091Js.A05(c5952Xx);
        C39610u.A01(c5952Xx);
        if (C5064JR.A0u(c5952Xx)) {
            C42104y.A00(c5952Xx);
        }
        if (C5064JR.A1I(c5952Xx)) {
            C5925XW.A02().A7N(c5952Xx);
        }
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A0F(C5952Xx c5952Xx, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C44138T.A01(c5952Xx);
        boolean z = false;
        synchronized (C44689N.class) {
            if (!A00) {
                if (i != 1 && i != 2) {
                    if (i == 3 && !A01) {
                        A01 = true;
                        z = true;
                    }
                }
                A00 = true;
                z = true;
            }
        }
        if (z) {
            A0E(c5952Xx, i);
            ExecutorC5250MX.A08.execute(new C5940Xl(c5952Xx, initListener));
        } else if (i != 1) {
        } else {
            String A022 = A02(51, 38, 53);
            if (initListener != null) {
                A04(initListener, new C44679M(true, A022));
            } else {
                Log.w(A02(8, 17, 60), A022);
            }
        }
    }

    public static void A0G(C5952Xx c5952Xx, @Nullable MultithreadedBundleWrapper multithreadedBundleWrapper, @Nullable AudienceNetworkAds.InitListener initListener, int i) {
        C5128KV.A05(A02(188, 10, 82), A02(25, 26, 51), A02(0, 8, 87));
        C5545RK.A06();
        A0F(c5952Xx, initListener, i);
    }

    public static synchronized boolean A0H() {
        boolean z;
        synchronized (C44689N.class) {
            z = A00;
        }
        return z;
    }
}
