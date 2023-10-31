package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzfkf extends zzato {
    public zzfkf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfkd zze(zzfkb zzfkbVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzfkbVar);
        Parcel zzbg = zzbg(1, zza);
        zzfkd zzfkdVar = (zzfkd) zzatq.zza(zzbg, zzfkd.CREATOR);
        zzbg.recycle();
        return zzfkdVar;
    }

    public final zzfkm zzf(zzfkk zzfkkVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzfkkVar);
        Parcel zzbg = zzbg(3, zza);
        zzfkm zzfkmVar = (zzfkm) zzatq.zza(zzbg, zzfkm.CREATOR);
        zzbg.recycle();
        return zzfkmVar;
    }

    public final void zzg(zzfjy zzfjyVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzfjyVar);
        zzbh(2, zza);
    }
}
