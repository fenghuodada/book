package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.VU */
/* loaded from: assets/audience_network.dex */
public final class C5802VU extends AbstractC4569B1 {
    public static String[] A09 = {"LiVpibqpJatuLGaZNpcVvLbqNHldnUzA", "bX5xO856XIcJE12GDRsOqh2", "ZVG", "hIvfEeguXT", "OzXlbx4H0xP2XpsF07euT", "fU7LOfxMrEgavyMWFPaWlv5y0089z6Uh", "tbzCzUNP5mUbYRUDq8rztMXXiQr3Ary2", "G8Ws4pPS3koy2aZpOP3X3qbhHPqHsp6i"};
    public static final Object A0A = new Object();
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    @Nullable
    public final Object A06;
    public final boolean A07;
    public final boolean A08;

    public C5802VU(long j, long j2, long j3, long j4, long j5, long j6, boolean z, boolean z2, @Nullable Object obj) {
        this.A01 = j;
        this.A05 = j2;
        this.A00 = j3;
        this.A03 = j4;
        this.A04 = j5;
        this.A02 = j6;
        this.A08 = z;
        this.A07 = z2;
        this.A06 = obj;
    }

    public C5802VU(long j, long j2, long j3, long j4, boolean z, boolean z2, @Nullable Object obj) {
        this(-9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, obj);
    }

    public C5802VU(long j, boolean z, boolean z2, @Nullable Object obj) {
        this(j, j, 0L, 0L, z, z2, obj);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4569B1
    public final int A00() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4569B1
    public final int A01() {
        return 1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4569B1
    public final int A04(Object obj) {
        return A0A.equals(obj) ? 0 : -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4569B1
    public final C4567Az A0A(int i, C4567Az c4567Az, boolean z) {
        C4997IK.A00(i, 0, 1);
        return c4567Az.A0B(null, z ? A0A : null, 0, this.A00, -this.A04);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r13 > r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (r13 > r2) goto L17;
     */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC4569B1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p036X.C4568B0 A0D(int r22, com.facebook.ads.redexgen.p036X.C4568B0 r23, boolean r24, long r25) {
        /*
            r21 = this;
            r0 = r21
            r2 = 0
            r1 = 1
            r3 = r22
            com.facebook.ads.redexgen.p036X.C4997IK.A00(r3, r2, r1)
            if (r24 == 0) goto L81
            java.lang.Object r6 = r0.A06
        Ld:
            long r13 = r0.A02
            boolean r4 = r0.A07
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5802VU.A09
            r1 = 1
            r1 = r2[r1]
            int r2 = r1.length()
            r1 = 20
            if (r2 == r1) goto L83
            java.lang.String[] r3 = com.facebook.ads.redexgen.p036X.C5802VU.A09
            java.lang.String r2 = "fKWrusBplbW"
            r1 = 1
            r3[r1] = r2
            if (r4 == 0) goto L3d
            r2 = 0
            int r1 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            if (r1 == 0) goto L3d
            long r2 = r0.A03
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L57
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L3d:
            long r7 = r0.A01
            long r9 = r0.A05
            boolean r11 = r0.A08
            boolean r12 = r0.A07
            long r2 = r0.A03
            r17 = 0
            r18 = 0
            long r0 = r0.A04
            r5 = r23
            r15 = r2
            r19 = r0
            com.facebook.ads.redexgen.X.B0 r0 = r5.A04(r6, r7, r9, r11, r12, r13, r15, r17, r18, r19)
            return r0
        L57:
            long r13 = r13 + r25
            java.lang.String[] r4 = com.facebook.ads.redexgen.p036X.C5802VU.A09
            r1 = 3
            r1 = r4[r1]
            int r4 = r1.length()
            r1 = 10
            if (r4 == r1) goto L70
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3d
        L6a:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L3d
        L70:
            java.lang.String[] r5 = com.facebook.ads.redexgen.p036X.C5802VU.A09
            java.lang.String r4 = "wVi"
            r1 = 2
            r5[r1] = r4
            java.lang.String r4 = "2OdzkdLKms985VAdE1FhN"
            r1 = 4
            r5[r1] = r4
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3d
            goto L6a
        L81:
            r6 = 0
            goto Ld
        L83:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5802VU.A0D(int, com.facebook.ads.redexgen.X.B0, boolean, long):com.facebook.ads.redexgen.X.B0");
    }
}
