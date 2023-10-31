package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbvr extends zzatp implements zzbvs {
    public zzbvr() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvm zzbvkVar;
        switch (i) {
            case 1:
                zzj();
                break;
            case 2:
                zzg();
                break;
            case 3:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbvkVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    zzbvkVar = queryLocalInterface instanceof zzbvm ? (zzbvm) queryLocalInterface : new zzbvk(readStrongBinder);
                }
                zzatq.zzc(parcel);
                zzk(zzbvkVar);
                break;
            case 4:
                int readInt = parcel.readInt();
                zzatq.zzc(parcel);
                zzh(readInt);
                break;
            case 5:
                zzatq.zzc(parcel);
                zzi((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
                break;
            case 6:
                zzf();
                break;
            case 7:
                zze();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
