package com.facebook.ads.redexgen.p036X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Vv */
/* loaded from: assets/audience_network.dex */
public final class C5826Vv implements InterfaceC4658Cc {
    public static byte[] A0C;
    public static String[] A0D = {"1wQJeguTcmzEzlcqQISF6uciTtBYCHEI", "1z5HoD8RnfRsH4NGqOJrgtDb3AvWKmRf", "OZb5z3fyn7DmUcX5PD2FSiUNDYO3SJGv", "xysXnf11fptxvGLEVlqKxNXP96VBbPb9", "B9gj7Y4phCIGiISa5KNqUW4wq7x20Uai", "0XWjmjuElj7dnGBGcTqheWJCaJtkSIxV", "xem2h", "3rpnxRNe64JCaC2IexlmS1y9p5GeiPOv"};
    public static final InterfaceC4661Cf A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC4660Ce A02;
    public InterfaceC4734Dx A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC4734Dx> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC4732Dv A09;
    public final C5022Ij A0A;
    public final List<C5034Iv> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 75);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-90, -88, -110, -104, -12, 18, 31, 31, 32, 37, -47, 23, 26, 31, 21, -47, 36, 42, 31, 20, -47, 19, 42, 37, 22, -33, -47, -2, 32, 36, 37, -47, 29, 26, 28, 22, 29, 42, -47, 31, 32, 37, -47, 18, -47, 5, 35, 18, 31, 36, 33, 32, 35, 37, -47, 4, 37, 35, 22, 18, 30, -33, -98, -102, -100, -116, -61, -64, -47, -66};
    }

    static {
        A0G();
        A0E = new C5829Vy();
        A0F = C5038Iz.A08(A0D(0, 4, 26));
        A0G = C5038Iz.A08(A0D(62, 4, 14));
        A0H = C5038Iz.A08(A0D(66, 4, 48));
    }

    public C5826Vv() {
        this(0);
    }

    public C5826Vv(int i) {
        this(1, i);
    }

    public C5826Vv(int i, int i2) {
        this(i, new C5034Iv(0L), new C5843WC(i2));
    }

    public C5826Vv(int i, C5034Iv c5034Iv, InterfaceC4732Dv interfaceC4732Dv) {
        this.A09 = (InterfaceC4732Dv) C4997IK.A01(interfaceC4732Dv);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c5034Iv);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c5034Iv);
        }
        this.A0A = new C5022Ij(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C5826Vv c5826Vv) {
        int i = c5826Vv.A01;
        c5826Vv.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC4734Dx> A4K = this.A09.A4K();
        int size = A4K.size();
        for (int i = 0; i < size; i++) {
            this.A06.put(A4K.keyAt(i), A4K.valueAt(i));
        }
        this.A06.put(0, new C5831W0(new C5828Vx(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A02 = interfaceC4660Ce;
        interfaceC4660Ce.AEM(new C5883Wq(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
        r13.A0A.A0Y(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
        r0 = r8 + 1;
        r8 = r0 & 15;
        r1 = com.facebook.ads.redexgen.p036X.C5826Vv.A0D[1].charAt(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
        if (r1 == 72) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
        com.facebook.ads.redexgen.p036X.C5826Vv.A0D[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
        if (r9 == r8) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
        r3.AEK();
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ADX(com.facebook.ads.redexgen.p036X.InterfaceC4659Cd r14, com.facebook.ads.redexgen.p036X.C4665Cj r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5826Vv.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        r3 = r3 + 1;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AEv(com.facebook.ads.redexgen.p036X.InterfaceC4659Cd r8) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.Ij r0 = r7.A0A
            byte[] r5 = r0.A00
            r4 = 0
            r0 = 940(0x3ac, float:1.317E-42)
            r8.AD7(r5, r4, r0)
            r3 = 0
        Lb:
            r6 = 188(0xbc, float:2.63E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C5826Vv.A0D
            r0 = 1
            r1 = r1[r0]
            r0 = 3
            char r1 = r1.charAt(r0)
            r0 = 72
            if (r1 == r0) goto L21
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L21:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5826Vv.A0D
            java.lang.String r1 = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC"
            r0 = 1
            r2[r0] = r1
            if (r3 >= r6) goto L42
            r2 = 0
        L2b:
            r0 = 5
            if (r2 != r0) goto L33
            r8.AEt(r3)
            r0 = 1
            return r0
        L33:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L3f
            int r3 = r3 + 1
            goto Lb
        L3f:
            int r2 = r2 + 1
            goto L2b
        L42:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5826Vv.AEv(com.facebook.ads.redexgen.X.Cd):boolean");
    }
}
