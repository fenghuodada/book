package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbgd extends zzatp implements zzbge {
    public zzbgd() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public static zzbge zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        return queryLocalInterface instanceof zzbge ? (zzbge) queryLocalInterface : new zzbgc(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbgn zzbglVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzbglVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
                zzbglVar = queryLocalInterface instanceof zzbgn ? (zzbgn) queryLocalInterface : new zzbgl(readStrongBinder);
            }
            zzatq.zzc(parcel);
            zze(zzbglVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
