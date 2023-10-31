package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gs */
/* loaded from: assets/audience_network.dex */
public final class C4909Gs {
    public static String[] A09 = {"dgnk6daQ0T87wOoHtyty7iRYaKvd8BzP", "TK3sWG", "r0T7HSyuXxeUz69yLbXIR4BhIiF2UDCf", "E94UIter8sht222SneNEBcgvWBNv8GHv", "qg4jsBrtjCwX7ZbqQAPOhxC1noKxQthL", "J", "sUrKaEkRL4ABh9brwle2ScDHOfoRuahW", "YVc6k2"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C5022Ij A07 = new C5022Ij();
    public final int[] A08 = new int[256];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C5022Ij c5022Ij, int i) {
        int A0G;
        if (i < 4) {
            return;
        }
        c5022Ij.A0Z(3);
        int i2 = i - 4;
        if ((c5022Ij.A0E() & 128) != 0) {
            if (i2 < 7 || (A0G = c5022Ij.A0G()) < 4) {
                return;
            }
            this.A01 = c5022Ij.A0I();
            this.A00 = c5022Ij.A0I();
            this.A07.A0W(A0G - 4);
            i2 -= 7;
        }
        int A06 = this.A07.A06();
        int A07 = this.A07.A07();
        if (A06 < A07 && i2 > 0) {
            int bytesToRead = Math.min(i2, A07 - A06);
            c5022Ij.A0c(this.A07.A00, A06, bytesToRead);
            this.A07.A0Y(A06 + bytesToRead);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C5022Ij c5022Ij, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c5022Ij.A0I();
        this.A04 = c5022Ij.A0I();
        c5022Ij.A0Z(11);
        this.A02 = c5022Ij.A0I();
        this.A03 = c5022Ij.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C5022Ij c5022Ij, int i) {
        if (i % 5 != 2) {
            return;
        }
        c5022Ij.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int r = 0; r < i2; r++) {
            int A0E = c5022Ij.A0E();
            int A0E2 = c5022Ij.A0E();
            int A0E3 = c5022Ij.A0E();
            int A0E4 = c5022Ij.A0E();
            int entryCount = c5022Ij.A0E();
            int cb = A0E4 - 128;
            double d = A0E2 - (cb * 0.34414d);
            int i3 = A0E3 - 128;
            int i4 = (int) (d - (i3 * 0.71414d));
            int i5 = A0E4 - 128;
            int[] iArr = this.A08;
            int i6 = C5038Iz.A06((int) (A0E2 + ((A0E3 - 128) * 1.402d)), 0, 255);
            int i7 = (entryCount << 24) | (i6 << 16);
            int i8 = C5038Iz.A06(i4, 0, 255);
            iArr[A0E] = i7 | (i8 << 8) | C5038Iz.A06((int) (A0E2 + (i5 * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    /* JADX WARN: Incorrect condition in loop: B:20:0x003b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p036X.C4888GX A06() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4909Gs.A06():com.facebook.ads.redexgen.X.GX");
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
