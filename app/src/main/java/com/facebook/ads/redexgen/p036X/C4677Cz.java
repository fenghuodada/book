package com.facebook.ads.redexgen.p036X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cz */
/* loaded from: assets/audience_network.dex */
public final class C4677Cz {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public boolean A04;
    public final byte[] A05 = new byte[10];

    public final void A00() {
        this.A04 = false;
    }

    public final void A01(InterfaceC4659Cd interfaceC4659Cd, int i, int i2) throws IOException, InterruptedException {
        if (!this.A04) {
            interfaceC4659Cd.AD7(this.A05, 0, 10);
            interfaceC4659Cd.AEB();
            if (C4578BA.A06(this.A05) == -1) {
                return;
            }
            this.A04 = true;
            this.A02 = 0;
        }
        if (this.A02 == 0) {
            this.A00 = i;
            this.A01 = 0;
        }
        this.A01 += i2;
    }

    public final void A02(C4676Cy c4676Cy) {
        if (this.A04 && this.A02 > 0) {
            c4676Cy.A0W.AEH(this.A03, this.A00, this.A01, 0, c4676Cy.A0V);
            this.A02 = 0;
        }
    }

    public final void A03(C4676Cy c4676Cy, long j) {
        if (!this.A04) {
            return;
        }
        int i = this.A02;
        this.A02 = i + 1;
        if (i == 0) {
            this.A03 = j;
        }
        if (this.A02 < 16) {
            return;
        }
        c4676Cy.A0W.AEH(this.A03, this.A00, this.A01, 0, c4676Cy.A0V);
        this.A02 = 0;
    }
}
