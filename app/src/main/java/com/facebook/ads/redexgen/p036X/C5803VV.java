package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.VV */
/* loaded from: assets/audience_network.dex */
public final class C5803VV implements InterfaceC4670Co {
    public static String[] A0F = {"I0oQBEUbvXwmLkE4WWtRMgz", "xnniIxRr7DxSpuMWabRYn3WDpy4qBN9b", "Y7uRaXgz80uNyvcPATB9r3b0PwOkuM1V", "hSCUvOutOZqOqVGgCzlnUKxaNOAoeOWK", "Xz3O4WRIuCzLKbQHyaIDpuywePn7", "cSGy8Fn9cMgpPa", "oA7ibzMCvoxqvUcH1m6Eely4XW9nrCN1", "6CG0cGfKidBjxaDlKmMoUzgrmHvkLCHY"};
    public long A00;
    public long A01;
    public Format A02;
    public Format A03;
    public C4850Ft A04;
    public C4850Ft A05;
    public C4850Ft A06;
    public InterfaceC4851Fu A07;
    public boolean A08;
    public boolean A09;
    public final int A0A;
    public final InterfaceC4947HW A0D;
    public final C4849Fs A0C = new C4849Fs();
    public final C4848Fr A0B = new C4848Fr();
    public final C5022Ij A0E = new C5022Ij(32);

    public C5803VV(InterfaceC4947HW interfaceC4947HW) {
        this.A0D = interfaceC4947HW;
        this.A0A = interfaceC4947HW.A6o();
        this.A04 = new C4850Ft(0L, this.A0A);
        C4850Ft c4850Ft = this.A04;
        this.A05 = c4850Ft;
        this.A06 = c4850Ft;
    }

    private int A00(int i) {
        if (!this.A06.A02) {
            this.A06.A02(this.A0D.A3L(), new C4850Ft(this.A06.A03, this.A0A));
        }
        return Math.min(i, (int) (this.A06.A03 - this.A01));
    }

    public static Format A01(Format format, long j) {
        if (format == null) {
            return null;
        }
        if (j != 0 && format.A0G != Long.MAX_VALUE) {
            return format.A0H(format.A0G + j);
        }
        return format;
    }

    private void A02(int i) {
        this.A01 += i;
        if (this.A01 == this.A06.A03) {
            this.A06 = this.A06.A00;
        }
    }

    private void A03(long j) {
        while (j >= this.A05.A03) {
            this.A05 = this.A05.A00;
        }
    }

    private void A04(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A04.A03) {
            InterfaceC4947HW interfaceC4947HW = this.A0D;
            C4946HV c4946hv = this.A04.A01;
            if (A0F[7].charAt(20) != 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[3] = "uyKFH8oWQ0ou8mdxvkWufQ8fbIwtl6Z0";
            strArr[1] = "5GODjm0a5UxNqoFNrNo0AvXndV19DDx4";
            interfaceC4947HW.ADn(c4946hv);
            this.A04 = this.A04.A01();
        }
        if (this.A05.A04 < this.A04.A04) {
            this.A05 = this.A04;
        }
    }

