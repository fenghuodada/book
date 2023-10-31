package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Dh */
/* loaded from: assets/audience_network.dex */
public final class C4718Dh implements InterfaceC5869Wc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C4718Dh(long j, long j2, C4664Ci c4664Ci) {
        this.A04 = j2;
        this.A01 = c4664Ci.A02;
        this.A00 = c4664Ci.A00;
        if (j == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
            return;
        }
        this.A02 = j - j2;
        this.A03 = A7e(j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long positionOffset) {
        long j = this.A02;
        if (j == -1) {
            return new C4666Ck(new C4668Cm(0L, this.A04));
        }
        int i = this.A01;
        long A0E = C5038Iz.A0E((((this.A00 * positionOffset) / 8000000) / i) * i, 0L, j - i);
        long j2 = this.A04 + A0E;
        long A7e = A7e(j2);
        C4668Cm seekPoint = new C4668Cm(A7e, j2);
        if (A7e < positionOffset) {
            long j3 = this.A02;
            int i2 = this.A01;
            if (A0E != j3 - i2) {
                long j4 = i2 + j2;
                return new C4666Ck(seekPoint, new C4668Cm(A7e(j4), j4));
            }
        }
        return new C4666Ck(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5869Wc
    public final long A7e(long j) {
        return ((Math.max(0L, j - this.A04) * 1000000) * 8) / this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return this.A02 != -1;
    }
}
