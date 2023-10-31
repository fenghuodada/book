package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Vs */
/* loaded from: assets/audience_network.dex */
public final class C5823Vs implements InterfaceC4667Cl {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C5823Vs(int i, int i2, int i3, int i4, int i5, int i6) {
        this.A06 = i;
        this.A07 = i2;
        this.A02 = i3;
        this.A04 = i4;
        this.A03 = i5;
        this.A05 = i6;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j) {
        return (1000000 * Math.max(0L, j - this.A01)) / this.A02;
    }

    public final void A06(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return (1000000 * (this.A00 / this.A04)) / this.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long j) {
        int i = this.A04;
        long A0E = C5038Iz.A0E((((this.A02 * j) / 1000000) / i) * i, 0L, this.A00 - i);
        long j2 = this.A01 + A0E;
        long seekTimeUs = A05(j2);
        C4668Cm c4668Cm = new C4668Cm(seekTimeUs, j2);
        if (seekTimeUs < j) {
            long j3 = this.A00;
            int i2 = this.A04;
            if (A0E != j3 - i2) {
                long j4 = i2 + j2;
                long seekPosition = A05(j4);
                return new C4666Ck(c4668Cm, new C4668Cm(seekPosition, j4));
            }
        }
        return new C4666Ck(c4668Cm);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return true;
    }
}