    private void A05(long j, ByteBuffer byteBuffer, int i) {
        A03(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.A05.A03 - j));
            byteBuffer.put(this.A05.A01.A01, this.A05.A00(j), min);
            i -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    private void A06(long j, byte[] bArr, int i) {
        A03(j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.A05.A03 - j));
            System.arraycopy(this.A05.A01.A01, this.A05.A00(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == this.A05.A03) {
                this.A05 = this.A05.A00;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ae, code lost:
        if (r10 < r11) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(com.facebook.ads.redexgen.p036X.C5895X2 r20, com.facebook.ads.redexgen.p036X.C4848Fr r21) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5803VV.A07(com.facebook.ads.redexgen.X.X2, com.facebook.ads.redexgen.X.Fr):void");
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0019 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.p036X.C4850Ft r6) {
        /*
            r5 = this;
            boolean r0 = r6.A02
            if (r0 != 0) goto L5
            return
        L5:
            com.facebook.ads.redexgen.X.Ft r0 = r5.A06
            boolean r4 = r0.A02
            com.facebook.ads.redexgen.X.Ft r0 = r5.A06
            long r2 = r0.A04
            long r0 = r6.A04
            long r2 = r2 - r0
            int r1 = (int) r2
            int r0 = r5.A0A
            int r1 = r1 / r0
            int r4 = r4 + r1
            com.facebook.ads.redexgen.X.HV[] r2 = new com.facebook.ads.redexgen.p036X.C4946HV[r4]
            r1 = 0
        L18:
            int r0 = r2.length
            if (r1 >= r0) goto L26
            com.facebook.ads.redexgen.X.HV r0 = r6.A01
            r2[r1] = r0
            com.facebook.ads.redexgen.X.Ft r6 = r6.A01()
            int r1 = r1 + 1
            goto L18
        L26:
            com.facebook.ads.redexgen.X.HW r0 = r5.A0D
            r0.ADo(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5803VV.A08(com.facebook.ads.redexgen.X.Ft):void");
    }

    private final void A09(boolean z) {
        this.A0C.A0H(z);
        A08(this.A04);
        this.A04 = new C4850Ft(0L, this.A0A);
        C4850Ft c4850Ft = this.A04;
        this.A05 = c4850Ft;
        this.A06 = c4850Ft;
        this.A01 = 0L;
        this.A0D.AFE();
    }

    public final int A0A() {
        return this.A0C.A07();
    }

    public final int A0B() {
        return this.A0C.A05();
    }

    public final int A0C() {
        return this.A0C.A06();
    }

    public final int A0D(long j, boolean z, boolean z2) {
        return this.A0C.A08(j, z, z2);
    }

    public final int A0E(C4541AZ c4541az, C5895X2 c5895x2, boolean z, boolean z2, long j) {
        int A09 = this.A0C.A09(c4541az, c5895x2, z, z2, this.A02, this.A0B);
        if (A09 == -5) {
            this.A02 = c4541az.A00;
            return -5;
        } else if (A09 != -4) {
            if (A09 == -3) {
                return -3;
            }
            throw new IllegalStateException();
        } else {
            if (!c5895x2.A04()) {
                long j2 = c5895x2.A00;
                if (A0F[7].charAt(20) != 'U') {
                    throw new RuntimeException();
                }
                A0F[2] = "VD6eroQucXdNz3MsoKHIT4kATW1JDfRN";
                if (j2 < j) {
                    c5895x2.A00(Integer.MIN_VALUE);
                }
                if (c5895x2.A0A()) {
                    A07(c5895x2, this.A0B);
                }
                c5895x2.A09(this.A0B.A00);
                A05(this.A0B.A01, c5895x2.A01, this.A0B.A00);
            }
            return -4;
        }
    }

    public final long A0F() {
        return this.A0C.A0B();
    }

    public final Format A0G() {
        return this.A0C.A0E();
    }

    public final void A0H() {
        A04(this.A0C.A0A());
    }

    public final void A0I() {
        A09(false);
    }

    public final void A0J() {
        this.A0C.A0F();
        this.A05 = this.A04;
    }

    public final void A0K(long j, boolean z, boolean z2) {
        A04(this.A0C.A0D(j, z, z2));
    }

    public final void A0L(InterfaceC4851Fu interfaceC4851Fu) {
        this.A07 = interfaceC4851Fu;
    }

    public final boolean A0M() {
        return this.A0C.A0I();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void A5V(Format format) {
        Format A01 = A01(format, this.A00);
        boolean A0K = this.A0C.A0K(A01);
        this.A03 = format;
        this.A08 = false;
        InterfaceC4851Fu interfaceC4851Fu = this.A07;
        if (interfaceC4851Fu != null && A0K) {
            interfaceC4851Fu.ACe(A01);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final int AEF(InterfaceC4659Cd interfaceC4659Cd, int i, boolean z) throws IOException, InterruptedException {
        int read = interfaceC4659Cd.read(this.A06.A01.A01, this.A06.A00(this.A01), A00(i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        A02(read);
        if (A0F[4].length() != 13) {
            String[] strArr = A0F;
            strArr[0] = "gj56WjutkODHGuBsULoCjgk";
            strArr[5] = "cXoHIYif5j6YkS";
            return read;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void AEG(C5022Ij c5022Ij, int i) {
        while (i > 0) {
            int A00 = A00(i);
            c5022Ij.A0c(this.A06.A01.A01, this.A06.A00(this.A01), A00);
            i -= A00;
            A02(A00);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4670Co
    public final void AEH(long j, int i, int i2, int i3, C4669Cn c4669Cn) {
        if (this.A08) {
            A5V(this.A03);
        }
        if (this.A09) {
            if ((i & 1) != 0) {
                C4849Fs c4849Fs = this.A0C;
                if (A0F[4].length() == 13) {
                    throw new RuntimeException();
                }
                String[] strArr = A0F;
                strArr[3] = "x9Xeu0fQ5laTPGHIgNPQILpO6czCAzIw";
                strArr[1] = "ozcoxAULLkb5oe9KcRf5sNeK93qRoKsz";
                if (!c4849Fs.A0J(j)) {
                    return;
                }
                String[] strArr2 = A0F;
                if (strArr2[0].length() == strArr2[5].length()) {
                    throw new RuntimeException();
                }
                A0F[7] = "2aF6Rrv8pvM6dW2iEnwFUFag8sTvrLLb";
                this.A09 = false;
            } else {
                return;
            }
        }
        long timeUs = j + this.A00;
        this.A0C.A0G(timeUs, i, (this.A01 - i2) - i3, i2, c4669Cn);
    }
}
