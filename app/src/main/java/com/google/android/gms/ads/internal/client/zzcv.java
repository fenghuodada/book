package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;

/* loaded from: classes.dex */
public abstract class zzcv extends zzatp implements zzcw {
    public zzcv() {
        super("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public static zzcw zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMuteThisAdReason");
        return queryLocalInterface instanceof zzcw ? (zzcw) queryLocalInterface : new zzcu(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zze;
        if (i == 1) {
            zze = zze();
        } else if (i != 2) {
            return false;
        } else {
            zze = zzf();
        }
        parcel2.writeNoException();
        parcel2.writeString(zze);
        return true;
    }
}
