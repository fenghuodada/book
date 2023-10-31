package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdtl extends AppOpenAd.AppOpenAdLoadCallback {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzdtt zzc;

    public zzdtl(zzdtt zzdttVar, String str, String str2) {
        this.zzc = zzdttVar;
        this.zza = str;
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdtt zzdttVar = this.zzc;
        zzk = zzdtt.zzk(loadAdError);
        zzdttVar.zzl(zzk, this.zzb);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.zzc.zzg(this.zza, appOpenAd, this.zzb);
    }
}
