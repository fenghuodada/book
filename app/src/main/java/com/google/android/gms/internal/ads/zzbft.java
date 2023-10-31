package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbft extends zzatp implements zzbfu {
    public zzbft() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static zzbfu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof zzbfu ? (zzbfu) queryLocalInterface : new zzbfs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbfk zzbfiVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbfiVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
                zzbfiVar = queryLocalInterface instanceof zzbfk ? (zzbfk) queryLocalInterface : new zzbfi(readStrongBinder);
            }
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zze(zzbfiVar, readString);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
