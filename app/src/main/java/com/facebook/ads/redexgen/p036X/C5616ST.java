package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.ST */
/* loaded from: assets/audience_network.dex */
public class C5616ST implements InterfaceC5201Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC5165L8 A01;
    public final /* synthetic */ AbstractC5613SQ A02;

    public C5616ST(AbstractC5613SQ abstractC5613SQ, int i, AbstractRunnableC5165L8 abstractRunnableC5165L8) {
        this.A02 = abstractC5613SQ;
        this.A00 = i;
        this.A01 = abstractRunnableC5165L8;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    public final void AAN() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    public final void ABy(float f) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
