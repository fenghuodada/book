package com.facebook.ads.internal.api;

import android.content.Context;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;

@Keep
/* loaded from: classes.dex */
public interface NativeAdViewApi {
    View render(Context context, NativeAd nativeAd);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type);

    @Deprecated
    View render(Context context, NativeAd nativeAd, NativeAdView.Type type, @Nullable NativeAdViewAttributes nativeAdViewAttributes);

    View render(Context context, NativeAd nativeAd, @Nullable NativeAdViewAttributes nativeAdViewAttributes);
}
