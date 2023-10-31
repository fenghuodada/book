package com.facebook.ads.redexgen.p036X;

import android.util.SparseArray;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.W1 */
/* loaded from: assets/audience_network.dex */
public final class C5832W1 implements InterfaceC4658Cc {
    public static String[] A08 = {"", "mExdGVP0maPlz", "mtU4GW9lJGPRgwi7WTtJ47xTDMOD9Jvz", "mnVK2jaR5CYO63Y95SEKprVffrLm5k0s", "WHnhbYArFQVibafDHBFVvoYN0aOa9WUH", "bzekXst0bt0AdcZvIiwJXkkJcIHRgIjU", "gyTL2jV1VgKAzlNybmW", "q"};
    public static final InterfaceC4661Cf A09 = new C5833W2();
    public long A00;
    public InterfaceC4660Ce A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SparseArray<C4726Dp> A05;
    public final C5022Ij A06;
    public final C5034Iv A07;

    public C5832W1() {
        this(new C5034Iv(0L));
    }

    public C5832W1(C5034Iv c5034Iv) {
        this.A07 = c5034Iv;
        this.A06 = new C5022Ij(4096);
        this.A05 = new SparseArray<>();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A01 = interfaceC4660Ce;
        interfaceC4660Ce.AEM(new C5883Wq(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0135, code lost:
        r10.AEt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0139, code lost:
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013c, code lost:
        r9.A06.A0W(r5);
        r10.readFully(r9.A06.A00, 0, r5);
        r9.A06.A0Y(6);
        r4.A03(r9.A06);
        r1 = r9.A06;
        r1.A0X(r1.A05());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ADX(com.facebook.ads.redexgen.p036X.InterfaceC4659Cd r10, com.facebook.ads.redexgen.p036X.C4665Cj r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5832W1.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        this.A07.A08();
        for (int i = 0; i < this.A05.size(); i++) {
            this.A05.valueAt(i).A02();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        interfaceC4659Cd.AD7(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            if (A08[7].length() != 3) {
                A08[4] = "dWjhqjXulz1hd3AtKzuGBSPNQhOMyT1H";
                interfaceC4659Cd.A3K(bArr[13] & 7);
                interfaceC4659Cd.AD7(bArr, 0, 3);
                return 1 == ((bArr[2] & 255) | (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)));
            }
            throw new RuntimeException();
        }
        return false;
    }
}
