package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.IA */
/* loaded from: assets/audience_network.dex */
public final class C4987IA {
    public static String[] A00 = {"v79OOCD3rFDrBH3Sw8ccat0nkfR9Jk8K", "zaqJSCMgPr8q8xIyOc2JWspWFv3JOD4h", "Sqp2xVCvxFHsc", "s8GBWRpegr", "t6Y6wcH7Q091ZQl7CdWm1Bgnnklpnco", "XVr0n", "MY0M4GS8ICKTpGygoaRzgsCYiOraPhWK", "Pkt85Yo8hwIimoTAGZdJTyJAkZ2fE06T"};

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        return r9;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE  (r3 I:com.facebook.ads.redexgen.X.He) type: STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void, block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE  (r3 I:com.facebook.ads.redexgen.X.He) type: STATIC call: com.facebook.ads.redexgen.X.Iz.A0W(com.facebook.ads.redexgen.X.He):void, block:B:36:0x0092 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long A00(com.facebook.ads.redexgen.p036X.C4959Hi r14, long r15, long r17, com.facebook.ads.redexgen.p036X.InterfaceC4955He r19, byte[] r20, @androidx.annotation.Nullable com.facebook.ads.redexgen.p036X.C5026In r21, int r22, com.facebook.ads.redexgen.p036X.C4986I9 r23) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r2 = r14
        L1:
            r1 = r21
            if (r1 == 0) goto La
            r0 = r22
            r1.A01(r0)
        La:
            r3 = r19
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.Hi r4 = new com.facebook.ads.redexgen.X.Hi     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            android.net.Uri r5 = r2.A04     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            byte[] r6 = r2.A06     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r9 = r2.A03     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r7 = r15
            long r9 = r9 + r7
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r9 = r9 - r0
            r11 = -1
            java.lang.String r13 = r2.A05     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            int r0 = r2.A00     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r14 = r0 | 2
            r4.<init>(r5, r6, r7, r9, r11, r13, r14)     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r2 = r4
            long r7 = r3.ACw(r2)     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r6 = r23
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r11 = -1
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L42
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 == 0) goto L42
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r7
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
        L42:
            r9 = 0
        L44:
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 == 0) goto L8d
            boolean r0 = java.lang.Thread.interrupted()     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            if (r0 != 0) goto L7c
            r7 = 0
            int r0 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            r8 = r20
            if (r0 == 0) goto L5f
            int r0 = r8.length     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r4 = (long) r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r0 = r17 - r9
            long r0 = java.lang.Math.min(r4, r0)     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            int r4 = (int) r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            goto L60
        L5f:
            int r4 = r8.length     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
        L60:
            int r7 = r3.read(r8, r7, r4)     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r0 = -1
            if (r7 != r0) goto L73
            long r4 = r6.A01     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 != 0) goto L8d
            long r0 = r2.A01     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r0 = r0 + r9
            r6.A01 = r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            goto L8d
        L73:
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r9 = r9 + r0
            long r4 = r6.A02     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r0 = (long) r7     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            long r4 = r4 + r0
            r6.A02 = r4     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            goto L44
        L7c:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
        L82:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            r0.<init>()     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
            throw r0     // Catch: com.facebook.ads.redexgen.p036X.C5025Im -> L88 java.lang.Throwable -> L91
        L88:
            com.facebook.ads.redexgen.p036X.C5038Iz.A0W(r3)
            goto L1
        L8d:
            com.facebook.ads.redexgen.p036X.C5038Iz.A0W(r3)
            return r9
        L91:
            r0 = move-exception
            com.facebook.ads.redexgen.p036X.C5038Iz.A0W(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4987IA.A00(com.facebook.ads.redexgen.X.Hi, long, long, com.facebook.ads.redexgen.X.He, byte[], com.facebook.ads.redexgen.X.In, int, com.facebook.ads.redexgen.X.I9):long");
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(C4959Hi c4959Hi) {
        return c4959Hi.A05 != null ? c4959Hi.A05 : A01(c4959Hi.A04);
    }

    public static void A03(C4959Hi c4959Hi, InterfaceC4981I4 interfaceC4981I4, C5762Uq c5762Uq, byte[] bArr, @Nullable C5026In c5026In, int i, @Nullable C4986I9 c4986i9, @Nullable AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        long left;
        C4986I9 counters = c4986i9;
        C4997IK.A01(c5762Uq);
        C4997IK.A01(bArr);
        if (counters != null) {
            A04(c4959Hi, interfaceC4981I4, counters);
        } else {
            counters = new C4986I9();
        }
        String key = A02(c4959Hi);
        long j = c4959Hi.A01;
        if (c4959Hi.A02 != -1) {
            left = c4959Hi.A02;
        } else {
            left = interfaceC4981I4.A68(key);
        }
        while (true) {
            long j2 = 0;
            if (left != 0) {
                if (atomicBoolean != null) {
                    boolean z2 = atomicBoolean.get();
                    if (A00[5].length() == 1) {
                        break;
                    }
                    A00[5] = "EAlW89nW7uOIImzUc5SW8CQaYz84C";
                    if (z2) {
                        throw new InterruptedException();
                    }
                }
                long A5w = interfaceC4981I4.A5w(key, j, left != -1 ? left : Long.MAX_VALUE);
                if (A5w <= 0) {
                    long j3 = -A5w;
                    String[] strArr = A00;
                    if (strArr[6].length() != strArr[1].length()) {
                        break;
                    }
                    A00[2] = "OFDha7Ysfl6kB";
                    A5w = j3;
                    if (A00(c4959Hi, j, j3, c5762Uq, bArr, c5026In, i, counters) < A5w) {
                        if (!z || left == -1) {
                            return;
                        }
                        throw new EOFException();
                    }
                }
                j += A5w;
                if (left != -1) {
                    j2 = A5w;
                }
                left -= j2;
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public static void A04(C4959Hi c4959Hi, InterfaceC4981I4 interfaceC4981I4, C4986I9 c4986i9) {
        long A68;
        String A02 = A02(c4959Hi);
        long j = c4959Hi.A01;
        if (c4959Hi.A02 != -1) {
            A68 = c4959Hi.A02;
        } else {
            A68 = interfaceC4981I4.A68(A02);
        }
        c4986i9.A01 = A68;
        if (A00[5].length() == 1) {
            throw new RuntimeException();
        }
        A00[4] = "nu";
        c4986i9.A00 = 0L;
        c4986i9.A02 = 0L;
        while (A68 != 0) {
            long start = interfaceC4981I4.A5w(A02, j, A68 != -1 ? A68 : Long.MAX_VALUE);
            if (start > 0) {
                c4986i9.A00 += start;
            } else {
                start = -start;
                if (start == Long.MAX_VALUE) {
                    return;
                }
            }
            j += start;
            if (A68 == -1) {
                start = 0;
            }
            A68 -= start;
        }
    }

    public static void A05(InterfaceC4981I4 interfaceC4981I4, String str) {
        for (C4985I8 c4985i8 : interfaceC4981I4.A5x(str)) {
            if (A00[2].length() != 13) {
                throw new RuntimeException();
            }
            A00[4] = "R4HmvLUlpWi57h";
            try {
                interfaceC4981I4.ADx(c4985i8);
            } catch (C4979I2 unused) {
            }
        }
    }
}
