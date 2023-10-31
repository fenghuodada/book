package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzavt extends zzatp implements zzavu {
    public zzavt() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public static zzavu zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        return queryLocalInterface instanceof zzavu ? (zzavu) queryLocalInterface : new zzavs(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzavr zzavpVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzavpVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                zzavpVar = queryLocalInterface instanceof zzavr ? (zzavr) queryLocalInterface : new zzavp(readStrongBinder);
            }
            zzatq.zzc(parcel);
            zzd(zzavpVar);
        } else if (i == 2) {
            parcel.readInt();
            zzatq.zzc(parcel);
        } else if (i != 3) {
            return false;
        } else {
            zzatq.zzc(parcel);
            zzc((com.google.android.gms.ads.internal.client.zze) zzatq.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
