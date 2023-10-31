package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ch */
/* loaded from: assets/audience_network.dex */
public final class C6243ch implements InterfaceC40261x {
    public static byte[] A0D;
    public static String[] A0E = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0F;
    public long A02;
    @Nullable
    public RewardedVideoAd A03;
    @Nullable
    public AbstractC397518 A04;
    @Nullable
    public C4816FL A05;
    @Nullable
    public C6197bu A06;
    @Nullable
    public String A08;
    public final C5953Xy A0A;
    public final S2SRewardedVideoAdExtendedListener A0B;
    public final C403324 A0C;
    public int A00 = 0;
    public boolean A09 = false;
    public long A01 = -1;
    public C5237MK A07 = new C5237MK();

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0D = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0E[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0E;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0C();
        A0F = C6243ch.class.getSimpleName();
    }

    public C6243ch(C403324 c403324, InterfaceC403627 interfaceC403627, String str) {
        this.A0C = c403324;
        this.A0A = c403324.A0B;
        this.A0B = new C6236ca(str, interfaceC403627, this, c403324);
    }

    private void A0E(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        String A02;
        if (!this.A09 && this.A05 != null) {
            Log.w(A0F, A0A(0, 78, 100));
        }
        A0F(false);
        this.A09 = false;
        C40181p c40181p = new C40181p(this.A0C.A0C, EnumC5119KM.A06, AdPlacementType.REWARDED_VIDEO, EnumC5117KK.A07, 1);
        c40181p.A08(z);
        if (C5064JR.A1o(this.A0A) && (A02 = C5192Lb.A02(this.A0A, this.A0C.A06)) != null) {
            C403324 c403324 = this.A0C;
            String[] strArr = A0E;
            if (strArr[2].charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0E[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            c403324.A06 = A02;
        }
        c40181p.A06(this.A0C.A06);
        c40181p.A07(this.A0C.A07);
        this.A05 = new C4816FL(this.A0C.A0B, c40181p);
        this.A05.A0M(new C6245cj(this));
        this.A05.A0Q(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(boolean z) {
        C4816FL c4816fl = this.A05;
        if (c4816fl != null) {
            c4816fl.A0M(new C6244ci(this));
            this.A05.A0R(z);
            this.A05 = null;
        }
    }

    public final long A0H() {
        C4816FL c4816fl = this.A05;
        if (c4816fl != null) {
            return c4816fl.A0B();
        }
        return -1L;
    }

    public final void A0I() {
        A0F(true);
    }

    public final void A0J() {
        C6197bu c6197bu = this.A06;
        if (c6197bu != null) {
            c6197bu.A02();
        }
    }

    public final void A0K(RewardData rewardData) {
        C4816FL c4816fl;
        this.A0C.A03 = rewardData;
        if (this.A09 && (c4816fl = this.A05) != null) {
            c4816fl.A0U(rewardData);
        }
    }

    public final void A0L(AdCompanionView adCompanionView) {
        AbstractC397518 abstractC397518;
        this.A06 = (C6197bu) adCompanionView.getAdCompanionViewApi();
        C5953Xy c5953Xy = this.A0A;
        if (c5953Xy != null && (abstractC397518 = this.A04) != null) {
            this.A06.A03(c5953Xy, abstractC397518);
        }
    }

    public final void A0M(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z) {
        this.A01 = System.currentTimeMillis();
        try {
            A0E(str, adExperienceType, z);
        } catch (Exception e) {
            Log.e(A0F, A0A(78, 31, 55), e);
            this.A0C.A0B.A06().A8y(A0A(109, 3, 96), C44458z.A0b, new C444690(e));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A0C.A0B.A0D().A2a(C5236MJ.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A0B.onError(this.A0C.A00(), internalError);
        }
    }

    public final boolean A0N() {
        C4816FL c4816fl = this.A05;
        return c4816fl == null || c4816fl.A0S();
    }

    public final boolean A0O() {
        return this.A09;
    }

    public final boolean A0P(int i, long j) {
        if (!this.A09) {
            this.A0B.onError(this.A0C.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        } else if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i);
            this.A05.A07.A03(j);
            this.A05.A0G();
            this.A09 = false;
            return true;
        } else {
            this.A09 = false;
            return false;
        }
    }
}
