package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbkh extends zzatp implements zzbki {
    public zzbkh() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbki zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbki ? (zzbki) queryLocalInterface : new zzbkg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzf();
        } else if (i != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
