package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdtm extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ AdView zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzdtt zzd;

    public zzdtm(zzdtt zzdttVar, String str, AdView adView, String str2) {
        this.zzd = zzdttVar;
        this.zza = str;
        this.zzb = adView;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdtt zzdttVar = this.zzd;
        zzk = zzdtt.zzk(loadAdError);
        zzdttVar.zzl(zzk, this.zzc);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzd.zzg(this.zza, this.zzb, this.zzc);
    }
}
