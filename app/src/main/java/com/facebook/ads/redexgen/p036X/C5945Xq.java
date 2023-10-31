package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.Xq */
/* loaded from: assets/audience_network.dex */
public class C5945Xq extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5952Xx A00;

    public C5945Xq(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        for (C44408u event : C44398t.A02()) {
            C44398t.A0A(this.A00, event.A02(), event.A00(), event.A01(), false);
        }
        C44398t.A02().clear();
    }
}
