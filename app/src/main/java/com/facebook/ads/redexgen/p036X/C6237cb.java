package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.cb */
/* loaded from: assets/audience_network.dex */
public final class C6237cb extends C403425 implements InterstitialAdExtendedListener {
    public static byte[] A01;
    public final C6246ck A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-68, -63, -57, -46, -72, -59, -59, -62, -59, -46, -74, -62, -73, -72, -46, -66, -72, -52, -103, -100, -101, -108, -84, -106, -101, -93, -114, -103, -106, -111, -114, -95, -106, -100, -101, -84, -95, -106, -102, -110, -84, -104, -110, -90, 15, 16, 14, 27, 1, 14, 14, 11, 14, 27, 9, 1, 15, 15, -3, 3, 1, 27, 7, 1, 21};
    }

    public C6237cb(String str, InterfaceC403627 interfaceC403627, C6246ck c6246ck) {
        super(str, interfaceC403627);
        this.A00 = c6246ck;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(1024, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(18, 26, 0), this.A00.A0E());
        super.A00.ABX(1020, this.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC3877Ad interfaceC3877Ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(44, 21, 111), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 38), adError.getErrorCode());
        super.A00.ABX(1023, this.A01, bundle);
    }

    @Override // com.facebook.ads.InterstitialAdExtendedListener
    public final void onInterstitialActivityDestroyed() {
        super.A00.ABX(1026, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(1022, this.A01, null);
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(1021, this.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(1025, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdCompleted() {
        super.A00.ABX(3000, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerFailed() {
        super.A00.ABX(3002, this.A01, null);
    }

    @Override // com.facebook.ads.RewardedAdListener
    public final void onRewardedAdServerSucceeded() {
        super.A00.ABX(AdError.MEDIATION_ERROR_CODE, this.A01, null);
    }
}
