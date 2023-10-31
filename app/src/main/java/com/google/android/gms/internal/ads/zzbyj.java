package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class zzbyj extends zzatp implements zzbyk {
    public zzbyj() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return queryLocalInterface instanceof zzbyk ? (zzbyk) queryLocalInterface : new zzbyi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyh zzbyhVar = null;
        switch (i) {
            case 1:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyo zzbyoVar = (zzbyo) zzatq.zza(parcel, zzbyo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbyhVar = queryLocalInterface instanceof zzbyh ? (zzbyh) queryLocalInterface : new zzbyf(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zze(asInterface, zzbyoVar, zzbyhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzj(asInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                zzatq.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                zzatq.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsk zzb = zzbsj.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzl(createTypedArrayList, asInterface3, zzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList createTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsk zzb2 = zzbsj.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzk(createTypedArrayList2, asInterface4, zzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzatq.zzc(parcel);
                zzf((zzbst) zzatq.zza(parcel, zzbst.CREATOR));
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzi(asInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList createTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsk zzb3 = zzbsj.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzh(createTypedArrayList3, asInterface6, zzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList createTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper asInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbsk zzb4 = zzbsj.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzg(createTypedArrayList4, asInterface7, zzb4);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
