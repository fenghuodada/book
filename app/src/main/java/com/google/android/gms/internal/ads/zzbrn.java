package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbrn extends zzatp implements zzbro {
    public zzbrn() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbro zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbro ? (zzbro) queryLocalInterface : new zzbrm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzatq.zzc(parcel);
            zze((Intent) zzatq.zza(parcel, Intent.CREATOR));
        } else if (i == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzatq.zzc(parcel);
            zzg(asInterface, readString, readString2);
        } else if (i != 3) {
            return false;
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
