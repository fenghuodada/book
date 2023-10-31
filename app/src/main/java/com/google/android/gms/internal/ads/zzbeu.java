package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzbeu extends IInterface {
    IObjectWrapper zzb(String str) throws RemoteException;

    void zzbs(String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbt(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbu(@Nullable zzben zzbenVar) throws RemoteException;

    void zzbv(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzbw(@Nullable IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzc() throws RemoteException;

    void zzd(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
