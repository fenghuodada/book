package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.RE */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5539RE {
    public static byte[] A05;
    public C5535RA A00;
    public EnumC5538RD A01;
    public String A02;
    public String A03;
    public byte[] A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{119};
    }

    public AbstractC5539RE(String str, @Nullable C5541RG c5541rg, C5535RA c5535ra) {
        this.A03 = A00(0, 0, 77);
        if (str != null) {
            this.A03 = str;
        }
        if (c5541rg != null && !c5541rg.A06().isEmpty()) {
            this.A03 += A00(0, 1, 35) + c5541rg.A06();
        }
        this.A00 = c5535ra;
    }

    public final C5535RA A02() {
        return this.A00;
    }

    public final EnumC5538RD A03() {
        return this.A01;
    }

    public final String A04() {
        return this.A02;
    }

    public final String A05() {
        return this.A03;
    }

    public final byte[] A06() {
        return this.A04;
    }
}
