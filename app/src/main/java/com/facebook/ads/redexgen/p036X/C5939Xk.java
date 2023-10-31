package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* renamed from: com.facebook.ads.redexgen.X.Xk */
/* loaded from: assets/audience_network.dex */
public class C5939Xk extends AbstractRunnableC5165L8 {
    public final /* synthetic */ C5952Xx A00;

    public C5939Xk(C5952Xx c5952Xx) {
        this.A00 = c5952Xx;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
        if (dynamicLoader != null) {
            dynamicLoader.createBidderTokenProviderApi().getBidderToken(this.A00);
        }
    }
}
