package com.facebook.ads.redexgen.p036X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vq */
/* loaded from: assets/audience_network.dex */
public final class C5821Vq implements InterfaceC4747EA {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{72, 87, 90, 91, 81, 17, 95, 72, 93};
    }

    public C5821Vq() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final int A66() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final MediaCodecInfo A67(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final boolean A8f(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 51).equals(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4747EA
    public final boolean AEJ() {
        return false;
    }
}
