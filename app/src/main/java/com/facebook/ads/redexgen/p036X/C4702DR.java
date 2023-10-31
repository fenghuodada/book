package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.DR */
/* loaded from: assets/audience_network.dex */
public final class C4702DR {
    public final int A00;
    public final int A01;
    public final long A02;
    public final C4699DO A03;
    public final int[] A04;
    public final int[] A05;
    public final long[] A06;
    public final long[] A07;

    public C4702DR(C4699DO c4699do, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        C4997IK.A03(iArr.length == jArr2.length);
        C4997IK.A03(jArr.length == jArr2.length);
        C4997IK.A03(iArr2.length == jArr2.length);
        this.A03 = c4699do;
        this.A06 = jArr;
        this.A05 = iArr;
        this.A00 = i;
        this.A07 = jArr2;
        this.A04 = iArr2;
        this.A02 = j;
        this.A01 = jArr.length;
    }

    public final int A00(long j) {
        for (int A0B = C5038Iz.A0B(this.A07, j, true, false); A0B >= 0; A0B--) {
            if ((this.A04[A0B] & 1) != 0) {
                return A0B;
            }
        }
        return -1;
    }

    public final int A01(long j) {
        for (int A0A = C5038Iz.A0A(this.A07, j, true, false); A0A < this.A07.length; A0A++) {
            if ((this.A04[A0A] & 1) != 0) {
                return A0A;
            }
        }
        return -1;
    }
}
