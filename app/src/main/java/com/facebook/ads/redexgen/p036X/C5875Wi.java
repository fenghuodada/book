package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wi */
/* loaded from: assets/audience_network.dex */
public final class C5875Wi extends AbstractC4671Cq {
    public static byte[] A05;
    public static String[] A06 = {"HrBrUDmtAiHhEIFi", "ovhYl7NWEd171z8PJdmzSHTS5BmNRwGh", "O04BUWOaHdfjopELTyPlWCM73tUUR1GH", "jF3DEBpuUmaMt5XqjGdbc3EKLhdJIOP", "6wGSczOuIh6bVbI0f7FgwzIt", "67fT6B3p0kUWiMxqOkjfZNmnVryLDGGV", "w97Hra0FQmNyyw573", "JpIXAL9FgQ2FQzjAVAZn2BwWekNoW7nE"};
    public int A00;
    public int A01;
    public boolean A02;
    public final C5022Ij A03;
    public final C5022Ij A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{1, 62, 51, 50, 56, 119, 49, 56, 37, 58, 54, 35, 119, 57, 56, 35, 119, 36, 34, 39, 39, 56, 37, 35, 50, 51, 109, 119, 91, 68, 73, 72, 66, 2, 76, 91, 78};
    }

    static {
        A01();
    }

    public C5875Wi(InterfaceC4670Co interfaceC4670Co) {
        super(interfaceC4670Co);
        this.A04 = new C5022Ij(C5018If.A03);
        this.A03 = new C5022Ij(4);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4671Cq
    public final void A0B(C5022Ij c5022Ij, long j) throws C4547Af {
        int A0E = c5022Ij.A0E();
        long A09 = j + (c5022Ij.A09() * 1000);
        if (A0E == 0 && !this.A02) {
            C5022Ij videoSequence = new C5022Ij(new byte[c5022Ij.A04()]);
            c5022Ij.A0c(videoSequence.A00, 0, c5022Ij.A04());
            C5040J1 A00 = C5040J1.A00(videoSequence);
            this.A01 = A00.A02;
            super.A00.A5V(Format.A03(null, A00(28, 9, 114), null, -1, -1, A00.A03, A00.A01, -1.0f, A00.A04, -1, A00.A00, null));
            this.A02 = true;
        } else if (A0E != 1 || !this.A02) {
        } else {
            byte[] bArr = this.A03.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i = 4 - this.A01;
            int i2 = 0;
            while (c5022Ij.A04() > 0) {
                c5022Ij.A0c(this.A03.A00, i, this.A01);
                this.A03.A0Y(0);
                int A0H = this.A03.A0H();
                this.A04.A0Y(0);
                super.A00.AEG(this.A04, 4);
                super.A00.AEG(c5022Ij, A0H);
                i2 = i2 + 4 + A0H;
            }
            InterfaceC4670Co interfaceC4670Co = super.A00;
            int i3 = this.A00 != 1 ? 0 : 1;
            if (A06[6].length() == 3) {
                throw new RuntimeException();
            }
            String[] strArr = A06;
            strArr[1] = "SxoTsTEtYbkIpzmogJvkXCUruqqJ7knT";
            strArr[7] = "DX7TKSEUbLiNIzjv4P1HkLtMAUktYoJf";
            interfaceC4670Co.AEH(A09, i3, i2, 0, null);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC4671Cq
    public final boolean A0C(C5022Ij c5022Ij) throws C5876Wj {
        int A0E = c5022Ij.A0E();
        int i = (A0E >> 4) & 15;
        int i2 = A0E & 15;
        if (i2 == 7) {
            this.A00 = i;
            return i != 5;
        }
        throw new C5876Wj(A00(0, 28, 8) + i2);
    }
}
