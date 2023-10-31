package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbga extends zzatp implements zzbgb {
    public zzbga() {
        super("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public static zzbgb zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
        return queryLocalInterface instanceof zzbgb ? (zzbgb) queryLocalInterface : new zzbfz(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            com.google.android.gms.ads.internal.client.zzbu zzac = com.google.android.gms.ads.internal.client.zzbt.zzac(parcel.readStrongBinder());
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            zze(zzac, asInterface);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
