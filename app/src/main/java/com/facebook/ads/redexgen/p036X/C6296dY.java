package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.dY */
/* loaded from: assets/audience_network.dex */
public class C6296dY implements InterfaceC42535f {
    public final /* synthetic */ C4839Fi A00;
    public final /* synthetic */ boolean A01;

    public C6296dY(C4839Fi c4839Fi, boolean z) {
        this.A00 = c4839Fi;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA1() {
        C5953Xy c5953Xy;
        AtomicBoolean atomicBoolean;
        InterfaceC397114 interfaceC397114;
        C5953Xy c5953Xy2;
        AbstractC397518 abstractC397518;
        c5953Xy = this.A00.A04;
        if (!C5064JR.A1D(c5953Xy) || !this.A01) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC397114 = this.A00.A01;
            interfaceC397114.ACC(this.A00);
            return;
        }
        C4839Fi c4839Fi = this.A00;
        c5953Xy2 = c4839Fi.A04;
        abstractC397518 = this.A00.A03;
        c4839Fi.A07 = C5412PB.A01(c5953Xy2, (C6277dF) abstractC397518, 0, new C6297dZ(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC42535f
    public final void AA2() {
        InterfaceC397114 interfaceC397114;
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACF(this.A00, AdError.CACHE_ERROR);
    }
}
