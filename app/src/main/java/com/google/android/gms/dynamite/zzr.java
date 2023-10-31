package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.exoplayer2.analytics.C6656q;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzr extends com.google.android.gms.internal.common.zza {
    public zzr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final IObjectWrapper zze(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return C6656q.m6130a(zzB(2, zza));
    }

    public final IObjectWrapper zzf(IObjectWrapper iObjectWrapper, String str, int i, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeInt(i);
        com.google.android.gms.internal.common.zzc.zze(zza, iObjectWrapper2);
        return C6656q.m6130a(zzB(3, zza));
    }
}
