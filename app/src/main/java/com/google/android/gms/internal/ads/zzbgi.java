package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzbgi extends zzato implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze() throws RemoteException {
        zzbh(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zzf(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(1, zza);
    }
}
