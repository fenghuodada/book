package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Dp */
/* loaded from: assets/audience_network.dex */
public final class C4726Dp {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC4719Di A05;
    public final C5021Ii A06 = new C5021Ii(new byte[64]);
    public final C5034Iv A07;

    public C4726Dp(InterfaceC4719Di interfaceC4719Di, C5034Iv c5034Iv) {
        this.A05 = interfaceC4719Di;
        this.A07 = c5034Iv;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            this.A06.A08(1);
            long A04 = (this.A06.A04(3) << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15);
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((this.A06.A04(3) << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            long pts = this.A07.A07(A04);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEK();
    }

    public final void A03(C5022Ij c5022Ij) throws C4547Af {
        c5022Ij.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c5022Ij.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.AD4(this.A01, true);
        this.A05.A48(c5022Ij);
        this.A05.AD3();
    }
}
