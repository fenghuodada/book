package com.facebook.ads.redexgen.p036X;

import android.content.ActivityNotFoundException;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.ON */
/* loaded from: assets/audience_network.dex */
public final class C5363ON {
    public static byte[] A09;
    public static String[] A0A = {"Dlx9HUQ", "3SJpPR4POSYtfyo20zogCoACzZ0TFz6K", "kjKhSI2oz7rhTngoHOUaCo24OHJZbpIQ", "a4Zk7jMDxn", "WU0c1Yk7xIFA3rTFxMg", "", "SjppttcIPjZ3F", "aZkh9z8pdJw1o0Uivju"};
    @Nullable
    public InterfaceC5362OM A00;
    public boolean A01;
    public boolean A02;
    public final C5953Xy A03;
    public final InterfaceC5080Jh A04;
    public final C5237MK A05;
    public final InterfaceC5269Mq A06;
    @Nullable
    public final C5521Qw A07;
    public final String A08;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, Utf8.REPLACEMENT_BYTE, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    static {
        A02();
    }

    public C5363ON(C5953Xy c5953Xy, String str, @Nullable C5521Qw c5521Qw, C5237MK c5237mk, InterfaceC5080Jh interfaceC5080Jh) {
        this.A01 = true;
        this.A03 = c5953Xy;
        this.A08 = str;
        this.A07 = c5521Qw;
        this.A05 = c5237mk;
        this.A04 = interfaceC5080Jh;
        this.A06 = new C5651T2(this);
    }

    public C5363ON(C5953Xy c5953Xy, String str, @Nullable C5521Qw c5521Qw, C5237MK c5237mk, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5269Mq interfaceC5269Mq) {
        this.A01 = true;
        this.A03 = c5953Xy;
        this.A08 = str;
        this.A07 = c5521Qw;
        this.A05 = c5237mk;
        this.A04 = interfaceC5080Jh;
        this.A06 = interfaceC5269Mq;
    }

    public static void A03(C5953Xy c5953Xy, @Nullable C5521Qw c5521Qw, C5237MK c5237mk, InterfaceC5080Jh interfaceC5080Jh, C39881L c39881l, String str) {
        AbstractC39470f A01 = C39480g.A01(c5953Xy, interfaceC5080Jh, str, C5191La.A00(c39881l.A05()), new C5356OG().A03(c5521Qw).A02(c5237mk).A05(), false, false);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A9O(str, map);
        C5207Lq.A00(new DialogInterface$OnClickListenerC5360OK(this, map, str, str2), new DialogInterface$OnClickListenerC5361OL(this, str, map), ActivityUtils.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC39470f A012 = C39480g.A01(this.A03, this.A04, str, C5191La.A00(str2), new C5356OG(map).A03(this.A07).A02(this.A05).A05(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0C();
            }
            if (this.A00 != null) {
                this.A00.AAR();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            String[] strArr = A0A;
            if (strArr[0].length() != strArr[6].length()) {
                A0A[5] = "";
                Log.e(A01, A01(22, 22, 95), e2);
                return;
            }
            throw new RuntimeException();
        }
    }

    public final void A07(InterfaceC5362OM interfaceC5362OM) {
        this.A00 = interfaceC5362OM;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new C5088Jp(str, this.A04).A02(EnumC5087Jo.A0J, null);
        if (this.A05.A09(this.A03)) {
            this.A04.A8u(str, map);
        } else if (C5064JR.A14(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}
