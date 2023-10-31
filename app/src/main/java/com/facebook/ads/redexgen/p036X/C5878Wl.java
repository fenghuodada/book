package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wl */
/* loaded from: assets/audience_network.dex */
public final class C5878Wl implements InterfaceC4658Cc {
    public static byte[] A0F;
    public static String[] A0G = {"F9KwQMNMxiTjkayDhPM6gvDLkPvUNcLn", "Em4FZTw9NeUBCVsnasMEsqdbQrmSbGq", "", "tDq5h6G1X4d5RY1LfaFLZXWqT85DrCya", "B5R7X", "Y", "Zp00UWtElOmikRSXEs37FpNUTZ5eWL9Y", "wqRNyyxlEoRi9"};
    public static final InterfaceC4661Cf A0H;
    public static final int A0I;
    public int A00;
    public int A02;
    public int A03;
    public long A05;
    public InterfaceC4660Ce A06;
    public C5880Wn A07;
    public C5875Wi A08;
    public boolean A09;
    public final C5022Ij A0C = new C5022Ij(4);
    public final C5022Ij A0B = new C5022Ij(9);
    public final C5022Ij A0E = new C5022Ij(11);
    public final C5022Ij A0D = new C5022Ij();
    public final C5877Wk A0A = new C5877Wk();
    public int A01 = 1;
    public long A04 = -9223372036854775807L;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 60);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0F = new byte[]{-117, -111, -101};
    }

    static {
        A03();
        A0H = new C5879Wm();
        A0I = C5038Iz.A08(A01(0, 3, 9));
    }

    private C5022Ij A00(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        if (this.A02 > this.A0D.A05()) {
            C5022Ij c5022Ij = this.A0D;
            c5022Ij.A0b(new byte[Math.max(c5022Ij.A05() * 2, this.A02)], 0);
        } else {
            this.A0D.A0Y(0);
        }
        this.A0D.A0X(this.A02);
        interfaceC4659Cd.readFully(this.A0D.A00, 0, this.A02);
        return this.A0D;
    }

    private void A02() {
        if (!this.A09) {
            this.A06.AEM(new C5883Wq(-9223372036854775807L));
            this.A09 = true;
        }
        if (this.A04 != -9223372036854775807L) {
            return;
        }
        this.A04 = this.A0A.A0D() == -9223372036854775807L ? -this.A05 : 0L;
    }

    private void A04(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        interfaceC4659Cd.AEt(this.A00);
        this.A00 = 0;
        this.A01 = 3;
    }

    private boolean A05(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        if (interfaceC4659Cd.ADc(this.A0B.A00, 0, 9, true)) {
            C5022Ij c5022Ij = this.A0B;
            if (A0G[4].length() != 15) {
                String[] strArr = A0G;
                strArr[3] = "xxv79KM5VyarLmUhQqEOMlbbyGFtPWOG";
                strArr[6] = "n0W8PrJEyrqWl4lCbLWkK9bcjvpbO2Fn";
                c5022Ij.A0Y(0);
                this.A0B.A0Z(4);
                int A0E = this.A0B.A0E();
                boolean z = (A0E & 4) != 0;
                boolean hasAudio = (A0E & 1) != 0;
                if (z && this.A07 == null) {
                    this.A07 = new C5880Wn(this.A06.AFD(8, 1));
                }
                if (hasAudio && this.A08 == null) {
                    this.A08 = new C5875Wi(this.A06.AFD(9, 2));
                }
                this.A06.A5D();
                this.A00 = (this.A0B.A08() - 9) + 4;
                this.A01 = 2;
                return true;
            }
            throw new RuntimeException();
        }
        return false;
    }

    private boolean A06(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        boolean z = true;
        if (this.A03 == 8 && this.A07 != null) {
            A02();
            this.A07.A00(A00(interfaceC4659Cd), this.A04 + this.A05);
        } else if (this.A03 == 9 && this.A08 != null) {
            A02();
            this.A08.A00(A00(interfaceC4659Cd), this.A04 + this.A05);
        } else if (this.A03 == 18 && !this.A09) {
            this.A0A.A00(A00(interfaceC4659Cd), this.A05);
            long A0D = this.A0A.A0D();
            if (A0D != -9223372036854775807L) {
                this.A06.AEM(new C5883Wq(A0D));
                this.A09 = true;
            }
        } else {
            int i = this.A02;
            if (A0G[4].length() == 15) {
                throw new RuntimeException();
            }
            A0G[0] = "mShHrd4Vu2jNkvRJUK8UrhhXjzgbGKl1";
            interfaceC4659Cd.AEt(i);
            z = false;
        }
        this.A00 = 4;
        this.A01 = 2;
        return z;
    }

    private boolean A07(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        if (interfaceC4659Cd.ADc(this.A0E.A00, 0, 11, true)) {
            this.A0E.A0Y(0);
            this.A03 = this.A0E.A0E();
            this.A02 = this.A0E.A0G();
            this.A05 = this.A0E.A0G();
            this.A05 = ((this.A0E.A0E() << 24) | this.A05) * 1000;
            this.A0E.A0Z(3);
            this.A01 = 4;
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A06 = interfaceC4660Ce;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        while (true) {
            int i = this.A01;
            if (i != 1) {
                if (i == 2) {
                    A04(interfaceC4659Cd);
                } else if (A0G[4].length() == 15) {
                    throw new RuntimeException();
                } else {
                    A0G[4] = "ncW0XwKX3pgCRaaT";
                    if (i != 3) {
                        if (i == 4) {
                            if (A06(interfaceC4659Cd)) {
                                if (A0G[0].charAt(18) != 'j') {
                                    A0G[7] = "5";
                                    return 0;
                                }
                                A0G[7] = "DR5iBP2XCUKx659t";
                                return 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else if (!A07(interfaceC4659Cd)) {
                        return -1;
                    }
                }
            } else if (!A05(interfaceC4659Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        this.A01 = 1;
        this.A04 = -9223372036854775807L;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        interfaceC4659Cd.AD7(this.A0C.A00, 0, 3);
        this.A0C.A0Y(0);
        if (this.A0C.A0G() != A0I) {
            return false;
        }
        interfaceC4659Cd.AD7(this.A0C.A00, 0, 2);
        this.A0C.A0Y(0);
        if ((this.A0C.A0I() & 250) != 0) {
            return false;
        }
        interfaceC4659Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        int A08 = this.A0C.A08();
        interfaceC4659Cd.AEB();
        interfaceC4659Cd.A3K(A08);
        interfaceC4659Cd.AD7(this.A0C.A00, 0, 4);
        this.A0C.A0Y(0);
        return this.A0C.A08() == 0;
    }
}
