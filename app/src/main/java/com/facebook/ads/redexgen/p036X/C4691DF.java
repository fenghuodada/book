package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.DF */
/* loaded from: assets/audience_network.dex */
public final class C4691DF {
    public static String[] A0A = {"3clh", "In2mDQuCVOg3ihkf16hWdIIfuM6sFv5F", "x02l2Vae1akitXdZsfkSin5rPssADgyF", "voDg", "hUzVtg6QDcg3AayaGyy4Y5hfj2RvIx7z", "AYA0HHhZRav1tOhmR967ChnIf", "RG8", "bQ6q4wCv1qa3psjbWrVNO9D1ADq5zdw2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public C4686D9 A04;
    public C4699DO A05;
    public final InterfaceC4670Co A06;
    public final C4701DQ A07 = new C4701DQ();
    public final C5022Ij A09 = new C5022Ij(1);
    public final C5022Ij A08 = new C5022Ij();

    public C4691DF(InterfaceC4670Co interfaceC4670Co) {
        this.A06 = interfaceC4670Co;
    }

    private C4700DP A00() {
        int i = this.A07.A07.A02;
        if (this.A07.A08 != null) {
            C4701DQ c4701dq = this.A07;
            String[] strArr = A0A;
            if (strArr[1].charAt(10) != strArr[4].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "mhitCTNVD2gTcCiZ9jaRAXWaAA0g9dMw";
            strArr2[4] = "MwiogHOaq0gqmibDd9x4nD1rPGRVV4il";
            return c4701dq.A08;
        }
        return this.A05.A00(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (!this.A07.A0A) {
            return;
        }
        C5022Ij c5022Ij = this.A07.A09;
        C4700DP A00 = A00();
        if (A00.A00 != 0) {
            c5022Ij.A0Z(A00.A00);
        }
        if (this.A07.A0H[this.A01]) {
            c5022Ij.A0Z(c5022Ij.A0I() * 6);
        }
    }

    public final int A03() {
        C5022Ij c5022Ij;
        int length;
        if (this.A07.A0A) {
            C4700DP A00 = A00();
            if (A00.A00 != 0) {
                c5022Ij = this.A07.A09;
                length = A00.A00;
            } else {
                byte[] bArr = A00.A04;
                String[] strArr = A0A;
                if (strArr[3].length() != strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[1] = "Pfb0S5CneQgYrjeMjOJgtR7T7eyOdr1R";
                strArr2[4] = "zLY8KEVp0MgNhcadjz3HGMWIKnjSbq4p";
                this.A08.A0b(bArr, bArr.length);
                c5022Ij = this.A08;
                length = bArr.length;
            }
            boolean[] zArr = this.A07.A0H;
            int vectorSize = this.A01;
            boolean z = zArr[vectorSize];
            byte[] bArr2 = this.A09.A00;
            int vectorSize2 = z ? 128 : 0;
            bArr2[0] = (byte) (vectorSize2 | length);
            this.A09.A0Y(0);
            this.A06.AEG(this.A09, 1);
            this.A06.AEG(c5022Ij, length);
            if (!z) {
                int vectorSize3 = length + 1;
                return vectorSize3;
            }
            C5022Ij c5022Ij2 = this.A07.A09;
            int A0I = c5022Ij2.A0I();
            c5022Ij2.A0Z(-2);
            int subsampleCount = A0I * 6;
            int i = subsampleCount + 2;
            this.A06.AEG(c5022Ij2, i);
            int subsampleDataLength = length + 1;
            return subsampleDataLength + i;
        }
        return 0;
    }

    public final void A04() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A05(long j) {
        long A01 = C4523AG.A01(j);
        for (int i = this.A01; i < this.A07.A00 && this.A07.A00(i) < A01; i++) {
            boolean[] zArr = this.A07.A0I;
            String[] strArr = A0A;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[1] = "yYyJ6pNJ0kgjmttu9OhrBT2GfQD0mn7b";
            strArr2[4] = "spdSEizAECgh3deYwyaUKu4kY7nul1tj";
            if (zArr[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A06(DrmInitData drmInitData) {
        C4700DP A00 = this.A05.A00(this.A07.A07.A02);
        this.A06.A5V(this.A05.A07.A0I(drmInitData.A02(A00 != null ? A00.A02 : null)));
    }

    public final void A07(C4699DO c4699do, C4686D9 c4686d9) {
        this.A05 = (C4699DO) C4997IK.A01(c4699do);
        this.A04 = (C4686D9) C4997IK.A01(c4686d9);
        this.A06.A5V(c4699do.A07);
        A04();
    }

    public final boolean A08() {
        this.A01++;
        this.A00++;
        int i = this.A00;
        int[] iArr = this.A07.A0E;
        int i2 = this.A02;
        if (i == iArr[i2]) {
            this.A02 = i2 + 1;
            String[] strArr = A0A;
            if (strArr[2].charAt(8) != strArr[7].charAt(8)) {
                throw new RuntimeException();
            }
            A0A[6] = "24SILmm";
            this.A00 = 0;
            return false;
        }
        return true;
    }
}
