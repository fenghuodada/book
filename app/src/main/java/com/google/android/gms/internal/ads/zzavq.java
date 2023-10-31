package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzavq extends zzatp implements zzavr {
    public zzavq() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        IInterface zze;
        zzavy zzavwVar;
        switch (i) {
            case 2:
                zze = zze();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zze);
                return true;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                    if (queryLocalInterface instanceof zzavv) {
                        zzavv zzavvVar = (zzavv) queryLocalInterface;
                    }
                }
                zzatq.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 == null) {
                    zzavwVar = null;
                } else {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    zzavwVar = queryLocalInterface2 instanceof zzavy ? (zzavy) queryLocalInterface2 : new zzavw(readStrongBinder2);
                }
                zzatq.zzc(parcel);
                zzi(asInterface, zzavwVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zze = zzf();
                parcel2.writeNoException();
                zzatq.zzf(parcel2, zze);
                return true;
            case 6:
                boolean zzg = zzatq.zzg(parcel);
                zzatq.zzc(parcel);
                zzg(zzg);
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzdg zzb = com.google.android.gms.ads.internal.client.zzdf.zzb(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzh(zzb);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
