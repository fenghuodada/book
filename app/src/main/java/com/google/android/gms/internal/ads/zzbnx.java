package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbnx extends zzatp implements zzbny {
    public zzbnx() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static zzbny zzf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return queryLocalInterface instanceof zzbny ? (zzbny) queryLocalInterface : new zzbnw(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zzb;
        int i3;
        if (i != 1) {
            if (i == 2) {
                String readString = parcel.readString();
                zzatq.zzc(parcel);
                i3 = zze(readString);
            } else if (i == 3) {
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                zzb = zzc(readString2);
            } else if (i != 4) {
                return false;
            } else {
                String readString3 = parcel.readString();
                zzatq.zzc(parcel);
                i3 = zzd(readString3);
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        }
        String readString4 = parcel.readString();
        zzatq.zzc(parcel);
        zzb = zzb(readString4);
        parcel2.writeNoException();
        zzatq.zzf(parcel2, zzb);
        return true;
    }
}
