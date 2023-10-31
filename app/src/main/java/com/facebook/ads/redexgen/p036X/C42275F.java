package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import com.facebook.ads.internal.api.BidderTokenProviderApi;

/* renamed from: com.facebook.ads.redexgen.X.5F */
/* loaded from: assets/audience_network.dex */
public final class C42275F implements BidderTokenProviderApi {
    public final C428067 A00 = new C428067();

    public final C428067 A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.BidderTokenProviderApi
    public final String getBidderToken(Context context) {
        return this.A00.A06(C42285G.A07(context));
    }
}
