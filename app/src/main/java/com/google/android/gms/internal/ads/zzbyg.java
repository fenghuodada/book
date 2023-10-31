package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbyg extends zzatp implements zzbyh {
    public zzbyg() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            zzatq.zzc(parcel);
        } else if (i == 2) {
            String readString = parcel.readString();
            zzatq.zzc(parcel);
            zzb(readString);
        } else if (i != 3) {
            return false;
        } else {
            zzatq.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzatq.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
