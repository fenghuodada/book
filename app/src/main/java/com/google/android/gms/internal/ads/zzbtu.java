package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbtu extends zzato implements zzbtw {
    public zzbtu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zze(zzbto zzbtoVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbtoVar);
        zzatq.zzf(zza, zzbtzVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtw
    public final void zzf(zzbtk zzbtkVar, zzbtz zzbtzVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbtkVar);
        zzatq.zzf(zza, zzbtzVar);
        zzbh(1, zza);
    }
}
