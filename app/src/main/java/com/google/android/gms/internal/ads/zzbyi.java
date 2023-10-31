package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbyi extends zzato implements zzbyk {
    public zzbyi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zze(IObjectWrapper iObjectWrapper, zzbyo zzbyoVar, zzbyh zzbyhVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzbyoVar);
        zzatq.zzf(zza, zzbyhVar);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzf(zzbst zzbstVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbstVar);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbskVar);
        zzbh(10, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbskVar);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbskVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyk
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbsk zzbskVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbskVar);
        zzbh(5, zza);
    }
}
