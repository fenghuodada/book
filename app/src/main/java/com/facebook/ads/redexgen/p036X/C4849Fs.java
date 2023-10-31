package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;

/* renamed from: com.facebook.ads.redexgen.X.Fs */
/* loaded from: assets/audience_network.dex */
public final class C4849Fs {
    public static String[] A0I = {"CqT0KuE1AFfImBFy4ik", "hGcHjrCi226kocD9vKzS9HyQAF0ZqssA", "ZD81yrpYsqeXe4L", "XJx", "nsm5GlP1XQIMmswL2BtDEyl4JYnPccJt", "OHNFP06lkToQsW2YsoX4lx0", "UGSwurzNNOniPMx0TIQOqAAX3osRvTJh", "YaODE33QO8vEeLZGxHQ5TNBfWhqIAS5S"};
    public int A00;
    public int A01 = 1000;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public Format A08;
    public boolean A09;
    public boolean A0A;
    public int[] A0B;
    public int[] A0C;
    public int[] A0D;
    public long[] A0E;
    public long[] A0F;
    public Format[] A0G;
    public C4669Cn[] A0H;

    public C4849Fs() {
        int i = this.A01;
        this.A0D = new int[i];
        this.A0E = new long[i];
        this.A0F = new long[i];
        this.A0B = new int[i];
        this.A0C = new int[i];
        this.A0H = new C4669Cn[i];
        this.A0G = new Format[i];
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        this.A09 = true;
        this.A0A = true;
    }

    private int A00(int i) {
        int i2 = this.A04 + i;
        int i3 = this.A01;
        return i2 < i3 ? i2 : i2 - i3;
    }

