package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public interface InitializationCompleteCallback {
    void onInitializationFailed(@NonNull String str);

    void onInitializationSucceeded();
}
