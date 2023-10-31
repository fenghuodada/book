package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbjg extends zzato implements zzbji {
    public zzbjg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zze() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbji
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }
}
