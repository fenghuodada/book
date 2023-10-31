package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1d */
/* loaded from: assets/audience_network.dex */
public final class C40061d {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    @Nullable
    public C43657U A00;
    public EnumC5357OH A01 = EnumC5357OH.A06;
    @Nullable
    @DoNotStrip
    public C5411PA A02;
    public final C6281dJ A03;
    public final InterfaceC40051c A04;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -53, -48, -42, -57, -44, -43, -42, -53, -42, -53, -61, -50};
    }

    static {
        A07();
    }

    public C40061d(C5953Xy c5953Xy, C40191q c40191q, InterfaceC40051c interfaceC40051c, @Nullable String str) {
        this.A03 = A02(c5953Xy, c40191q, str, c40191q.A03());
        this.A04 = interfaceC40051c;
    }

    @Nullable
    private AdError A00(C5953Xy c5953Xy) {
        if (this.A03.A0c().isEmpty()) {
            c5953Xy.A06().A8y(A06(62, 3, 18), C44458z.A0Z, new C444690(A06(5, 43, 6)));
            return AdError.internalError(AdError.INTERNAL_ERROR_2006);
        }
        return null;
    }

    public static C6281dJ A02(C5953Xy c5953Xy, C40191q c40191q, @Nullable String str, JSONObject jSONObject) {
        C6281dJ adDataBundle = C6281dJ.A01(jSONObject, c5953Xy);
        adDataBundle.A0i(str);
        C44649I A01 = c40191q.A01();
        if (A01 != null) {
            adDataBundle.A0e(A01.A06());
        }
        return adDataBundle;
    }

    private C43657U A04(C5953Xy c5953Xy) {
        C43657U c43657u = this.A00;
        return c43657u != null ? c43657u : new C43657U(c5953Xy);
    }

    private void A08(C5953Xy c5953Xy) {
        C39991W A062 = this.A03.A0O().A0D().A06();
        A0A(A062 != null ? A062.A0A() : EnumC5357OH.A06);
        C6272dA c6272dA = new C6272dA(this);
        C43657U c43657u = new C43657U(c5953Xy);
        boolean z = C5064JR.A1U(c5953Xy) && C42545g.A0A(this.A03.A0d());
        String[] strArr = A06;
        if (strArr[7].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "rsw451NGt86";
        strArr2[2] = "Yd4DtCWl7E1Fg10XBidxjBNo2K";
        if (z) {
            C42545g c42545g = new C42545g(c43657u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C6271d9(this));
            C5088Jp funnelLoggingHandler = new C5088Jp(this.A03.A0U(), c5953Xy.A08());
            c43657u.A0d(funnelLoggingHandler);
            c42545g.A0B();
            return;
        }
        C6281dJ c6281dJ = this.A03;
        String[] strArr3 = A06;
        if (strArr3[1].charAt(24) != strArr3[0].charAt(24)) {
            C40161n.A02(c5953Xy, c6281dJ, true, c6272dA);
            return;
        }
        String[] strArr4 = A06;
        strArr4[6] = "NvwaqOE8NtZ";
        strArr4[2] = "Mi75BUZiVIPk9FHJPOQQgiG4jh";
        C40161n.A02(c5953Xy, c6281dJ, true, c6272dA);
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x00c9 */
    /* JADX WARN: Incorrect condition in loop: B:21:0x0112 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.facebook.ads.redexgen.p036X.C5953Xy r21, java.util.EnumSet<com.facebook.ads.CacheFlag> r22) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C40061d.A09(com.facebook.ads.redexgen.X.Xy, java.util.EnumSet):void");
    }

    private void A0A(EnumC5357OH enumC5357OH) {
        this.A01 = enumC5357OH;
    }

    public final AbstractC397518 A0B() {
        return this.A03;
    }

    public final EnumC5149Kq A0C() {
        if (this.A03.A0r()) {
            return EnumC5149Kq.A03;
        }
        int size = this.A03.A0c().size();
        String[] strArr = A06;
        if (strArr[6].length() != strArr[2].length()) {
            A06[3] = "f4kXngrP8CD5dz";
            if (size > 1) {
                return EnumC5149Kq.A07;
            }
            if (this.A03.A0O().A0D().A06() != null) {
                EnumC5149Kq enumC5149Kq = EnumC5149Kq.A09;
                String[] strArr2 = A06;
                if (strArr2[7].length() == strArr2[4].length()) {
                    A06[3] = "ny";
                    return enumC5149Kq;
                }
            } else if (A0I()) {
                EnumC5149Kq enumC5149Kq2 = EnumC5149Kq.A0A;
                String[] strArr3 = A06;
                if (strArr3[6].length() != strArr3[2].length()) {
                    A06[3] = "JH";
                    return enumC5149Kq2;
                }
                throw new RuntimeException();
            } else {
                EnumC5149Kq enumC5149Kq3 = EnumC5149Kq.A08;
                if (A06[3].length() == 32) {
                    A06[3] = "ySAy4b6nQ";
                    return enumC5149Kq3;
                }
                String[] strArr4 = A06;
                strArr4[1] = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl";
                strArr4[0] = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9";
                return enumC5149Kq3;
            }
        }
        throw new RuntimeException();
    }

    public final EnumC5357OH A0D() {
        return this.A01;
    }

    public final String A0E() {
        return this.A03.A0U();
    }

    public final void A0F() {
        this.A04.AFH();
    }

    public final void A0G(Intent intent, RewardData rewardData, String str) {
        this.A03.A0g(rewardData);
        this.A03.A0k(str);
        intent.putExtra(A06(48, 14, 94), this.A03);
    }

    public final void A0H(C5953Xy c5953Xy, EnumSet<CacheFlag> enumSet) {
        AdError A00 = A00(c5953Xy);
        if (A00 != null) {
            this.A04.A9u(A00);
            return;
        }
        this.A04.ADj();
        if (A0C() == EnumC5149Kq.A09) {
            A08(c5953Xy);
        } else {
            A09(c5953Xy, enumSet);
        }
    }

    public final boolean A0I() {
        return !TextUtils.isEmpty(this.A03.A0O().A0D().A08());
    }

    public final boolean A0J() {
        return this.A03.A0o();
    }
}
