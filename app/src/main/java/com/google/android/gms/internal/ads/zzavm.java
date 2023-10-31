package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* loaded from: classes.dex */
public final class zzavm extends zzavt {
    @Nullable
    private final AppOpenAd.AppOpenAdLoadCallback zza;
    private final String zzb;

    public zzavm(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavu
    public final void zzd(zzavr zzavrVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzavn(zzavrVar, this.zzb));
        }
    }
}
