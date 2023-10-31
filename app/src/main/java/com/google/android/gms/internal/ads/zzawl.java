package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzawl extends zzato {
    public zzawl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzawj zzawjVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzawjVar);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzawg zzf(zzawj zzawjVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzawjVar);
        Parcel zzbg = zzbg(1, zza);
        zzawg zzawgVar = (zzawg) zzatq.zza(zzbg, zzawg.CREATOR);
        zzbg.recycle();
        return zzawgVar;
    }

    public final zzawg zzg(zzawj zzawjVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzawjVar);
        Parcel zzbg = zzbg(2, zza);
        zzawg zzawgVar = (zzawg) zzatq.zza(zzbg, zzawg.CREATOR);
        zzbg.recycle();
        return zzawgVar;
    }
}
