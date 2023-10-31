package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzcoy extends zzavq {
    private final zzcox zza;
    private final com.google.android.gms.ads.internal.client.zzbu zzb;
    private final zzevd zzc;
    private boolean zzd = false;
    private final zzdqc zze;

    public zzcoy(zzcox zzcoxVar, com.google.android.gms.ads.internal.client.zzbu zzbuVar, zzevd zzevdVar, zzdqc zzdqcVar) {
        this.zza = zzcoxVar;
        this.zzb = zzbuVar;
        this.zzc = zzevdVar;
        this.zze = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final com.google.android.gms.ads.internal.client.zzbu zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue()) {
            return this.zza.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdgVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzo(zzdgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzavr
    public final void zzi(IObjectWrapper iObjectWrapper, zzavy zzavyVar) {
        try {
            this.zzc.zzq(zzavyVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzavyVar, this.zzd);
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }
}
