package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbvf extends zzato implements zzbvh {
    public zzbvf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvi zzbviVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzbviVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(11, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(5, zza);
    }
}
