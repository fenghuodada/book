package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.SH */
/* loaded from: assets/audience_network.dex */
public class C5604SH extends AbstractRunnableC5165L8 {
    public static byte[] A01;
    public final /* synthetic */ C44088N A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{100, 91, 86, 87, 93, 18, 69, 83, 65, 18, 92, 87, 68, 87, 64, 18, 66, 64, 87, 66, 83, 64, 87, 86};
    }

    public C5604SH(C44088N c44088n) {
        this.A00 = c44088n;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        boolean z;
        z = this.A00.A07;
        if (!z) {
            this.A00.A0G(A00(0, 24, 76));
        }
    }
}
