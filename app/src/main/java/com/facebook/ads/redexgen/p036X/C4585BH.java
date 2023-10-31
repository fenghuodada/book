package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.BH */
/* loaded from: assets/audience_network.dex */
public final class C4585BH implements InterfaceC5720UA {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C4585BH(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5094Jv
    public final void A9s() {
        C5157Kz.A00(new C5716U6(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5094Jv
    public final void A9w() {
        C5157Kz.A00(new C5717U7(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5094Jv
    public final void AAi(C5115KH c5115kh) {
        C5157Kz.A00(new C5719U9(this, c5115kh));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5094Jv
    public final void ABO() {
        C5157Kz.A00(new C5715U5(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5720UA
    public final void ABT() {
        C5157Kz.A00(new C5718U8(this));
    }
}
