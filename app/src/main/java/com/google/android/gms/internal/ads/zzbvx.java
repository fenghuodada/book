package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbvx extends zzato {
    public zzbvx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbvm zzbvmVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbvmVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
