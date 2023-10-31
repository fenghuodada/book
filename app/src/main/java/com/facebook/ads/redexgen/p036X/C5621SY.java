package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.SY */
/* loaded from: assets/audience_network.dex */
public class C5621SY extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public final /* synthetic */ C5404P2 A00;
    public final /* synthetic */ C439484 A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, Utf8.REPLACEMENT_BYTE, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public C5621SY(C5404P2 c5404p2, C439484 c439484) {
        this.A00 = c5404p2;
        this.A01 = c439484;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C5483QK c5483qk;
        C5483QK c5483qk2;
        c5483qk = this.A00.A0D;
        if (c5483qk.getState() == EnumC5518Qt.A02) {
            c5483qk2 = this.A00.A0D;
            if (c5483qk2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
