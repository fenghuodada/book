package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbub extends zzatp implements zzbuc {
    public zzbub() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzatp
    public final boolean zzbE(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            zzatq.zzc(parcel);
            zzf((ParcelFileDescriptor) zzatq.zza(parcel, ParcelFileDescriptor.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            zzatq.zzc(parcel);
            zze((com.google.android.gms.ads.internal.util.zzaz) zzatq.zza(parcel, com.google.android.gms.ads.internal.util.zzaz.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
