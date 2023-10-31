package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzejq {
    private final zzejv zza;
    private final String zzb;
    @Nullable
    private com.google.android.gms.ads.internal.client.zzdn zzc;

    public zzejq(zzejv zzejvVar, String str) {
        this.zza = zzejvVar;
        this.zzb = str;
    }

    @Nullable
    public final synchronized String zza() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    @Nullable
    public final synchronized String zzb() {
        com.google.android.gms.ads.internal.client.zzdn zzdnVar;
        try {
            zzdnVar = this.zzc;
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
            return null;
        }
        return zzdnVar != null ? zzdnVar.zzg() : null;
    }

    public final synchronized void zzd(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(zzlVar, this.zzb, new zzejw(i), new zzejp(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
