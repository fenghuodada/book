package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.G1 */
/* loaded from: assets/audience_network.dex */
public final class C4858G1 extends AbstractC6313dp {
    public static byte[] A02;
    public static String[] A03 = {"OXbCEMjwdPN5xvU2NT0kKgep5UeL1Sqr", "SX0ygsPxRN6KiRybC8JMsMv996SDI", "L77PzfY5dGd9ppcaJeqEYdg5mL", "qaE4mxmFDXDzve4pMTR5s0xQhV", "rrEUCxltihDw1phZ7LTyezPpJ6vgfWBl", "FdpTQfSalwXKw6iuOYHl49ZbqEAaQDuv", "IFg4N7XoM6S2Rxr", "IzcF2xeWDVSzXIhxKqlgaOjlVHZ1W1Z3"};
    public Map<String, String> A00;
    public final Uri A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {104, 109, 106, 111};
        if (A03[5].charAt(30) != 'u') {
            throw new RuntimeException();
        }
        A03[5] = "82m81CO1d0OwjHPL38rD7xdABiLQ6kup";
        A02 = bArr;
    }

    static {
        A01();
    }

    public C4858G1(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, String str, Uri uri, Map<String, String> map) {
        super(c5953Xy, interfaceC5080Jh, str, null, true, true);
        this.A01 = uri;
        this.A00 = map;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6313dp
    public final void A0D() {
        A0E(this.A00, null);
    }

    public final Uri A0G() {
        return C5191La.A00(this.A01.getQueryParameter(A00(0, 4, 20)));
    }
}
