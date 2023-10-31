package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbvk extends zzato implements zzbvm {
    public zzbvk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final int zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.ads.zzbvm
    public final String zzf() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }
}
