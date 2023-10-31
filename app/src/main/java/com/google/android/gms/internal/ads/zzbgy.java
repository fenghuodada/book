package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes.dex */
public final class zzbgy extends zzbgd {
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener zza;

    public zzbgy(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.zza = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zze(zzbgn zzbgnVar) {
        this.zza.onUnifiedNativeAdLoaded(new zzbgo(zzbgnVar));
    }
}
