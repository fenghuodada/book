package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;

/* loaded from: classes.dex */
final class zzbqg implements MediationAdLoadCallback {
    final /* synthetic */ zzbps zza;
    final /* synthetic */ zzboe zzb;
    final /* synthetic */ zzbqh zzc;

    public zzbqg(zzbqh zzbqhVar, zzbps zzbpsVar, zzboe zzboeVar) {
        this.zzc = zzbqhVar;
        this.zza = zzbpsVar;
        this.zzb = zzboeVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        try {
            this.zza.zzf(adError.zza());
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    @Nullable
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        MediationRewardedAd mediationRewardedAd = (MediationRewardedAd) obj;
        if (mediationRewardedAd != null) {
            try {
                this.zzc.zzc = mediationRewardedAd;
                this.zza.zzg();
            } catch (RemoteException e) {
                zzbzt.zzh("", e);
            }
            return new zzbqi(this.zzb);
        }
        zzbzt.zzj("Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad.");
        try {
            this.zza.zze("Adapter returned null.");
            return null;
        } catch (RemoteException e2) {
            zzbzt.zzh("", e2);
            return null;
        }
    }
}
