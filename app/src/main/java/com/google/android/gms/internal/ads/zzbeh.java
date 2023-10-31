package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzbeh extends zzatp implements zzbei {
    public zzbeh() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static zzbei zzj(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return queryLocalInterface instanceof zzbei ? (zzbei) queryLocalInterface : new zzbeg(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            String zzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(zzg);
            return true;
        } else if (i != 3) {
            return false;
        } else {
            List zzh = zzh();
            parcel2.writeNoException();
            parcel2.writeList(zzh);
            return true;
        }
    }
}
