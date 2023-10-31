package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbet extends zzatp implements zzbeu {
    public zzbet() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public static zzbeu zzbx(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
        return queryLocalInterface instanceof zzbeu ? (zzbeu) queryLocalInterface : new zzbes(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzben zzbelVar;
        switch (i) {
            case 1:
                String readString = parcel.readString();
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzbs(readString, asInterface);
                break;
            case 2:
                String readString2 = parcel.readString();
                zzatq.zzc(parcel);
                IObjectWrapper zzb = zzb(readString2);
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zzb);
                return true;
            case 3:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzbw(asInterface2);
                break;
            case 4:
                zzc();
                break;
            case 5:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                parcel.readInt();
                zzatq.zzc(parcel);
                break;
            case 6:
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzbt(asInterface3);
                break;
            case 7:
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd(asInterface4);
                break;
            case 8:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbelVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
                    zzbelVar = queryLocalInterface instanceof zzben ? (zzben) queryLocalInterface : new zzbel(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzbu(zzbelVar);
                break;
            case 9:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzbv(asInterface5);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
