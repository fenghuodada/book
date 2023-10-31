package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.ck */
/* loaded from: assets/audience_network.dex */
public final class C6246ck implements InterfaceC40261x {
    public static byte[] A0B;
    public static String[] A0C = {"Q9RghtL5kPMxXUG2hlpmHrVaJwYYGwGq", "TIO3FaU0Mikock0w3rckrPhiuYRMfGhJ", "k6SAISDvmHdOF1rkjeEeymm6HvDlJVR0", "eDRhFd25R2oFsFg27vb0d5UADzs1KoZv", "MaVPWgska1IH7XOKtPwNB8GdxIWUIxDt", "dS1g8OO0fBonmOwqVSSlXi39LbvMIXQb", "JdFW5Fpsu4G", "QGzwgj8zvaLwI8"};
    public static final String A0D;
    @Nullable
    public InterstitialAd A01;
    @Nullable
    public AbstractC397518 A02;
    @Nullable
    public C4820FP A03;
    @Nullable
    public C6197bu A04;
    public boolean A06;
    public boolean A07;
    public final C5953Xy A08;
    public final InterstitialAdExtendedListener A09;
    public final C402920 A0A;
    public long A00 = -1;
    public C5237MK A05 = new C5237MK();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0B = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -45, 31, 34, 20, 23, -45, 22, 20, 31, 31, 24, 23, -45, 42, 27, 28, 31, 24, -45, 38, 27, 34, 42, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -31, 13, 28, 21};
    }

    static {
        A0B();
        A0D = C6246ck.class.getSimpleName();
    }

    public C6246ck(C402920 c402920, InterfaceC403627 interfaceC403627, String str) {
        this.A0A = c402920;
        this.A08 = c402920.A05();
        this.A09 = new C6237cb(str, interfaceC403627, this);
    }

    public final long A0E() {
        C4820FP c4820fp = this.A03;
        if (c4820fp != null) {
            return c4820fp.A0B();
        }
        return -1L;
    }

    public final void A0F() {
        C4820FP c4820fp = this.A03;
        if (c4820fp != null) {
            c4820fp.A0M(new C6247cl(this));
            this.A03.A0R(true);
            this.A03 = null;
            this.A07 = false;
            this.A06 = false;
        }
    }

    public final void A0G() {
        C6197bu c6197bu = this.A04;
        if (c6197bu != null) {
            c6197bu.A02();
        }
    }

    public final void A0H(AdCompanionView adCompanionView) {
        AbstractC397518 abstractC397518;
        this.A04 = (C6197bu) adCompanionView.getAdCompanionViewApi();
        C5953Xy c5953Xy = this.A08;
        if (c5953Xy != null && (abstractC397518 = this.A02) != null) {
            this.A04.A03(c5953Xy, abstractC397518);
        }
    }

    public final void A0I(@Nullable EnumSet<CacheFlag> enumSet, @Nullable String str) {
        String A02;
        this.A00 = System.currentTimeMillis();
        if (!this.A07 && this.A03 != null) {
            Log.w(A0D, A0A(0, 78, 22));
        }
        this.A07 = false;
        if (this.A06 && !C5064JR.A0f(this.A08)) {
            this.A08.A06().A8y(A0A(130, 3, 62), C44458z.A0L, new C444690(A0A(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A08.A0D().A2a(C5236MJ.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A09.onError(this.A0A.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        C4820FP c4820fp = this.A03;
        if (c4820fp != null) {
            c4820fp.A0M(new C6251cp(this));
            this.A03.A0H();
            this.A03 = null;
        }
        C40181p c40181p = new C40181p(this.A0A.A09(), C5121KO.A00(this.A08.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC5117KK.A07, 1, enumSet);
        if (C5064JR.A1o(this.A08) && (A02 = C5192Lb.A02(this.A08, this.A0A.A07())) != null) {
            C402920 c402920 = this.A0A;
            if (A0C[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "6YCA3PHZSlLj0jmN2b2hvaW99ZyRMwjh";
            strArr[5] = "7PoIPIeUN8KAt8vfreK3c69iBAU82q7R";
            c402920.A0H(A02);
        }
        c40181p.A06(this.A0A.A07());
        c40181p.A07(this.A0A.A08());
        c40181p.A04(this.A0A.A03());
        this.A03 = new C4820FP(this.A08, c40181p);
        this.A03.A0M(new C6248cm(this));
        this.A03.A0P(str);
    }

    public final boolean A0J() {
        C4820FP c4820fp = this.A03;
        return c4820fp == null || c4820fp.A0S();
    }

    public final boolean A0K() {
        return this.A07;
    }

    public final boolean A0L() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A07) {
            this.A08.A0D().A2a(C5236MJ.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        C4820FP c4820fp = this.A03;
        if (c4820fp == null) {
            this.A08.A06().A8y(A0A(130, 3, 62), C44458z.A0S, new C444690(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A08.A0D().A2a(C5236MJ.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A09.onError(this.A0A.A01(), adError);
            return false;
        }
        c4820fp.A0G();
        this.A06 = true;
        this.A07 = false;
        return true;
    }
}
