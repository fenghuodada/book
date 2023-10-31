package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WJ */
/* loaded from: assets/audience_network.dex */
public final class C5850WJ extends AbstractC4709DY {
    public static byte[] A05;
    public static String[] A06 = {"Wz5kpI", "Qu4rCXWHGrZxyCLJ91nJYm9HwbbNBaAB", "jcFxTUNQ9mBSPSNjMUJY07wGvzfGS2C0", "wRecpgZSCUfboq2e81nqZjs5B", "2wu5mHiieWPMNFHGOEN0thCm6IWO9Xya", "P54DBngSoaRE6HRNMaW6H3WNUnBy8S0x", "u1kez8Hi5IXqm6uzKKQ3Ad3inAYpSzVQ", "yOq9tmgmQLY5WHe8QvjpkSndY9PHYfSY"};
    public int A00;
    public C4711Da A01;
    public C4713Dc A02;
    public C4715De A03;
    public boolean A04;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{61, 41, 56, 53, 51, 115, 42, 51, 46, 62, 53, 47};
    }

    static {
        A04();
    }

    public static int A00(byte b, int i, int i2) {
        return (b >> i2) & (255 >>> (8 - i));
    }

    public static int A01(byte b, C4711Da c4711Da) {
        if (!c4711Da.A04[A00(b, c4711Da.A00, 1)].A03) {
            return c4711Da.A02.A03;
        }
        return c4711Da.A02.A04;
    }

    private final C4711Da A02(C5022Ij c5022Ij) throws IOException {
        if (this.A03 == null) {
            this.A03 = C4716Df.A04(c5022Ij);
            return null;
        }
        C4713Dc c4713Dc = this.A02;
        if (A06[7].charAt(1) != 'O') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[3] = "EnVW7ymY5FyvrkHYKpVAYit2P";
        strArr[0] = "59lsEN";
        if (c4713Dc == null) {
            this.A02 = C4716Df.A03(c5022Ij);
            return null;
        }
        byte[] bArr = new byte[c5022Ij.A07()];
        System.arraycopy(c5022Ij.A00, 0, bArr, 0, c5022Ij.A07());
        C4714Dd[] A0C = C4716Df.A0C(c5022Ij, this.A03.A05);
        return new C4711Da(this.A03, this.A02, bArr, A0C, C4716Df.A00(A0C.length - 1));
    }

    public static void A05(C5022Ij c5022Ij, long j) {
        c5022Ij.A0X(c5022Ij.A07() + 4);
        c5022Ij.A00[c5022Ij.A07() - 4] = (byte) (j & 255);
        c5022Ij.A00[c5022Ij.A07() - 3] = (byte) ((j >>> 8) & 255);
        c5022Ij.A00[c5022Ij.A07() - 2] = (byte) ((j >>> 16) & 255);
        c5022Ij.A00[c5022Ij.A07() - 1] = (byte) (255 & (j >>> 24));
    }

    public static boolean A06(C5022Ij c5022Ij) {
        try {
            return C4716Df.A0A(1, c5022Ij, true);
        } catch (C4547Af unused) {
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final long A07(C5022Ij c5022Ij) {
        if ((c5022Ij.A00[0] & 1) == 1) {
            return -1L;
        }
        int A01 = A01(c5022Ij.A00[0], this.A01);
        int i = this.A04 ? (this.A00 + A01) / 4 : 0;
        A05(c5022Ij, i);
        this.A04 = true;
        this.A00 = A01;
        return i;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final void A08(long j) {
        super.A08(j);
        this.A04 = j != 0;
        C4715De c4715De = this.A03;
        this.A00 = c4715De != null ? c4715De.A03 : 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final void A09(boolean z) {
        super.A09(z);
        if (z) {
            this.A01 = null;
            this.A03 = null;
            this.A02 = null;
        }
        this.A00 = 0;
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4709DY
    public final boolean A0A(C5022Ij c5022Ij, long j, C4708DX c4708dx) throws IOException, InterruptedException {
        if (this.A01 != null) {
            String[] strArr = A06;
            if (strArr[5].charAt(2) != strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            A06[2] = "mO0nJ77ourwQSXFSw31DnFJId1Q3DZ07";
            return false;
        }
        this.A01 = A02(c5022Ij);
        if (this.A01 == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.A01.A02.A09);
        arrayList.add(this.A01.A03);
        c4708dx.A00 = Format.A07(null, A03(0, 12, 111), null, this.A01.A02.A02, -1, this.A01.A02.A05, (int) this.A01.A02.A06, arrayList, null, 0, null);
        return true;
    }
}
