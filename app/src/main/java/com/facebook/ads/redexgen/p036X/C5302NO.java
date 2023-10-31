package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.NO */
/* loaded from: assets/audience_network.dex */
public final class C5302NO {
    public static String[] A00 = {"Mh7OQPY25mJ4xZdJdnJU4lIWxnSb2W80", "uMvQGqYS2R9kLiwAhxbB5gyg9uPLoFmG", "JD8RnvPxGeaTxsc34jN0O6vhnDfoaLvm", "v", "yiVoJ6", "bh6EDcFJy1WMlrC6ew5uNV", "HsXTYL", "k"};
    public static final int A01 = (int) (C5208Lr.A00 * 200.0f);
    public static final int A03 = (int) (C5208Lr.A00 * 200.0f);
    public static final int A02 = (int) (C5208Lr.A00 * 50.0f);

    public static EnumC396710 A00(@Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return EnumC396710.A05;
        }
        if (A03(nativeAdLayout)) {
            return EnumC396710.A06;
        }
        return EnumC396710.A04;
    }

    @Nullable
    public static AbstractC5301NN A01(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, @Nullable NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return null;
        }
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int i = A01;
        if (width >= i && height >= i) {
            return new C5665TG(c5953Xy, interfaceC5080Jh, str);
        }
        if (width < A03 || height < A02) {
            return null;
        }
        return new C5666TH(c5953Xy, interfaceC5080Jh, str);
    }

    public static AbstractC5301NN A02(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, C39971U c39971u, InterfaceC5270Mr interfaceC5270Mr, InterfaceC5269Mq interfaceC5269Mq) {
        return new C5667TI(c5953Xy, interfaceC5080Jh, str, c39971u, interfaceC5270Mr, interfaceC5269Mq);
    }

    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int h = nativeAdLayout.getWidth();
        int w = nativeAdLayout.getHeight();
        int i = A01;
        if (h < i || w < i) {
            if (h >= A03) {
                int i2 = A02;
                if (A00[5].length() != 22) {
                    throw new RuntimeException();
                }
                A00[5] = "hhrIY4o6fKEkU42z4UVpb3";
                if (w < i2) {
                }
            }
            return true;
        }
        return false;
    }
}
