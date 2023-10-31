package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.V9 */
/* loaded from: assets/audience_network.dex */
public final class C5781V9 implements InterfaceC4947HW {
    public static byte[] A08;
    public int A00;
    public int A01;
    public int A02;
    public C4946HV[] A03;
    public final int A04;
    public final boolean A05;
    public final byte[] A06;
    public final C4946HV[] A07;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 123);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-69, -81, -2, 23, 14, 33, 25, 14, 12, 29, 14, 13, -55, 10, 21, 21, 24, 12, 10, 29, 18, 24, 23, -29, -55};
    }

    public C5781V9(boolean z, int i) {
        this(z, i, 0);
    }

    public C5781V9(boolean z, int i, int i2) {
        C4997IK.A03(i > 0);
        C4997IK.A03(i2 >= 0);
        this.A05 = z;
        this.A04 = i;
        this.A01 = i2;
        this.A03 = new C4946HV[i2 + 100];
        if (i2 > 0) {
            this.A06 = new byte[i2 * i];
            for (int i3 = 0; i3 < i2; i3++) {
                this.A03[i3] = new C4946HV(this.A06, i3 * i);
            }
        } else {
            this.A06 = null;
        }
        this.A07 = new C4946HV[1];
    }

    public final synchronized int A02() {
        return this.A00 * this.A04;
    }

    public final synchronized void A03() {
        if (this.A05) {
            A04(0);
        }
    }

    public final synchronized void A04(int i) {
        boolean z = i < this.A02;
        this.A02 = i;
        if (z) {
            AFE();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4947HW
    public final synchronized C4946HV A3L() {
        C4946HV c4946hv;
        this.A00++;
        if (this.A01 > 0) {
            C4946HV[] c4946hvArr = this.A03;
            int i = this.A01 - 1;
            this.A01 = i;
            c4946hv = c4946hvArr[i];
            this.A03[this.A01] = null;
        } else {
            c4946hv = new C4946HV(new byte[this.A04], 0);
        }
        return c4946hv;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4947HW
    public final int A6o() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4947HW
    public final synchronized void ADn(C4946HV c4946hv) {
        this.A07[0] = c4946hv;
        ADo(this.A07);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4947HW
    public final synchronized void ADo(C4946HV[] c4946hvArr) {
        if (this.A01 + c4946hvArr.length >= this.A03.length) {
            this.A03 = (C4946HV[]) Arrays.copyOf(this.A03, Math.max(this.A03.length * 2, this.A01 + c4946hvArr.length));
        }
        for (C4946HV c4946hv : c4946hvArr) {
            if (c4946hv.A01 != this.A06 && c4946hv.A01.length != this.A04) {
                throw new IllegalArgumentException(A00(2, 23, 46) + System.identityHashCode(c4946hv.A01) + A00(0, 2, 20) + System.identityHashCode(this.A06) + A00(0, 2, 20) + c4946hv.A01.length + A00(0, 2, 20) + this.A04);
            }
            C4946HV[] c4946hvArr2 = this.A03;
            int i = this.A01;
            this.A01 = i + 1;
            c4946hvArr2[i] = c4946hv;
        }
        this.A00 -= c4946hvArr.length;
        notifyAll();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4947HW
    public final synchronized void AFE() {
        int lowIndex = Math.max(0, C5038Iz.A04(this.A02, this.A04) - this.A00);
        if (lowIndex >= this.A01) {
            return;
        }
        if (this.A06 != null) {
            int i = 0;
            int i2 = this.A01 - 1;
            while (i <= i2) {
                C4946HV c4946hv = this.A03[i];
                if (c4946hv.A01 == this.A06) {
                    i++;
                } else {
                    C4946HV c4946hv2 = this.A03[i2];
                    if (c4946hv2.A01 != this.A06) {
                        i2--;
                    } else {
                        int highIndex = i + 1;
                        this.A03[i] = c4946hv2;
                        this.A03[i2] = c4946hv;
                        i2--;
                        i = highIndex;
                    }
                }
            }
            lowIndex = Math.max(lowIndex, i);
            if (lowIndex >= this.A01) {
                return;
            }
        }
        Arrays.fill(this.A03, lowIndex, this.A01, (Object) null);
        this.A01 = lowIndex;
    }
}
