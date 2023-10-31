package com.facebook.ads.redexgen.p036X;

import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.W9 */
/* loaded from: assets/audience_network.dex */
public final class C5840W9 implements InterfaceC4719Di {
    public static byte[] A0D;
    public static String[] A0E = {"YsqY7Lk0NG7yMwVwuR3aCKQ1vCFnnoD7", "imTBT5eeu9SEESxnKVa9Th5", "O0aT", "zBRiiCG0AgE79WafkQACjpG1QDeKkcp1", "wwjqIDfPN4cSDtn9coCmQZMwbPpUFodD", "uPTa", "JD3sFkMXr2jLKKNxvTNpqQokakbynhd6", "fAZgloKcDeiXibtKpEsUxRbbQwdcutNH"};
    public static final double[] A0F;
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public InterfaceC4670Co A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final boolean[] A0C = new boolean[4];
    public final C4720Dj A0B = new C4720Dj(128);

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0E[1].length() != 23) {
                throw new RuntimeException();
            }
            A0E[4] = "Ri5OGo1CF8gLgqNPBzhcn52enWrdUOS9";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 59);
            i4++;
        }
    }

    public static void A02() {
        A0D = new byte[]{-2, -15, -20, -19, -9, -73, -11, -8, -19, -17, -70};
    }

    static {
        A02();
        A0F = new double[]{23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    }

    public static Pair<Format, Long> A00(C4720Dj c4720Dj, String str) {
        byte[] copyOf = Arrays.copyOf(c4720Dj.A02, c4720Dj.A00);
        int i = copyOf[4] & 255;
        int i2 = copyOf[5] & 255;
        int firstByte = copyOf[6] & 255;
        int aspectRatioCode = (i << 4) | (i2 >> 4);
        int width = i2 & 15;
        int i3 = (width << 8) | firstByte;
        float f = 1.0f;
        int i4 = (copyOf[7] & 240) >> 4;
        if (i4 != 2) {
            String[] strArr = A0E;
            String str2 = strArr[2];
            String str3 = strArr[5];
            int firstByte2 = str2.length();
            if (firstByte2 == str3.length()) {
                String[] strArr2 = A0E;
                strArr2[3] = "HgbrGKSiwbnHfsjka25a0ZgViwBErbAQ";
                strArr2[6] = "kgfZHtVXJwuxNbqkZAemlWCJOmm9Ylqd";
                if (i4 != 3) {
                    if (i4 == 4) {
                        int frameRateExtensionN = i3 * 121;
                        float f2 = frameRateExtensionN;
                        int frameRateExtensionN2 = aspectRatioCode * 100;
                        f = f2 / frameRateExtensionN2;
                    }
                } else {
                    int frameRateExtensionN3 = i3 * 16;
                    float f3 = frameRateExtensionN3;
                    int frameRateExtensionN4 = aspectRatioCode * 9;
                    f = f3 / frameRateExtensionN4;
                }
            }
            throw new RuntimeException();
        }
        float pixelWidthHeightRatio = aspectRatioCode * 3;
        f = (i3 * 4) / pixelWidthHeightRatio;
        Format A03 = Format.A03(str, A01(0, 11, 77), null, -1, -1, aspectRatioCode, i3, -1.0f, Collections.singletonList(copyOf), -1, f, null);
        long j = 0;
        int i5 = (copyOf[7] & 15) - 1;
        if (i5 >= 0) {
            double[] dArr = A0F;
            int frameRateCodeMinusOne = dArr.length;
            if (i5 < frameRateCodeMinusOne) {
                double d = dArr[i5];
                int i6 = c4720Dj.A01;
                int sequenceExtensionPosition = i6 + 9;
                int i7 = (copyOf[sequenceExtensionPosition] & 96) >> 5;
                int i8 = i6 + 9;
                if (A0E[1].length() == 23) {
                    A0E[1] = "JkGh2MRG0HwgK9dbH7jOqv6";
                    int height = copyOf[i8] & 31;
                    if (i7 != height) {
                        double frameRate = i7;
                        int firstByte3 = height + 1;
                        d *= (frameRate + 1.0d) / firstByte3;
                    }
                    j = (long) (1000000.0d / d);
                }
                throw new RuntimeException();
            }
        }
        return Pair.create(A03, Long.valueOf(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (r3 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d6, code lost:
        if (r21.A07 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d8, code lost:
        r21.A05.AEH(r21.A03, r21.A09 ? 1 : 0, ((int) (r21.A04 - r21.A02)) - r4, r4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0122, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0124, code lost:
        r21.A03 = r2;
        r21.A09 = false;
        r21.A01 = r4;
        r21.A0A = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0140, code lost:
        if (r2 != (-9223372036854775807L)) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0145, code lost:
        if (r21.A0A == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0147, code lost:
        r2 = r21.A03 + r21.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x014d, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0157, code lost:
        if (r3 != false) goto L40;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A48(com.facebook.ads.redexgen.p036X.C5022Ij r22) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5840W9.A48(com.facebook.ads.redexgen.X.Ij):void");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A06 = c4733Dw.A04();
        this.A05 = interfaceC4660Ce.AFD(c4733Dw.A03(), 2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        this.A01 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        C5018If.A0B(this.A0C);
        this.A0B.A00();
        this.A04 = 0L;
        this.A0A = false;
    }
}
