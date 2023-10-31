package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbog extends zzatp implements zzboh {
    public zzbog() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzboh zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzboh ? (zzboh) queryLocalInterface : new zzbof(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper zze = zze();
            parcel2.writeNoException();
            zzatq.zzf(parcel2, zze);
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
