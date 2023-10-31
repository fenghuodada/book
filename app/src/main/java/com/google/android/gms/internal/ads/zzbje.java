package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbje extends zzatp implements zzbjf {
    public zzbje() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    public static zzbjf zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
        return queryLocalInterface instanceof zzbjf ? (zzbjf) queryLocalInterface : new zzbjd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zzb(readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
