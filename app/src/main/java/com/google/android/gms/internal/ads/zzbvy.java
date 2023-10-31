package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbvy extends RewardedAd {
    private final String zza;
    private final zzbvp zzb;
    private final Context zzc;
    private final zzbwh zzd = new zzbwh();
    @Nullable
    private OnAdMetadataChangedListener zze;
    @Nullable
    private OnPaidEventListener zzf;
    @Nullable
    private FullScreenContentCallback zzg;

    public zzbvy(Context context, String str) {
        this.zzc = context.getApplicationContext();
        this.zza = str;
        this.zzb = com.google.android.gms.ads.internal.client.zzay.zza().zzq(context, str, new zzbnv());
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                return zzbvpVar.zzb();
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final String getAdUnitId() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar = null;
        try {
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzdnVar = zzbvpVar.zzc();
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVar);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    @NonNull
    public final RewardItem getRewardItem() {
        try {
            zzbvp zzbvpVar = this.zzb;
            zzbvm zzd = zzbvpVar != null ? zzbvpVar.zzd() : null;
            return zzd == null ? RewardItem.DEFAULT_REWARD : new zzbvz(zzd);
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zzg = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z) {
        try {
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzbvpVar.zzh(z);
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(@Nullable OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.zze = onAdMetadataChangedListener;
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzbvpVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzf = onPaidEventListener;
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzbvpVar.zzj(new com.google.android.gms.ads.internal.client.zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(@Nullable ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                zzbvp zzbvpVar = this.zzb;
                if (zzbvpVar != null) {
                    zzbvpVar.zzl(new zzbwd(serverSideVerificationOptions));
                }
            } catch (RemoteException e) {
                zzbzt.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(@NonNull Activity activity, @NonNull OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.zzd.zzc(onUserEarnedRewardListener);
        if (activity == null) {
            zzbzt.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzbvpVar.zzk(this.zzd);
                this.zzb.zzm(ObjectWrapper.wrap(activity));
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        try {
            zzbvp zzbvpVar = this.zzb;
            if (zzbvpVar != null) {
                zzbvpVar.zzf(com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzc, zzdxVar), new zzbwc(rewardedAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }
}
