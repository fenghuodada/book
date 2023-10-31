package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DN */
/* loaded from: assets/audience_network.dex */
public final class C4698DN implements InterfaceC5869Wc {
    public static byte[] A05;
    public static String[] A06 = {"BIb1Y700RDmcL7JF9Fn", "lk1IRtv8jtyAOasrQbC6YrAcVcFJ9", "71nm4ncPUlnpG5PegzVfukIlQIS7yUOP", "GCiVubWGa77lALd1Rb0", "chLweuz0mMl4FbXf4CPkrAmx2V", "NRv5J71Oqm94bOZTTnySoFkmq1d86Acc", "fJm6FHaelFV0WMwBghon3E9Gns2th", "ObA7Byd4NJEP2M9ay6ZCFLfldVonyLqe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long[] A04;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[0].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A06[5] = "xDmrh2CysME7FGpg0OVAAWQWrb1b5rm7";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
            i4++;
        }
    }

    public static void A03() {
        String[] strArr = A06;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A06[5] = "O7i6ampyP1fRYbe4QOmd9JyFrRUTDP0J";
        A05 = new byte[]{87, 91, 99, 114, 117, 124, 27, 95, 90, 79, 90, 27, 72, 82, 65, 94, 27, 86, 82, 72, 86, 90, 79, 88, 83, 1, 27, 82, 99, 100, 109, 89, 111, 111, 97, 111, 120};
    }

    static {
        A03();
    }

    public C4698DN(long j, int i, long j2) {
        this(j, i, j2, -1L, null);
    }

    public C4698DN(long j, int i, long j2, long j3, long[] jArr) {
        this.A02 = j;
        this.A00 = i;
        this.A03 = j2;
        this.A01 = j3;
        this.A04 = jArr;
    }

    private long A00(int i) {
        return (this.A03 * i) / 100;
    }

    public static C4698DN A01(long j, long j2, C4664Ci c4664Ci, C5022Ij c5022Ij) {
        int flags;
        int i = c4664Ci.A04;
        int i2 = c4664Ci.A03;
        int A08 = c5022Ij.A08();
        int samplesPerFrame = A08 & 1;
        if (samplesPerFrame != 1 || (flags = c5022Ij.A0H()) == 0) {
            return null;
        }
        long dataSize = C5038Iz.A0F(flags, i * 1000000, i2);
        int samplesPerFrame2 = A08 & 6;
        if (samplesPerFrame2 != 6) {
            return new C4698DN(j2, c4664Ci.A02, dataSize);
        }
        long A0H = c5022Ij.A0H();
        long[] jArr = new long[100];
        for (int i3 = 0; i3 < 100; i3++) {
            long durationUs = c5022Ij.A0E();
            jArr[i3] = durationUs;
        }
        if (j != -1 && j != j2 + A0H) {
            StringBuilder sb = new StringBuilder();
            sb.append(A02(2, 25, 81));
            sb.append(j);
            sb.append(A02(0, 2, 17));
            long durationUs2 = j2 + A0H;
            sb.append(durationUs2);
            Log.w(A02(27, 10, 96), sb.toString());
        }
        return new C4698DN(j2, c4664Ci.A02, dataSize, A0H, jArr);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long j) {
        long[] jArr;
        double scaledPosition;
        if (!A8g()) {
            return new C4666Ck(new C4668Cm(0L, this.A02 + this.A00));
        }
        long positionOffset = C5038Iz.A0E(j, 0L, this.A03);
        long timeUs = this.A03;
        double d = (positionOffset * 100.0d) / timeUs;
        if (d <= 0.0d) {
            scaledPosition = 0.0d;
        } else if (d >= 100.0d) {
            scaledPosition = 256.0d;
        } else {
            int i = (int) d;
            double d2 = this.A04[i];
            if (A06[4].length() == 1) {
                throw new RuntimeException();
            }
            A06[4] = "";
            scaledPosition = d2 + (((i == 99 ? 256.0d : jArr[i + 1]) - d2) * (d - i));
        }
        return new C4666Ck(new C4668Cm(positionOffset, this.A02 + C5038Iz.A0E(Math.round((scaledPosition / 256.0d) * this.A01), this.A00, this.A01 - 1)));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5869Wc
    public final long A7e(long j) {
        long j2;
        double d;
        long positionOffset = j - this.A02;
        if (A8g()) {
            long j3 = this.A00;
            if (A06[4].length() != 1) {
                A06[5] = "XBnVl7Vf2qRXlKywSNR3LOgq8shxQKKO";
                if (positionOffset > j3) {
                    double d2 = (positionOffset * 256.0d) / this.A01;
                    int A0B = C5038Iz.A0B(this.A04, (long) d2, true, true);
                    long A00 = A00(A0B);
                    long j4 = this.A04[A0B];
                    long A002 = A00(A0B + 1);
                    if (j4 == (A0B == 99 ? 256L : this.A04[A0B + 1])) {
                        d = 0.0d;
                    } else {
                        d = (d2 - j4) / (j2 - j4);
                    }
                    long nextScaledPosition = Math.round((A002 - A00) * d);
                    return nextScaledPosition + A00;
                }
                return 0L;
            }
            throw new RuntimeException();
        }
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return this.A04 != null;
    }
}
