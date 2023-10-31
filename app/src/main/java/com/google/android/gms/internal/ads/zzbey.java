package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbey extends zzato implements zzbfa {
    public zzbey(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzb(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzc(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbfa
    public final void zzd() throws RemoteException {
        zzbh(2, zza());
    }
}
