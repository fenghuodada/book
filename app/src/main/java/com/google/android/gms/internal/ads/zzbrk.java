package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class zzbrk extends zzbgd {
    private final NativeAd.OnNativeAdLoadedListener zza;

    public zzbrk(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbge
    public final void zze(zzbgn zzbgnVar) {
        this.zza.onNativeAdLoaded(new zzbrd(zzbgnVar));
    }
}
