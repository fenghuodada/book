package com.applovin.mediation;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public interface MaxError {
    @Deprecated
    String getAdLoadFailureInfo();

    int getCode();

    int getMediatedNetworkErrorCode();

    String getMediatedNetworkErrorMessage();

    String getMessage();

    @Nullable
    MaxAdWaterfallInfo getWaterfall();
}
