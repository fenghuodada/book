package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;

/* loaded from: classes.dex */
final class zzbox implements MediationAdLoadCallback {
    final /* synthetic */ zzboe zza;
    final /* synthetic */ zzboy zzb;

    public zzbox(zzboy zzboyVar, zzboe zzboeVar) {
        this.zzb = zzboyVar;
        this.zza = zzboeVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            int code = adError.getCode();
            String message = adError.getMessage();
            String domain = adError.getDomain();
            zzbzt.zze(canonicalName + "failed to load mediation ad: ErrorCode = " + code + ". ErrorMessage = " + message + ". ErrorDomain = " + domain);
            this.zza.zzh(adError.zza());
            this.zza.zzi(adError.getCode(), adError.getMessage());
            this.zza.zzg(adError.getCode());
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        Object obj;
        try {
            obj = this.zzb.zza;
            String canonicalName = obj.getClass().getCanonicalName();
            zzbzt.zze(canonicalName + "failed to loaded mediation ad: " + str);
            this.zza.zzi(0, str);
            this.zza.zzg(0);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        try {
            this.zzb.zzj = (MediationAppOpenAd) obj;
            this.zza.zzo();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
        return new zzbop(this.zza);
    }
}
