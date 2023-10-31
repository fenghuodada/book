package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzezc extends zzbuy {
    private final zzeys zza;
    private final zzeyi zzb;
    private final zzezs zzc;
    @Nullable
    private zzdmo zzd;
    private boolean zze = false;

    public zzezc(zzeys zzeysVar, zzeyi zzeyiVar, zzezs zzezsVar) {
        this.zza = zzeysVar;
        this.zzb = zzeyiVar;
        this.zzc = zzezsVar;
    }

    private final synchronized boolean zzy() {
        zzdmo zzdmoVar = this.zzd;
        if (zzdmoVar != null) {
            if (!zzdmoVar.zze()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final Bundle zzb() {
        Preconditions.checkMainThread("getAdMetadata can only be called from the UI thread.");
        zzdmo zzdmoVar = this.zzd;
        return zzdmoVar != null ? zzdmoVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue()) {
            zzdmo zzdmoVar = this.zzd;
            if (zzdmoVar != null) {
                return zzdmoVar.zzl();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    @Nullable
    public final synchronized String zzd() throws RemoteException {
        zzdmo zzdmoVar = this.zzd;
        if (zzdmoVar == null || zzdmoVar.zzl() == null) {
            return null;
        }
        return zzdmoVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zze() throws RemoteException {
        zzf(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        Context context = null;
        this.zzb.zzb(null);
        if (this.zzd != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
            }
            this.zzd.zzm().zza(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzg(zzbvd zzbvdVar) throws RemoteException {
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        String str = zzbvdVar.zzb;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfd);
        if (str2 != null && str != null) {
            try {
                if (Pattern.matches(str2, str)) {
                    return;
                }
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "NonagonUtil.isPatternMatched");
            }
        }
        if (zzy()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzff)).booleanValue()) {
                return;
            }
        }
        zzeyk zzeykVar = new zzeyk(null);
        this.zzd = null;
        this.zza.zzj(1);
        this.zza.zzb(zzbvdVar.zza, zzbvdVar.zzb, zzeykVar, new zzeza(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzh() {
        zzi(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzb(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzj() {
        zzk(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzk(IObjectWrapper iObjectWrapper) {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        if (this.zzd != null) {
            this.zzd.zzm().zzc(iObjectWrapper == null ? null : (Context) ObjectWrapper.unwrap(iObjectWrapper));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzl(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener can only be called from the UI thread.");
        if (zzbyVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzezb(this, zzbyVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzm(String str) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setCustomData");
        this.zzc.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzn(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zze = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzo(zzbvc zzbvcVar) throws RemoteException {
        Preconditions.checkMainThread("setRewardedVideoAdListener can only be called from the UI thread.");
        this.zzb.zzf(zzbvcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzp(String str) throws RemoteException {
        Preconditions.checkMainThread("setUserId must be called on the main UI thread.");
        this.zzc.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzq() throws RemoteException {
        zzr(null);
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final synchronized void zzr(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("showAd must be called on the main UI thread.");
        if (this.zzd != null) {
            Activity activity = null;
            if (iObjectWrapper != null) {
                Object unwrap = ObjectWrapper.unwrap(iObjectWrapper);
                if (unwrap instanceof Activity) {
                    activity = (Activity) unwrap;
                }
            }
            this.zzd.zzh(this.zze, activity);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final boolean zzs() throws RemoteException {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final boolean zzt() {
        zzdmo zzdmoVar = this.zzd;
        return zzdmoVar != null && zzdmoVar.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbuz
    public final void zzu(zzbux zzbuxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
        this.zzb.zzg(zzbuxVar);
    }
}
