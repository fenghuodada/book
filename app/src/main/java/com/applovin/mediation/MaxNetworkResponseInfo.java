package com.applovin.mediation;

import android.os.Bundle;

/* loaded from: classes.dex */
public interface MaxNetworkResponseInfo {

    /* loaded from: classes.dex */
    public enum AdLoadState {
        AD_LOAD_NOT_ATTEMPTED,
        AD_LOADED,
        FAILED_TO_LOAD
    }

    AdLoadState getAdLoadState();

    Bundle getCredentials();

    MaxError getError();

    long getLatencyMillis();

    MaxMediatedNetworkInfo getMediatedNetwork();
}
