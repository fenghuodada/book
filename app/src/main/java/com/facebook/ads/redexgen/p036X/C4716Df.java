package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Df */
/* loaded from: assets/audience_network.dex */
public final class C4716Df {
    public static byte[] A00;
    public static String[] A01 = {"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C4715De A04(C5022Ij c5022Ij) throws C4547Af {
        A0A(1, c5022Ij, false);
        long A0K = c5022Ij.A0K();
        int A0E = c5022Ij.A0E();
        long A0K2 = c5022Ij.A0K();
        int A0A = c5022Ij.A0A();
        int A0A2 = c5022Ij.A0A();
        int A0A3 = c5022Ij.A0A();
        int A0E2 = c5022Ij.A0E();
        return new C4715De(A0K, A0E, A0K2, A0A, A0A2, A0A3, (int) Math.pow(2.0d, A0E2 & 15), (int) Math.pow(2.0d, (A0E2 & 240) >> 4), (c5022Ij.A0E() & 1) > 0, Arrays.copyOf(c5022Ij.A00, c5022Ij.A07()));
    }

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 55);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, 23, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, 15, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, 15, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, 20, 0, 19, 31, 27, 28, 21, 82, 16, 27, 6, 82, 19, 20, 6, 23, 0, 82, 31, 29, 22, 23, 1, 82, 28, 29, 6, 82, 1, 23, 6, 82, 19, 1, 82, 23, 10, 2, 23, 17, 6, 23, 22, 87, 67, 80, 92, 88, 95, 86, 17, 83, 88, 69, 17, 84, 73, 65, 84, 82, 69, 84, 85, 17, 69, 94, 17, 83, 84, 17, 66, 84, 69, 66, 65, 65, 69, 91, 94, 14, 90, 87, 94, 75, 14, 73, 92, 75, 79, 90, 75, 92, 14, 90, 70, 79, 64, 14, 28, 14, 64, 65, 90, 14, 74, 75, 77, 65, 74, 79, 76, 66, 75, 20, 14, 38, 42, 59, 59, 34, 37, 44, 107, Utf8.REPLACEMENT_BYTE, 50, 59, 46, 107, 36, Utf8.REPLACEMENT_BYTE, 35, 46, 57, 107, Utf8.REPLACEMENT_BYTE, 35, 42, 37, 107, 123, 107, 37, 36, Utf8.REPLACEMENT_BYTE, 107, 56, 62, 59, 59, 36, 57, Utf8.REPLACEMENT_BYTE, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, Utf8.REPLACEMENT_BYTE, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, Utf8.REPLACEMENT_BYTE, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, 20, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, Byte.MAX_VALUE, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, 18, 22, 19, 18, 5, 77, 87};
    }

    static {
        A06();
    }

    public static int A00(int val) {
        int i = 0;
        while (val > 0) {
            i++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            A01[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i;
    }

    public static long A01(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.C4712Db A02(com.facebook.ads.redexgen.p036X.C4710DZ r12) throws com.facebook.ads.redexgen.p036X.C4547Af {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4716Df.A02(com.facebook.ads.redexgen.X.DZ):com.facebook.ads.redexgen.X.Db");
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0023 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.C4713Dc A03(com.facebook.ads.redexgen.p036X.C5022Ij r9) throws com.facebook.ads.redexgen.p036X.C4547Af {
        /*
            r1 = 3
            r0 = 0
            A0A(r1, r9, r0)
            r3 = 7
            long r1 = r9.A0K()
            int r0 = (int) r1
            int r3 = r3 + 4
            java.lang.String r5 = r9.A0S(r0)
            int r0 = r5.length()
            int r3 = r3 + r0
            long r1 = r9.A0K()
            int r0 = (int) r1
            java.lang.String[] r4 = new java.lang.String[r0]
            int r6 = r3 + 4
            r3 = 0
        L20:
            long r7 = (long) r3
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 >= 0) goto L3c
            long r7 = r9.A0K()
            int r0 = (int) r7
            int r6 = r6 + 4
            java.lang.String r0 = r9.A0S(r0)
            r4[r3] = r0
            r0 = r4[r3]
            int r0 = r0.length()
            int r6 = r6 + r0
            int r3 = r3 + 1
            goto L20
        L3c:
            int r0 = r9.A0E()
            r3 = r0 & 1
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C4716Df.A01
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto L55
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L55:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4716Df.A01
            java.lang.String r1 = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3"
            r0 = 7
            r2[r0] = r1
            if (r3 == 0) goto L66
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.Dc r0 = new com.facebook.ads.redexgen.X.Dc
            r0.<init>(r5, r4, r1)
            return r0
        L66:
            r2 = 198(0xc6, float:2.77E-43)
            r1 = 30
            r0 = 6
            java.lang.String r1 = A05(r2, r1, r0)
            com.facebook.ads.redexgen.X.Af r0 = new com.facebook.ads.redexgen.X.Af
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4716Df.A03(com.facebook.ads.redexgen.X.Ij):com.facebook.ads.redexgen.X.Dc");
    }

    public static void A07(int mappingsCount, C4710DZ c4710dz) throws C4547Af {
        int i;
        int A02 = c4710dz.A02(6) + 1;
        for (int i2 = 0; i2 < A02; i2++) {
            int A022 = c4710dz.A02(16);
            if (A022 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + A022);
            } else {
                if (c4710dz.A04()) {
                    i = c4710dz.A02(4) + 1;
                } else {
                    i = 1;
                }
                boolean A04 = c4710dz.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (A04) {
                    int A023 = c4710dz.A02(8) + 1;
                    for (int i3 = 0; i3 < A023; i3++) {
                        int i4 = mappingsCount - 1;
                        c4710dz.A03(A00(i4));
                        int i5 = mappingsCount - 1;
                        c4710dz.A03(A00(i5));
                    }
                }
                int i6 = c4710dz.A02(2);
                if (i6 == 0) {
                    if (i > 1) {
                        for (int i7 = 0; i7 < mappingsCount; i7++) {
                            c4710dz.A03(4);
                        }
                    }
                    for (int i8 = 0; i8 < i; i8++) {
                        c4710dz.A03(8);
                        c4710dz.A03(8);
                        c4710dz.A03(8);
                    }
                } else {
                    throw new C4547Af(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A08(C4710DZ c4710dz) throws C4547Af {
        int A02 = c4710dz.A02(6) + 1;
        for (int floorType = 0; floorType < A02; floorType++) {
            int A022 = c4710dz.A02(16);
            if (A022 == 0) {
                c4710dz.A03(8);
                c4710dz.A03(16);
                c4710dz.A03(16);
                c4710dz.A03(6);
                c4710dz.A03(8);
                int A023 = c4710dz.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < A023; rangeBits++) {
                    c4710dz.A03(8);
                }
            } else if (A022 != 1) {
                throw new C4547Af(A05(114, 41, 126) + A022);
            } else {
                int j = c4710dz.A02(5);
                int i = -1;
                int[] iArr = new int[j];
                for (int i2 = 0; i2 < j; i2++) {
                    iArr[i2] = c4710dz.A02(4);
                    if (iArr[i2] > i) {
                        i = iArr[i2];
                    }
                }
                int[] iArr2 = new int[i + 1];
                int i3 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    A01[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i3 < length) {
                        iArr2[i3] = c4710dz.A02(3) + 1;
                        int classSubclasses = c4710dz.A02(2);
                        if (classSubclasses > 0) {
                            c4710dz.A03(8);
                        }
                        for (int i4 = 0; i4 < (1 << classSubclasses); i4++) {
                            c4710dz.A03(8);
                        }
                        i3++;
                    } else {
                        c4710dz.A03(2);
                        int count = c4710dz.A02(4);
                        int i5 = 0;
                        int i6 = 0;
                        for (int k = 0; k < j; k++) {
                            int rangeBits2 = iArr[k];
                            i5 += iArr2[rangeBits2];
                            while (i6 < i5) {
                                c4710dz.A03(count);
                                i6++;
                            }
                        }
                    }
                }
            }
        }
    }

    public static void A09(C4710DZ c4710dz) throws C4547Af {
        int A02 = c4710dz.A02(6) + 1;
        for (int classifications = 0; classifications < A02; classifications++) {
            if (c4710dz.A02(16) <= 2) {
                c4710dz.A03(24);
                c4710dz.A03(24);
                c4710dz.A03(24);
                int A022 = c4710dz.A02(6) + 1;
                c4710dz.A03(8);
                int[] iArr = new int[A022];
                for (int i = 0; i < A022; i++) {
                    int i2 = 0;
                    int A023 = c4710dz.A02(3);
                    if (c4710dz.A04()) {
                        i2 = c4710dz.A02(5);
                    }
                    int highBits = i2 * 8;
                    iArr[i] = highBits + A023;
                }
                for (int i3 = 0; i3 < A022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int k = 1 << i4;
                        if ((iArr[i3] & k) != 0) {
                            c4710dz.A03(8);
                        }
                    }
                }
            } else {
                throw new C4547Af(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0A(int i, C5022Ij c5022Ij, boolean z) throws C4547Af {
        if (c5022Ij.A04() < 7) {
            if (z) {
                return false;
            }
            throw new C4547Af(A05(464, 18, 64) + c5022Ij.A04());
        } else if (c5022Ij.A0E() != i) {
            if (z) {
                return false;
            }
            throw new C4547Af(A05(93, 21, 10) + Integer.toHexString(i));
        } else if (c5022Ij.A0E() != 118 || c5022Ij.A0E() != 111 || c5022Ij.A0E() != 114 || c5022Ij.A0E() != 98 || c5022Ij.A0E() != 105 || c5022Ij.A0E() != 115) {
            if (z) {
                return false;
            }
            throw new C4547Af(A05(10, 28, 24));
        } else if (A01[6].length() != 22) {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
            strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
            return true;
        }
    }

    public static C4714Dd[] A0B(C4710DZ c4710dz) {
        int A02 = c4710dz.A02(6) + 1;
        C4714Dd[] c4714DdArr = new C4714Dd[A02];
        for (int windowType = 0; windowType < A02; windowType++) {
            c4714DdArr[windowType] = new C4714Dd(c4710dz.A04(), c4710dz.A02(16), c4710dz.A02(16), c4710dz.A02(8));
        }
        return c4714DdArr;
    }

    public static C4714Dd[] A0C(C5022Ij c5022Ij, int i) throws C4547Af {
        A0A(5, c5022Ij, false);
        int i2 = c5022Ij.A0E() + 1;
        C4710DZ c4710dz = new C4710DZ(c5022Ij.A00);
        c4710dz.A03(c5022Ij.A06() * 8);
        for (int i3 = 0; i3 < i2; i3++) {
            A02(c4710dz);
        }
        int A02 = c4710dz.A02(6) + 1;
        for (int timeCount = 0; timeCount < A02; timeCount++) {
            int i4 = c4710dz.A02(16);
            if (i4 != 0) {
                throw new C4547Af(A05(311, 52, 110));
            }
        }
        A08(c4710dz);
        A09(c4710dz);
        A07(i, c4710dz);
        C4714Dd[] A0B = A0B(c4710dz);
        if (c4710dz.A04()) {
            return A0B;
        }
        throw new C4547Af(A05(155, 43, 69));
    }
}