    private int A01(int searchIndex, int i, long j, boolean z) {
        int i2 = -1;
        for (int i3 = 0; i3 < i; i3++) {
            long j2 = this.A0F[searchIndex];
            String[] strArr = A0I;
            if (strArr[3].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[3] = "JFV";
            strArr2[5] = "8A9T2ZHBGF6P3L1HGcqfomX";
            if (j2 > j) {
                break;
            }
            if (!z || (this.A0B[searchIndex] & 1) != 0) {
                i2 = i3;
            }
            searchIndex++;
            if (searchIndex == this.A01) {
                searchIndex = 0;
            }
        }
        return i2;
    }

    private long A02(int i) {
        int i2;
        this.A06 = Math.max(this.A06, A03(i));
        this.A02 -= i;
        this.A00 += i;
        this.A04 += i;
        int i3 = this.A04;
        int i4 = this.A01;
        if (i3 >= i4) {
            int i5 = i3 - i4;
            String[] strArr = A0I;
            if (strArr[7].charAt(18) != strArr[6].charAt(18)) {
                throw new RuntimeException();
            }
            A0I[2] = "rmPQqkiHfMf";
            this.A04 = i5;
        }
        this.A03 -= i;
        if (this.A03 < 0) {
            if (A0I[2].length() == 8) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[4] = "rGNm6jdFTVK86xam60qdwwsNjuy3SfLS";
            strArr2[1] = "zCUBtEUnOSv2Jph2uhLKbu226T4aXBY5";
            this.A03 = 0;
        }
        if (this.A02 == 0) {
            int i6 = this.A04;
            if (i6 == 0) {
                i6 = this.A01;
            }
            return this.A0E[i6 - 1] + this.A0C[i2];
        }
        return this.A0E[this.A04];
    }

    private long A03(int i) {
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        long j = Long.MIN_VALUE;
        int relativeSampleIndex = A00(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.A0F[relativeSampleIndex]);
            int i3 = this.A0B[relativeSampleIndex];
            if ((i3 & 1) != 0) {
                break;
            }
            relativeSampleIndex--;
            if (relativeSampleIndex == -1) {
                int i4 = this.A01;
                String[] strArr = A0I;
                String str = strArr[4];
                String str2 = strArr[1];
                int charAt = str.charAt(25);
                int relativeSampleIndex2 = str2.charAt(25);
                if (charAt == relativeSampleIndex2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0I;
                strArr2[3] = "3tp";
                strArr2[5] = "Z0W9OfGRhIfCW820bOQ6uFB";
                relativeSampleIndex = i4 - 1;
            }
        }
        return j;
    }

    private final synchronized void A04(long j) {
        this.A07 = Math.max(this.A07, j);
    }

    public final int A05() {
        return this.A00 + this.A03;
    }

    public final int A06() {
        return this.A00 + this.A02;
    }

    public final synchronized int A07() {
        int i;
        i = this.A02 - this.A03;
        this.A03 = this.A02;
        return i;
    }

    public final synchronized int A08(long j, boolean z, boolean z2) {
        int A00 = A00(this.A03);
        if (!A0I() || j < this.A0F[A00] || (j > this.A07 && !z2)) {
            return -1;
        }
        int A01 = A01(A00, this.A02 - this.A03, j, z);
        if (A01 == -1) {
            return -1;
        }
        this.A03 += A01;
        return A01;
    }

    public final synchronized int A09(C4541AZ c4541az, C5895X2 c5895x2, boolean z, boolean z2, Format format, C4848Fr c4848Fr) {
        if (!A0I()) {
            if (z2) {
                c5895x2.A02(4);
                return -4;
            } else if (this.A08 == null || (!z && this.A08 == format)) {
                return -3;
            } else {
                c4541az.A00 = this.A08;
                return -5;
            }
        }
        int A00 = A00(this.A03);
        if (z || this.A0G[A00] != format) {
            c4541az.A00 = this.A0G[A00];
            return -5;
        } else if (c5895x2.A0B()) {
            return -3;
        } else {
            c5895x2.A00 = this.A0F[A00];
            c5895x2.A02(this.A0B[A00]);
            c4848Fr.A00 = this.A0C[A00];
            c4848Fr.A01 = this.A0E[A00];
            c4848Fr.A02 = this.A0H[A00];
            this.A03++;
            return -4;
        }
    }

    public final synchronized long A0A() {
        if (this.A02 == 0) {
            return -1L;
        }
        return A02(this.A02);
    }

    public final synchronized long A0B() {
        return this.A07;
    }

    public final long A0C(int i) {
        int A00;
        int A06 = A06() - i;
        C4997IK.A03(A06 >= 0 && A06 <= this.A02 - this.A03);
        this.A02 -= A06;
        this.A07 = Math.max(this.A06, A03(this.A02));
        int i2 = this.A02;
        if (i2 == 0) {
            return 0L;
        }
        return this.A0E[A00(i2 - 1)] + this.A0C[A00];
    }

    public final synchronized long A0D(long j, boolean z, boolean z2) {
        if (this.A02 != 0 && j >= this.A0F[this.A04]) {
            int A01 = A01(this.A04, (!z2 || this.A03 == this.A02) ? this.A02 : this.A03 + 1, j, z);
            if (A01 == -1) {
                return -1L;
            }
            return A02(A01);
        }
        return -1L;
    }

    public final synchronized Format A0E() {
        return this.A09 ? null : this.A08;
    }

    public final synchronized void A0F() {
        this.A03 = 0;
    }

    public final synchronized void A0G(long j, int i, long j2, int i2, C4669Cn c4669Cn) {
        if (this.A0A) {
            if ((i & 1) == 0) {
                return;
            }
            this.A0A = false;
        }
        C4997IK.A04(!this.A09);
        A04(j);
        int A00 = A00(this.A02);
        this.A0F[A00] = j;
        this.A0E[A00] = j2;
        this.A0C[A00] = i2;
        this.A0B[A00] = i;
        this.A0H[A00] = c4669Cn;
        this.A0G[A00] = this.A08;
        this.A0D[A00] = this.A05;
        this.A02++;
        if (this.A02 == this.A01) {
            int i3 = this.A01 + 1000;
            int[] iArr = new int[i3];
            long[] jArr = new long[i3];
            long[] jArr2 = new long[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            C4669Cn[] c4669CnArr = new C4669Cn[i3];
            Format[] formatArr = new Format[i3];
            int i4 = this.A01 - this.A04;
            long[] jArr3 = this.A0E;
            int beforeWrap = this.A04;
            System.arraycopy(jArr3, beforeWrap, jArr, 0, i4);
            long[] jArr4 = this.A0F;
            int beforeWrap2 = this.A04;
            System.arraycopy(jArr4, beforeWrap2, jArr2, 0, i4);
            int[] iArr4 = this.A0B;
            int beforeWrap3 = this.A04;
            System.arraycopy(iArr4, beforeWrap3, iArr2, 0, i4);
            int[] iArr5 = this.A0C;
            int beforeWrap4 = this.A04;
            System.arraycopy(iArr5, beforeWrap4, iArr3, 0, i4);
            C4669Cn[] c4669CnArr2 = this.A0H;
            int beforeWrap5 = this.A04;
            System.arraycopy(c4669CnArr2, beforeWrap5, c4669CnArr, 0, i4);
            Format[] formatArr2 = this.A0G;
            int beforeWrap6 = this.A04;
            System.arraycopy(formatArr2, beforeWrap6, formatArr, 0, i4);
            int[] iArr6 = this.A0D;
            int beforeWrap7 = this.A04;
            System.arraycopy(iArr6, beforeWrap7, iArr, 0, i4);
            int i5 = this.A04;
            System.arraycopy(this.A0E, 0, jArr, i4, i5);
            System.arraycopy(this.A0F, 0, jArr2, i4, i5);
            System.arraycopy(this.A0B, 0, iArr2, i4, i5);
            System.arraycopy(this.A0C, 0, iArr3, i4, i5);
            System.arraycopy(this.A0H, 0, c4669CnArr, i4, i5);
            System.arraycopy(this.A0G, 0, formatArr, i4, i5);
            System.arraycopy(this.A0D, 0, iArr, i4, i5);
            this.A0E = jArr;
            this.A0F = jArr2;
            this.A0B = iArr2;
            this.A0C = iArr3;
            this.A0H = c4669CnArr;
            this.A0G = formatArr;
            this.A0D = iArr;
            this.A04 = 0;
            int afterWrap = this.A01;
            this.A02 = afterWrap;
            this.A01 = i3;
        }
    }

    public final void A0H(boolean z) {
        this.A02 = 0;
        this.A00 = 0;
        this.A04 = 0;
        this.A03 = 0;
        this.A0A = true;
        this.A06 = Long.MIN_VALUE;
        this.A07 = Long.MIN_VALUE;
        if (z) {
            this.A08 = null;
            this.A09 = true;
        }
    }

    public final synchronized boolean A0I() {
        return this.A03 != this.A02;
    }

    public final synchronized boolean A0J(long j) {
        if (this.A02 == 0) {
            return j > this.A06;
        } else if (Math.max(this.A06, A03(this.A03)) >= j) {
            return false;
        } else {
            int i = this.A02;
            int A00 = A00(this.A02 - 1);
            while (i > this.A03 && this.A0F[A00] >= j) {
                i--;
                A00--;
                if (A00 == -1) {
                    A00 = this.A01 - 1;
                }
            }
            A0C(this.A00 + i);
            return true;
        }
    }

    public final synchronized boolean A0K(Format format) {
        if (format == null) {
            this.A09 = true;
            return false;
        }
        this.A09 = false;
        if (C5038Iz.A0g(format, this.A08)) {
            return false;
        }
        this.A08 = format;
        return true;
    }
}
