package com.ambrose.overwall.fragment;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.ambrose.overwall.fragment.i */
/* loaded from: classes.dex */
public final class C2459i extends FullScreenContentCallback {
    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        super.onAdDismissedFullScreenContent();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(@NonNull @NotNull AdError adError) {
        super.onAdFailedToShowFullScreenContent(adError);
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        super.onAdImpression();
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        super.onAdShowedFullScreenContent();
    }
}
