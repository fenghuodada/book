package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdto extends RewardedAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdtt zzc;

    public zzdto(zzdtt zzdttVar, String str, String str2) {
        this.zzc = zzdttVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
        String zzk;
        zzdtt zzdttVar = this.zzc;
        zzk = zzdtt.zzk(loadAdError);
        zzdttVar.zzl(zzk, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull RewardedAd rewardedAd) {
        this.zzc.zzg(this.zza, rewardedAd, this.zzb);
    }
}
