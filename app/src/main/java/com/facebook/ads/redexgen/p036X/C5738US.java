package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;

/* renamed from: com.facebook.ads.redexgen.X.US */
/* loaded from: assets/audience_network.dex */
public class C5738US implements InterfaceC5099K0 {
    public final /* synthetic */ MediaViewVideoRendererApi A00;
    public final /* synthetic */ C5733UN A01;

    public C5738US(C5733UN c5733un, MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        this.A01 = c5733un;
        this.A00 = mediaViewVideoRendererApi;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5099K0
    public final void AEa() {
        this.A00.setVolume(1.0f);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5099K0
    public final void AEd(NativeAd nativeAd) {
        this.A01.A0I(C5721UB.A0L(nativeAd.getInternalNativeAd()), new C5734UO(C5721UB.A0L(nativeAd.getInternalNativeAd())));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5099K0
    public final void AFI() {
        this.A01.A0D();
    }
}
