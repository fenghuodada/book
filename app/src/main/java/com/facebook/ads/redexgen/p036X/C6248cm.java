package com.facebook.ads.redexgen.p036X;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cm */
/* loaded from: assets/audience_network.dex */
public class C6248cm extends AbstractC39550o {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C6246ck A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C6248cm(C6246ck c6246ck) {
        this.A00 = c6246ck;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A06 = false;
            interstitialAdExtendedListener = this.A00.A09;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C4820FP c4820fp;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C402920 c402920;
        C5237MK c5237mk;
        C4820FP c4820fp2;
        C4820FP c4820fp3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A06 = false;
        c4820fp = this.A00.A03;
        if (c4820fp != null) {
            c4820fp2 = this.A00.A03;
            c4820fp2.A0M(new C6249cn(this));
            c4820fp3 = this.A00.A03;
            c4820fp3.A0H();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A09;
        c402920 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDismissed(c402920.A01());
        c5237mk = this.A00.A05;
        c5237mk.A05();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C402920 c402920;
        interstitialAdExtendedListener = this.A00.A09;
        c402920 = this.A00.A0A;
        interstitialAdExtendedListener.onInterstitialDisplayed(c402920.A01());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A09;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C402920 c402920;
        this.A00.A08.A0D().A2X();
        interstitialAdExtendedListener = this.A00.A09;
        c402920 = this.A00.A0A;
        interstitialAdExtendedListener.onAdClicked(c402920.A01());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C402920 c402920;
        interstitialAdExtendedListener = this.A00.A09;
        c402920 = this.A00.A0A;
        interstitialAdExtendedListener.onLoggingImpression(c402920.A01());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r4 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        r5 = new com.facebook.ads.redexgen.p036X.C5192Lb();
        r3 = r6.A00.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A07();
        r0 = r6.A00.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b5, code lost:
        if (r5.A09(r3, r1, r0.A0G()) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b7, code lost:
        r5.A08(r6.A00.A08, true);
        r4 = r6.A00;
        r3 = r4.A08;
        r0 = r6.A00.A0A;
        r1 = r0.A09();
        r0 = r6.A00.A0A;
        r4.A01 = r5.A06(r3, r1, r0.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x013f, code lost:
        r5.A08(r6.A00.A08, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0148, code lost:
        if (r4 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(com.facebook.ads.redexgen.p036X.InterfaceC39540n r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C6248cm.A0F(com.facebook.ads.redexgen.X.0n):void");
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC39550o
    public final void A0G(C5115KH c5115kh) {
        long j;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C402920 c402920;
        InterfaceC39330R A0D = this.A00.A08.A0D();
        j = this.A00.A00;
        A0D.A2a(C5236MJ.A01(j), c5115kh.A03().getErrorCode(), c5115kh.A04());
        interstitialAdExtendedListener = this.A00.A09;
        c402920 = this.A00.A0A;
        interstitialAdExtendedListener.onError(c402920.A01(), C5194Ld.A00(c5115kh));
    }
}
