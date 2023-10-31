package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzato;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbny;

/* loaded from: classes.dex */
public final class zzbv extends zzato {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(IObjectWrapper iObjectWrapper, zzq zzqVar, String str, zzbny zzbnyVar, int i, int i2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzatq.zzd(zza, zzqVar);
        zza.writeString(str);
        zzatq.zzf(zza, zzbnyVar);
        zza.writeInt(231700000);
        zza.writeInt(i2);
        Parcel zzbg = zzbg(2, zza);
        IBinder readStrongBinder = zzbg.readStrongBinder();
        zzbg.recycle();
        return readStrongBinder;
    }
}
