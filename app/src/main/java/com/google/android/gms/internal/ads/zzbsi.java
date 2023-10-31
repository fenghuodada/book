package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbsi extends zzato implements zzbsk {
    public zzbsi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsk
    public final void zzf(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbh(1, zza);
    }
}
