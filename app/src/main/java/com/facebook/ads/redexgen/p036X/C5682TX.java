package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.TX */
/* loaded from: assets/audience_network.dex */
public class C5682TX implements InterfaceC5201Lk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC5681TW A01;

    public C5682TX(AbstractC5681TW abstractC5681TW, int i) {
        this.A01 = abstractC5681TW;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    public final void AAN() {
        this.A01.A03 = false;
        this.A01.A0S();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5201Lk
    public final void ABy(float f) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f / this.A00)));
    }
}
