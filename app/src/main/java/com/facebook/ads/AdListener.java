package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
/* loaded from: classes.dex */
public interface AdListener {
    @Benchmark
    void onAdClicked(InterfaceC3877Ad interfaceC3877Ad);

    @Benchmark
    void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad);

    @Benchmark
    void onError(InterfaceC3877Ad interfaceC3877Ad, AdError adError);

    @Benchmark
    void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad);
}
