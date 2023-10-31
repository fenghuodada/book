package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* loaded from: classes.dex */
public final class zzbwi extends zzbvv {
    private final RewardedInterstitialAdLoadCallback zza;
    private final zzbwj zzb;

    public zzbwi(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, zzbwj zzbwjVar) {
        this.zza = rewardedInterstitialAdLoadCallback;
        this.zzb = zzbwjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg() {
        zzbwj zzbwjVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.zza;
        if (rewardedInterstitialAdLoadCallback == null || (zzbwjVar = this.zzb) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(zzbwjVar);
    }
}
