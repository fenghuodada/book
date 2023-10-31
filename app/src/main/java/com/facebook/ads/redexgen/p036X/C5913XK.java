package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XK */
/* loaded from: assets/audience_network.dex */
public final class C5913XK implements InterfaceC4543Ab {
    public static byte[] A0A;
    public static String[] A0B = {"ilntiKeCpn72Dx7EE3Rw9hkq75JbKAcA", "wPL2yleQwYX6RVVdEOaHMWHZq50QYzDc", "zjYhmAwspMfnQIz92oeL2kf6IR", "AEUyDf5SOKQlymFmwa942o3bdmA", "6YNynFjnDYQOqc0QM1ycbBp5CCdF169p", "D8", "MEXbIoh", "5uze5Gp41PLyaey5Hs3T"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final C5781V9 A07;
    public final C5026In A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 24);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{104, -85, -87, -74, -74, -73, -68, 104, -86, -83, 104, -76, -83, -69, -69, 104, -68, -80, -87, -74, 104, -81, -88, -69, -84, -84, -85, -72, -116, -75, -72, -106, -78, -89, -65, -88, -89, -87, -79, -121, -84, -70, -85, -72, -104, -85, -88, -69, -84, -84, -85, -72, -109, -71, -54, -35, -50, -50, -51, -38, -82, -41, -38, -72, -44, -55, -31, -54, -55, -53, -45, -75, -37, -17, -29, -6, -60, -9, -24, -24, -25, -12, -49, -11, -23, -27, -22, -66, -15, -30, -30, -31, -18, -55, -17};
    }

    static {
        A02();
    }

    public C5913XK() {
        this(new C5781V9(true, 65536));
    }

    @Deprecated
    public C5913XK(C5781V9 c5781v9) {
        this(c5781v9, 15000, 50000, 2500, 5000, -1, true);
    }

    @Deprecated
    public C5913XK(C5781V9 c5781v9, int i, int i2, int i3, int i4, int i5, boolean z) {
        this(c5781v9, i, i2, i3, i4, i5, z, null);
    }

    @Deprecated
    public C5913XK(C5781V9 c5781v9, int i, int i2, int i3, int i4, int i5, boolean z, C5026In c5026In) {
        String A01 = A01(21, 1, 103);
        String A012 = A01(54, 19, 80);
        A03(i3, 0, A012, A01);
        String A013 = A01(22, 32, 46);
        A03(i4, 0, A013, A01);
        String A014 = A01(84, 11, 100);
        A03(i, i3, A014, A012);
        A03(i, i4, A014, A013);
        A03(i2, i, A01(73, 11, 106), A014);
        this.A07 = c5781v9;
        this.A06 = i * 1000;
        this.A05 = i2 * 1000;
        this.A04 = i3 * 1000;
        this.A03 = i4 * 1000;
        this.A02 = i5;
        this.A09 = z;
        this.A08 = c5026In;
    }

    private final int A00(InterfaceC5909XG[] interfaceC5909XGArr, C4942HR c4942hr) {
        int i = 0;
        for (int i2 = 0; i2 < interfaceC5909XGArr.length; i2++) {
            if (c4942hr.A00(i2) != null) {
                i += C5038Iz.A01(interfaceC5909XGArr[i2].A7i());
            }
        }
        return i;
    }

    public static void A03(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        C4997IK.A05(z, str + A01(0, 21, 48) + str2);
    }

    private void A04(boolean z) {
        this.A00 = 0;
        C5026In c5026In = this.A08;
        if (c5026In != null && this.A01) {
            c5026In.A03(0);
        }
        this.A01 = false;
        if (z) {
            this.A07.A03();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final InterfaceC4947HW A5h() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final long A5m() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final void AC5() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final void ACR() {
        A04(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final void ACZ(InterfaceC5909XG[] interfaceC5909XGArr, TrackGroupArray trackGroupArray, C4942HR c4942hr) {
        int i = this.A02;
        if (i == -1) {
            i = A00(interfaceC5909XGArr, c4942hr);
        }
        this.A00 = i;
        this.A07.A04(this.A00);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final boolean AED() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (r3 != r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r3 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
        r6.A00(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
        r6.A03(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
        if (r3 != r4) goto L22;
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AEl(long r9, float r11) {
        /*
            r8 = this;
            com.facebook.ads.redexgen.X.V9 r0 = r8.A07
            int r1 = r0.A02()
            int r0 = r8.A00
            r6 = 1
            r5 = 0
            if (r1 < r0) goto L86
            r7 = 1
        Ld:
            boolean r4 = r8.A01
            long r0 = r8.A06
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L21
            long r2 = com.facebook.ads.redexgen.p036X.C5038Iz.A0C(r0, r11)
            long r0 = r8.A05
            long r0 = java.lang.Math.min(r2, r0)
        L21:
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7b
            boolean r3 = r8.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C5913XK.A0B
            r0 = 1
            r1 = r1[r0]
            r0 = 1
            char r1 = r1.charAt(r0)
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5913XK.A0B
            java.lang.String r1 = "Ppn0DE"
            r0 = 5
            r2[r0] = r1
            if (r3 != 0) goto L40
            if (r7 != 0) goto L79
        L40:
            r8.A01 = r6
        L42:
            com.facebook.ads.redexgen.X.In r6 = r8.A08
            if (r6 == 0) goto L68
            boolean r3 = r8.A01
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C5913XK.A0B
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 13
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5913XK.A0B
            java.lang.String r1 = "7hiTZk3TS6kdJpPH1OWD5iH5Lha"
            r0 = 3
            r2[r0] = r1
            java.lang.String r1 = "uWsgjDiVcVLtDVCTZxMR"
            r0 = 7
            r2[r0] = r1
            if (r3 == r4) goto L68
        L63:
            if (r3 == 0) goto L6b
            r6.A00(r5)
        L68:
            boolean r0 = r8.A01
            return r0
        L6b:
            r6.A03(r5)
            goto L68
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5913XK.A0B
            java.lang.String r1 = "I9dScF5ijEM2hd"
            r0 = 6
            r2[r0] = r1
            if (r3 == r4) goto L68
            goto L63
        L79:
            r6 = 0
            goto L40
        L7b:
            long r1 = r8.A05
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 > 0) goto L83
            if (r7 == 0) goto L42
        L83:
            r8.A01 = r5
            goto L42
        L86:
            r7 = 0
            goto Ld
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5913XK.AEl(long, float):boolean");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final boolean AEo(long j, float f, boolean z) {
        long A0D = C5038Iz.A0D(j, f);
        long j2 = z ? this.A03 : this.A04;
        if (A0B[6].length() != 13) {
            A0B[6] = "eSzKm";
            return j2 <= 0 || A0D >= j2 || (!this.A09 && this.A07.A02() >= this.A00);
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4543Ab
    public final void onPrepared() {
        A04(false);
    }
}
