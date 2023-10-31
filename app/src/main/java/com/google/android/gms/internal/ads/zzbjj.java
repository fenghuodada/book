package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbjj extends zzato implements zzbjl {
    public zzbjj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final zzbji zze(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i, zzbjf zzbjfVar) throws RemoteException {
        zzbji zzbjgVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        zzatq.zzf(zza, zzbjfVar);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbjgVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbjgVar = queryLocalInterface instanceof zzbji ? (zzbji) queryLocalInterface : new zzbjg(readStrongBinder);
        }
        zzbg.recycle();
        return zzbjgVar;
    }
}
