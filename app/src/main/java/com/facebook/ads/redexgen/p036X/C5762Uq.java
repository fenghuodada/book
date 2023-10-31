package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uq */
/* loaded from: assets/audience_network.dex */
public final class C5762Uq implements InterfaceC4955He {
    public static byte[] A0L;
    public static String[] A0M = {"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC4955He A07;
    public C4985I8 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC4955He A0D;
    public final InterfaceC4955He A0E;
    public final InterfaceC4955He A0F;
    public final InterfaceC4981I4 A0G;
    @Nullable
    public final InterfaceC4983I6 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "0DeGlGnSrcDo9YH";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 36);
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{28, 29, 48, 18, 16, 27, 22, 23, 49, 10, 7, 22, 0, 33, 22, 18, 23};
    }

    static {
        A06();
    }

    public C5762Uq(InterfaceC4981I4 interfaceC4981I4, InterfaceC4955He interfaceC4955He, InterfaceC4955He interfaceC4955He2, @Nullable InterfaceC4953Hc interfaceC4953Hc, int i, @Nullable InterfaceC4983I6 interfaceC4983I6) {
        this.A0G = interfaceC4981I4;
        this.A0D = interfaceC4955He2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC4955He;
        if (interfaceC4953Hc != null) {
            this.A0E = new C5765Ut(interfaceC4955He, interfaceC4953Hc);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC4983I6;
    }

    private int A00(C4959Hi c4959Hi) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c4959Hi.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC4981I4 interfaceC4981I4, String str, Uri uri) {
        InterfaceC4991IE contentMetadata = interfaceC4981I4.A69(str);
        Uri A01 = C4992IF.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.I8, com.facebook.ads.redexgen.X.He] */
    private void A03() throws IOException {
        InterfaceC4955He interfaceC4955He = this.A07;
        if (interfaceC4955He == null) {
            return;
        }
        try {
            interfaceC4955He.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            C4985I8 c4985i8 = this.A08;
            if (c4985i8 != null) {
                this.A0G.ADq(c4985i8);
                this.A08 = null;
            }
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5v();
            throw new NullPointerException(A02(0, 17, 87));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEW(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof C4979I2)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01b9, code lost:
        if (r4 != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bb, code lost:
        r2 = java.lang.Math.min(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d0, code lost:
        if (r4 != (-1)) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(boolean r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5762Uq.A08(boolean):void");
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0D(java.io.IOException r3) {
        /*
        L0:
            if (r3 == 0) goto L14
            boolean r0 = r3 instanceof com.facebook.ads.redexgen.p036X.C4956Hf
            if (r0 == 0) goto Lf
            r0 = r3
            com.facebook.ads.redexgen.X.Hf r0 = (com.facebook.ads.redexgen.p036X.C4956Hf) r0
            int r0 = r0.A00
            if (r0 != 0) goto Lf
            r0 = 1
            return r0
        Lf:
            java.lang.Throwable r3 = r3.getCause()
            goto L0
        L14:
            r3 = 0
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C5762Uq.A0M
            r0 = 5
            r1 = r1[r0]
            r0 = 13
            char r1 = r1.charAt(r0)
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L2a
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L2a:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C5762Uq.A0M
            java.lang.String r1 = "Fi50x9pU4R4a4ch"
            r0 = 1
            r2[r0] = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5762Uq.A0D(java.io.IOException):boolean");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final Uri A7k() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final long ACw(C4959Hi c4959Hi) throws IOException {
        try {
            this.A09 = C4987IA.A02(c4959Hi);
            this.A06 = c4959Hi.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c4959Hi.A00;
            this.A03 = c4959Hi.A03;
            this.A0B = A00(c4959Hi) != -1;
            boolean z = this.A0B;
            if (c4959Hi.A02 != -1 || this.A0B) {
                this.A01 = c4959Hi.A02;
            } else {
                this.A01 = this.A0G.A68(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c4959Hi.A03;
                    if (this.A01 <= 0) {
                        throw new C4956Hf(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4955He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            int i3 = (this.A03 > this.A02 ? 1 : (this.A03 == this.A02 ? 0 : -1));
            String[] strArr = A0M;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (i3 >= 0) {
                A08(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A0A()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
