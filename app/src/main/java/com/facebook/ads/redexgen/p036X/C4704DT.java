package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DT */
/* loaded from: assets/audience_network.dex */
public final class C4704DT {
    public static String[] A05 = {"YmqCfQGeJdZscNiSsRHgK8Xqwc4qCDQV", "BEVC1cuwi5mxHrGOZ29iGldY3rFRULVC", "DSPc42zLHxXdWx97yn92wynUTyNm", "qbq", "Vn6wbfa2hXyYQug1oukzP6oQFgTa", "a4c", "hss", "EwoauNNUoRbyLKR"};
    public int A01;
    public boolean A02;
    public final C4705DU A03 = new C4705DU();
    public final C5022Ij A04 = new C5022Ij(new byte[65025], 0);
    public int A00 = -1;

    private int A00(int i) {
        this.A01 = 0;
        int i2 = 0;
        while (this.A01 + i < this.A03.A02) {
            int[] iArr = this.A03.A09;
            int i3 = this.A01;
            this.A01 = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public final C4705DU A01() {
        return this.A03;
    }

    public final C5022Ij A02() {
        return this.A04;
    }

    public final void A03() {
        this.A03.A02();
        this.A04.A0V();
        this.A00 = -1;
        this.A02 = false;
    }

    public final void A04() {
        if (this.A04.A00.length == 65025) {
            return;
        }
        C5022Ij c5022Ij = this.A04;
        c5022Ij.A00 = Arrays.copyOf(c5022Ij.A00, Math.max(65025, this.A04.A07()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
        if (r7.A03.A09[r3 - 1] != 5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ca, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ee, code lost:
        if (r7.A03.A09[r3 - 1] != 255) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f1, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A05(com.facebook.ads.redexgen.p036X.InterfaceC4659Cd r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4704DT.A05(com.facebook.ads.redexgen.X.Cd):boolean");
    }
}
