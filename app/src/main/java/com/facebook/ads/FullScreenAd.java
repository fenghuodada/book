package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.InterfaceC3877Ad;

/* loaded from: classes.dex */
public interface FullScreenAd extends InterfaceC3877Ad {

    @Keep
    /* loaded from: classes.dex */
    public interface ShowAdConfig {
    }

    @Keep
    /* loaded from: classes.dex */
    public interface ShowConfigBuilder {
        ShowAdConfig build();
    }

    InterfaceC3877Ad.LoadConfigBuilder buildLoadAdConfig();

    ShowConfigBuilder buildShowAdConfig();

    boolean show();
}
