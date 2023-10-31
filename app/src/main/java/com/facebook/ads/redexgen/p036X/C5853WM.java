package com.facebook.ads.redexgen.p036X;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WM */
/* loaded from: assets/audience_network.dex */
public final class C5853WM implements InterfaceC4658Cc {
    public static byte[] A03;
    public static final InterfaceC4661Cf A04;
    public InterfaceC4660Ce A00;
    public AbstractC4709DY A01;
    public boolean A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{95, 120, 112, 117, 124, 125, 57, 109, 118, 57, 125, 124, 109, 124, 107, 116, 112, 119, 124, 57, 123, 112, 109, 106, 109, 107, 124, 120, 116, 57, 109, 96, 105, 124};
    }

    static {
        A02();
        A04 = new C5854WN();
    }

    public static C5022Ij A00(C5022Ij c5022Ij) {
        c5022Ij.A0Y(0);
        return c5022Ij;
    }

    private boolean A03(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        C4705DU c4705du = new C4705DU();
        if (c4705du.A03(interfaceC4659Cd, true) && (c4705du.A04 & 2) == 2) {
            int length = Math.min(c4705du.A00, 8);
            C5022Ij c5022Ij = new C5022Ij(length);
            interfaceC4659Cd.AD7(c5022Ij.A00, 0, length);
            C5022Ij scratch = A00(c5022Ij);
            if (C5855WO.A04(scratch)) {
                this.A01 = new C5855WO();
            } else {
                C5022Ij scratch2 = A00(c5022Ij);
                if (C5850WJ.A06(scratch2)) {
                    this.A01 = new C5850WJ();
                } else {
                    C5022Ij scratch3 = A00(c5022Ij);
                    if (!C5852WL.A04(scratch3)) {
                        return false;
                    }
                    this.A01 = new C5852WL();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A00 = interfaceC4660Ce;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        if (this.A01 == null) {
            if (A03(interfaceC4659Cd)) {
                interfaceC4659Cd.AEB();
            } else {
                throw new C4547Af(A01(0, 34, 107));
            }
        }
        if (!this.A02) {
            InterfaceC4670Co AFD = this.A00.AFD(0, 1);
            this.A00.A5D();
            this.A01.A06(this.A00, AFD);
            this.A02 = true;
        }
        return this.A01.A02(interfaceC4659Cd, c4665Cj);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        AbstractC4709DY abstractC4709DY = this.A01;
        if (abstractC4709DY != null) {
            abstractC4709DY.A05(j, j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        try {
            return A03(interfaceC4659Cd);
        } catch (C4547Af unused) {
            return false;
        }
    }
}
