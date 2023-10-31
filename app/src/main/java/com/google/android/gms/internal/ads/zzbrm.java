package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbrm extends zzato implements zzbro {
    public zzbrm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzd(zza, intent);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final void zzg(IObjectWrapper iObjectWrapper, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
