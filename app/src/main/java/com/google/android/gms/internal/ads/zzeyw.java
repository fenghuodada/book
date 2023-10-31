package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzeyw extends zzbvo {
    private final zzeys zza;
    private final zzeyi zzb;
    private final String zzc;
    private final zzezs zzd;
    private final Context zze;
    private final zzbzz zzf;
    private final zzaqq zzg;
    private final zzdqc zzh;
    @Nullable
    private zzdmo zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaD)).booleanValue();

    public zzeyw(@Nullable String str, zzeys zzeysVar, Context context, zzeyi zzeyiVar, zzezs zzezsVar, zzbzz zzbzzVar, zzaqq zzaqqVar, zzdqc zzdqcVar) {
        this.zzc = str;
        this.zza = zzeysVar;
        this.zzb = zzeyiVar;
        this.zzd = zzezsVar;
        this.zze = context;
        this.zzf = zzbzzVar;
        this.zzg = zzaqqVar;
        this.zzh = zzdqcVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar, int i) throws RemoteException {
        boolean z = false;
        if (((Boolean) zzbdb.zzl.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjG)).booleanValue()) {
                z = true;
            }
        }
        if (this.zzf.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjH)).intValue() || !z) {
            Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        }
        this.zzb.zze(zzbvwVar);
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zze) && zzlVar.zzs == null) {
            zzbzt.zzg("Failed to load the ad because app ID is missing.");
            this.zzb.zza(zzfba.zzd(4, null, null));
            return;
        }
        if (this.zzi != null) {
            return;
        }
        zzeyk zzeykVar = new zzeyk(null);
        this.zza.zzj(i);
        this.zza.zzb(zzlVar, this.zzc, zzeykVar, new zzeyv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmo zzdmoVar = this.zzi;
        return zzdmoVar != null ? zzdmoVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzc() {
        zzdmo zzdmoVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue() && (zzdmoVar = this.zzi) != null) {
            return zzdmoVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    @Nullable
    public final zzbvm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmo zzdmoVar = this.zzi;
        if (zzdmoVar != null) {
            return zzdmoVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    @Nullable
    public final synchronized String zze() throws RemoteException {
        zzdmo zzdmoVar = this.zzi;
        if (zzdmoVar == null || zzdmoVar.zzl() == null) {
            return null;
        }
        return zzdmoVar.zzl().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException {
        zzu(zzlVar, zzbvwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException {
        zzu(zzlVar, zzbvwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        if (zzddVar == null) {
            this.zzb.zzb(null);
        } else {
            this.zzb.zzb(new zzeyu(this, zzddVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzc(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzk(zzbvs zzbvsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzd(zzbvsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzl(zzbwd zzbwdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzezs zzezsVar = this.zzd;
        zzezsVar.zza = zzbwdVar.zza;
        zzezsVar.zzb = zzbwdVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            zzbzt.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzk(zzfba.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdmo zzdmoVar = this.zzi;
        return (zzdmoVar == null || zzdmoVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbvp
    public final void zzp(zzbvx zzbvxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzi(zzbvxVar);
    }
}
