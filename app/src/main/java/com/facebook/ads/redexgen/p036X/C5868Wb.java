package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wb */
/* loaded from: assets/audience_network.dex */
public final class C5868Wb implements InterfaceC4658Cc {
    public static byte[] A0E;
    public static String[] A0F = {"ydp2W5xsf3wxxmCItZRtLRLpaCcQN61V", "ZzeQ67WJ6", "MfxT7BiZm", "QAZkmCdKFAHfN7ilsO4NsWCm7AIOdsAB", "uXA2W", "sq6CLgUZZ", "GhmTF3RrY3ydpwpSZCJZy8aIHeXkOr61", "710SvX7FP4z"};
    public static final InterfaceC4661Cf A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public InterfaceC4660Ce A04;
    public InterfaceC4670Co A05;
    public InterfaceC5869Wc A06;
    public Metadata A07;
    public final int A08;
    public final long A09;
    public final C4662Cg A0A;
    public final C4663Ch A0B;
    public final C4664Ci A0C;
    public final C5022Ij A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A0E = new byte[]{117, 82, 90, 83, 97, 87, 83, 64, 81, 90, 87, 86, 18, 70, 93, 93, 18, 95, 83, 92, 75, 18, 80, 75, 70, 87, 65, 28, 0, 20, 4, 31, 11, 58, 61, 52};
    }

    static {
        A05();
        A0G = new C5870Wd();
        A0J = C5038Iz.A08(A04(32, 4, 79));
        A0H = C5038Iz.A08(A04(0, 4, 32));
        A0I = C5038Iz.A08(A04(28, 4, 74));
    }

    public C5868Wb() {
        this(0);
    }

    public C5868Wb(int i) {
        this(i, -9223372036854775807L);
    }

    public C5868Wb(int i, long j) {
        this.A08 = i;
        this.A09 = j;
        this.A0D = new C5022Ij(10);
        this.A0C = new C4664Ci();
        this.A0A = new C4662Cg();
        this.A02 = -9223372036854775807L;
        this.A0B = new C4663Ch();
    }

    private int A00(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            interfaceC4659Cd.AEB();
            String[] strArr = A0F;
            if (strArr[1].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[0] = "k6Z5PTGWNQqxWVGEWp2g14fMjsllqw2H";
            strArr2[6] = "hJNgcdrxKvM79jF48EqDHnrsGOClnbxU";
            if (!interfaceC4659Cd.AD8(this.A0D.A00, 0, 4, true)) {
                return -1;
            }
            this.A0D.A0Y(0);
            int A08 = this.A0D.A08();
            if (!A06(A08, this.A01) || C4664Ci.A00(A08) == -1) {
                interfaceC4659Cd.AEt(1);
                this.A01 = 0;
                return 0;
            }
            C4664Ci.A04(A08, this.A0C);
            if (this.A02 == -9223372036854775807L) {
                this.A02 = this.A06.A7e(interfaceC4659Cd.A7F());
                if (this.A09 != -9223372036854775807L) {
                    this.A02 += this.A09 - this.A06.A7e(0L);
                }
            }
            this.A00 = this.A0C.A02;
        }
        int AEF = this.A05.AEF(interfaceC4659Cd, this.A00, true);
        if (AEF == -1) {
            return -1;
        }
        this.A00 -= AEF;
        if (this.A00 > 0) {
            return 0;
        }
        this.A05.AEH(this.A02 + ((this.A03 * 1000000) / this.A0C.A03), 1, this.A0C.A02, 0, null);
        this.A03 += this.A0C.A04;
        this.A00 = 0;
        return 0;
    }

    public static int A01(C5022Ij c5022Ij, int i) {
        if (c5022Ij.A07() >= i + 4) {
            c5022Ij.A0Y(i);
            int A08 = c5022Ij.A08();
            if (A08 == A0J || A08 == A0H) {
                return A08;
            }
        }
        if (c5022Ij.A07() >= 40) {
            c5022Ij.A0Y(36);
            int A082 = c5022Ij.A08();
            int i2 = A0I;
            if (A082 == i2) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    private InterfaceC5869Wc A02(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        interfaceC4659Cd.AD7(this.A0D.A00, 0, 4);
        this.A0D.A0Y(0);
        C4664Ci.A04(this.A0D.A08(), this.A0C);
        return new C4718Dh(interfaceC4659Cd.A6t(), interfaceC4659Cd.A7F(), this.A0C);
    }

    private InterfaceC5869Wc A03(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        C5022Ij c5022Ij = new C5022Ij(this.A0C.A02);
        interfaceC4659Cd.AD7(c5022Ij.A00, 0, this.A0C.A02);
        int i = 21;
        if ((this.A0C.A05 & 1) != 0) {
            if (this.A0C.A01 != 1) {
                i = 36;
            }
        } else {
            int seekHeader = this.A0C.A01;
            if (seekHeader == 1) {
                i = 13;
            }
        }
        int A01 = A01(c5022Ij, i);
        int seekHeader2 = A0J;
        if (A01 != seekHeader2) {
            int seekHeader3 = A0H;
            if (A01 != seekHeader3) {
                int seekHeader4 = A0I;
                if (A01 == seekHeader4) {
                    C4717Dg A00 = C4717Dg.A00(interfaceC4659Cd.A6t(), interfaceC4659Cd.A7F(), this.A0C, c5022Ij);
                    interfaceC4659Cd.AEt(this.A0C.A02);
                    return A00;
                }
                interfaceC4659Cd.AEB();
                return null;
            }
        }
        C4698DN A012 = C4698DN.A01(interfaceC4659Cd.A6t(), interfaceC4659Cd.A7F(), this.A0C, c5022Ij);
        if (A012 != null && !this.A0A.A03()) {
            interfaceC4659Cd.AEB();
            int seekHeader5 = i + 141;
            interfaceC4659Cd.A3K(seekHeader5);
            interfaceC4659Cd.AD7(this.A0D.A00, 0, 3);
            this.A0D.A0Y(0);
            C4662Cg c4662Cg = this.A0A;
            int seekHeader6 = this.A0D.A0G();
            c4662Cg.A04(seekHeader6);
        }
        int seekHeader7 = this.A0C.A02;
        interfaceC4659Cd.AEt(seekHeader7);
        if (A012 == null || A012.A8g()) {
            return A012;
        }
        int seekHeader8 = A0H;
        if (A01 == seekHeader8) {
            return A02(interfaceC4659Cd);
        }
        return A012;
    }

    public static boolean A06(int i, long j) {
        return ((long) ((-128000) & i)) == ((-128000) & j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
        if (r15 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
        r14.AEt(r5 + r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
        r13.A01 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        r14.AEB();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A07(com.facebook.ads.redexgen.p036X.InterfaceC4659Cd r14, boolean r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5868Wb.A07(com.facebook.ads.redexgen.X.Cd, boolean):boolean");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A04 = interfaceC4660Ce;
        this.A05 = this.A04.AFD(0, 1);
        this.A04.A5D();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        if (this.A01 == 0) {
            try {
                A07(interfaceC4659Cd, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.A06 == null) {
            this.A06 = A03(interfaceC4659Cd);
            InterfaceC5869Wc interfaceC5869Wc = this.A06;
            if (interfaceC5869Wc == null || (!interfaceC5869Wc.A8g() && (this.A08 & 1) != 0)) {
                InterfaceC5869Wc A02 = A02(interfaceC4659Cd);
                String[] strArr = A0F;
                if (strArr[2].length() != strArr[5].length()) {
                    throw new RuntimeException();
                }
                A0F[3] = "vRoDRHRtSRtNnEEJ64K4r5ogXxosELXw";
                this.A06 = A02;
            }
            this.A04.AEM(this.A06);
            this.A05.A5V(Format.A05(null, this.A0C.A06, null, -1, 4096, this.A0C.A01, this.A0C.A03, -1, this.A0A.A00, this.A0A.A01, null, null, 0, null, (this.A08 & 2) != 0 ? null : this.A07));
        }
        return A00(interfaceC4659Cd);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A03 = 0L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        return A07(interfaceC4659Cd, true);
    }
}
