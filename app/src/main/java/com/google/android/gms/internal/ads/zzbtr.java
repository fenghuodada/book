package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbtr extends zzatp implements zzbts {
    public zzbtr() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbuc zzbucVar = null;
        if (i != 1) {
            if (i == 2) {
                zzbth zzbthVar = (zzbth) zzatq.zza(parcel, zzbth.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (queryLocalInterface instanceof zzbtt) {
                        zzbtt zzbttVar = (zzbtt) queryLocalInterface;
                    }
                }
                zzatq.zzc(parcel);
            } else if (i == 4) {
                zzbug zzbugVar = (zzbug) zzatq.zza(parcel, zzbug.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbucVar = queryLocalInterface2 instanceof zzbuc ? (zzbuc) queryLocalInterface2 : new zzbua(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzg(zzbugVar, zzbucVar);
            } else if (i == 5) {
                zzbug zzbugVar2 = (zzbug) zzatq.zza(parcel, zzbug.CREATOR);
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbucVar = queryLocalInterface3 instanceof zzbuc ? (zzbuc) queryLocalInterface3 : new zzbua(readStrongBinder3);
                }
                zzatq.zzc(parcel);
                zzf(zzbugVar2, zzbucVar);
            } else if (i == 6) {
                zzbug zzbugVar3 = (zzbug) zzatq.zza(parcel, zzbug.CREATOR);
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbucVar = queryLocalInterface4 instanceof zzbuc ? (zzbuc) queryLocalInterface4 : new zzbua(readStrongBinder4);
                }
                zzatq.zzc(parcel);
                zze(zzbugVar3, zzbucVar);
            } else if (i != 7) {
                return false;
            } else {
                String readString = parcel.readString();
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbucVar = queryLocalInterface5 instanceof zzbuc ? (zzbuc) queryLocalInterface5 : new zzbua(readStrongBinder5);
                }
                zzatq.zzc(parcel);
                zzh(readString, zzbucVar);
            }
            parcel2.writeNoException();
        } else {
            zzbth zzbthVar2 = (zzbth) zzatq.zza(parcel, zzbth.CREATOR);
            zzatq.zzc(parcel);
            parcel2.writeNoException();
            zzatq.zze(parcel2, null);
        }
        return true;
    }
}
