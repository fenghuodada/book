package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.D4 */
/* loaded from: assets/audience_network.dex */
public final class C4681D4 {
    public static byte[] A09;
    public static String[] A0A = {"fT4", "9XJ", "BdT8ugCih1Mpz00LrHVoF8KqNvgOr8AQ", "ItU4Mc5lT2NsoQYD", "XQJ1SNvFfokPp3KD", "IGCc23FH28N7ANBVj9k1dGnz4ha0U", "1lzK38hIt0", "A8GyDlY1o0KAgmQELzlat0ZxMGcgz"};
    public int A00;
    public int A01;
    public long A02;
    public int A03;
    public int A04;
    public final int A05;
    public final C5022Ij A06;
    public final C5022Ij A07;
    public final boolean A08;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A09 = new byte[]{27, 20, 15, 14, 9, 34, 30, 21, 8, 19, 22, 93, 16, 8, 14, 9, 93, 31, 24, 93, 76};
    }

    static {
        A01();
    }

    public C4681D4(C5022Ij c5022Ij, C5022Ij c5022Ij2, boolean z) {
        this.A07 = c5022Ij;
        this.A06 = c5022Ij2;
        this.A08 = z;
        c5022Ij2.A0Y(12);
        this.A05 = c5022Ij2.A0H();
        c5022Ij.A0Y(12);
        this.A04 = c5022Ij.A0H();
        C4997IK.A06(c5022Ij.A08() == 1, A00(0, 21, 44));
        this.A00 = -1;
    }

    public final boolean A02() {
        long A0M;
        int i;
        int i2 = this.A00 + 1;
        this.A00 = i2;
        if (i2 == this.A05) {
            if (A0A[6].length() != 19) {
                A0A[2] = "dfpT2dt5bGn60gbEA6wBElGJneIfVZr3";
                return false;
            }
            throw new RuntimeException();
        }
        if (this.A08) {
            A0M = this.A06.A0N();
        } else {
            A0M = this.A06.A0M();
        }
        this.A02 = A0M;
        if (this.A00 == this.A03) {
            this.A01 = this.A07.A0H();
            this.A07.A0Z(4);
            int i3 = this.A04 - 1;
            this.A04 = i3;
            if (i3 > 0) {
                C5022Ij c5022Ij = this.A07;
                String[] strArr = A0A;
                if (strArr[0].length() != strArr[1].length()) {
                    i = c5022Ij.A0H() - 1;
                } else {
                    A0A[2] = "DxoiDv7jb7q87sjQbqIMGefCzqS86q5Y";
                    i = c5022Ij.A0H() - 1;
                }
            } else {
                i = -1;
            }
            this.A03 = i;
        }
        return true;
    }
}
