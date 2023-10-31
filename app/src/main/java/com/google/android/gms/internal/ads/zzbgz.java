package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* loaded from: classes.dex */
public final class zzbgz extends zzbgj {
    private final UnifiedNativeAd.UnconfirmedClickListener zza;

    public zzbgz(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.zza = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze() {
        this.zza.onUnconfirmedClickCancelled();
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzf(String str) {
        this.zza.onUnconfirmedClickReceived(str);
    }
}
