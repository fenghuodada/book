package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.WP */
/* loaded from: assets/audience_network.dex */
public class C5856WP implements InterfaceC4706DV, InterfaceC4667Cl {
    public static String[] A05 = {"yHlOCb8hYCUAGFBSR1KAQUls", "juuz7zvmjSSgkVuftf6ZJcl9wJUxZwvI", "9ebISPaipFvwM", "wI75rrP9DnRc8cDmDq6gSrlsVWTLnppT", "4k7x4VjdHI9zouAPkna3Rg4ZAMvyURep", "hKkxNrfwukp47", "HBJCJbTVml8ZYTmPInpazFF5", "aaJAILk2rqVBl9Nm5Oiw"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ C5855WO A04;

    public C5856WP(C5855WO c5855wo) {
        this.A04 = c5855wo;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    public final void A01(C5022Ij c5022Ij) {
        c5022Ij.A0Z(1);
        int A0G = c5022Ij.A0G() / 18;
        this.A02 = new long[A0G];
        this.A03 = new long[A0G];
        for (int i = 0; i < A0G; i++) {
            this.A02[i] = c5022Ij.A0L();
            if (A05[4].charAt(31) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[5] = "w9Elnsp9xD6AY";
            strArr[2] = "jAQAlpm0y2ybi";
            this.A03[i] = c5022Ij.A0L();
            c5022Ij.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4706DV
    public final InterfaceC4667Cl A4S() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        C5009IW c5009iw;
        c5009iw = this.A04.A01;
        return c5009iw.A01();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long j) {
        int A0B = C5038Iz.A0B(this.A02, this.A04.A04(j), true, true);
        long seekTimeUs = this.A04.A03(this.A02[A0B]);
        C4668Cm c4668Cm = new C4668Cm(seekTimeUs, this.A00 + this.A03[A0B]);
        if (seekTimeUs < j) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                long A03 = this.A04.A03(jArr[A0B + 1]);
                long secondSeekTimeUs = this.A00;
                return new C4666Ck(c4668Cm, new C4668Cm(A03, secondSeekTimeUs + this.A03[A0B + 1]));
            }
        }
        return new C4666Ck(c4668Cm);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4706DV
    public final long ADY(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        long j = this.A01;
        if (j >= 0) {
            long j2 = -(j + 2);
            this.A01 = -1L;
            return j2;
        }
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4706DV
    public final long AF1(long j) {
        long A04 = this.A04.A04(j);
        this.A01 = this.A02[C5038Iz.A0B(this.A02, A04, true, true)];
        return A04;
    }
}
