package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbyl extends zzato implements zzbyn {
    public zzbyl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyn
    public final zzbyk zze(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        zzbyk zzbyiVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyiVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzbyiVar = queryLocalInterface instanceof zzbyk ? (zzbyk) queryLocalInterface : new zzbyi(readStrongBinder);
        }
        zzbg.recycle();
        return zzbyiVar;
    }
}
