package com.facebook.ads.redexgen.p036X;

import android.content.Intent;
import android.util.Log;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.dc */
/* loaded from: assets/audience_network.dex */
public final class C6300dc implements InterfaceC39540n, InterfaceC40051c {
    public static byte[] A0B;
    public static String[] A0C = {"PgLDGrk3t3a26fQCrT3IpIrRB5PMNBKm", "uls9HIPpriPjzjIXJVTR7HWmS4IMGzWu", "f2YRmtND2fanruA3kJYGXgN9aGwgjawI", "EZdssni07U2TMPMup9RmA63S0tAhTBNo", "xilKUxawUAlWzUTJOedtCKHAHwNBDRxA", "SxIuirRfQS0L7ik0LzQXw", "dF8CYh", "NQmOIXzIEfwTEqDrM9Z7TuMEUTKSiMNX"};
    public long A00;
    public RewardData A01;
    public InterfaceC39640x A02;
    public C39650y A03;
    public C40061d A04;
    public C5953Xy A05;
    public String A06;
    @Nullable
    public String A07;
    public String A08;
    public boolean A09;
    public final String A0A = UUID.randomUUID().toString();

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 8);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        byte[] bArr = {78, 108, 99, 42, 121, 45, 126, 121, 108, Byte.MAX_VALUE, 121, 45, 76, 120, 105, 100, 104, 99, 110, 104, 67, 104, 121, 122, 98, Byte.MAX_VALUE, 102, 76, 110, 121, 100, 123, 100, 121, 116, 35, 45, 64, 108, 102, 104, 45, 126, 120, Byte.MAX_VALUE, 104, 45, 121, 101, 108, 121, 45, 100, 121, 42, 126, 45, 100, 99, 45, 116, 98, 120, Byte.MAX_VALUE, 45, 76, 99, 105, Byte.MAX_VALUE, 98, 100, 105, 64, 108, 99, 100, 107, 104, 126, 121, 35, 117, 96, 97, 45, 107, 100, 97, 104, 35, 73, 77, 78, 122, 107, 102, 106, 97, 108, 106, 65, 106, 123, 120, 96, 125, 100, 68, 37, 42, 27, 37, 39, 48, 45, 50, 45, 48, 61, 93, 82, 87, 91, 80, 74, 106, 81, 85, 91, 80, 17, 25, 24, 21, 29, 8, 21, 19, 18, 56, 29, 8, 29, 52, 40, 37, 39, 33, 41, 33, 42, 48, 13, 32, 4, 6, 17, 16, 17, 18, 29, 26, 17, 16, 59, 6, 29, 17, 26, 0, 21, 0, 29, 27, 26, Utf8.REPLACEMENT_BYTE, 17, 13, 117, 98, 118, 114, 98, 116, 115, 83, 110, 106, 98, 29, 6, 1, 25, 29, 13, 33, 12, 38, 57, 53, 39, 4, 41, 32, 53, 80, 78, 73, 67, 72, 80};
        if (A0C[1].charAt(29) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "6qgGoSyjmuhDFT94hunOHzgd3UUS7LMQ";
        strArr[0] = "q1PjRK7gg6WFD8n4pAFO870HLaNMi7ir";
        A0B = bArr;
    }

    static {
        A05();
    }

    private int A00() {
        int rotation = ((WindowManager) this.A05.getSystemService(A03(205, 6, 47))).getDefaultDisplay().getRotation();
        EnumC5357OH adOrientation = A02();
        if (adOrientation == EnumC5357OH.A06) {
            return -1;
        }
        if (adOrientation == EnumC5357OH.A04) {
            if (rotation == 2 || rotation == 3) {
                if (A0C[1].charAt(29) != 'g') {
                    String[] strArr = A0C;
                    strArr[3] = "WCZdwi0h9oyTFk4ywD5LtkOxTOpQ29Yc";
                    strArr[7] = "4yy96Y2PoNFTEE84mLwUlYETryPZgGhE";
                    return 8;
                }
                throw new RuntimeException();
            }
            return 0;
        } else if (rotation != 2) {
            return 1;
        } else {
            return 9;
        }
    }

    private final EnumC5149Kq A01() {
        return this.A04.A0C();
    }

    private EnumC5357OH A02() {
        return this.A04.A0D();
    }

    private void A04() {
        this.A09 = true;
    }

    private void A06(Intent intent) {
        C40061d c40061d = this.A04;
        RewardData rewardData = this.A01;
        c40061d.A0G(intent, rewardData, C5454Pr.A03(rewardData, this.A0A, this.A06));
    }

    private final void A07(C5953Xy c5953Xy, InterfaceC39640x interfaceC39640x, C40191q c40191q, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        this.A04 = new C40061d(c5953Xy, c40191q, this, str);
        this.A04.A0H(c5953Xy, enumSet);
    }

    private void A08(EnumC5149Kq enumC5149Kq) {
        if (enumC5149Kq.equals(EnumC5149Kq.A07)) {
            this.A05.A0D().AEj(EnumC39440c.A03);
        } else if (enumC5149Kq.equals(EnumC5149Kq.A08)) {
            this.A05.A0D().AEj(EnumC39440c.A07);
        } else if (enumC5149Kq.equals(EnumC5149Kq.A0A)) {
            this.A05.A0D().AEj(EnumC39440c.A09);
        } else if (enumC5149Kq.equals(EnumC5149Kq.A09)) {
            this.A05.A0D().AEj(EnumC39440c.A08);
        } else if (!enumC5149Kq.equals(EnumC5149Kq.A03)) {
        } else {
            if (this.A04.A0J()) {
                InterfaceC39330R A0D = this.A05.A0D();
                String[] strArr = A0C;
                if (strArr[5].length() == strArr[6].length()) {
                    throw new RuntimeException();
                }
                A0C[2] = "SZ1DhKHJxqFOmux8c4F7iNiG5ZFRRvjL";
                A0D.AEj(EnumC39440c.A04);
            } else if (this.A04.A0I()) {
                this.A05.A0D().AEj(EnumC39440c.A06);
            } else {
                this.A05.A0D().AEj(EnumC39440c.A05);
            }
        }
    }

    public final AbstractC397518 A09() {
        return this.A04.A0B();
    }

    public final void A0A(C5953Xy c5953Xy, InterfaceC39640x interfaceC39640x, C40191q c40191q, EnumSet<CacheFlag> enumSet, @Nullable String str, @Nullable String str2, @Nullable RewardData rewardData) {
        this.A05 = c5953Xy;
        this.A02 = interfaceC39640x;
        this.A08 = c40191q.A02();
        String str3 = this.A08;
        this.A06 = str3 != null ? str3.split(A03(107, 1, 19))[0] : A03(0, 0, 5);
        this.A00 = c40191q.A00();
        this.A07 = str2;
        this.A01 = rewardData;
        A07(c5953Xy, interfaceC39640x, c40191q, enumSet, str);
    }

    public final boolean A0B() {
        if (!this.A09) {
            InterfaceC39640x interfaceC39640x = this.A02;
            if (interfaceC39640x != null) {
                interfaceC39640x.AB5(this, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            }
            return false;
        }
        AdActivityIntent A04 = C5180LN.A04(this.A05);
        A04.putExtra(A03(154, 24, 124), A00());
        A04.putExtra(A03(189, 8, 96), this.A0A);
        A04.putExtra(A03(143, 11, 76), this.A08);
        A04.putExtra(A03(178, 11, 15), this.A00);
        EnumC5149Kq A01 = A01();
        A08(A01);
        A04.putExtra(A03(197, 8, 88), A01);
        String str = this.A07;
        if (str != null) {
            A04.putExtra(A03(130, 13, 116), str);
        }
        A06(A04);
        A04.addFlags(268435456);
        A04.putExtra(A03(119, 11, 54), this.A04.A0E());
        try {
            ActivityUtils.A03(this.A05);
            C5180LN.A09(this.A05, A04);
            return true;
        } catch (C5178LL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A05.A06().A8y(A03(108, 11, 76), C44458z.A0D, new C444690(th));
            Log.e(A03(90, 17, 7), A03(0, 90, 5), th);
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    @Nullable
    public final String A65() {
        return this.A04.A0E();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final AdPlacementType A7B() {
        return AdPlacementType.INTERSTITIAL;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40051c
    public final void A9u(AdError adError) {
        InterfaceC39640x interfaceC39640x = this.A02;
        if (interfaceC39640x != null) {
            interfaceC39640x.AB5(this, adError);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40051c
    public final void A9v() {
        A04();
        this.A02.AB4(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40051c
    public final void ADj() {
        this.A03 = new C39650y(this.A05, this.A0A, this, this.A02);
        this.A03.A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC40051c
    public final void AFH() {
        C39650y c39650y = this.A03;
        if (c39650y != null) {
            c39650y.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final void onDestroy() {
        C40061d c40061d = this.A04;
        if (c40061d != null) {
            c40061d.A0F();
        }
    }
}
