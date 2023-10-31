package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbtv extends zzatp implements zzbtw {
    public zzbtv() {
        super("com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbtz zzbtzVar = null;
        if (i == 1) {
            zzbtk zzbtkVar = (zzbtk) zzatq.zza(parcel, zzbtk.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtzVar = queryLocalInterface instanceof zzbtz ? (zzbtz) queryLocalInterface : new zzbtx(readStrongBinder);
            }
            zzatq.zzc(parcel);
            zzf(zzbtkVar, zzbtzVar);
        } else if (i == 2) {
            zzbtk zzbtkVar2 = (zzbtk) zzatq.zza(parcel, zzbtk.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                if (queryLocalInterface2 instanceof zzbtz) {
                    zzbtz zzbtzVar2 = (zzbtz) queryLocalInterface2;
                }
            }
            zzatq.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzbto zzbtoVar = (zzbto) zzatq.zza(parcel, zzbto.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
                zzbtzVar = queryLocalInterface3 instanceof zzbtz ? (zzbtz) queryLocalInterface3 : new zzbtx(readStrongBinder3);
            }
            zzatq.zzc(parcel);
            zze(zzbtoVar, zzbtzVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
