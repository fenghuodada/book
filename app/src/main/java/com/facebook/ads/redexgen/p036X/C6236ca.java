package com.facebook.ads.redexgen.p036X;

import android.os.Bundle;
import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.ca */
/* loaded from: assets/audience_network.dex */
public final class C6236ca extends C403425 implements S2SRewardedVideoAdExtendedListener {
    public static byte[] A02;
    public final C6243ch A00;
    public final C403324 A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{103, 96, 122, 113, 107, 124, 124, 97, 124, 113, 109, 97, 106, 107, 113, 101, 107, 119, 34, 37, Utf8.REPLACEMENT_BYTE, 52, 57, 61, 52, 61, 34, 47, 46, 36, 52, 47, 62, 57, 42, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 52, 32, 46, 50, 62, 61, 60, 53, 45, 59, 60, 36, 51, 62, 59, 54, 51, 38, 59, 61, 60, 45, 38, 59, Utf8.REPLACEMENT_BYTE, 55, 45, 57, 55, 43, 74, 77, 75, 70, 92, 75, 75, 86, 75, 70, 84, 92, 74, 74, 88, 94, 92, 70, 82, 92, 64};
    }

    public C6236ca(String str, InterfaceC403627 interfaceC403627, C6243ch c6243ch, C403324 c403324) {
        super(str, interfaceC403627);
        this.A00 = c6243ch;
        this.A01 = c403324;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(2104, super.A01, null);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad) {
        Bundle bundle = new Bundle();
        bundle.putLong(A00(43, 26, 106), this.A00.A0H());
        bundle.putInt(A00(18, 25, 115), this.A01.A00);
        super.A00.ABX(AdError.BROKEN_MEDIA_ERROR_CODE, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC3877Ad interfaceC3877Ad, AdError adError) {
        Bundle bundle = new Bundle();
        bundle.putString(A00(69, 21, 1), adError.getErrorMessage());
        bundle.putInt(A00(0, 18, 54), adError.getErrorCode());
        super.A00.ABX(2103, super.A01, bundle);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad) {
        super.A00.ABX(2105, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        super.A00.ABX(3002, super.A01, null);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        super.A00.ABX(AdError.MEDIATION_ERROR_CODE, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        super.A00.ABX(2106, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        super.A00.ABX(2110, super.A01, null);
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        super.A00.ABX(3000, super.A01, null);
    }
}
