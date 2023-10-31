package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbua extends zzato implements zzbuc {
    public zzbua(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zze(com.google.android.gms.ads.internal.util.zzaz zzazVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzazVar);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbuc
    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
