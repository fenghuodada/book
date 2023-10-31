package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbtq extends zzato implements zzbts {
    public zzbtq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zze(zzbug zzbugVar, zzbuc zzbucVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbugVar);
        zzatq.zzf(zza, zzbucVar);
        zzbh(6, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzf(zzbug zzbugVar, zzbuc zzbucVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbugVar);
        zzatq.zzf(zza, zzbucVar);
        zzbh(5, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzg(zzbug zzbugVar, zzbuc zzbucVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbugVar);
        zzatq.zzf(zza, zzbucVar);
        zzbh(4, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzh(String str, zzbuc zzbucVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzatq.zzf(zza, zzbucVar);
        zzbh(7, zza);
    }
}
