package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbgg extends zzatp implements zzbgh {
    public zzbgg() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static zzbgh zzc(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return queryLocalInterface instanceof zzbgh ? (zzbgh) queryLocalInterface : new zzbgf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzatq.zzc(parcel);
            boolean zzb = zzb(asInterface);
            parcel2.writeNoException();
            parcel2.writeInt(zzb ? 1 : 0);
            return true;
        }
        return false;
    }
}
