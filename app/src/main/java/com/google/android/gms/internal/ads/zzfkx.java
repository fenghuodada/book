package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzfkx extends zzatp implements zzfky {
    public zzfkx() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
                parcel2.writeNoException();
                return true;
            case 4:
                parcel.createIntArray();
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 5:
                parcel.createByteArray();
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 6:
            case 7:
                parcel.readInt();
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
