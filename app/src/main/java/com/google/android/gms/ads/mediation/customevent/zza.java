package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzbzt;

@VisibleForTesting
/* loaded from: classes.dex */
final class zza implements CustomEventBannerListener {
    private final CustomEventAdapter zza;
    private final MediationBannerListener zzb;

    public zza(CustomEventAdapter customEventAdapter, MediationBannerListener mediationBannerListener) {
        this.zza = customEventAdapter;
        this.zzb = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        zzbzt.zze("Custom event adapter called onAdClicked.");
        this.zzb.onAdClicked(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        zzbzt.zze("Custom event adapter called onAdClosed.");
        this.zzb.onAdClosed(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        zzbzt.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        zzbzt.zze("Custom event adapter called onAdFailedToLoad.");
        this.zzb.onAdFailedToLoad(this.zza, adError);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        zzbzt.zze("Custom event adapter called onAdLeftApplication.");
        this.zzb.onAdLeftApplication(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventBannerListener
    public final void onAdLoaded(View view) {
        zzbzt.zze("Custom event adapter called onAdLoaded.");
        this.zza.zze = view;
        this.zzb.onAdLoaded(this.zza);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        zzbzt.zze("Custom event adapter called onAdOpened.");
        this.zzb.onAdOpened(this.zza);
    }
}
