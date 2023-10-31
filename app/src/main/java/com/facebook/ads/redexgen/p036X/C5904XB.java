package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XB */
/* loaded from: assets/audience_network.dex */
public class C5904XB implements InterfaceC4611Bh {
    public final C5898X5 A00 = new C5898X5();
    public final C5897X4 A01 = new C5897X4();
    public final InterfaceC4589BL[] A02;

    public C5904XB(InterfaceC4589BL... interfaceC4589BLArr) {
        this.A02 = (InterfaceC4589BL[]) Arrays.copyOf(interfaceC4589BLArr, interfaceC4589BLArr.length + 2);
        InterfaceC4589BL[] interfaceC4589BLArr2 = this.A02;
        interfaceC4589BLArr2[interfaceC4589BLArr.length] = this.A00;
        interfaceC4589BLArr2[interfaceC4589BLArr.length + 1] = this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4611Bh
    public final C4549Ah A3Q(C4549Ah c4549Ah) {
        this.A00.A0B(c4549Ah.A02);
        return new C4549Ah(this.A01.A01(c4549Ah.A01), this.A01.A00(c4549Ah.A00), c4549Ah.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4611Bh
    public final InterfaceC4589BL[] A5l() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4611Bh
    public final long A6y(long j) {
        return this.A01.A02(j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4611Bh
    public final long A7V() {
        return this.A00.A0A();
    }
}
