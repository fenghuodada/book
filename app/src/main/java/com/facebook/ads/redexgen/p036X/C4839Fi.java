package com.facebook.ads.redexgen.p036X;

import android.content.ContentResolver;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.internal.util.activity.ActivityUtils;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fi */
/* loaded from: assets/audience_network.dex */
public final class C4839Fi extends AbstractC6288dQ {
    public static byte[] A0D;
    public static String[] A0E = {"YJVWhBFSVFKs7NrWmWULGh", "0GvTyPfIpVaCupDTXIuhVv", "vKmpQ0k2zgunQxdAFsx7Wlk6dmYtSCUc", "dqRYVPDeGy45RCRFCWIUPRHRtp9NBigI", "NSweCua6lZ8ChPFZ3cKnaOBscLcsrWLc", "HenZyTRrHhMHTWT00jKprDJGPW9d4C4V", "lvvcgtkpn6JHhS0LrJ19j3FN0lJsZZOv", "GmBDkEWrzwPugE8SLtTHysECIxUFQGpg"};
    public long A00;
    public InterfaceC397114 A01;
    public C397215 A02;
    public AbstractC397518 A03;
    public C5953Xy A04;
    public C5088Jp A05;
    public EnumC5149Kq A06;
    @Nullable
    @DoNotStrip
    public C5411PA A07;
    public String A08;
    @Nullable
    public String A09;
    public String A0A;
    public final String A0B = UUID.randomUUID().toString();
    public final AtomicBoolean A0C = new AtomicBoolean();

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0D = new byte[]{56, 52, 54, 54, 48, 57, 48, 39, 58, 56, 48, 33, 48, 39, 10, 39, 58, 33, 52, 33, 60, 58, 59, 108, 99, 82, 108, 110, 121, 100, 123, 100, 121, 116, 9, 6, 3, 15, 4, 30, 62, 5, 1, 15, 4, 68, 76, 77, 64, 72, 93, 64, 70, 71, 109, 72, 93, 72, 12, 16, 29, 31, 25, 17, 25, 18, 8, 53, 24, 87, 85, 66, 67, 66, 65, 78, 73, 66, 67, 104, 85, 78, 66, 73, 83, 70, 83, 78, 72, 73, 108, 66, 94, 4, 19, 7, 3, 19, 5, 2, 34, 31, 27, 19, 104, Byte.MAX_VALUE, 109, 123, 104, 126, 73, Byte.MAX_VALUE, 104, 108, Byte.MAX_VALUE, 104, 79, 72, 86, 25, 14, 28, 10, 25, 15, 14, 15, 61, 2, 15, 14, 4, 42, 15, 47, 10, 31, 10, 41, 30, 5, 15, 7, 14, 87, 64, 82, 68, 87, 65, 64, 65, 122, 83, 76, 65, 64, 74, 124, 103, 96, 120, 124, 108, 64, 109, 83, 76, 64, 82, 113, 92, 85, 64};
    }

    static {
        A08();
    }

    private void A06() {
        C40582T A00 = C40582T.A00(this.A04);
        C397215 c397215 = this.A02;
        A00.A06(c397215, c397215.A00());
    }

    private void A07() {
        if (this.A02 != null) {
            try {
                C40582T.A00(this.A04).A05(this.A02);
            } catch (Exception unused) {
            }
        }
    }

    private void A09(Intent intent) {
        int i = super.A00;
        String A04 = A04(69, 24, 89);
        if (i != -1) {
            ContentResolver contentResolver = this.A04.getContentResolver();
            if (A0E[3].charAt(29) != 'i') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[7] = "ryaiaZaF8EzuUPZd67FeoIG9jUALGHZG";
            strArr[6] = "XITZtpYy2wf6QHmOozCOnY6Xlkm3ca51";
            if (Settings.System.getInt(contentResolver, A04(1, 22, 43), 0) != 1) {
                int i2 = super.A00;
                if (A0E[2].charAt(2) != 'm') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0E;
                strArr2[1] = "mo2n49jFbf8CHvb7nubztA";
                strArr2[0] = "3h0LYrxRFByrgEG7Z48zJG";
                intent.putExtra(A04, i2);
                return;
            }
        }
        if (!C5064JR.A0e(this.A04)) {
            intent.putExtra(A04, 6);
        }
    }

    private void A0A(boolean z) {
        if (this.A06 == EnumC5149Kq.A0C) {
            A0C(z);
            return;
        }
        EnumC5149Kq enumC5149Kq = this.A06;
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[4] = "1yOiFacRiwJanRzqDJ6A5hJ77lYfziAe";
        strArr2[5] = "McEelBumOV7dKb1zb6BdvUT5HG6VvrgI";
        if (enumC5149Kq == EnumC5149Kq.A0B) {
            A0B(z);
        } else {
            A0C(z);
        }
    }

    private void A0B(boolean z) {
        C43657U c43657u = new C43657U(this.A04);
        boolean z2 = C5064JR.A1U(this.A04) && C42545g.A0A(this.A03.A0d());
        if (z2) {
            C42545g c42545g = new C42545g(c43657u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z2, new C6294dW(this));
            C5088Jp funnelLoggingHandler = new C5088Jp(this.A03.A0U(), this.A04.A08());
            c43657u.A0d(funnelLoggingHandler);
            c42545g.A0B();
            return;
        }
        C40161n.A02(this.A04, this.A03, z, new C6293dV(this));
    }

    private void A0C(boolean isUnifiedAssetsLoaderEnabled) {
        C43657U c43657u = new C43657U(this.A04);
        c43657u.A0d(this.A05);
        boolean z = C5064JR.A1U(this.A04) && C42545g.A0A(this.A03.A0d());
        boolean A0r = this.A03.A0r();
        if (z) {
            new C42545g(c43657u, this.A03.A0d(), this.A03.A0Y(), this.A03.A0Z(), z, new C6296dY(this, A0r)).A0B();
            return;
        }
        C6277dF c6277dF = (C6277dF) this.A03;
        if (TextUtils.isEmpty(c6277dF.A0O().A0D().A08())) {
            this.A01.ACF(this, AdError.INTERNAL_ERROR);
            return;
        }
        C40171o.A02(this.A04, c43657u, c6277dF);
        c43657u.A0W(new C4846Fp(this, isUnifiedAssetsLoaderEnabled, A0r, c6277dF, this), new C43587N(c6277dF.A0Z(), A04(144, 14, 91)));
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6288dQ
    public final int A0D() {
        AbstractC397518 abstractC397518 = this.A03;
        if (abstractC397518 == null) {
            String[] strArr = A0E;
            if (strArr[4].charAt(5) != strArr[5].charAt(5)) {
                A0E[3] = "zy8kAWNFspHhc9OUOOhBHMIK4AaCMilm";
                return -1;
            }
            throw new RuntimeException();
        }
        return abstractC397518.A0K();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6288dQ
    public final AbstractC397518 A0E() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6288dQ
    public final boolean A0F() {
        if (!this.A0C.get()) {
            return false;
        }
        this.A03.A0f(super.A01);
        String A03 = C5454Pr.A03(super.A02, this.A0B, this.A08);
        this.A03.A0g(super.A02);
        this.A03.A0k(A03);
        AdActivityIntent A04 = C5180LN.A04(this.A04);
        A04.putExtra(A04(166, 8, 91), this.A06);
        A04.putExtra(A04(119, 25, 21), this.A03);
        A04.putExtra(A04(158, 8, 119), this.A0B);
        if (A03 != null) {
            A04.putExtra(A04(104, 15, 100), A03);
        }
        A04.putExtra(A04(58, 11, 2), this.A0A);
        A04.putExtra(A04(93, 11, 8), this.A00);
        String str = this.A09;
        if (str != null) {
            A04.putExtra(A04(45, 13, 87), str);
        }
        A09(A04);
        A04.setFlags(A04.getFlags() | 268435456);
        A04.putExtra(A04(34, 11, 20), this.A03.A0U());
        ActivityUtils.A03(this.A04);
        try {
            C5180LN.A09(this.A04, A04);
        } catch (C5178LL e) {
            Throwable cause = e.getCause();
            Throwable th = e;
            if (cause != null) {
                th = e.getCause();
            }
            this.A04.A06().A8y(A04(23, 11, 115), C44458z.A01, new C444690(th));
        }
        String[] strArr = A0E;
        if (strArr[1].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0E;
        strArr2[1] = "L0ou65zbaEHIK9W1EiRqjH";
        strArr2[0] = "MlzKsAmmQguOmiSj0COpPP";
        return true;
    }

    public final void A0G(C5953Xy c5953Xy, InterfaceC397114 interfaceC397114, C40191q c40191q, boolean z, @Nullable String str, @Nullable String str2) {
        this.A0C.set(false);
        this.A04 = c5953Xy;
        this.A01 = interfaceC397114;
        this.A0A = c40191q.A02();
        this.A00 = c40191q.A00();
        this.A09 = str2;
        String str3 = this.A0A;
        this.A08 = str3 != null ? str3.split(A04(0, 1, 25))[0] : A04(0, 0, 20);
        this.A03 = C6277dF.A01(c40191q.A03(), this.A04);
        this.A03.A0i(str);
        this.A03.A0e(c40191q.A01().A06());
        this.A05 = new C5088Jp(this.A03.A0U(), c5953Xy.A08());
        if (this.A03.A0r()) {
            this.A06 = EnumC5149Kq.A05;
            if (this.A03.A0o()) {
                InterfaceC39330R A0D2 = this.A04.A0D();
                EnumC39440c enumC39440c = EnumC39440c.A04;
                String[] strArr = A0E;
                if (strArr[7].charAt(31) != strArr[6].charAt(31)) {
                    String[] strArr2 = A0E;
                    strArr2[7] = "T6UzDEu82kzY1KsvV3iHB7OkWnIxnMBs";
                    strArr2[6] = "PWXGgNcAlDXPEXP1mMx0dPQCA8p68UI5";
                    A0D2.AEj(enumC39440c);
                }
                throw new RuntimeException();
            }
            this.A04.A0D().AEj(EnumC39440c.A06);
            this.A02 = new C397215(this.A0B, this, interfaceC397114);
            A06();
            A0A(z);
        }
        int A0J = this.A03.A0J();
        if (A0J == 0) {
            this.A06 = EnumC5149Kq.A0C;
            C5953Xy c5953Xy2 = this.A04;
            String[] strArr3 = A0E;
            if (strArr3[4].charAt(5) != strArr3[5].charAt(5)) {
                String[] strArr4 = A0E;
                strArr4[4] = "sE7A2oUzbi1vVIMuEE2CogviWDEosGc5";
                strArr4[5] = "5NgD8lzbPLe7uQJdX4ST7JevLzoIctPR";
                c5953Xy2.A0D().AEj(EnumC39440c.A09);
            }
            throw new RuntimeException();
        } else if (A0J == 1) {
            this.A06 = EnumC5149Kq.A0B;
            this.A04.A0D().AEj(EnumC39440c.A08);
        }
        this.A02 = new C397215(this.A0B, this, interfaceC397114);
        A06();
        A0A(z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final String A65() {
        return this.A03.A0U();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final void onDestroy() {
        A07();
    }
}
