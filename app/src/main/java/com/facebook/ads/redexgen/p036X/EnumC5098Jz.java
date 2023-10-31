package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Jz */
/* loaded from: assets/audience_network.dex */
public enum EnumC5098Jz {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);
    
    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 111);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC5098Jz(long j, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC5098Jz A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        EnumC5098Jz[] values;
        for (EnumC5098Jz enumC5098Jz : values()) {
            if (enumC5098Jz.A01 == mediaCacheFlag) {
                return enumC5098Jz;
            }
        }
        return null;
    }
}
