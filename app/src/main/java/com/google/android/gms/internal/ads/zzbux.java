package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbux extends zzato {
    public zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbuw zzbuwVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbuwVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
