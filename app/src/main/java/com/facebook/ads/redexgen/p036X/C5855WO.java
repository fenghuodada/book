package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.WO */
/* loaded from: assets/audience_network.dex */
public final class C5855WO extends AbstractC4709DY {
    public static byte[] A02;
    public static String[] A03 = {"RjYCDLb2NANzCnedRKoQM0GQ", "QX5lqyT5r1TYXy6sq6A", "sDmzmZu2Epi", "QleORMZQxcHxPLUcnR0aaEPVJ", "tBrVRsKa63H7cOEQm0uGMqa5cwtrVWSW", "PEwzIbtLaNn1pzRcppb", "zVqUyH", "ZIYCsXe3luBjtUiXTHmKPLmA"};
    public C5856WP A00;
    public C5009IW A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{6, 18, 3, 14, 8, 72, 1, 11, 6, 4};
    }

    static {
        A03();
    }

    private int A00(C5022Ij c5022Ij) {
        int i = (c5022Ij.A00[2] & 255) >> 4;
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
            case 7:
                c5022Ij.A0Z(4);
                c5022Ij.A0O();
                int A0E = i == 6 ? c5022Ij.A0E() : c5022Ij.A0I();
                c5022Ij.A0Y(0);
                return A0E + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static boolean A04(C5022Ij c5022Ij) {
        return c5022Ij.A04() >= 5 && c5022Ij.A0E() == 127 && c5022Ij.A0M() == 1179402563;
    }

    public static boolean A05(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final long A07(C5022Ij c5022Ij) {
        if (!A05(c5022Ij.A00)) {
            return -1L;
        }
        int A00 = A00(c5022Ij);
        String[] strArr = A03;
        if (strArr[2].length() != strArr[0].length()) {
            String[] strArr2 = A03;
            strArr2[2] = "M0DKrSciZtY";
            strArr2[0] = "bwyyvFLni8GVBC8P6VU38e20";
            return A00;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final boolean A0A(C5022Ij c5022Ij, long j, C4708DX c4708dx) throws IOException, InterruptedException {
        byte[] bArr = c5022Ij.A00;
        if (this.A01 == null) {
            this.A01 = new C5009IW(bArr, 17);
            byte[] data = Arrays.copyOfRange(bArr, 9, c5022Ij.A07());
            data[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(data);
            c4708dx.A00 = Format.A07(null, A02(0, 10, 95), null, -1, this.A01.A00(), this.A01.A01, this.A01.A06, singletonList, null, 0, null);
            return true;
        } else if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            this.A00 = new C5856WP(this);
            this.A00.A01(c5022Ij);
            return true;
        } else if (!A05(bArr)) {
            return true;
        } else {
            C5856WP c5856wp = this.A00;
            if (c5856wp != null) {
                c5856wp.A00(j);
                c4708dx.A01 = this.A00;
            }
            return false;
        }
    }
}
