package com.facebook.ads.redexgen.p036X;

import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dg */
/* loaded from: assets/audience_network.dex */
public final class C4717Dg implements InterfaceC5869Wc {
    public static byte[] A03;
    public static String[] A04 = {"hwqziZW7AZPod2dXLouvGwTTrlxQftu5", "HWTvO3PtXP9N2f8hjjNBE5ELyu96O7C2", "XZiXxIUms072zxq0eptbFHl9id1xfsii", "R678H1T6QVa3UEsgGNCZuIT3k3f5TJMX", "R3CvDfTCre2oGIfhbqMtFAzPo9CSve3e", "yCxuKEdtUnEmK00296URo1FADbxWErUf", "IeIjE9tQRhU2QKWiPhSO822TtqgvRx0R", "yf6PTLZVRmp8JK3c15ye5co8mawgp7Wk"};
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[1].charAt(18) != 'N') {
            throw new RuntimeException();
        }
        A04[1] = "IGRalwhGPANuEueVyyNisaHhdEkfW4kv";
        A03 = new byte[]{-117, Byte.MAX_VALUE, -52, -72, -56, -65, -106, -38, -41, -22, -41, -106, -23, -33, -16, -37, -106, -29, -33, -23, -29, -41, -22, -39, -34, -80, -106, -74, -62, -46, -55, -77, -59, -59, -53, -59, -46};
    }

    static {
        A02();
    }

    public C4717Dg(long[] jArr, long[] jArr2, long j) {
        this.A02 = jArr;
        this.A01 = jArr2;
        this.A00 = j;
    }

    public static C4717Dg A00(long durationUs, long j, C4664Ci c4664Ci, C5022Ij c5022Ij) {
        int A0E;
        long position = j;
        c5022Ij.A0Z(10);
        int A08 = c5022Ij.A08();
        if (A08 <= 0) {
            return null;
        }
        int i = c4664Ci.A03;
        long A0F = C5038Iz.A0F(A08, 1000000 * (i >= 32000 ? 1152 : 576), i);
        int A0I = c5022Ij.A0I();
        int A0I2 = c5022Ij.A0I();
        int A0I3 = c5022Ij.A0I();
        c5022Ij.A0Z(2);
        int scale = c4664Ci.A02;
        long j2 = position + scale;
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        for (int i2 = 0; i2 < A0I; i2++) {
            jArr[i2] = (i2 * A0F) / A0I;
            jArr2[i2] = Math.max(position, j2);
            if (A0I3 == 1) {
                A0E = c5022Ij.A0E();
            } else if (A0I3 == 2) {
                A0E = c5022Ij.A0I();
            } else if (A0I3 == 3) {
                A0E = c5022Ij.A0G();
            } else if (A0I3 != 4) {
                return null;
            } else {
                A0E = c5022Ij.A0H();
            }
            position += A0E * A0I2;
            int segmentSize = A04[7].charAt(10);
            if (segmentSize == 80) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[5] = "SApHUsB0TeciBaZ8FVEH7XQ0HhkRahgp";
            strArr[4] = "ro1Cj1bOUorcqHsrq9aZZzvMMKgEvTZf";
        }
        int entryCount = (durationUs > (-1L) ? 1 : (durationUs == (-1L) ? 0 : -1));
        if (entryCount != 0) {
            int entryCount2 = (durationUs > position ? 1 : (durationUs == position ? 0 : -1));
            if (entryCount2 != 0) {
                Log.w(A01(27, 10, 57), A01(2, 25, 79) + durationUs + A01(0, 2, 56) + position);
            }
        }
        return new C4717Dg(jArr, jArr2, A0F);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long j) {
        int A0B = C5038Iz.A0B(this.A02, j, true, true);
        C4668Cm c4668Cm = new C4668Cm(this.A02[A0B], this.A01[A0B]);
        if (c4668Cm.A01 < j) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new C4666Ck(c4668Cm, new C4668Cm(jArr[A0B + 1], this.A01[A0B + 1]));
            }
        }
        return new C4666Ck(c4668Cm);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5869Wc
    public final long A7e(long j) {
        return this.A02[C5038Iz.A0B(this.A01, j, true, true)];
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return true;
    }
}
