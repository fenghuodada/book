package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.W7 */
/* loaded from: assets/audience_network.dex */
public final class C5838W7 implements InterfaceC4719Di {
    public static byte[] A0E;
    public static String[] A0F = {"a", "PSzfdfjRZC0XN6VxjsgcztfFaZhzgWb7", "1Gl4YGiW2C7ithS", "fAa", "AJgx", "lYVk", "kBtUfz7weItcbZk1MBk54uJpUuqD7Dj9", "de5NTYCoeu4fZv0TXl8jvZIWd"};
    public long A00;
    public long A01;
    public InterfaceC4670Co A02;
    public C4724Dn A03;
    public String A04;
    public boolean A05;
    public final C4728Dr A0B;
    public final boolean[] A0D = new boolean[3];
    public final C4725Do A0A = new C4725Do(32, 128);
    public final C4725Do A08 = new C4725Do(33, 128);
    public final C4725Do A06 = new C4725Do(34, 128);
    public final C4725Do A07 = new C4725Do(39, 128);
    public final C4725Do A09 = new C4725Do(40, 128);
    public final C5022Ij A0C = new C5022Ij();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0E = new byte[]{-65, -87, -83, -84, -55, -36, -40, -37, -36, -23, -20, 5, -4, 15, 7, -4, -6, 11, -4, -5, -73, -8, 10, 7, -4, -6, 11, -10, 9, -8, 11, 0, 6, -10, 0, -5, -6, -73, 13, -8, 3, 12, -4, -47, -73, 49, 36, 31, 32, 42, -22, 35, 32, 49, 30};
    }

    static {
        A02();
    }

    public C5838W7(C4728Dr c4728Dr) {
        this.A0B = c4728Dr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d2, code lost:
        if (r6 == 255) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d4, code lost:
        r1 = r3.A05(16);
        r0 = r3.A05(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01de, code lost:
        if (r1 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01e0, code lost:
        if (r0 == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01e2, code lost:
        r4 = r1 / r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0205, code lost:
        if (r6 == 255) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020b, code lost:
        if (r6 >= com.facebook.ads.redexgen.p036X.C5018If.A04.length) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x020d, code lost:
        r4 = com.facebook.ads.redexgen.p036X.C5018If.A04[r6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0212, code lost:
        android.util.Log.w(A01(0, 10, 32), A01(10, 35, 64) + r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0243, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.internal.exoplayer2.Format A00(java.lang.String r17, com.facebook.ads.redexgen.p036X.C4725Do r18, com.facebook.ads.redexgen.p036X.C4725Do r19, com.facebook.ads.redexgen.p036X.C4725Do r20) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5838W7.A00(java.lang.String, com.facebook.ads.redexgen.X.Do, com.facebook.ads.redexgen.X.Do, com.facebook.ads.redexgen.X.Do):com.facebook.ads.internal.exoplayer2.Format");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
        if (r3.A03() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
        r5.A02.A5V(A00(r5.A04, r5.A0A, r5.A08, r5.A06));
        r2 = com.facebook.ads.redexgen.p036X.C5838W7.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cc, code lost:
        if (r2[5].length() == r2[4].length()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00df, code lost:
        if (r3.A03() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e2, code lost:
        com.facebook.ads.redexgen.p036X.C5838W7.A0F[1] = "ZjqETcMPlDZxu07sDnjN9sy4wI9cybTG";
        r5.A05 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A03(long r6, int r8, int r9, long r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5838W7.A03(long, int, int, long):void");
    }

    private void A04(long j, int i, int i2, long j2) {
        if (this.A05) {
            this.A03.A03(j, i, i2, j2);
        } else {
            this.A0A.A01(i2);
            this.A08.A01(i2);
            this.A06.A01(i2);
        }
        this.A07.A01(i2);
        this.A09.A01(i2);
    }

    public static void A05(C5023Ik c5023Ik) {
        for (int i = 0; i < 4; i++) {
            int i2 = 0;
            while (i2 < 6) {
                if (!c5023Ik.A0A()) {
                    c5023Ik.A04();
                } else {
                    int min = Math.min(64, 1 << ((i << 1) + 4));
                    if (i > 1) {
                        c5023Ik.A03();
                    }
                    for (int i3 = 0; i3 < min; i3++) {
                        c5023Ik.A03();
                    }
                }
                int i4 = 3;
                if (i != 3) {
                    i4 = 1;
                }
                i2 += i4;
            }
        }
    }

    public static void A06(C5023Ik c5023Ik) {
        int A04 = c5023Ik.A04();
        boolean z = false;
        int stRpsIdx = 0;
        for (int numNegativePics = 0; numNegativePics < A04; numNegativePics++) {
            if (numNegativePics != 0) {
                z = c5023Ik.A0A();
            }
            if (z) {
                c5023Ik.A06();
                c5023Ik.A04();
                for (int i = 0; i <= stRpsIdx; i++) {
                    if (c5023Ik.A0A()) {
                        c5023Ik.A06();
                    }
                }
            } else {
                int numPositivePics = c5023Ik.A04();
                int A042 = c5023Ik.A04();
                stRpsIdx = numPositivePics + A042;
                for (int i2 = 0; i2 < numPositivePics; i2++) {
                    c5023Ik.A04();
                    c5023Ik.A06();
                }
                for (int i3 = 0; i3 < A042; i3++) {
                    c5023Ik.A04();
                    if (A0F[2].length() != 15) {
                        throw new RuntimeException();
                    }
                    A0F[7] = "29HJBmKLkgSGGX3jFY36NCeZA";
                    c5023Ik.A06();
                }
                continue;
            }
        }
    }

    private void A07(byte[] bArr, int i, int i2) {
        if (this.A05) {
            this.A03.A04(bArr, i, i2);
        } else {
            this.A0A.A02(bArr, i, i2);
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A09.A02(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) {
        while (c5022Ij.A04() > 0) {
            int A06 = c5022Ij.A06();
            int A07 = c5022Ij.A07();
            byte[] bArr = c5022Ij.A00;
            this.A01 += c5022Ij.A04();
            this.A02.AEG(c5022Ij, c5022Ij.A04());
            while (A06 < A07) {
                int A04 = C5018If.A04(bArr, A06, A07, this.A0D);
                if (A04 == A07) {
                    A07(bArr, A06, A07);
                    return;
                }
                int A00 = C5018If.A00(bArr, A04);
                int nalUnitType = A04 - A06;
                if (nalUnitType > 0) {
                    A07(bArr, A06, A04);
                }
                int lengthToNalUnit = A07 - A04;
                long j = this.A01 - lengthToNalUnit;
                A03(j, lengthToNalUnit, nalUnitType < 0 ? -nalUnitType : 0, this.A00);
                long absolutePosition = this.A00;
                A04(j, lengthToNalUnit, A00, absolutePosition);
                A06 = A04 + 3;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A04 = c4733Dw.A04();
        this.A02 = interfaceC4660Ce.AFD(c4733Dw.A03(), 2);
        this.A03 = new C4724Dn(this.A02);
        this.A0B.A03(interfaceC4660Ce, c4733Dw);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        C5018If.A0B(this.A0D);
        this.A0A.A00();
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A09.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
