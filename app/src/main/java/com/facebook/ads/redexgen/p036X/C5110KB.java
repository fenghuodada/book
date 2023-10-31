package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.KB */
/* loaded from: assets/audience_network.dex */
public final class C5110KB implements NativeAdBase.NativeAdLoadConfigBuilder, NativeAdBase.NativeLoadAdConfig {
    @Nullable
    public NativeAdBase.MediaCacheFlag A02;
    @Nullable
    public String A03;
    public boolean A04;
    public final NativeAdBase A05;
    public final C5721UB A06;
    public int A01 = -1;
    public int A00 = -1;

    public C5110KB(C5721UB c5721ub, NativeAdBase nativeAdBase) {
        this.A06 = c5721ub;
        this.A05 = nativeAdBase;
    }

    public final void A00() {
        if (this.A02 == null) {
            this.A02 = NativeAdBase.MediaCacheFlag.ALL;
        }
        this.A06.A1V(EnumC5098Jz.A00(this.A02), this.A03, new C43707Z(this.A04, this.A01, this.A00));
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final NativeAdBase.NativeLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener) {
        this.A06.A1R(this.A05, nativeAdListener);
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder, com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withBid(String str) {
        this.A03 = str;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withMediaCacheFlag(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A02 = mediaCacheFlag;
        return this;
    }

    @Override // com.facebook.ads.NativeAdBase.NativeAdLoadConfigBuilder
    public final NativeAdBase.NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2) {
        this.A04 = true;
        this.A01 = i;
        this.A00 = i2;
        return this;
    }
}
