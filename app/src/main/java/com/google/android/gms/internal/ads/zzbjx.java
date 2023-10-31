package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbjx extends zzato {
    public zzbjx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbjr zzbjrVar, zzbjw zzbjwVar) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, zzbjrVar);
        zzatq.zzf(zza, zzbjwVar);
        zzbi(2, zza);
    }
}
