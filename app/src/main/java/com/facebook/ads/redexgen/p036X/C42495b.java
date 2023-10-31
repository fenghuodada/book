package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import androidx.annotation.Nullable;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.AdCompanionView;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5b */
/* loaded from: assets/audience_network.dex */
public final class C42495b implements RewardedVideoAdApi, Repairable {
    public static byte[] A05;
    public boolean A00;
    public final InterfaceC3877Ad A01;
    public final C403324 A02;
    public final C4814FJ A03;
    public final C5953Xy A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{116, 116, 116, -89, 120, 120, -88, 122, -90, -96, -95, -44, -42, -93, -96, -124, -124, -124, -126, Byte.MAX_VALUE, -80, -77, -126, 76, 75, 122, 119, 78, 123, 73, 70, 82, 119, 125, 110, 123, 119, 106, 117, 41, 110, 123, 123, 120, 123, 55, 19, -51, -32, -14, -36, -19, -33, -32, -33, -101, -15, -28, -33, -32, -22, -101, -36, -33, -101, -33, -32, -18, -17, -19, -22, -12, -32, -33, -81, -62, -44, -66, -49, -63, -62, -63, 125, -45, -58, -63, -62, -52, 125, -66, -63, 125, -55, -52, -66, -63, 125, -49, -62, -50, -46, -62, -48, -47, -62, -63, -63, -44, -26, -48, -31, -45, -44, -45, -113, -27, -40, -45, -44, -34, -113, -48, -45, -113, -30, -41, -34, -26, -113, -46, -48, -37, -37, -44, -45, -86, -85, -71, -70, -72, -75, -65, -84, -81, -95, -92, -127, -92, -43, -54, -47, -39};
    }

    public C42495b(Context context, String str, InterfaceC3877Ad interfaceC3877Ad) {
        this.A01 = interfaceC3877Ad;
        this.A04 = C42285G.A05(context);
        this.A04.A0D().A2g(AdPlacementType.REWARDED_VIDEO.toString(), str);
        this.A02 = new C403324(this.A04, str, this.A01);
        this.A04.A0G(this);
        this.A03 = new C4814FJ(this.A02);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A02 */
    public final C42505c buildLoadAdConfig() {
        return new C42505c(this);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    /* renamed from: A03 */
    public final C42515d buildShowAdConfig() {
        return new C42515d();
    }

    public final void A04() {
        if (C5064JR.A1Z(this.A04)) {
            return;
        }
        this.A03.A05();
        this.A04.A0D().A2h();
    }

    public final void A05(RewardData rewardData) {
        this.A03.A0A(rewardData);
    }

    public final void A06(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A02.A04 = rewardedVideoAdListener;
        this.A04.A0D().A2Z(rewardedVideoAdListener != null);
    }

    public final void A07(@Nullable String str, @Nullable AdExperienceType adExperienceType, boolean z, boolean z2) {
        if (str == null) {
            this.A04.A0D().A2d();
        } else {
            this.A04.A0D().A2c();
        }
        this.A00 = z2;
        this.A03.A09(this.A01, str, adExperienceType, z);
        this.A04.A0D().A2b();
    }

    public final boolean A08(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        this.A04.A0D().A2m();
        boolean A0D = this.A03.A0D(this.A01, rewardedVideoShowAdConfig);
        this.A04.A0D().A2l(A0D);
        return A0D;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC3877Ad
    public final void destroy() {
        C5128KV.A05(A00(135, 7, 66), A00(47, 27, 119), A00(0, 8, 62));
        A04();
    }

    public final void finalize() {
        this.A03.A04();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC3877Ad
    public final String getPlacementId() {
        return this.A02.A0C;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final int getVideoDuration() {
        return this.A02.A00;
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public final boolean isAdInvalidated() {
        boolean A0B = this.A03.A0B();
        this.A04.A0D().A4Y(A0B);
        return A0B;
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean isAdLoaded() {
        return this.A03.A0C();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC3877Ad
    public final void loadAd() {
        C5128KV.A05(A00(142, 6, 60), A00(74, 32, 89), A00(23, 8, 17));
        A07(null, null, true, false);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void loadAd(RewardedVideoAd.RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        ((C42505c) rewardedVideoLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void registerAdCompanionView(AdCompanionView adCompanionView) {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0L(adCompanionView);
        }
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        if (this.A02.A04 != null) {
            RewardedVideoAdListener rewardedVideoAdListener = this.A02.A04;
            InterfaceC3877Ad interfaceC3877Ad = this.A01;
            rewardedVideoAdListener.onError(interfaceC3877Ad, new AdError(AdError.INTERNAL_ERROR_CODE, A00(31, 16, 5) + C5227MA.A03(this.A02.A0B, th)));
        }
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.InterfaceC3877Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A02.A06 = extraHints.getHints();
        this.A02.A07 = extraHints.getMediationData();
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        C5128KV.A05(A00(148, 4, 94), A00(106, 29, 107), A00(15, 8, 74));
        return A08(new C42515d().withAppOrientation(-1).build());
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final boolean show(RewardedVideoAd.RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        C5128KV.A05(A00(148, 4, 94), A00(106, 29, 107), A00(8, 7, 108));
        return A08(rewardedVideoShowAdConfig);
    }

    @Override // com.facebook.ads.internal.api.RewardedVideoAdApi
    public final void unregisterAdCompanionView() {
        if (this.A00 && this.A03.A07() != null) {
            this.A03.A07().A0J();
        }
    }
}
