package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Sa */
/* loaded from: assets/audience_network.dex */
public class C5623Sa extends AbstractRunnableC5165L8 {
    public static byte[] A01;
    public final /* synthetic */ C5404P2 A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{5, 58, 55, 54, 60, 115, 61, 54, 37, 54, 33, 115, 32, 39, 50, 33, 39, 54, 55, 115, 35, Utf8.REPLACEMENT_BYTE, 50, 42, 58, 61, 52};
    }

    public C5623Sa(C5404P2 c5404p2) {
        this.A00 = c5404p2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        boolean z;
        z = this.A00.A04;
        if (!z) {
            this.A00.A0I(A00(0, 27, 122));
        }
    }
}
