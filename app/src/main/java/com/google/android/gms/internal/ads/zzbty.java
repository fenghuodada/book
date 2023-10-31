package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public abstract class zzbty extends zzatp implements zzbtz {
    public zzbty() {
        super("com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
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
