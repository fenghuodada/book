package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.W0 */
/* loaded from: assets/audience_network.dex */
public final class C5831W0 implements InterfaceC4734Dx {
    public static String[] A06 = {"kFQyFzcAtW9h", "T9w", "fQaNjl3SJX3d9bVQ", "oZJ95vdSt2TTHBWCj0JXn5a7ndpZ8Bju", "u9yp8kydrxa7", "6VdIrZzllDHdfU7GHzHok5zrzcn9yZKG", "C5", "TRfT7Vv0"};
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final InterfaceC4727Dq A04;
    public final C5022Ij A05 = new C5022Ij(32);

    public C5831W0(InterfaceC4727Dq interfaceC4727Dq) {
        this.A04 = interfaceC4727Dq;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4734Dx
    public final void A49(C5022Ij c5022Ij, boolean z) {
        int i = -1;
        if (z) {
            i = c5022Ij.A06() + c5022Ij.A0E();
        }
        boolean z2 = this.A03;
        if (A06[1].length() == 27) {
            throw new RuntimeException();
        }
        A06[7] = "Nc9T8xtu";
        if (z2) {
            if (!z) {
                return;
            }
            this.A03 = false;
            c5022Ij.A0Y(i);
            this.A00 = 0;
        }
        while (c5022Ij.A04() > 0) {
            int i2 = this.A00;
            if (i2 < 3) {
                if (i2 == 0) {
                    int A0E = c5022Ij.A0E();
                    c5022Ij.A0Y(c5022Ij.A06() - 1);
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[2] = "aJNwIS78aN3JetqFlJ8G";
                    if (A0E == 255) {
                        this.A03 = true;
                        return;
                    }
                }
                int min = Math.min(c5022Ij.A04(), 3 - this.A00);
                c5022Ij.A0c(this.A05.A00, this.A00, min);
                this.A00 += min;
                if (this.A00 == 3) {
                    this.A05.A0W(3);
                    this.A05.A0Z(1);
                    int A0E2 = this.A05.A0E();
                    int A0E3 = this.A05.A0E();
                    this.A02 = (A0E2 & 128) != 0;
                    this.A01 = (((A0E2 & 15) << 8) | A0E3) + 3;
                    if (this.A05.A05() < this.A01) {
                        byte[] bytes = this.A05.A00;
                        this.A05.A0W(Math.min(4098, Math.max(this.A01, bytes.length * 2)));
                        System.arraycopy(bytes, 0, this.A05.A00, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(c5022Ij.A04(), this.A01 - this.A00);
                c5022Ij.A0c(this.A05.A00, this.A00, min2);
                this.A00 += min2;
                int i3 = this.A00;
                int i4 = this.A01;
                if (i3 == i4) {
                    boolean z3 = this.A02;
                    if (A06[7].length() != 8) {
                        throw new RuntimeException();
                    }
                    A06[1] = "WscUDiyP9zB";
                    if (z3) {
                        if (C5038Iz.A09(this.A05.A00, 0, this.A01, -1) != 0) {
                            this.A03 = true;
                            return;
                        }
                        this.A05.A0W(this.A01 - 4);
                    } else {
                        C5022Ij c5022Ij2 = this.A05;
                        if (A06[2].length() != 29) {
                            String[] strArr = A06;
                            strArr[3] = "nNiCCranccCPI0NRpeExr6ylwZyZykwG";
                            strArr[5] = "pfAdcnCCuWORkUPhfNuwqkYYK2fT2IOL";
                            c5022Ij2.A0W(i4);
                        } else {
                            A06[2] = "0kjAgxStX";
                            c5022Ij2.A0W(i4);
                        }
                    }
                    this.A04.A48(this.A05);
                    this.A00 = 0;
                } else {
                    continue;
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4734Dx
    public final void A8K(C5034Iv c5034Iv, InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        this.A04.A8K(c5034Iv, interfaceC4660Ce, c4733Dw);
        this.A03 = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4734Dx
    public final void AEK() {
        this.A03 = true;
    }
}
