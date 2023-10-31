package com.facebook.ads.internal.api;

import android.content.res.Configuration;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.facebook.ads.AdView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.proguard.annotations.DoNotStripAny;

@Keep
@DoNotStripAny
@UiThread
/* loaded from: classes.dex */
public interface AdViewApi extends AdViewParentApi, InterfaceC3877Ad {
    AdView.AdViewLoadConfigBuilder buildLoadAdConfig();

    void loadAd(AdView.AdViewLoadConfig adViewLoadConfig);

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    void onConfigurationChanged(Configuration configuration);

    @Override // com.facebook.ads.InterfaceC3877Ad
    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
