package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wh */
/* loaded from: assets/audience_network.dex */
public final class C5874Wh implements InterfaceC4674Cu {
    public static byte[] A07;
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC4675Cw A03;
    public final byte[] A06 = new byte[8];
    public final ArrayDeque<C4673Ct> A05 = new ArrayDeque<>();
    public final C4679D1 A04 = new C4679D1();

    static {
        A05();
    }

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A07 = new byte[]{101, -118, -110, 125, -120, -123, Byte.MIN_VALUE, 60, -127, -120, -127, -119, -127, -118, -112, 60, -112, -107, -116, -127, 60, -73, -36, -28, -49, -38, -41, -46, -114, -44, -38, -35, -49, -30, -114, -31, -41, -24, -45, -88, -114, -95, -58, -50, -71, -60, -63, -68, 120, -63, -58, -52, -67, -65, -67, -54, 120, -53, -63, -46, -67, -110, 120, -64, -31, -33, -42, -37, -44, -115, -46, -39, -46, -38, -46, -37, -31, -115, -32, -42, -25, -46, -89, -115};
    }

    private double A00(InterfaceC4659Cd interfaceC4659Cd, int i) throws IOException, InterruptedException {
        long A02 = A02(interfaceC4659Cd, i);
        if (i == 4) {
            return Float.intBitsToFloat((int) A02);
        }
        return Double.longBitsToDouble(A02);
    }

    private long A01(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        interfaceC4659Cd.AEB();
        while (true) {
            interfaceC4659Cd.AD7(this.A06, 0, 4);
            int A00 = C4679D1.A00(this.A06[0]);
            if (A00 != -1 && A00 <= 4) {
                int A01 = (int) C4679D1.A01(this.A06, A00, false);
                if (this.A03.A8X(A01)) {
                    interfaceC4659Cd.AEt(A00);
                    return A01;
                }
            }
            interfaceC4659Cd.AEt(1);
        }
    }

    private long A02(InterfaceC4659Cd interfaceC4659Cd, int i) throws IOException, InterruptedException {
        interfaceC4659Cd.readFully(this.A06, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.A06[i2] & 255);
        }
        return j;
    }

    private String A04(InterfaceC4659Cd interfaceC4659Cd, int trimmedLength) throws IOException, InterruptedException {
        if (trimmedLength == 0) {
            return A03(0, 0, 34);
        }
        byte[] bArr = new byte[trimmedLength];
        interfaceC4659Cd.readFully(bArr, 0, trimmedLength);
        while (trimmedLength > 0 && bArr[trimmedLength - 1] == 0) {
            trimmedLength--;
        }
        return new String(bArr, 0, trimmedLength);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4674Cu
    public final void A8J(InterfaceC4675Cw interfaceC4675Cw) {
        this.A03 = interfaceC4675Cw;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4674Cu
    public final boolean ADZ(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        long j;
        int i;
        C4997IK.A04(this.A03 != null);
        while (true) {
            if (!this.A05.isEmpty()) {
                long A7F = interfaceC4659Cd.A7F();
                j = this.A05.peek().A01;
                if (A7F >= j) {
                    InterfaceC4675Cw interfaceC4675Cw = this.A03;
                    i = this.A05.pop().A00;
                    interfaceC4675Cw.A5C(i);
                    return true;
                }
            }
            if (this.A01 == 0) {
                long A05 = this.A04.A05(interfaceC4659Cd, true, false, 4);
                if (A05 == -2) {
                    A05 = A01(interfaceC4659Cd);
                }
                if (A05 == -1) {
                    return false;
                }
                this.A00 = (int) A05;
                this.A01 = 1;
            }
            if (this.A01 == 1) {
                this.A02 = this.A04.A05(interfaceC4659Cd, false, true, 8);
                this.A01 = 2;
            }
            int A6T = this.A03.A6T(this.A00);
            if (A6T != 0) {
                if (A6T == 1) {
                    long A7F2 = interfaceC4659Cd.A7F();
                    this.A05.push(new C4673Ct(this.A00, A7F2 + this.A02));
                    this.A03.AEy(this.A00, A7F2, this.A02);
                    this.A01 = 0;
                    return true;
                } else if (A6T == 2) {
                    long j2 = this.A02;
                    if (j2 <= 8) {
                        this.A03.A8L(this.A00, A02(interfaceC4659Cd, (int) j2));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C4547Af(A03(41, 22, 60) + this.A02);
                } else if (A6T == 3) {
                    long j3 = this.A02;
                    if (j3 <= 2147483647L) {
                        this.A03.AF6(this.A00, A04(interfaceC4659Cd, (int) j3));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C4547Af(A03(63, 21, 81) + this.A02);
                } else if (A6T == 4) {
                    this.A03.A3r(this.A00, (int) this.A02, interfaceC4659Cd);
                    this.A01 = 0;
                    return true;
                } else if (A6T == 5) {
                    long j4 = this.A02;
                    if (j4 == 4 || j4 == 8) {
                        this.A03.A5R(this.A00, A00(interfaceC4659Cd, (int) this.A02));
                        this.A01 = 0;
                        return true;
                    }
                    throw new C4547Af(A03(21, 20, 82) + this.A02);
                } else {
                    throw new C4547Af(A03(0, 21, 0) + A6T);
                }
            }
            interfaceC4659Cd.AEt((int) this.A02);
            this.A01 = 0;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4674Cu
    public final void reset() {
        this.A01 = 0;
        this.A05.clear();
        this.A04.A06();
    }
}
