package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

@Keep
/* loaded from: classes.dex */
public class AdView extends RelativeLayout implements InterfaceC3877Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    @Keep
    /* loaded from: classes.dex */
    public interface AdViewLoadConfig extends InterfaceC3877Ad.LoadAdConfig {
    }

    @Keep
    /* loaded from: classes.dex */
    public interface AdViewLoadConfigBuilder extends InterfaceC3877Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        /* bridge */ /* synthetic */ InterfaceC3877Ad.LoadAdConfig build();

        @Override // com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Override // com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        /* bridge */ /* synthetic */ InterfaceC3877Ad.LoadConfigBuilder withBid(String str);

        @Override // com.facebook.ads.InterfaceC3877Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withBid(String str);
    }

    /* renamed from: com.facebook.ads.AdView$a */
    /* loaded from: classes.dex */
    public class C3878a implements AdViewParentApi {
        public C3878a() {
        }

        @Override // com.facebook.ads.internal.api.AdViewParentApi
        @Benchmark
        public final void onConfigurationChanged(Configuration configuration) {
            AdView.super.onConfigurationChanged(configuration);
        }
    }

    @Benchmark
    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        C3878a c3878a = new C3878a();
        this.mAdViewParentApi = c3878a;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, c3878a, this);
    }

    @Benchmark
    public AdView(Context context, String str, String str2) throws Exception {
        super(context);
        C3878a c3878a = new C3878a();
        this.mAdViewParentApi = c3878a;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, c3878a, this);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    @Benchmark
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Benchmark
    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.InterfaceC3877Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }
}
