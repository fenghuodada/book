package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdtn extends InterstitialAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdtt zzc;

    public zzdtn(zzdtt zzdttVar, String str, String str2) {
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
    public final /* bridge */ /* synthetic */ void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
        this.zzc.zzg(this.zza, interstitialAd, this.zzb);
    }
}
