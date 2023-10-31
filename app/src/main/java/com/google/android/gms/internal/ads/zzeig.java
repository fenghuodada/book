package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzeig extends com.google.android.gms.ads.internal.client.zzbt {
    private final Context zza;
    private final com.google.android.gms.ads.internal.client.zzbh zzb;
    private final zzfaa zzc;
    private final zzcpd zzd;
    private final ViewGroup zze;
    private final zzdqc zzf;

    public zzeig(Context context, @Nullable com.google.android.gms.ads.internal.client.zzbh zzbhVar, zzfaa zzfaaVar, zzcpd zzcpdVar, zzdqc zzdqcVar) {
        this.zza = context;
        this.zzb = zzbhVar;
        this.zzc = zzfaaVar;
        this.zzd = zzcpdVar;
        this.zzf = zzdqcVar;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        View zzc = zzcpdVar.zzc();
        com.google.android.gms.ads.internal.zzt.zzp();
        frameLayout.addView(zzc, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setMinimumHeight(zzg().zzc);
        frameLayout.setMinimumWidth(zzg().zzf);
        this.zze = frameLayout;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() throws RemoteException {
        this.zzd.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzB() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzc(null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) throws RemoteException {
        zzbzt.zzi("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws RemoteException {
        zzbzt.zzi("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) throws RemoteException {
        zzbzt.zzi("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) throws RemoteException {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzd;
        if (zzcpdVar != null) {
            zzcpdVar.zzh(this.zze, zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) throws RemoteException {
        zzejf zzejfVar = this.zzc.zzc;
        if (zzejfVar != null) {
            zzejfVar.zzi(zzcbVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavu zzavuVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbse zzbseVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) throws RemoteException {
        zzbzt.zzi("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzO(zzbci zzbciVar) throws RemoteException {
        zzbzt.zzi("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjT)).booleanValue()) {
            zzbzt.zzi("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
            return;
        }
        zzejf zzejfVar = this.zzc.zzc;
        if (zzejfVar != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zzf.zze();
                }
            } catch (RemoteException e) {
                zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            zzejfVar.zzg(zzdgVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsh zzbshVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvc zzbvcVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) throws RemoteException {
        zzbzt.zzi("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzY() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zzbzt.zzi("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) throws RemoteException {
        zzbzt.zzi("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() throws RemoteException {
        zzbzt.zzi("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        return zzfae.zza(this.zza, Collections.singletonList(this.zzd.zze()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() throws RemoteException {
        return this.zzc.zzn;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdn zzk() {
        return this.zzd.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() throws RemoteException {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() throws RemoteException {
        return ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final String zzr() throws RemoteException {
        return this.zzc.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzs() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final String zzt() throws RemoteException {
        if (this.zzd.zzl() != null) {
            return this.zzd.zzl().zzg();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz() throws RemoteException {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzd.zzm().zzb(null);
    }
}
