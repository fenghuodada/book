package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbdy extends zzato {
    public zzbdy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbtf zzbtfVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbtfVar);
        zzbh(1, zza);
    }
}
