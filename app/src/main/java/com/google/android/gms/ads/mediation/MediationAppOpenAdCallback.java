package com.google.android.gms.ads.mediation;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public interface MediationAppOpenAdCallback extends MediationAdCallback {
    void onAdFailedToShow(@NonNull AdError adError);
}
