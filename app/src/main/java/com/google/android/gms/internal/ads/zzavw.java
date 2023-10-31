package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzavw extends zzato implements zzavy {
    public zzavw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzb() throws RemoteException {
        zzbh(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzc() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzavy
    public final void zzf() throws RemoteException {
        zzbh(1, zza());
    }
}
