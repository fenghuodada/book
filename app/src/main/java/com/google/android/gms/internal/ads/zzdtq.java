package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdtq extends AdListener {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdtt zzb;

    public zzdtq(zzdtt zzdttVar, String str) {
        this.zzb = zzdttVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        String zzk;
        zzdtt zzdttVar = this.zzb;
        zzk = zzdtt.zzk(loadAdError);
        zzdttVar.zzl(zzk, this.zza);
    }
}
