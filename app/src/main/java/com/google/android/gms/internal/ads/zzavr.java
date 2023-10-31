package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzavr extends IInterface {
    com.google.android.gms.ads.internal.client.zzbu zze() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdn zzf() throws RemoteException;

    void zzg(boolean z) throws RemoteException;

    void zzh(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException;

    void zzi(IObjectWrapper iObjectWrapper, zzavy zzavyVar) throws RemoteException;
}
