package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
public final class zzbfz extends zzato implements zzbgb {
    public zzbfz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgb
    public final void zze(com.google.android.gms.ads.internal.client.zzbu zzbuVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzatq.zzf(zza, zzbuVar);
        zzatq.zzf(zza, iObjectWrapper);
        zzbh(1, zza);
    }
}
