package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbny;
import java.util.List;

/* loaded from: classes.dex */
public interface zzco extends IInterface {
    float zze() throws RemoteException;

    String zzf() throws RemoteException;

    List zzg() throws RemoteException;

    void zzh(@Nullable String str) throws RemoteException;

    void zzi() throws RemoteException;

    void zzj(boolean z) throws RemoteException;

    void zzk() throws RemoteException;

    void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzm(zzda zzdaVar) throws RemoteException;

    void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException;

    void zzo(zzbny zzbnyVar) throws RemoteException;

    void zzp(boolean z) throws RemoteException;

    void zzq(float f) throws RemoteException;

    void zzr(String str) throws RemoteException;

    void zzs(zzbkl zzbklVar) throws RemoteException;

    void zzt(String str) throws RemoteException;

    void zzu(zzff zzffVar) throws RemoteException;

    boolean zzv() throws RemoteException;
}
