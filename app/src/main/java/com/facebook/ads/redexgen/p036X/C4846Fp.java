package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Fp */
/* loaded from: assets/audience_network.dex */
public class C4846Fp extends AbstractC6268d6 {
    public final /* synthetic */ C4839Fi A00;
    public final /* synthetic */ AbstractC6288dQ A01;
    public final /* synthetic */ C6277dF A02;
    public final /* synthetic */ boolean A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4846Fp(C4839Fi c4839Fi, boolean z, boolean z2, C6277dF c6277dF, AbstractC6288dQ abstractC6288dQ) {
        super(z);
        this.A00 = c4839Fi;
        this.A03 = z2;
        this.A02 = c6277dF;
        this.A01 = abstractC6288dQ;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6268d6
    public final void A00() {
        InterfaceC397114 interfaceC397114;
        interfaceC397114 = this.A00.A01;
        interfaceC397114.ACF(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6268d6
    public final void A01(boolean z) {
        C5953Xy c5953Xy;
        AtomicBoolean atomicBoolean;
        InterfaceC397114 interfaceC397114;
        C5953Xy c5953Xy2;
        c5953Xy = this.A00.A04;
        if (!C5064JR.A1D(c5953Xy) || !this.A03) {
            atomicBoolean = this.A00.A0C;
            atomicBoolean.set(true);
            interfaceC397114 = this.A00.A01;
            interfaceC397114.ACC(this.A01);
            return;
        }
        C4839Fi c4839Fi = this.A00;
        c5953Xy2 = c4839Fi.A04;
        c4839Fi.A07 = C5412PB.A01(c5953Xy2, this.A02, 0, new C6295dX(this));
    }
}
