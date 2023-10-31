package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzbvp extends IInterface {
    Bundle zzb() throws RemoteException;

    com.google.android.gms.ads.internal.client.zzdn zzc() throws RemoteException;

    zzbvm zzd() throws RemoteException;

    String zze() throws RemoteException;

    void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException;

    void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar, zzbvw zzbvwVar) throws RemoteException;

    void zzh(boolean z) throws RemoteException;

    void zzi(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException;

    void zzj(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException;

    void zzk(zzbvs zzbvsVar) throws RemoteException;

    void zzl(zzbwd zzbwdVar) throws RemoteException;

    void zzm(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException;

    boolean zzo() throws RemoteException;

    void zzp(zzbvx zzbvxVar) throws RemoteException;
}
