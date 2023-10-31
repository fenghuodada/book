package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzdm extends zzatp implements zzdn {
    public zzdm() {
        super("com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    public static zzdn zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
        return queryLocalInterface instanceof zzdn ? (zzdn) queryLocalInterface : new zzdl(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzg;
        Parcelable zzf;
        switch (i) {
            case 1:
                zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 2:
                zzg = zzi();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 3:
                List zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 4:
                zzf = zzf();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzf);
                return true;
            case 5:
                zzf = zze();
                parcel2.writeNoException();
                zzatq.zze(parcel2, zzf);
                return true;
            case 6:
                zzg = zzh();
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            default:
                return false;
        }
    }
}
