package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public interface zzbrv extends IInterface {
    boolean zzF() throws RemoteException;

    void zzg(int i, int i2, Intent intent) throws RemoteException;

    void zzh() throws RemoteException;

    void zzj(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzk(@Nullable Bundle bundle) throws RemoteException;

    void zzl() throws RemoteException;

    void zzn() throws RemoteException;

    void zzo(int i, String[] strArr, int[] iArr) throws RemoteException;

    void zzp() throws RemoteException;

    void zzq() throws RemoteException;

    void zzr(Bundle bundle) throws RemoteException;

    void zzs() throws RemoteException;

    void zzt() throws RemoteException;

    void zzu() throws RemoteException;

    void zzw() throws RemoteException;
}
