package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* loaded from: classes.dex */
public final class zzbrl extends zzbgj {
    private final NativeAd.UnconfirmedClickListener zza;

    public zzbrl(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
