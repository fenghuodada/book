package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbrp extends zzato implements zzbrr {
    public zzbrp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbrr
    public final zzbro zze(IObjectWrapper iObjectWrapper, zzbny zzbnyVar, int i) throws RemoteException {
        zzbro zzbrmVar;
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        Parcel zzbg = zzbg(1, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        if (readStrongBinder == null) {
            zzbrmVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbrmVar = queryLocalInterface instanceof zzbro ? (zzbro) queryLocalInterface : new zzbrm(readStrongBinder);
        }
        zzbg.recycle();
        return zzbrmVar;
    }
}
