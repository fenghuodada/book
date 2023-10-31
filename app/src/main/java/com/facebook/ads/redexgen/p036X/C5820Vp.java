package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

@TargetApi(21)
/* renamed from: com.facebook.ads.redexgen.X.Vp */
/* loaded from: assets/audience_network.dex */
public final class C5820Vp implements InterfaceC4747EA {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 28, 26, 12, 11, 28, 84, 9, 21, 24, 0, 27, 24, 26, 18};
    }

    public C5820Vp(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final int A66() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final MediaCodecInfo A67(int i) {
        A01();
        return this.A00[i];
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final boolean A8f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 94));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final boolean AEJ() {
        return true;
    }
}
