package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.SZ */
/* loaded from: assets/audience_network.dex */
public class C5622SZ extends AbstractRunnableC5165L8 {
    public static byte[] A01;
    public final /* synthetic */ C5404P2 A00;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 80);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-78, -59, -64, -63, -53, 124, -45, -67, -49, 124, -54, -63, -46, -63, -50, 124, -52, -50, -63, -52, -67, -50, -63, -64};
    }

    public C5622SZ(C5404P2 c5404p2) {
        this.A00 = c5404p2;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        boolean z;
        z = this.A00.A03;
        if (!z) {
            this.A00.A0I(A00(0, 24, 12));
        }
    }
}
