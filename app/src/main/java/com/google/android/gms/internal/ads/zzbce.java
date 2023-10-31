package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public abstract class zzbce extends zzatp implements zzbcf {
    public zzbce() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        String zzb;
        if (i == 1) {
            zzb = zzb();
        } else if (i != 2) {
            if (i == 3) {
                IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzatq.zzc(parcel);
                zzd(asInterface);
            } else if (i == 4) {
                zze();
            } else if (i != 5) {
                return false;
            } else {
                zzf();
            }
            parcel2.writeNoException();
            return true;
        } else {
            zzb = zzc();
        }
        parcel2.writeNoException();
        parcel2.writeString(zzb);
        return true;
    }
}
