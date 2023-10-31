package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Oe */
/* loaded from: assets/audience_network.dex */
public final class C5380Oe {
    public static final int A00 = C5208Lr.A01.heightPixels;
    public static final int A01 = C5208Lr.A01.widthPixels;

    public static float A00(C39781B c39781b) {
        int A012 = c39781b.A0D().A01();
        int height = c39781b.A0D().A00();
        if (height > 0) {
            return A012 / height;
        }
        return -1.0f;
    }

    public static int A01(double d) {
        return (int) ((A01 - (AbstractC5381Of.A08 * 2)) / d);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = C5245MS.A01(16);
        int i = C5366OQ.A0A * 2;
        int ctaSpacing = AbstractC5381Of.A08;
        int ctaMargin2 = ctaMargin + i + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d) {
        return d < 0.9d;
    }

    public static boolean A04(double d, int i) {
        return A02(i) < A01(d);
    }

    public static boolean A05(int i, int i2, double d) {
        return i == 2 || A04(d, i2);
    }
}
