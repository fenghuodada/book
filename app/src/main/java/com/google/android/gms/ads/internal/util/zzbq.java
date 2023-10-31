package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

/* loaded from: classes.dex */
public abstract class zzbq extends zzatp implements zzbr {
    public zzbq() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzatq.zzc(parcel);
            boolean zzf = zzf(asInterface, readString, readString2);
            parcel2.writeNoException();
            parcel2.writeInt(zzf ? 1 : 0);
        } else if (i != 2) {
            return false;
        } else {
            IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            zze(asInterface2);
            parcel2.writeNoException();
        }
        return true;
    }
}
