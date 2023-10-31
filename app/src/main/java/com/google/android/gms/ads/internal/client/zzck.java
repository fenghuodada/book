package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import com.google.android.gms.internal.ads.zzbny;

/* loaded from: classes.dex */
public abstract class zzck extends zzatp implements zzcl {
    public zzck() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static zzcl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof zzcl ? (zzcl) queryLocalInterface : new zzcj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzatq.zze(parcel2, liteSdkVersion);
        } else if (i != 2) {
            return false;
        } else {
            zzbny adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzatq.zzf(parcel2, adapterCreator);
        }
        return true;
    }
}
