package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbks extends zzatp implements zzbkt {
    public zzbks() {
        super("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzb;
        zzbkw zzbkuVar;
        if (i != 3) {
            if (i == 4) {
                zzd();
            } else if (i == 5) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbkuVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
                    zzbkuVar = queryLocalInterface instanceof zzbkw ? (zzbkw) queryLocalInterface : new zzbku(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzf(asInterface, zzbkuVar);
            } else if (i == 6) {
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zze(asInterface2);
            } else if (i != 7) {
                return false;
            } else {
                zzb = zzc();
            }
            parcel2.writeNoException();
            return true;
        }
        zzb = zzb();
        parcel2.writeNoException();
        zzatq.zzf(parcel2, zzb);
        return true;
    }
}
