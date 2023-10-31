package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzcgt extends zzato implements zzcgv {
    public zzcgt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.measurement.IMeasurementManager");
    }

    @Override // com.google.android.gms.internal.ads.zzcgv
    public final void zze(IObjectWrapper iObjectWrapper, zzcgs zzcgsVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzf(zza, zzcgsVar);
        zzbh(2, zza);
    }
}
