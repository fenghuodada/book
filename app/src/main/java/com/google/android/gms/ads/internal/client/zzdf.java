package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzatq;

/* loaded from: classes.dex */
public abstract class zzdf extends zzatp implements zzdg {
    public zzdf() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static zzdg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof zzdg ? (zzdg) queryLocalInterface : new zzde(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzatq.zzc(parcel);
            zze((zzs) zzatq.zza(parcel, zzs.CREATOR));
            parcel2.writeNoException();
        } else if (i != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            int i3 = zzatq.zza;
            parcel2.writeInt(zzf ? 1 : 0);
        }
        return true;
    }
}
