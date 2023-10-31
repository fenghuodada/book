package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.SK */
/* loaded from: assets/audience_network.dex */
public class C5607SK extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public final /* synthetic */ C44088N A00;
    public final /* synthetic */ C439484 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C5607SK(C44088N c44088n, C439484 c439484) {
        this.A00 = c44088n;
        this.A01 = c439484;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5483QK c5483qk;
        C5483QK c5483qk2;
        c5483qk = this.A00.A0B;
        if (c5483qk.getState() == EnumC5518Qt.A02) {
            c5483qk2 = this.A00.A0B;
            if (c5483qk2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
