package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbkx extends zzato implements zzbkz {
    public zzbkx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zze(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzeVar);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbkz
    public final void zzg(zzbkt zzbktVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbktVar);
        zzbh(1, zza);
    }
}
