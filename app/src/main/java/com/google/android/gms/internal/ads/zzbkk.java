package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbkk extends zzatp implements zzbkl {
    public zzbkk() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbkl zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbkl ? (zzbkl) queryLocalInterface : new zzbkj(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList createTypedArrayList = parcel.createTypedArrayList(zzbke.CREATOR);
            zzatq.zzc(parcel);
            zzb(createTypedArrayList);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
