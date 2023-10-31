package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.MediaViewVideoRenderer;

/* renamed from: com.facebook.ads.redexgen.X.F2 */
/* loaded from: assets/audience_network.dex */
public class C4797F2 extends AbstractC5200Lj {
    public final /* synthetic */ C42335L A00;

    public C4797F2(C42335L c42335l) {
        this.A00 = c42335l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
    /* renamed from: A00 */
    public final void A03(C5215Ly c5215Ly) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            C5721UB.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
