package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* loaded from: classes.dex */
final class zzbql implements com.google.android.gms.ads.internal.overlay.zzo {
    final /* synthetic */ zzbqn zza;

    public zzbql(zzbqn zzbqnVar) {
        this.zza = zzbqnVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        MediationInterstitialListener mediationInterstitialListener;
        zzbzt.zze("Opening AdMobCustomTabsAdapter overlay.");
        zzbqn zzbqnVar = this.zza;
        mediationInterstitialListener = zzbqnVar.zzb;
        mediationInterstitialListener.onAdOpened(zzbqnVar);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
        zzbzt.zze("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
        zzbzt.zze("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
        zzbzt.zze("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        MediationInterstitialListener mediationInterstitialListener;
        zzbzt.zze("AdMobCustomTabsAdapter overlay is closed.");
        zzbqn zzbqnVar = this.zza;
        mediationInterstitialListener = zzbqnVar.zzb;
        mediationInterstitialListener.onAdClosed(zzbqnVar);
    }
}
