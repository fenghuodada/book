package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzdrg {
    private final zzbjf zza;

    public zzdrg(zzbjf zzbjfVar) {
        this.zza = zzbjfVar;
    }

    private final void zzs(zzdrf zzdrfVar) throws RemoteException {
        String zza = zzdrf.zza(zzdrfVar);
        zzbzt.zzi("Dispatching AFMA event on publisher webview: ".concat(zza));
        this.zza.zzb(zza);
    }

    public final void zza() throws RemoteException {
        zzs(new zzdrf("initialize", null));
    }

    public final void zzb(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdClicked";
        this.zza.zzb(zzdrf.zza(zzdrfVar));
    }

    public final void zzc(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdClosed";
        zzs(zzdrfVar);
    }

    public final void zzd(long j, int i) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdFailedToLoad";
        zzdrfVar.zzd = Integer.valueOf(i);
        zzs(zzdrfVar);
    }

    public final void zze(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdLoaded";
        zzs(zzdrfVar);
    }

    public final void zzf(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrfVar);
    }

    public final void zzg(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("interstitial", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdOpened";
        zzs(zzdrfVar);
    }

    public final void zzh(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("creation", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "nativeObjectCreated";
        zzs(zzdrfVar);
    }

    public final void zzi(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("creation", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "nativeObjectNotCreated";
        zzs(zzdrfVar);
    }

    public final void zzj(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdClicked";
        zzs(zzdrfVar);
    }

    public final void zzk(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onRewardedAdClosed";
        zzs(zzdrfVar);
    }

    public final void zzl(long j, zzbvm zzbvmVar) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onUserEarnedReward";
        zzdrfVar.zze = zzbvmVar.zzf();
        zzdrfVar.zzf = Integer.valueOf(zzbvmVar.zze());
        zzs(zzdrfVar);
    }

    public final void zzm(long j, int i) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onRewardedAdFailedToLoad";
        zzdrfVar.zzd = Integer.valueOf(i);
        zzs(zzdrfVar);
    }

    public final void zzn(long j, int i) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onRewardedAdFailedToShow";
        zzdrfVar.zzd = Integer.valueOf(i);
        zzs(zzdrfVar);
    }

    public final void zzo(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onAdImpression";
        zzs(zzdrfVar);
    }

    public final void zzp(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onRewardedAdLoaded";
        zzs(zzdrfVar);
    }

    public final void zzq(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onNativeAdObjectNotAvailable";
        zzs(zzdrfVar);
    }

    public final void zzr(long j) throws RemoteException {
        zzdrf zzdrfVar = new zzdrf("rewarded", null);
        zzdrfVar.zza = Long.valueOf(j);
        zzdrfVar.zzc = "onRewardedAdOpened";
        zzs(zzdrfVar);
    }
}
