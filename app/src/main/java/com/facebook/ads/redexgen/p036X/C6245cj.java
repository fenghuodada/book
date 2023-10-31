package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cj */
/* loaded from: assets/audience_network.dex */
public class C6245cj extends AbstractC39550o {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C6243ch A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C6245cj(C6243ch c6243ch) {
        this.A00 = c6243ch;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C5237MK c5237mk;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C42515d c42515d = (C42515d) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j = this.A00.A02;
            c42515d.A02(currentTimeMillis - j);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c42515d.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
        c5237mk = this.A00.A07;
        c5237mk.A05();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C403324 c403324;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        c403324 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c403324.A00());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C403324 c403324;
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        c403324 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c403324.A00());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0F(InterfaceC39540n interfaceC39540n) {
        C4816FL c4816fl;
        C4816FL c4816fl2;
        C403324 c403324;
        C403324 c4033242;
        C4816FL c4816fl3;
        AbstractC397518 abstractC397518;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C403324 c4033243;
        AbstractC397518 abstractC3975182;
        RewardedVideoAd rewardedVideoAd2;
        AbstractC397518 abstractC3975183;
        C403324 c4033244;
        RewardedVideoAd rewardedVideoAd3;
        AbstractC397518 abstractC3975184;
        C403324 c4033245;
        AbstractC397518 abstractC3975185;
        C403324 c4033246;
        C403324 c4033247;
        C403324 c4033248;
        c4816fl = this.A00.A05;
        if (c4816fl == null) {
            this.A00.A0A.A06().A8y(A00(0, 3, 70), C44458z.A0N, new C444690(A00(3, 18, 43)));
            return;
        }
        C6243ch c6243ch = this.A00;
        c4816fl2 = c6243ch.A05;
        c6243ch.A08 = c4816fl2.A0E();
        AbstractC6288dQ abstractC6288dQ = (AbstractC6288dQ) interfaceC39540n;
        c403324 = this.A00.A0C;
        if (c403324.A03 != null) {
            c4033248 = this.A00.A0C;
            abstractC6288dQ.A02(c4033248.A03);
        }
        c4033242 = this.A00.A0C;
        int A0D = abstractC6288dQ.A0D();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        c4033242.A00 = A0D;
        this.A00.A09 = true;
        C6243ch c6243ch2 = this.A00;
        c4816fl3 = c6243ch2.A05;
        c6243ch2.A04 = c4816fl3.A0T();
        abstractC397518 = this.A00.A04;
        if (abstractC397518 != null) {
            abstractC3975184 = this.A00.A04;
            if (abstractC3975184.A0G() > 0) {
                C5192Lb c5192Lb = new C5192Lb();
                C5953Xy c5953Xy = this.A00.A0A;
                c4033245 = this.A00.A0C;
                String str = c4033245.A06;
                abstractC3975185 = this.A00.A04;
                if (c5192Lb.A09(c5953Xy, str, abstractC3975185.A0G())) {
                    c5192Lb.A08(this.A00.A0A, true);
                    C6243ch c6243ch3 = this.A00;
                    C5953Xy c5953Xy2 = c6243ch3.A0A;
                    c4033246 = this.A00.A0C;
                    String str2 = c4033246.A0C;
                    c4033247 = this.A00.A0C;
                    c6243ch3.A03 = c5192Lb.A07(c5953Xy2, str2, c4033247.A06);
                } else {
                    c5192Lb.A08(this.A00.A0A, false);
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A0B;
            c4033243 = this.A00.A0C;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c4033243.A00());
            return;
        }
        abstractC3975182 = this.A00.A04;
        abstractC3975182.A0m(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        abstractC3975183 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(abstractC3975183.A0M());
        c4033244 = this.A00.A0C;
        RewardedVideoAd.RewardedVideoLoadAdConfig build = withRewardData.withAdExperience(c4033244.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.1z
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(InterfaceC3877Ad interfaceC3877Ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C403324 c4033249;
                s2SRewardedVideoAdExtendedListener2 = C6245cj.this.A00.A0B;
                c4033249 = C6245cj.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c4033249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(InterfaceC3877Ad interfaceC3877Ad, AdError adError) {
                AbstractC397518 abstractC3975186;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C403324 c4033249;
                C6245cj.this.A00.A03 = null;
                abstractC3975186 = C6245cj.this.A00.A04;
                abstractC3975186.A0m(false);
                s2SRewardedVideoAdExtendedListener2 = C6245cj.this.A00.A0B;
                c4033249 = C6245cj.this.A00.A0C;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c4033249.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C5237MK c5237mk;
                s2SRewardedVideoAdExtendedListener2 = C6245cj.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
                c5237mk = C6245cj.this.A00.A07;
                c5237mk.A05();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C6245cj.this.A00.A0B;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(build);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0G(C5115KH c5115kh) {
        C403324 c403324;
        long j;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C403324 c4033242;
        this.A00.A0F(true);
        c403324 = this.A00.A0C;
        InterfaceC39330R A0D = c403324.A0B.A0D();
        j = this.A00.A01;
        A0D.A2a(C5236MJ.A01(j), c5115kh.A03().getErrorCode(), c5115kh.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A0B;
        c4033242 = this.A00.A0C;
        s2SRewardedVideoAdExtendedListener.onError(c4033242.A00(), C5194Ld.A00(c5115kh));
    }
}
