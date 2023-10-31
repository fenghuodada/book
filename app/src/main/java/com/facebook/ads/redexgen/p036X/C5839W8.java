package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.W8 */
/* loaded from: assets/audience_network.dex */
public final class C5839W8 implements InterfaceC4719Di {
    public static byte[] A0E;
    public static String[] A0F = {"OaAtDjibDffMS", "aj2yyuicdEn8dhTDbWTrD1WtuleVGPEx", "a3NvGU2CXdpQvxvcysdReyA6yUgKGJjf", "4BBSavRiCGZis8TiCNo6nDJqjRzxnCkr", "3Isw3BGBXoN1VbjlJcagr5xDVNXHwLpI", "HfhncQp7sGaDAl", "zNtUp", "pzzsrx2QpEHePoyNV"};
    public long A00;
    public long A01;
    public InterfaceC4670Co A02;
    public C4723Dm A03;
    public String A04;
    public boolean A05;
    public final C4728Dr A09;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean[] A0D = new boolean[3];
    public final C4725Do A08 = new C4725Do(7, 128);
    public final C4725Do A06 = new C4725Do(8, 128);
    public final C4725Do A07 = new C4725Do(6, 128);
    public final C5022Ij A0A = new C5022Ij();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0E = new byte[]{37, 58, 55, 54, 60, 124, 50, 37, 48};
    }

    static {
        A01();
    }

    public C5839W8(C4728Dr c4728Dr, boolean z, boolean z2) {
        this.A09 = c4728Dr;
        this.A0B = z;
        this.A0C = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0175, code lost:
        if (r4.A03() != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0177, code lost:
        r24.A03.A04(com.facebook.ads.redexgen.p036X.C5018If.A05(r24.A06.A01, 3, r24.A06.A00));
        r24.A06.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x019f, code lost:
        if (r4.A03() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(long r25, int r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5839W8.A02(long, int, int, long):void");
    }

    private void A03(long j, int i, long j2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A01(i);
            this.A06.A01(i);
        }
        this.A07.A01(i);
        String[] strArr = A0F;
        if (strArr[4].charAt(8) != strArr[2].charAt(8)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "7DOfm1dA88ob89";
        strArr2[0] = "yqrgSqZS2XcB9";
        this.A03.A03(j, i, j2);
    }

    private void A04(byte[] bArr, int i, int i2) {
        if (!this.A05 || this.A03.A07()) {
            this.A08.A02(bArr, i, i2);
            this.A06.A02(bArr, i, i2);
        }
        this.A07.A02(bArr, i, i2);
        this.A03.A06(bArr, i, i2);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) {
        int A06 = c5022Ij.A06();
        int A07 = c5022Ij.A07();
        byte[] bArr = c5022Ij.A00;
        this.A01 += c5022Ij.A04();
        this.A02.AEG(c5022Ij, c5022Ij.A04());
        while (true) {
            int A04 = C5018If.A04(bArr, A06, A07, this.A0D);
            if (A04 == A07) {
                A04(bArr, A06, A07);
                return;
            }
            int A01 = C5018If.A01(bArr, A04);
            int nalUnitOffset = A04 - A06;
            if (nalUnitOffset > 0) {
                A04(bArr, A06, A04);
            }
            int i = A07 - A04;
            long j = this.A01 - i;
            int offset = nalUnitOffset < 0 ? -nalUnitOffset : 0;
            A02(j, i, offset, this.A00);
            A03(j, A01, this.A00);
            A06 = A04 + 3;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A04 = c4733Dw.A04();
        this.A02 = interfaceC4660Ce.AFD(c4733Dw.A03(), 2);
        this.A03 = new C4723Dm(this.A02, this.A0B, this.A0C);
        this.A09.A03(interfaceC4660Ce, c4733Dw);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        C5018If.A0B(this.A0D);
        this.A08.A00();
        this.A06.A00();
        this.A07.A00();
        this.A03.A01();
        this.A01 = 0L;
    }
}
