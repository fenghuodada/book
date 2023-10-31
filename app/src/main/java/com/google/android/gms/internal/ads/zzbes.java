package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbes extends zzato implements zzbeu {
    public zzbes(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C6656q.m6130a(zzbg(2, zza));
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzbs(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzbt(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzbu(zzben zzbenVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbenVar);
        zzbh(8, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzbv(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(9, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzbw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzc() throws RemoteException {
        zzbh(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(7, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbeu
    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbh(5, zza);
    }
}
