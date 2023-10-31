package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdView;

/* renamed from: com.facebook.ads.redexgen.X.Ju */
/* loaded from: assets/audience_network.dex */
public final class C5093Ju implements AdView.AdViewLoadConfigBuilder, AdView.AdViewLoadConfig {
    @Nullable
    public String A00;
    public final C421654 A01;

    public C5093Ju(C421654 c421654) {
        this.A01 = c421654;
    }

    @Nullable
    public final String A00() {
        return this.A00;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfig build() {
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withAdListener(AdListener adListener) {
        this.A01.A0C(adListener);
        return this;
    }

    @Override // com.facebook.ads.AdView.AdViewLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final AdView.AdViewLoadConfigBuilder withBid(String str) {
        this.A00 = str;
        return this;
    }
}
